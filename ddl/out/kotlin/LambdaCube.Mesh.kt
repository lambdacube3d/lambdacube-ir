// generated file, do not modify!
// 2020-05-21T20:25:27.766405Z

package LambdaCube.Mesh

import RT.*


sealed class MeshAttribute()
data class _A_Float(
  val _0 : Array<Float>,
) : MeshAttribute()
data class _A_V2F(
  val _0 : Array<V2F>,
) : MeshAttribute()
data class _A_V3F(
  val _0 : Array<V3F>,
) : MeshAttribute()
data class _A_V4F(
  val _0 : Array<V4F>,
) : MeshAttribute()
data class _A_M22F(
  val _0 : Array<M22F>,
) : MeshAttribute()
data class _A_M33F(
  val _0 : Array<M33F>,
) : MeshAttribute()
data class _A_M44F(
  val _0 : Array<M44F>,
) : MeshAttribute()
data class _A_Int(
  val _0 : Array<Int>,
) : MeshAttribute()
data class _A_Word(
  val _0 : Array<Int>,
) : MeshAttribute()

sealed class MeshPrimitive()
object _P_Points : MeshPrimitive()
object _P_TriangleStrip : MeshPrimitive()
object _P_Triangles : MeshPrimitive()
data class _P_TriangleStripI(
  val _0 : Array<Int>,
) : MeshPrimitive()
data class _P_TrianglesI(
  val _0 : Array<Int>,
) : MeshPrimitive()

data class Mesh(
  val mAttributes : Map<String, MeshAttribute>,
  val mPrimitive : MeshPrimitive,
)

