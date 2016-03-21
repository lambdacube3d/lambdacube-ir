-- generated file, do not modify!
-- 2016-03-21T13:14:18.137981000000Z

module LambdaCube.PipelineSchema where
import Prelude
import Data.Generic
import Data.Maybe (Maybe(..))
import Data.StrMap (StrMap(..))
import Data.Map (Map(..))
import Data.List (List(..))
import Linear

import Data.Argonaut.Combinators ((~>), (:=), (.?))
import Data.Argonaut.Core (jsonEmptyObject)
import Data.Argonaut.Printer (printJson)
import Data.Argonaut.Encode (EncodeJson, encodeJson)
import Data.Argonaut.Decode (DecodeJson, decodeJson)

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

data ObjectArraySchema
  = ObjectArraySchema
  { primitive :: FetchPrimitive
  , attributes :: StrMap StreamType
  }


data PipelineSchema
  = PipelineSchema
  { objectArrays :: StrMap ObjectArraySchema
  , uniforms :: StrMap InputType
  }




instance encodeJsonStreamType :: EncodeJson StreamType where
  encodeJson v = case v of
    Attribute_Word -> "tag" := "Attribute_Word" ~> jsonEmptyObject
    Attribute_V2U -> "tag" := "Attribute_V2U" ~> jsonEmptyObject
    Attribute_V3U -> "tag" := "Attribute_V3U" ~> jsonEmptyObject
    Attribute_V4U -> "tag" := "Attribute_V4U" ~> jsonEmptyObject
    Attribute_Int -> "tag" := "Attribute_Int" ~> jsonEmptyObject
    Attribute_V2I -> "tag" := "Attribute_V2I" ~> jsonEmptyObject
    Attribute_V3I -> "tag" := "Attribute_V3I" ~> jsonEmptyObject
    Attribute_V4I -> "tag" := "Attribute_V4I" ~> jsonEmptyObject
    Attribute_Float -> "tag" := "Attribute_Float" ~> jsonEmptyObject
    Attribute_V2F -> "tag" := "Attribute_V2F" ~> jsonEmptyObject
    Attribute_V3F -> "tag" := "Attribute_V3F" ~> jsonEmptyObject
    Attribute_V4F -> "tag" := "Attribute_V4F" ~> jsonEmptyObject
    Attribute_M22F -> "tag" := "Attribute_M22F" ~> jsonEmptyObject
    Attribute_M23F -> "tag" := "Attribute_M23F" ~> jsonEmptyObject
    Attribute_M24F -> "tag" := "Attribute_M24F" ~> jsonEmptyObject
    Attribute_M32F -> "tag" := "Attribute_M32F" ~> jsonEmptyObject
    Attribute_M33F -> "tag" := "Attribute_M33F" ~> jsonEmptyObject
    Attribute_M34F -> "tag" := "Attribute_M34F" ~> jsonEmptyObject
    Attribute_M42F -> "tag" := "Attribute_M42F" ~> jsonEmptyObject
    Attribute_M43F -> "tag" := "Attribute_M43F" ~> jsonEmptyObject
    Attribute_M44F -> "tag" := "Attribute_M44F" ~> jsonEmptyObject

instance decodeJsonStreamType :: DecodeJson StreamType where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
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

instance encodeJsonObjectArraySchema :: EncodeJson ObjectArraySchema where
  encodeJson v = case v of
    ObjectArraySchema r ->
      "tag" := "ObjectArraySchema" ~>
      "primitive" := r.primitive ~>
      "attributes" := r.attributes ~>
      jsonEmptyObject

instance decodeJsonObjectArraySchema :: DecodeJson ObjectArraySchema where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "ObjectArraySchema" -> do
        primitive <- obj .? "primitive"
        attributes <- obj .? "attributes"
        pure $ ObjectArraySchema
          { primitive:primitive
          , attributes:attributes
          } 

instance encodeJsonPipelineSchema :: EncodeJson PipelineSchema where
  encodeJson v = case v of
    PipelineSchema r ->
      "tag" := "PipelineSchema" ~>
      "objectArrays" := r.objectArrays ~>
      "uniforms" := r.uniforms ~>
      jsonEmptyObject

instance decodeJsonPipelineSchema :: DecodeJson PipelineSchema where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "PipelineSchema" -> do
        objectArrays <- obj .? "objectArrays"
        uniforms <- obj .? "uniforms"
        pure $ PipelineSchema
          { objectArrays:objectArrays
          , uniforms:uniforms
          } 

