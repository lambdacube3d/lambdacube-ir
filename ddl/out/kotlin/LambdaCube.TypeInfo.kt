// generated file, do not modify!
// 2020-05-18T22:30:51.129384Z

package LambdaCube.TypeInfo;

import LambdaCube.IR;

data class Range(
  val startLine : Long,
  val startColumn : Long,
  val endLine : Long,
  val endColumn : Long,
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
data class CompileError(
  val _0 : String,
  val _1 : Array<TypeInfo>,
  val _2 : Array<WarningInfo>,
  val _3 : Array<ErrorInfo>,
) : CompileResult()
data class Compiled(
  val _0 : String,
  val _1 : String,
  val _2 : Pipeline,
  val _3 : Array<TypeInfo>,
  val _4 : Array<WarningInfo>,
) : CompileResult()

