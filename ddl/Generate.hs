{-# LANGUAGE OverloadedStrings, FlexibleInstances, LambdaCase #-}
import qualified Data.Text.Lazy as LText
import           Text.EDE
import           Text.EDE.Filters

import           Data.HashMap.Strict          (HashMap)
import qualified Data.HashMap.Strict          as HashMap
import           Data.Text                    (Text)
import qualified Data.Map as Map
import qualified Data.Set as Set

import System.Directory
import System.FilePath

import Data.Time.Clock
import Control.Monad.Writer

import Definitions
import Language

instance Unquote [Field]
instance Unquote [Char]
instance Quote [Char]
instance Unquote DataDef
instance Unquote Type

main :: IO ()
main = do
  dataSwift <- eitherParseFile "templates/data.swift.ede"
  dataJava <- eitherParseFile "templates/data.java.ede"
  jsonJava <- eitherParseFile "templates/json.java.ede"
  dataHpp <- eitherParseFile "templates/data.hpp.ede"
  dataHpp2 <- eitherParseFile "templates/data.hpp2.ede"
  dataCpp <- eitherParseFile "templates/data.cpp.ede"
  dataCs <- eitherParseFile "templates/data.cs.ede"
  dataHs <- eitherParseFile "templates/data.hs.ede"
  dataPs <- eitherParseFile "templates/data.purs.ede"
  let generate mod@(ModuleDef name imports def) = do
        dt <- getCurrentTime
        let env = fromPairs
              [ "dataAndType" .= def
              , "definitions" .= [a | a@DataDef{} <- def ]
              , "moduleName"  .= name
              , "dateTime"    .= dt
              , "imports"     .= imports
              , "usedTypes"   .= collectTypes aliasMap mod
              , "usedCSTypes" .= (Set.fromList $ Map.elems $ Map.fromList [ (csType name aliasMap t,t) | t <- Set.toList $ collectTypes aliasMap mod])
              ]
            aliasMap = Map.fromList [(n,t) | TypeAlias n t <- def]
            mylib :: HashMap Text Term
            mylib = HashMap.fromList
                [ "hasFieldNames"   @: hasFieldNames
                , "parens"          @: parens
                , "constType"       @: constType
                , "hsType"          @: hsType aliasMap
                , "psType"          @: psType aliasMap
                , "cppType"         @: cppType aliasMap
                , "csType"          @: csType name aliasMap
                , "typeEnum"        @: typeEnum aliasMap
                , "javaType"        @: javaType aliasMap
                , "swiftType"       @: swiftType aliasMap
                , "hasEnumConstructor" @: hasEnumConstructor
                ]

        -- Haskell
        either error (\x -> writeFile ("out/" ++ name ++ ".hs") $ LText.unpack x) $ dataHs >>= (\t -> eitherRenderWith mylib t env)
        -- Purescript
        either error (\x -> writeFile ("out/" ++ name ++ ".purs") $ LText.unpack x) $ dataPs >>= (\t -> eitherRenderWith mylib t env)
        -- C++
        either error (\x -> writeFile ("out/" ++ name ++ "2.hpp") $ LText.unpack x) $ dataHpp2 >>= (\t -> eitherRenderWith mylib t env)
        either error (\x -> writeFile ("out/" ++ name ++ ".hpp") $ LText.unpack x) $ dataHpp >>= (\t -> eitherRenderWith mylib t env)
        either error (\x -> writeFile ("out/" ++ name ++ ".cpp") $ LText.unpack x) $ dataCpp >>= (\t -> eitherRenderWith mylib t env)
        -- Java
        let toPath a = flip map a $ \case
              '.' -> '/'
              c -> c
        forM_ [a | a@DataDef{} <- def {-TODO-}] $ \d -> do
          let env = fromPairs
                [ "def"         .= d
                , "moduleName"  .= name
                , "dateTime"    .= dt
                , "imports"     .= imports
                ]
              fname = "out/java/" ++ toPath name ++ "/" ++ dataName d ++ ".java"
              dir = takeDirectory fname
          createDirectoryIfMissing True dir
          either error (\x -> writeFile fname $ LText.unpack x) $ dataJava >>= (\t -> eitherRenderWith mylib t env)
        either error (\x -> writeFile ("out/java/" ++ toPath name ++ "/JSON.java") $ LText.unpack x) $ jsonJava >>= (\t -> eitherRenderWith mylib t env)
        -- C#
        either error (\x -> writeFile ("out/" ++ name ++ ".cs") $ LText.unpack x) $ dataCs >>= (\t -> eitherRenderWith mylib t env)
        -- Swift
        either error (\x -> writeFile ("out/" ++ name ++ ".swift") $ LText.unpack x) $ dataSwift >>= (\t -> eitherRenderWith mylib t env)
  mapM_ generate $ execWriter modules
