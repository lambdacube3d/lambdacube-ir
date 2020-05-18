// generated file, do not modify!
// 2020-05-18T22:30:51.145413Z

package TestData;

import LambdaCube.IR;
import LambdaCube.Mesh;
import LambdaCube.PipelineSchema;

data class ClientInfo(
  val clientName : String,
  val clientBackend : Backend,
)

data class Frame(
  val renderCount : Long,
  val frameUniforms : Map<String, Value>,
  val frameTextures : Map<String, Int>,
)

data class Scene(
  val objectArrays : Map<String, (Vector Int)>,
  val renderTargetWidth : Long,
  val renderTargetHeight : Long,
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
  val frImageWidth : Long,
  val frImageHeight : Long,
)

sealed class RenderJobResult()
data class RenderJobResult(
  val _0 : FrameResult,
) : RenderJobResult()
data class RenderJobError(
  val _0 : String,
) : RenderJobResult()

