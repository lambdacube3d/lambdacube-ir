-- generated file, do not modify!
-- 2016-02-12T16:05:13.310528000000Z

{-# LANGUAGE OverloadedStrings, RecordWildCards #-}
module LambdaCube.PipelineSchema where

import Data.Int
import Data.Word
import Data.Map
import Data.Vector (Vector(..))
import LambdaCube.Linear

import Data.Text
import Data.Aeson hiding (Value,Bool)
import Data.Aeson.Types hiding (Value,Bool)
import Control.Monad

import LambdaCube.IR

data StreamType
  = Attribute_Word
  | Attribute_V2U
  | Attribute_V3U
  | Attribute_V4U
  | Attribute_Int
  | Attribute_V2I
  | Attribute_V3I
  | Attribute_V4I
  | Attribute_Float
  | Attribute_V2F
  | Attribute_V3F
  | Attribute_V4F
  | Attribute_M22F
  | Attribute_M23F
  | Attribute_M24F
  | Attribute_M32F
  | Attribute_M33F
  | Attribute_M34F
  | Attribute_M42F
  | Attribute_M43F
  | Attribute_M44F
  deriving (Show, Eq, Ord)

data ObjectArraySchema
  = ObjectArraySchema
  { primitive :: FetchPrimitive
  , attributes :: Map String StreamType
  }

  deriving (Show, Eq, Ord)

data PipelineSchema
  = PipelineSchema
  { objectArrays :: Map String ObjectArraySchema
  , uniforms :: Map String InputType
  }

  deriving (Show, Eq, Ord)


instance ToJSON StreamType where
  toJSON v = case v of
    Attribute_Word -> object [ "tag" .= ("Attribute_Word" :: Text)]
    Attribute_V2U -> object [ "tag" .= ("Attribute_V2U" :: Text)]
    Attribute_V3U -> object [ "tag" .= ("Attribute_V3U" :: Text)]
    Attribute_V4U -> object [ "tag" .= ("Attribute_V4U" :: Text)]
    Attribute_Int -> object [ "tag" .= ("Attribute_Int" :: Text)]
    Attribute_V2I -> object [ "tag" .= ("Attribute_V2I" :: Text)]
    Attribute_V3I -> object [ "tag" .= ("Attribute_V3I" :: Text)]
    Attribute_V4I -> object [ "tag" .= ("Attribute_V4I" :: Text)]
    Attribute_Float -> object [ "tag" .= ("Attribute_Float" :: Text)]
    Attribute_V2F -> object [ "tag" .= ("Attribute_V2F" :: Text)]
    Attribute_V3F -> object [ "tag" .= ("Attribute_V3F" :: Text)]
    Attribute_V4F -> object [ "tag" .= ("Attribute_V4F" :: Text)]
    Attribute_M22F -> object [ "tag" .= ("Attribute_M22F" :: Text)]
    Attribute_M23F -> object [ "tag" .= ("Attribute_M23F" :: Text)]
    Attribute_M24F -> object [ "tag" .= ("Attribute_M24F" :: Text)]
    Attribute_M32F -> object [ "tag" .= ("Attribute_M32F" :: Text)]
    Attribute_M33F -> object [ "tag" .= ("Attribute_M33F" :: Text)]
    Attribute_M34F -> object [ "tag" .= ("Attribute_M34F" :: Text)]
    Attribute_M42F -> object [ "tag" .= ("Attribute_M42F" :: Text)]
    Attribute_M43F -> object [ "tag" .= ("Attribute_M43F" :: Text)]
    Attribute_M44F -> object [ "tag" .= ("Attribute_M44F" :: Text)]

instance FromJSON StreamType where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "Attribute_Word" -> pure Attribute_Word
      "Attribute_V2U" -> pure Attribute_V2U
      "Attribute_V3U" -> pure Attribute_V3U
      "Attribute_V4U" -> pure Attribute_V4U
      "Attribute_Int" -> pure Attribute_Int
      "Attribute_V2I" -> pure Attribute_V2I
      "Attribute_V3I" -> pure Attribute_V3I
      "Attribute_V4I" -> pure Attribute_V4I
      "Attribute_Float" -> pure Attribute_Float
      "Attribute_V2F" -> pure Attribute_V2F
      "Attribute_V3F" -> pure Attribute_V3F
      "Attribute_V4F" -> pure Attribute_V4F
      "Attribute_M22F" -> pure Attribute_M22F
      "Attribute_M23F" -> pure Attribute_M23F
      "Attribute_M24F" -> pure Attribute_M24F
      "Attribute_M32F" -> pure Attribute_M32F
      "Attribute_M33F" -> pure Attribute_M33F
      "Attribute_M34F" -> pure Attribute_M34F
      "Attribute_M42F" -> pure Attribute_M42F
      "Attribute_M43F" -> pure Attribute_M43F
      "Attribute_M44F" -> pure Attribute_M44F
  parseJSON _ = mzero

instance ToJSON ObjectArraySchema where
  toJSON v = case v of
    ObjectArraySchema{..} -> object
      [ "tag" .= ("ObjectArraySchema" :: Text)
      , "primitive" .= primitive
      , "attributes" .= attributes
      ]

instance FromJSON ObjectArraySchema where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "ObjectArraySchema" -> do
        primitive <- obj .: "primitive"
        attributes <- obj .: "attributes"
        pure $ ObjectArraySchema
          { primitive = primitive
          , attributes = attributes
          } 
  parseJSON _ = mzero

instance ToJSON PipelineSchema where
  toJSON v = case v of
    PipelineSchema{..} -> object
      [ "tag" .= ("PipelineSchema" :: Text)
      , "objectArrays" .= objectArrays
      , "uniforms" .= uniforms
      ]

instance FromJSON PipelineSchema where
  parseJSON (Object obj) = do
    tag <- obj .: "tag"
    case tag :: Text of
      "PipelineSchema" -> do
        objectArrays <- obj .: "objectArrays"
        uniforms <- obj .: "uniforms"
        pure $ PipelineSchema
          { objectArrays = objectArrays
          , uniforms = uniforms
          } 
  parseJSON _ = mzero

