-- generated file, do not modify!
<<<<<<< 4d40c4ee5ed15544d2ac7fb1ea7b61e89766d277
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
-- 2016-03-01T13:00:40.829757000000Z
=======
-- 2016-03-20T21:42:13.043021000000Z
>>>>>>> working c# backend
=======
-- 2016-03-20T22:19:43.692329000000Z
>>>>>>> fix c#
=======
-- 2016-03-21T11:36:01.244766000000Z
>>>>>>> work on java json loader

module TestData where
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
import LambdaCube.Mesh
import LambdaCube.PipelineSchema

data ClientInfo
  = ClientInfo
  { clientName :: String
  , clientBackend :: Backend
  }


data Frame
  = Frame
  { renderCount :: Int
  , frameUniforms :: StrMap Value
  , frameTextures :: StrMap Int
  }


data Scene
  = Scene
  { objectArrays :: StrMap (Array Int)
  , renderTargetWidth :: Int
  , renderTargetHeight :: Int
  , frames :: Array Frame
  }


data PipelineInfo
  = PipelineInfo
  { pipelineName :: String
  , pipeline :: Pipeline
  }


data RenderJob
  = RenderJob
  { meshes :: Array Mesh
  , textures :: Array String
  , schema :: PipelineSchema
  , scenes :: Array Scene
  , pipelines :: Array PipelineInfo
  }


data FrameResult
  = FrameResult
  { frRenderTimes :: Array Float
  , frImageWidth :: Int
  , frImageHeight :: Int
  }


data RenderJobResult
  = RenderJobResult FrameResult
  | RenderJobError String



instance encodeJsonClientInfo :: EncodeJson ClientInfo where
  encodeJson v = case v of
    ClientInfo r ->
      "tag" := "ClientInfo" ~>
      "clientName" := r.clientName ~>
      "clientBackend" := r.clientBackend ~>
      jsonEmptyObject

instance decodeJsonClientInfo :: DecodeJson ClientInfo where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "ClientInfo" -> do
        clientName <- obj .? "clientName"
        clientBackend <- obj .? "clientBackend"
        pure $ ClientInfo
          { clientName:clientName
          , clientBackend:clientBackend
          } 

instance encodeJsonFrame :: EncodeJson Frame where
  encodeJson v = case v of
    Frame r ->
      "tag" := "Frame" ~>
      "renderCount" := r.renderCount ~>
      "frameUniforms" := r.frameUniforms ~>
      "frameTextures" := r.frameTextures ~>
      jsonEmptyObject

instance decodeJsonFrame :: DecodeJson Frame where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "Frame" -> do
        renderCount <- obj .? "renderCount"
        frameUniforms <- obj .? "frameUniforms"
        frameTextures <- obj .? "frameTextures"
        pure $ Frame
          { renderCount:renderCount
          , frameUniforms:frameUniforms
          , frameTextures:frameTextures
          } 

instance encodeJsonScene :: EncodeJson Scene where
  encodeJson v = case v of
    Scene r ->
      "tag" := "Scene" ~>
      "objectArrays" := r.objectArrays ~>
      "renderTargetWidth" := r.renderTargetWidth ~>
      "renderTargetHeight" := r.renderTargetHeight ~>
      "frames" := r.frames ~>
      jsonEmptyObject

instance decodeJsonScene :: DecodeJson Scene where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "Scene" -> do
        objectArrays <- obj .? "objectArrays"
        renderTargetWidth <- obj .? "renderTargetWidth"
        renderTargetHeight <- obj .? "renderTargetHeight"
        frames <- obj .? "frames"
        pure $ Scene
          { objectArrays:objectArrays
          , renderTargetWidth:renderTargetWidth
          , renderTargetHeight:renderTargetHeight
          , frames:frames
          } 

instance encodeJsonPipelineInfo :: EncodeJson PipelineInfo where
  encodeJson v = case v of
    PipelineInfo r ->
      "tag" := "PipelineInfo" ~>
      "pipelineName" := r.pipelineName ~>
      "pipeline" := r.pipeline ~>
      jsonEmptyObject

instance decodeJsonPipelineInfo :: DecodeJson PipelineInfo where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "PipelineInfo" -> do
        pipelineName <- obj .? "pipelineName"
        pipeline <- obj .? "pipeline"
        pure $ PipelineInfo
          { pipelineName:pipelineName
          , pipeline:pipeline
          } 

instance encodeJsonRenderJob :: EncodeJson RenderJob where
  encodeJson v = case v of
    RenderJob r ->
      "tag" := "RenderJob" ~>
      "meshes" := r.meshes ~>
      "textures" := r.textures ~>
      "schema" := r.schema ~>
      "scenes" := r.scenes ~>
      "pipelines" := r.pipelines ~>
      jsonEmptyObject

instance decodeJsonRenderJob :: DecodeJson RenderJob where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "RenderJob" -> do
        meshes <- obj .? "meshes"
        textures <- obj .? "textures"
        schema <- obj .? "schema"
        scenes <- obj .? "scenes"
        pipelines <- obj .? "pipelines"
        pure $ RenderJob
          { meshes:meshes
          , textures:textures
          , schema:schema
          , scenes:scenes
          , pipelines:pipelines
          } 

instance encodeJsonFrameResult :: EncodeJson FrameResult where
  encodeJson v = case v of
    FrameResult r ->
      "tag" := "FrameResult" ~>
      "frRenderTimes" := r.frRenderTimes ~>
      "frImageWidth" := r.frImageWidth ~>
      "frImageHeight" := r.frImageHeight ~>
      jsonEmptyObject

instance decodeJsonFrameResult :: DecodeJson FrameResult where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "FrameResult" -> do
        frRenderTimes <- obj .? "frRenderTimes"
        frImageWidth <- obj .? "frImageWidth"
        frImageHeight <- obj .? "frImageHeight"
        pure $ FrameResult
          { frRenderTimes:frRenderTimes
          , frImageWidth:frImageWidth
          , frImageHeight:frImageHeight
          } 

instance encodeJsonRenderJobResult :: EncodeJson RenderJobResult where
  encodeJson v = case v of
    RenderJobResult arg0 -> "tag" := "RenderJobResult" ~> "arg0" := arg0 ~> jsonEmptyObject
    RenderJobError arg0 -> "tag" := "RenderJobError" ~> "arg0" := arg0 ~> jsonEmptyObject

instance decodeJsonRenderJobResult :: DecodeJson RenderJobResult where
  decodeJson json = do
    obj <- decodeJson json
    tag <- obj .? "tag"
    case tag of
      "RenderJobResult" -> RenderJobResult <$> obj .? "arg0"
      "RenderJobError" -> RenderJobError <$> obj .? "arg0"

