{-# LANGUAGE RankNTypes, OverloadedStrings, DeriveGeneric, LambdaCase, RecordWildCards #-}
module Language where

import GHC.Generics
import Data.Aeson (ToJSON(..),FromJSON(..))
import Control.Monad.Writer
import Data.String
import Data.List
import Data.Map (Map)
import qualified Data.Map as Map
import Data.Set (Set)
import qualified Data.Set as Set

instance IsString Type where
  fromString a = Data a

data ModuleDef
  = ModuleDef
  { moduleName  :: String
  , imports     :: [String]
  , definitions :: [DataDef]
  }
  deriving (Show,Generic)

data DataDef
  = DataDef
  { dataName      :: String
  , constructors  :: [ConstructorDef]
  , instances     :: [(Target,Instance)]
  }
  | TypeAlias
  { aliasName     :: String
  , aliasType     :: Type
  }
  deriving (Show,Generic)

data ConstructorDef
  = ConstructorDef
  { name          :: String
  , fields        :: [Field]
  }
  deriving (Show,Generic)

data Field
  = Field
  { fieldName :: String
  , fieldType :: Type
  }
  deriving (Show,Generic)

data Instance
  = Show
  | Eq
  | Ord
  deriving (Show,Generic)

data Target
  = Haskell
  | PureScript
  | Cpp
  | CSharp
  deriving (Show,Eq,Generic)

data Type
  = Int
  | Int32
  | Word
  | Word32
  | Float
  | Bool
  | String
  -- higher order types
  | V2 { type_ :: Type }
  | V3 { type_ :: Type }
  | V4 { type_ :: Type }
  | Array { type_ :: Type }
  | List { type_ :: Type }
  | Maybe { type_ :: Type }
  | Map { key_ :: Type, value_ :: Type }
  -- user defined
  | Data { name_ :: String }
  deriving (Show,Generic,Eq,Ord)

filterInstances :: Target -> [(Target,Instance)] -> [Instance]
filterInstances target l = [inst | (t,inst) <- l, t == target]

hasEnumConstructor :: DataDef -> Bool
hasEnumConstructor DataDef{..} = or [null fields | ConstructorDef{..} <- constructors]
hasEnumConstructor _ = False

collectTypes :: AliasMap -> ModuleDef -> Set Type
collectTypes aliasMap ModuleDef{..} = Set.fromList $ map (normalize aliasMap) $ concat
  [Data dataName : concatMap flatType [fieldType | ConstructorDef{..} <- constructors, Field{..} <- fields] | DataDef{..} <- definitions]
 where
  flatType t = case t of
    V2 a    -> [t,a]
    V3 a    -> [t,a]
    V4 a    -> [t,a]
    Array a -> [t,a]
    List a  -> [t,a]
    Maybe a -> [t,a]
    Map k v -> [t,k,v]
    _ -> [t]

parens :: String -> String
parens a
  | 1 == length (words a) = a
  | otherwise = "(" ++ a ++ ")"

type AliasMap = Map String Type

normalize :: AliasMap -> Type -> Type
normalize aliasMap t@(Data n) = Map.findWithDefault t n aliasMap
normalize aliasMap (V2 t) = V2 $ normalize aliasMap t
normalize aliasMap (V3 t) = V3 $ normalize aliasMap t
normalize aliasMap (V4 t) = V4 $ normalize aliasMap t
normalize aliasMap (Array t) = Array $ normalize aliasMap t
normalize aliasMap (List t) = List $ normalize aliasMap t
normalize aliasMap (Maybe t) = Maybe $ normalize aliasMap t
normalize aliasMap (Map k v) = Map (normalize aliasMap k) (normalize aliasMap v)
normalize _ t = t

psType :: AliasMap -> Type -> String
psType aliasMap = \case
  Int     -> "Int"
  Int32   -> "Int32"
  Word    -> "Word"
  Word32  -> "Word32"
  Float   -> "Float"
  Bool    -> "Bool"
  String  -> "String"

  V2 Int        -> "V2I"
  V2 Word       -> "V2U"
  V2 Float      -> "V2F"
  V2 Bool       -> "V2B"
  V2 (V2 Float) -> "M22F"
  V2 (V3 Float) -> "M32F"
  V2 (V4 Float) -> "M42F"

  V3 Int        -> "V3I"
  V3 Word       -> "V3U"
  V3 Float      -> "V3F"
  V3 Bool       -> "V3B"
  V3 (V2 Float) -> "M23F"
  V3 (V3 Float) -> "M33F"
  V3 (V4 Float) -> "M43F"

  V4 Int        -> "V4I"
  V4 Word       -> "V4U"
  V4 Float      -> "V4F"
  V4 Bool       -> "V4B"
  V4 (V2 Float) -> "M24F"
  V4 (V3 Float) -> "M34F"
  V4 (V4 Float) -> "M44F"

  Array t       -> "Array " ++ parens (psType aliasMap t)
  List t        -> "List " ++ parens (psType aliasMap t)
  Maybe t       -> "Maybe " ++ parens (psType aliasMap t)
  Map k v
    | String <- normalize aliasMap k -> "StrMap " ++ parens (psType aliasMap v)
    | otherwise -> "Map " ++ parens (psType aliasMap k) ++ " " ++ parens (psType aliasMap v)
  -- user defined
  Data t        -> t
  x -> error $ "unknown type: " ++ show x

hsType :: AliasMap -> Type -> String
hsType aliasMap = \case
  Int     -> "Int"
  Int32   -> "Int32"
  Word    -> "Word"
  Word32  -> "Word32"
  Float   -> "Float"
  Bool    -> "Bool"
  String  -> "String"

  V2 Int        -> "V2I"
  V2 Word       -> "V2U"
  V2 Float      -> "V2F"
  V2 Bool       -> "V2B"
  V2 (V2 Float) -> "M22F"
  V2 (V3 Float) -> "M32F"
  V2 (V4 Float) -> "M42F"

  V3 Int        -> "V3I"
  V3 Word       -> "V3U"
  V3 Float      -> "V3F"
  V3 Bool       -> "V3B"
  V3 (V2 Float) -> "M23F"
  V3 (V3 Float) -> "M33F"
  V3 (V4 Float) -> "M43F"

  V4 Int        -> "V4I"
  V4 Word       -> "V4U"
  V4 Float      -> "V4F"
  V4 Bool       -> "V4B"
  V4 (V2 Float) -> "M24F"
  V4 (V3 Float) -> "M34F"
  V4 (V4 Float) -> "M44F"

  Array t       -> "Vector " ++ parens (hsType aliasMap t)
  List t        -> "[" ++ hsType aliasMap t ++ "]"
  Maybe t       -> "Maybe " ++ parens (hsType aliasMap t)
  Map k v       -> "Map " ++ parens (hsType aliasMap k) ++ " " ++ parens (hsType aliasMap v)
  -- user defined
  Data t        -> t
  x -> error $ "unknown type: " ++ show x

swiftType :: AliasMap -> Type -> String
swiftType aliasMap = \case
  Int     -> "Int"
  Int32   -> "Int32"
  Word    -> "UInt"
  Word32  -> "UInt32"
  Float   -> "Float"
  Bool    -> "Bool"
  String  -> "String"
{-
  V2 Int        -> "V2I"
  V2 Word       -> "V2U"
  V2 Float      -> "V2F"
  V2 Bool       -> "V2B"
  V2 (V2 Float) -> "M22F"
  V2 (V3 Float) -> "M32F"
  V2 (V4 Float) -> "M42F"

  V3 Int        -> "V3I"
  V3 Word       -> "V3U"
  V3 Float      -> "V3F"
  V3 Bool       -> "V3B"
  V3 (V2 Float) -> "M23F"
  V3 (V3 Float) -> "M33F"
  V3 (V4 Float) -> "M43F"

  V4 Int        -> "V4I"
  V4 Word       -> "V4U"
  V4 Float      -> "V4F"
  V4 Bool       -> "V4B"
  V4 (V2 Float) -> "M24F"
  V4 (V3 Float) -> "M34F"
  V4 (V4 Float) -> "M44F"
-}
  Array t       -> "Array<" ++ swiftType aliasMap t ++ ">"
  List t        -> "Array<" ++ swiftType aliasMap t ++ ">"
  Maybe t       -> "Maybe<" ++ swiftType aliasMap t ++ ">"
  Map k v       -> "Dictionary<" ++ swiftType aliasMap k ++ ", " ++ swiftType aliasMap v ++ ">"
  -- user defined
  Data t        -> t
  _ -> "Int"
  x -> error $ "unknown type: " ++ show x

javaType :: AliasMap -> Type -> String -- TODO
javaType aliasMap a = case normalize aliasMap a of
  Data t        -> t
  Int           -> "Integer"
  Int32         -> "Integer"
  Word          -> "Integer"
  Word32        -> "Integer"
  Float         -> "Float"
  Bool          -> "Boolean"
  String        -> "String"
  Array t       -> "ArrayList<" ++ javaType aliasMap t ++ ">"
  List t        -> "ArrayList<" ++ javaType aliasMap t ++ ">"
  Map k v       -> "HashMap<" ++ javaType aliasMap k ++ ", " ++ javaType aliasMap v ++ ">"
  V2 t          -> "V2<" ++ javaType aliasMap t ++ ">"
  V3 t          -> "V3<" ++ javaType aliasMap t ++ ">"
  V4 t          -> "V4<" ++ javaType aliasMap t ++ ">"
  Maybe t       -> "Maybe<" ++ parens (javaType aliasMap t) ++ ">"
  x -> error $ "javaType: " ++ show x

ktType :: AliasMap -> Type -> String
ktType aliasMap = \case
  Int     -> "Int"
  Int32   -> "Int"
  Word    -> "Int"
  Word32  -> "Int"
  Float   -> "Float"
  Bool    -> "Bool"
  String  -> "String"

  V2 Int        -> "V2I"
  V2 Word       -> "V2U"
  V2 Float      -> "V2F"
  V2 Bool       -> "V2B"
  V2 (V2 Float) -> "M22F"
  V2 (V3 Float) -> "M32F"
  V2 (V4 Float) -> "M42F"

  V3 Int        -> "V3I"
  V3 Word       -> "V3U"
  V3 Float      -> "V3F"
  V3 Bool       -> "V3B"
  V3 (V2 Float) -> "M23F"
  V3 (V3 Float) -> "M33F"
  V3 (V4 Float) -> "M43F"

  V4 Int        -> "V4I"
  V4 Word       -> "V4U"
  V4 Float      -> "V4F"
  V4 Bool       -> "V4B"
  V4 (V2 Float) -> "M24F"
  V4 (V3 Float) -> "M34F"
  V4 (V4 Float) -> "M44F"

  Array t       -> "Array<" ++ parens (ktType aliasMap t) ++ ">"
  List t        -> "List<" ++ ktType aliasMap t ++ ">"
  Maybe t       -> parens (ktType aliasMap t) ++ "?"
  Map k v       -> "Map<" ++ parens (ktType aliasMap k) ++ ", " ++ parens (hsType aliasMap v) ++ ">"
  -- user defined
  Data t        -> t
  x -> error $ "unknown type: " ++ show x

typeEnum :: AliasMap -> Type -> String
typeEnum aliasMap a = case normalize aliasMap a of
  Data t        -> t
  Int           -> "Int"
  Int32         -> "Int32"
  Word          -> "Word"
  Word32        -> "Word32"
  Float         -> "Float"
  Bool          -> "Bool"
  String        -> "String"
  Array t       -> "Array_" ++ typeEnum aliasMap t
  List t        -> "List_" ++ typeEnum aliasMap t
  Map k v       -> "Map_" ++ typeEnum aliasMap k ++ "_" ++ typeEnum aliasMap v
  V2 t          -> "V2_" ++ typeEnum aliasMap t
  V3 t          -> "V3_" ++ typeEnum aliasMap t
  V4 t          -> "V4_" ++ typeEnum aliasMap t
  Maybe t       -> "Maybe_" ++ typeEnum aliasMap t
  x -> error $ "unknown type: " ++ show x

csType :: String -> AliasMap -> Type -> String -- TODO
csType moduleName aliasMap a = case normalize aliasMap a of
  Data t        -> "global::" ++ moduleName ++ "." ++ t
  Int           -> "int"
  Int32         -> "int"
  Word          -> "uint"
  Word32        -> "uint"
  Float         -> "float"
  Bool          -> "bool"
  String        -> "string"
  Array t       -> "List<" ++ csType moduleName aliasMap t ++ ">"
  List t        -> "List<" ++ csType moduleName aliasMap t ++ ">"
  Map k v       -> "Dictionary<" ++ csType moduleName aliasMap k ++ ", " ++ csType moduleName aliasMap v ++ ">"
  V2 t          -> "V2<" ++ csType moduleName aliasMap t ++ ">"
  V3 t          -> "V3<" ++ csType moduleName aliasMap t ++ ">"
  V4 t          -> "V4<" ++ csType moduleName aliasMap t ++ ">"
  Maybe t       -> "Maybe<" ++ parens (csType moduleName aliasMap t) ++ ">"
  x -> error $ "unknown type: " ++ show x

cppType :: AliasMap -> Type -> String
cppType aliasMap = \case
  Int           -> "Int"
  Int32         -> "Int32"
  Word          -> "Word"
  Word32        -> "Word32"
  Float         -> "Float"
  Bool          -> "Bool"
  String        -> "String"

  V2 Int        -> "V2I"
  V2 Word       -> "V2U"
  V2 Float      -> "V2F"
  V2 Bool       -> "V2B"
  V2 (V2 Float) -> "M22F"
  V2 (V3 Float) -> "M32F"
  V2 (V4 Float) -> "M42F"

  V3 Int        -> "V3I"
  V3 Word       -> "V3U"
  V3 Float      -> "V3F"
  V3 Bool       -> "V3B"
  V3 (V2 Float) -> "M23F"
  V3 (V3 Float) -> "M33F"
  V3 (V4 Float) -> "M43F"

  V4 Int        -> "V4I"
  V4 Word       -> "V4U"
  V4 Float      -> "V4F"
  V4 Bool       -> "V4B"
  V4 (V2 Float) -> "M24F"
  V4 (V3 Float) -> "M34F"
  V4 (V4 Float) -> "M44F"

  Array t       -> "std::vector<" ++ cppType aliasMap t ++ ">"
  List t        -> "std::vector<" ++ cppType aliasMap t ++ ">"
  Maybe t       -> "Maybe<" ++ cppType aliasMap t ++ ">"
  Map k v       -> "std::map<" ++ cppType aliasMap k ++ ", " ++ cppType aliasMap v ++ ">"
  -- user defined
  Data t        -> case normalize aliasMap (Data t) of
    Data _  -> "std::shared_ptr<::" ++ t ++ ">"
    _       -> "::" ++ t
  x -> error $ "unknown type: " ++ show x

hasFieldNames :: [Field] -> Bool
hasFieldNames [] = False
hasFieldNames l = all (not . null . fieldName) l

nonSingular :: [ConstructorDef] -> Bool
nonSingular [] = False
nonSingular (_:[]) = False
nonSingular (_:_:_) = True

constType :: DataDef -> String
constType = head . words . show

instance ToJSON ConstructorDef
instance ToJSON DataDef
instance ToJSON Instance
instance ToJSON Field
instance ToJSON Type
instance ToJSON Target

instance FromJSON ConstructorDef
instance FromJSON DataDef
instance FromJSON Instance
instance FromJSON Field
instance FromJSON Type
instance FromJSON Target

type MDef = Writer [ModuleDef]
type DDef = Writer ([DataDef],[String])
type CDef = Writer ([ConstructorDef],[(Target,Instance)])

module_ :: String -> DDef () -> MDef ()
module_ n m = tell [let (d,i) = execWriter m in ModuleDef n i d]

import_ :: [String] -> DDef ()
import_ l = tell (mempty,l)

data_ :: String -> CDef () -> DDef ()
data_ n l = tell ([let (c,i) = execWriter l in DataDef n c i],mempty)

alias_ :: String -> Type -> DDef ()
alias_ n t = tell ([TypeAlias n t],mempty)

a #= b = alias_ a b

class IsField a where
  toField :: a -> Field

instance IsField Field where
  toField a = a

instance IsField Type where
  toField a = Field "" a

deriving_ :: [Target] -> [Instance] -> CDef ()
deriving_ targets instances = tell (mempty,[(t,i) | i <- instances, t <- targets])

const_ :: String -> [Type] -> CDef ()
const_ n t = tell ([ConstructorDef n [Field a b | Field a b <- map toField t]],mempty)

constR_ :: String -> [Field] -> CDef ()
constR_ n t = tell ([ConstructorDef n [Field a b | Field a b <- map toField t]],mempty)

enum_ :: String -> CDef ()
enum_ n = tell ([ConstructorDef n []],mempty)

v2b = V2 Bool
v3b = V3 Bool
v4b = V4 Bool
v2u = V2 Word
v3u = V3 Word
v4u = V4 Word
v2i = V2 Int
v3i = V3 Int
v4i = V4 Int
v2f = V2 Float
v3f = V3 Float
v4f = V4 Float
m22 = V2 v2f
m23 = V3 v2f
m24 = V4 v2f
m32 = V2 v3f
m33 = V3 v3f
m34 = V4 v3f
m42 = V2 v4f
m43 = V3 v4f
m44 = V4 v4f

(#::) :: String -> Type -> Field
a #:: b = Field a b

{-
  definitions:
    ADT
    Record
    Vector

  instances:
    Show
    Eq
    Ord

  serialization:
    json: encode/decode
    other?
-}
