// generated file, do not modify!
// 2020-05-21T20:25:27.786125Z

package LambdaCube.TypeInfo

import RT.*

import LambdaCube.IR.*

data class Range(
  val startLine : Int,
  val startColumn : Int,
  val endLine : Int,
  val endColumn : Int,
)

data class TypeInfo(
  val range : Range,
  val text : String,
)

data class WarningInfo(
  val wRange : Range,
  val wText : String,
)

data class ErrorInfo(
  val eRange : Range,
  val eText : String,
)

sealed class CompileResult()
data class _CompileError(
  val _0 : String,
  val _1 : Array<TypeInfo>,
  val _2 : Array<WarningInfo>,
  val _3 : Array<ErrorInfo>,
) : CompileResult()
data class _Compiled(
  val _0 : String,
  val _1 : String,
  val _2 : Pipeline,
  val _3 : Array<TypeInfo>,
  val _4 : Array<WarningInfo>,
) : CompileResult()

