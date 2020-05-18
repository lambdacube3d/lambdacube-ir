// generated file, do not modify!
// 2020-05-18T22:52:34.098621Z

package LambdaCube.IR;

import RT.*;


typealias StreamName = Long

typealias ProgramName = Long

typealias TextureName = Long

typealias SamplerName = Long

typealias UniformName = String

typealias SlotName = Long

typealias FrameBufferComponent = Long

typealias TextureUnit = Long

typealias RenderTargetName = Long

typealias TextureUnitMapping = Map<UniformName, TextureUnit>

sealed class ArrayValue()
data class VBoolArray(
  val _0 : Array<Bool>,
) : ArrayValue()
data class VIntArray(
  val _0 : Array<Int>,
) : ArrayValue()
data class VWordArray(
  val _0 : Array<Int>,
) : ArrayValue()
data class VFloatArray(
  val _0 : Array<Float>,
) : ArrayValue()

sealed class Value()
data class VBool(
  val _0 : Bool,
) : Value()
data class VV2B(
  val _0 : V2B,
) : Value()
data class VV3B(
  val _0 : V3B,
) : Value()
data class VV4B(
  val _0 : V4B,
) : Value()
data class VWord(
  val _0 : Int,
) : Value()
data class VV2U(
  val _0 : V2U,
) : Value()
data class VV3U(
  val _0 : V3U,
) : Value()
data class VV4U(
  val _0 : V4U,
) : Value()
data class VInt(
  val _0 : Int,
) : Value()
data class VV2I(
  val _0 : V2I,
) : Value()
data class VV3I(
  val _0 : V3I,
) : Value()
data class VV4I(
  val _0 : V4I,
) : Value()
data class VFloat(
  val _0 : Float,
) : Value()
data class VV2F(
  val _0 : V2F,
) : Value()
data class VV3F(
  val _0 : V3F,
) : Value()
data class VV4F(
  val _0 : V4F,
) : Value()
data class VM22F(
  val _0 : M22F,
) : Value()
data class VM23F(
  val _0 : M23F,
) : Value()
data class VM24F(
  val _0 : M24F,
) : Value()
data class VM32F(
  val _0 : M32F,
) : Value()
data class VM33F(
  val _0 : M33F,
) : Value()
data class VM34F(
  val _0 : M34F,
) : Value()
data class VM42F(
  val _0 : M42F,
) : Value()
data class VM43F(
  val _0 : M43F,
) : Value()
data class VM44F(
  val _0 : M44F,
) : Value()

sealed class InputType()
object Bool : InputType()
object V2B : InputType()
object V3B : InputType()
object V4B : InputType()
object Word : InputType()
object V2U : InputType()
object V3U : InputType()
object V4U : InputType()
object Int : InputType()
object V2I : InputType()
object V3I : InputType()
object V4I : InputType()
object Float : InputType()
object V2F : InputType()
object V3F : InputType()
object V4F : InputType()
object M22F : InputType()
object M23F : InputType()
object M24F : InputType()
object M32F : InputType()
object M33F : InputType()
object M34F : InputType()
object M42F : InputType()
object M43F : InputType()
object M44F : InputType()
object STexture1D : InputType()
object STexture2D : InputType()
object STextureCube : InputType()
object STexture1DArray : InputType()
object STexture2DArray : InputType()
object STexture2DRect : InputType()
object FTexture1D : InputType()
object FTexture2D : InputType()
object FTexture3D : InputType()
object FTextureCube : InputType()
object FTexture1DArray : InputType()
object FTexture2DArray : InputType()
object FTexture2DMS : InputType()
object FTexture2DMSArray : InputType()
object FTextureBuffer : InputType()
object FTexture2DRect : InputType()
object ITexture1D : InputType()
object ITexture2D : InputType()
object ITexture3D : InputType()
object ITextureCube : InputType()
object ITexture1DArray : InputType()
object ITexture2DArray : InputType()
object ITexture2DMS : InputType()
object ITexture2DMSArray : InputType()
object ITextureBuffer : InputType()
object ITexture2DRect : InputType()
object UTexture1D : InputType()
object UTexture2D : InputType()
object UTexture3D : InputType()
object UTextureCube : InputType()
object UTexture1DArray : InputType()
object UTexture2DArray : InputType()
object UTexture2DMS : InputType()
object UTexture2DMSArray : InputType()
object UTextureBuffer : InputType()
object UTexture2DRect : InputType()

sealed class PointSpriteCoordOrigin()
object LowerLeft : PointSpriteCoordOrigin()
object UpperLeft : PointSpriteCoordOrigin()

sealed class PointSize()
data class PointSize(
  val _0 : Float,
) : PointSize()
object ProgramPointSize : PointSize()

sealed class PolygonOffset()
object NoOffset : PolygonOffset()
data class Offset(
  val _0 : Float,
  val _1 : Float,
) : PolygonOffset()

sealed class FrontFace()
object CCW : FrontFace()
object CW : FrontFace()

sealed class PolygonMode()
data class PolygonPoint(
  val _0 : PointSize,
) : PolygonMode()
data class PolygonLine(
  val _0 : Float,
) : PolygonMode()
object PolygonFill : PolygonMode()

sealed class ProvokingVertex()
object FirstVertex : ProvokingVertex()
object LastVertex : ProvokingVertex()

sealed class CullMode()
object CullNone : CullMode()
data class CullFront(
  val _0 : FrontFace,
) : CullMode()
data class CullBack(
  val _0 : FrontFace,
) : CullMode()

sealed class ComparisonFunction()
object Never : ComparisonFunction()
object Less : ComparisonFunction()
object Equal : ComparisonFunction()
object Lequal : ComparisonFunction()
object Greater : ComparisonFunction()
object Notequal : ComparisonFunction()
object Gequal : ComparisonFunction()
object Always : ComparisonFunction()

typealias DepthFunction = ComparisonFunction

sealed class StencilOperation()
object OpZero : StencilOperation()
object OpKeep : StencilOperation()
object OpReplace : StencilOperation()
object OpIncr : StencilOperation()
object OpIncrWrap : StencilOperation()
object OpDecr : StencilOperation()
object OpDecrWrap : StencilOperation()
object OpInvert : StencilOperation()

sealed class BlendEquation()
object FuncAdd : BlendEquation()
object FuncSubtract : BlendEquation()
object FuncReverseSubtract : BlendEquation()
object Min : BlendEquation()
object Max : BlendEquation()

sealed class BlendingFactor()
object Zero : BlendingFactor()
object One : BlendingFactor()
object SrcColor : BlendingFactor()
object OneMinusSrcColor : BlendingFactor()
object DstColor : BlendingFactor()
object OneMinusDstColor : BlendingFactor()
object SrcAlpha : BlendingFactor()
object OneMinusSrcAlpha : BlendingFactor()
object DstAlpha : BlendingFactor()
object OneMinusDstAlpha : BlendingFactor()
object ConstantColor : BlendingFactor()
object OneMinusConstantColor : BlendingFactor()
object ConstantAlpha : BlendingFactor()
object OneMinusConstantAlpha : BlendingFactor()
object SrcAlphaSaturate : BlendingFactor()

sealed class LogicOperation()
object Clear : LogicOperation()
object And : LogicOperation()
object AndReverse : LogicOperation()
object Copy : LogicOperation()
object AndInverted : LogicOperation()
object Noop : LogicOperation()
object Xor : LogicOperation()
object Or : LogicOperation()
object Nor : LogicOperation()
object Equiv : LogicOperation()
object Invert : LogicOperation()
object OrReverse : LogicOperation()
object CopyInverted : LogicOperation()
object OrInverted : LogicOperation()
object Nand : LogicOperation()
object Set : LogicOperation()

data class StencilOps(
  val frontStencilOp : StencilOperation,
  val backStencilOp : StencilOperation,
)

data class StencilTest(
  val stencilComparision : ComparisonFunction,
  val stencilReference : Int,
  val stencilMask : Int,
)

data class StencilTests(
  val _0 : StencilTest,
  val _1 : StencilTest,
)

sealed class FetchPrimitive()
object Points : FetchPrimitive()
object Lines : FetchPrimitive()
object Triangles : FetchPrimitive()
object LinesAdjacency : FetchPrimitive()
object TrianglesAdjacency : FetchPrimitive()

sealed class OutputPrimitive()
object TrianglesOutput : OutputPrimitive()
object LinesOutput : OutputPrimitive()
object PointsOutput : OutputPrimitive()

sealed class ColorArity()
object Red : ColorArity()
object RG : ColorArity()
object RGB : ColorArity()
object RGBA : ColorArity()

sealed class Blending()
object NoBlending : Blending()
data class BlendLogicOp(
  val _0 : LogicOperation,
) : Blending()
data class Blend(
  val colorEqSrc : BlendEquation,
  val alphaEqSrc : BlendEquation,
  val colorFSrc : BlendingFactor,
  val colorFDst : BlendingFactor,
  val alphaFSrc : BlendingFactor,
  val alphaFDst : BlendingFactor,
  val color : V4F,
) : Blending()

sealed class RasterContext()
data class PointCtx(
  val _0 : PointSize,
  val _1 : Float,
  val _2 : PointSpriteCoordOrigin,
) : RasterContext()
data class LineCtx(
  val _0 : Float,
  val _1 : ProvokingVertex,
) : RasterContext()
data class TriangleCtx(
  val _0 : CullMode,
  val _1 : PolygonMode,
  val _2 : PolygonOffset,
  val _3 : ProvokingVertex,
) : RasterContext()

sealed class FragmentOperation()
data class DepthOp(
  val _0 : DepthFunction,
  val _1 : Bool,
) : FragmentOperation()
data class StencilOp(
  val _0 : StencilTests,
  val _1 : StencilOps,
  val _2 : StencilOps,
) : FragmentOperation()
data class ColorOp(
  val _0 : Blending,
  val _1 : Value,
) : FragmentOperation()

data class AccumulationContext(
  val accViewportName : String?,
  val accOperations : List<FragmentOperation>,
)

sealed class TextureDataType()
data class FloatT(
  val _0 : ColorArity,
) : TextureDataType()
data class IntT(
  val _0 : ColorArity,
) : TextureDataType()
data class WordT(
  val _0 : ColorArity,
) : TextureDataType()
object ShadowT : TextureDataType()

sealed class TextureType()
data class Texture1D(
  val _0 : TextureDataType,
  val _1 : Long,
) : TextureType()
data class Texture2D(
  val _0 : TextureDataType,
  val _1 : Long,
) : TextureType()
data class Texture3D(
  val _0 : TextureDataType,
) : TextureType()
data class TextureCube(
  val _0 : TextureDataType,
) : TextureType()
data class TextureRect(
  val _0 : TextureDataType,
) : TextureType()
data class Texture2DMS(
  val _0 : TextureDataType,
  val _1 : Long,
  val _2 : Long,
  val _3 : Bool,
) : TextureType()
data class TextureBuffer(
  val _0 : TextureDataType,
) : TextureType()

sealed class MipMap()
data class Mip(
  val _0 : Long,
  val _1 : Long,
) : MipMap()
object NoMip : MipMap()
data class AutoMip(
  val _0 : Long,
  val _1 : Long,
) : MipMap()

sealed class Filter()
object Nearest : Filter()
object Linear : Filter()
object NearestMipmapNearest : Filter()
object NearestMipmapLinear : Filter()
object LinearMipmapNearest : Filter()
object LinearMipmapLinear : Filter()

sealed class EdgeMode()
object Repeat : EdgeMode()
object MirroredRepeat : EdgeMode()
object ClampToEdge : EdgeMode()
object ClampToBorder : EdgeMode()

sealed class ImageSemantic()
object Depth : ImageSemantic()
object Stencil : ImageSemantic()
object Color : ImageSemantic()

sealed class ImageRef()
data class TextureImage(
  val _0 : TextureName,
  val _1 : Long,
  val _2 : Long?,
) : ImageRef()
data class Framebuffer(
  val _0 : ImageSemantic,
) : ImageRef()

data class ClearImage(
  val imageSemantic : ImageSemantic,
  val clearValue : Value,
)

sealed class Command()
data class SetRasterContext(
  val _0 : RasterContext,
) : Command()
data class SetAccumulationContext(
  val _0 : AccumulationContext,
) : Command()
data class SetRenderTarget(
  val _0 : RenderTargetName,
) : Command()
data class SetProgram(
  val _0 : ProgramName,
) : Command()
data class SetSamplerUniform(
  val _0 : UniformName,
  val _1 : TextureUnit,
) : Command()
data class SetTexture(
  val _0 : TextureUnit,
  val _1 : TextureName,
) : Command()
data class SetSampler(
  val _0 : TextureUnit,
  val _1 : SamplerName?,
) : Command()
data class RenderSlot(
  val _0 : SlotName,
) : Command()
data class RenderStream(
  val _0 : StreamName,
) : Command()
data class ClearRenderTarget(
  val _0 : Array<ClearImage>,
) : Command()
data class GenerateMipMap(
  val _0 : TextureUnit,
) : Command()
data class SaveImage(
  val _0 : FrameBufferComponent,
  val _1 : ImageRef,
) : Command()
data class LoadImage(
  val _0 : ImageRef,
  val _1 : FrameBufferComponent,
) : Command()

data class SamplerDescriptor(
  val samplerWrapS : EdgeMode,
  val samplerWrapT : EdgeMode?,
  val samplerWrapR : EdgeMode?,
  val samplerMinFilter : Filter,
  val samplerMagFilter : Filter,
  val samplerBorderColor : Value,
  val samplerMinLod : Float?,
  val samplerMaxLod : Float?,
  val samplerLodBias : Float,
  val samplerCompareFunc : ComparisonFunction?,
)

data class TextureDescriptor(
  val textureType : TextureType,
  val textureSize : Value,
  val textureSemantic : ImageSemantic,
  val textureSampler : SamplerDescriptor,
  val textureBaseLevel : Long,
  val textureMaxLevel : Long,
)

data class Parameter(
  val name : String,
  val ty : InputType,
)

data class Program(
  val programUniforms : Map<UniformName, InputType>,
  val programStreams : Map<UniformName, Parameter>,
  val programInTextures : Map<UniformName, InputType>,
  val programOutput : Array<Parameter>,
  val vertexShader : String,
  val geometryShader : String?,
  val fragmentShader : String,
)

data class Slot(
  val slotName : String,
  val slotStreams : Map<String, InputType>,
  val slotUniforms : Map<UniformName, InputType>,
  val slotPrimitive : FetchPrimitive,
  val slotPrograms : Array<ProgramName>,
)

data class StreamData(
  val streamData : Map<String, ArrayValue>,
  val streamType : Map<String, InputType>,
  val streamPrimitive : FetchPrimitive,
  val streamPrograms : Array<ProgramName>,
)

data class TargetItem(
  val targetSemantic : ImageSemantic,
  val targetRef : ImageRef?,
)

data class RenderTarget(
  val renderTargets : Array<TargetItem>,
)

sealed class Backend()
object WebGL1 : Backend()
object OpenGL33 : Backend()

data class Pipeline(
  val info : String,
  val backend : Backend,
  val textures : Array<TextureDescriptor>,
  val samplers : Array<SamplerDescriptor>,
  val targets : Array<RenderTarget>,
  val programs : Array<Program>,
  val slots : Array<Slot>,
  val streams : Array<StreamData>,
  val commands : Array<Command>,
)

