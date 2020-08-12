// generated file, do not modify!
// 2020-05-21T20:25:27.753757Z

package LambdaCube.PipelineSchema

import RT.*

import LambdaCube.IR.*

sealed class StreamType()
object _Attribute_Word : StreamType()
object _Attribute_V2U : StreamType()
object _Attribute_V3U : StreamType()
object _Attribute_V4U : StreamType()
object _Attribute_Int : StreamType()
object _Attribute_V2I : StreamType()
object _Attribute_V3I : StreamType()
object _Attribute_V4I : StreamType()
object _Attribute_Float : StreamType()
object _Attribute_V2F : StreamType()
object _Attribute_V3F : StreamType()
object _Attribute_V4F : StreamType()
object _Attribute_M22F : StreamType()
object _Attribute_M23F : StreamType()
object _Attribute_M24F : StreamType()
object _Attribute_M32F : StreamType()
object _Attribute_M33F : StreamType()
object _Attribute_M34F : StreamType()
object _Attribute_M42F : StreamType()
object _Attribute_M43F : StreamType()
object _Attribute_M44F : StreamType()

data class ObjectArraySchema(
  val primitive : FetchPrimitive,
  val attributes : Map<String, StreamType>,
)

data class PipelineSchema(
  val objectArrays : Map<String, ObjectArraySchema>,
  val uniforms : Map<String, InputType>,
)

