// generated file, do not modify!
// 2020-05-21T18:29:16.46264Z

package LambdaCube.PipelineSchema

import RT.*

import LambdaCube.IR.*

sealed class StreamType()
object Attribute_Word : StreamType()
object Attribute_V2U : StreamType()
object Attribute_V3U : StreamType()
object Attribute_V4U : StreamType()
object Attribute_Int : StreamType()
object Attribute_V2I : StreamType()
object Attribute_V3I : StreamType()
object Attribute_V4I : StreamType()
object Attribute_Float : StreamType()
object Attribute_V2F : StreamType()
object Attribute_V3F : StreamType()
object Attribute_V4F : StreamType()
object Attribute_M22F : StreamType()
object Attribute_M23F : StreamType()
object Attribute_M24F : StreamType()
object Attribute_M32F : StreamType()
object Attribute_M33F : StreamType()
object Attribute_M34F : StreamType()
object Attribute_M42F : StreamType()
object Attribute_M43F : StreamType()
object Attribute_M44F : StreamType()

data class ObjectArraySchema(
  val primitive : FetchPrimitive,
  val attributes : Map<String, StreamType>,
)

data class PipelineSchema(
  val objectArrays : Map<String, ObjectArraySchema>,
  val uniforms : Map<String, InputType>,
)

