// generated file, do not modify!
// 2020-05-21T18:52:11.118474Z

package TestData

import RT.*

import LambdaCube.IR.*
import LambdaCube.Mesh.*
import LambdaCube.PipelineSchema.*

data class ClientInfo(
  val clientName : String,
  val clientBackend : Backend,
)

data class Frame(
  val renderCount : Int,
  val frameUniforms : Map<String, Value>,
  val frameTextures : Map<String, Int>,
)

data class Scene(
  val objectArrays : Map<String, (Vector Int)>,
  val renderTargetWidth : Int,
  val renderTargetHeight : Int,
  val frames : Array<Frame>,
)

data class PipelineInfo(
  val pipelineName : String,
  val pipeline : Pipeline,
)

data class RenderJob(
  val meshes : Array<Mesh>,
  val textures : Array<String>,
  val schema : PipelineSchema,
  val scenes : Array<Scene>,
  val pipelines : Array<PipelineInfo>,
)

data class FrameResult(
  val frRenderTimes : Array<Float>,
  val frImageWidth : Int,
  val frImageHeight : Int,
)

sealed class RenderJobResult()
data class RenderJobResult(
  val _0 : FrameResult,
) : RenderJobResult()
data class RenderJobError(
  val _0 : String,
) : RenderJobResult()

