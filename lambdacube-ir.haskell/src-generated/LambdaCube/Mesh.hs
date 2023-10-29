-- generated file, do not modify!
-- 2023-10-27T02:34:24.280572454Z

{-# LANGUAGE OverloadedStrings, RecordWildCards #-}
module LambdaCube.Mesh where

import Data.Int
import Data.Word
import Data.Map
import Data.Vector (Vector(..))
import LambdaCube.Linear

import Data.Text
import Data.Aeson hiding (Value,Bool)
import Data.Aeson.Types hiding (Value,Bool)
import Control.Monad


data MeshAttribute
  = A_Float (Vector Float)
  | A_V2F (Vector V2F)
  | A_V3F (Vector V3F)
  | A_V4F (Vector V4F)
  | A_M22F (Vector M22F)
  | A_M33F (Vector M33F)
  | A_M44F (Vector M44F)
  | A_Int (Vector Int32)
  | A_Word (Vector Word32)
  deriving (Show, Eq, Ord)

data MeshPrimitive
  = P_Points
  | P_LineStrip
  | P_LineLoop
  | P_Lines
  | P_TriangleStrip
  | P_TriangleFan
  | P_Triangles
  | P_TriangleStripI (Vector Int32)
  | P_TrianglesI (Vector Int32)
  deriving (Show, Eq, Ord)

data Mesh
  = Mesh
  { mAttributes :: Map String MeshAttribute
  , mPrimitive :: MeshPrimitive
  }

  deriving (Show, Eq, Ord)


instance ToJSON MeshAttribute where
  toJSON v = case v of
    A_Float arg0 -> object [ "tag" .= ("A_Float" :: Text), "arg0" .= arg0]
    A_V2F arg0 -> object [ "tag" .= ("A_V2F" :: Text), "arg0" .= arg0]
    A_V3F arg0 -> object [ "tag" .= ("A_V3F" :: Text), "arg0" .= arg0]
    A_V4F arg0 -> object [ "tag" .= ("A_V4F" :: Text), "arg0" .= arg0]
    A_M22F arg0 -> object [ "tag" .= ("A_M22F" :: Text), "arg0" .= arg0]
    A_M33F arg0 -> object [ "tag" .= ("A_M33F" :: Text), "arg0" .= arg0]
    A_M44F arg0 -> object [ "tag" .= ("A_M44F" :: Text), "arg0" .= arg0]
    A_Int arg0 -> object [ "tag" .= ("A_Int" :: Text), "arg0" .= arg0]
    A_Word arg0 -> object [ "tag" .= ("A_Word" :: Text), "arg0" .= arg0]

instance FromJSON MeshAttribute where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "A_Float" -> A_Float <$> obj .: "arg0"
      "A_V2F" -> A_V2F <$> obj .: "arg0"
      "A_V3F" -> A_V3F <$> obj .: "arg0"
      "A_V4F" -> A_V4F <$> obj .: "arg0"
      "A_M22F" -> A_M22F <$> obj .: "arg0"
      "A_M33F" -> A_M33F <$> obj .: "arg0"
      "A_M44F" -> A_M44F <$> obj .: "arg0"
      "A_Int" -> A_Int <$> obj .: "arg0"
      "A_Word" -> A_Word <$> obj .: "arg0"
  parseJSON _ = mzero

instance ToJSON MeshPrimitive where
  toJSON v = case v of
    P_Points -> object [ "tag" .= ("P_Points" :: Text)]
    P_LineStrip -> object [ "tag" .= ("P_LineStrip" :: Text)]
    P_LineLoop -> object [ "tag" .= ("P_LineLoop" :: Text)]
    P_Lines -> object [ "tag" .= ("P_Lines" :: Text)]
    P_TriangleStrip -> object [ "tag" .= ("P_TriangleStrip" :: Text)]
    P_TriangleFan -> object [ "tag" .= ("P_TriangleFan" :: Text)]
    P_Triangles -> object [ "tag" .= ("P_Triangles" :: Text)]
    P_TriangleStripI arg0 -> object [ "tag" .= ("P_TriangleStripI" :: Text), "arg0" .= arg0]
    P_TrianglesI arg0 -> object [ "tag" .= ("P_TrianglesI" :: Text), "arg0" .= arg0]

instance FromJSON MeshPrimitive where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "P_Points" -> pure P_Points
      "P_LineStrip" -> pure P_LineStrip
      "P_LineLoop" -> pure P_LineLoop
      "P_Lines" -> pure P_Lines
      "P_TriangleStrip" -> pure P_TriangleStrip
      "P_TriangleFan" -> pure P_TriangleFan
      "P_Triangles" -> pure P_Triangles
      "P_TriangleStripI" -> P_TriangleStripI <$> obj .: "arg0"
      "P_TrianglesI" -> P_TrianglesI <$> obj .: "arg0"
  parseJSON _ = mzero

instance ToJSON Mesh where
  toJSON v = case v of
    Mesh{..} -> object
      [ "tag" .= ("Mesh" :: Text)
      , "mAttributes" .= mAttributes
      , "mPrimitive" .= mPrimitive
      ]

instance FromJSON Mesh where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "Mesh" -> do
        mAttributes <- obj .: "mAttributes"
        mPrimitive <- obj .: "mPrimitive"
        pure $ Mesh
          { mAttributes = mAttributes
          , mPrimitive = mPrimitive
          } 
  parseJSON _ = mzero

