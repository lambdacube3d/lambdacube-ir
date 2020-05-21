// generated file, do not modify!
// 2020-05-21T20:25:27.552277Z

package LambdaCube.IR

import RT.*


typealias StreamName = Int

typealias ProgramName = Int

typealias TextureName = Int

typealias SamplerName = Int

typealias UniformName = String

typealias SlotName = Int

typealias FrameBufferComponent = Int

typealias TextureUnit = Int

typealias RenderTargetName = Int

typealias TextureUnitMapping = Map<UniformName, TextureUnit>

sealed class ArrayValue()
data class _VBoolArray(
  val _0 : Array<Bool>,
) : ArrayValue()
data class _VIntArray(
  val _0 : Array<Int>,
) : ArrayValue()
data class _VWordArray(
  val _0 : Array<Int>,
) : ArrayValue()
data class _VFloatArray(
  val _0 : Array<Float>,
) : ArrayValue()

sealed class Value()
data class _VBool(
  val _0 : Bool,
) : Value()
data class _VV2B(
  val _0 : V2B,
) : Value()
data class _VV3B(
  val _0 : V3B,
) : Value()
data class _VV4B(
  val _0 : V4B,
) : Value()
data class _VWord(
  val _0 : Int,
) : Value()
data class _VV2U(
  val _0 : V2U,
) : Value()
data class _VV3U(
  val _0 : V3U,
) : Value()
data class _VV4U(
  val _0 : V4U,
) : Value()
data class _VInt(
  val _0 : Int,
) : Value()
data class _VV2I(
  val _0 : V2I,
) : Value()
data class _VV3I(
  val _0 : V3I,
) : Value()
data class _VV4I(
  val _0 : V4I,
) : Value()
data class _VFloat(
  val _0 : Float,
) : Value()
data class _VV2F(
  val _0 : V2F,
) : Value()
data class _VV3F(
  val _0 : V3F,
) : Value()
data class _VV4F(
  val _0 : V4F,
) : Value()
data class _VM22F(
  val _0 : M22F,
) : Value()
data class _VM23F(
  val _0 : M23F,
) : Value()
data class _VM24F(
  val _0 : M24F,
) : Value()
data class _VM32F(
  val _0 : M32F,
) : Value()
data class _VM33F(
  val _0 : M33F,
) : Value()
data class _VM34F(
  val _0 : M34F,
) : Value()
data class _VM42F(
  val _0 : M42F,
) : Value()
data class _VM43F(
  val _0 : M43F,
) : Value()
data class _VM44F(
  val _0 : M44F,
) : Value()

sealed class InputType()
object _Bool : InputType()
object _V2B : InputType()
object _V3B : InputType()
object _V4B : InputType()
object _Word : InputType()
object _V2U : InputType()
object _V3U : InputType()
object _V4U : InputType()
object _Int : InputType()
object _V2I : InputType()
object _V3I : InputType()
object _V4I : InputType()
object _Float : InputType()
object _V2F : InputType()
object _V3F : InputType()
object _V4F : InputType()
object _M22F : InputType()
object _M23F : InputType()
object _M24F : InputType()
object _M32F : InputType()
object _M33F : InputType()
object _M34F : InputType()
object _M42F : InputType()
object _M43F : InputType()
object _M44F : InputType()
object _STexture1D : InputType()
object _STexture2D : InputType()
object _STextureCube : InputType()
object _STexture1DArray : InputType()
object _STexture2DArray : InputType()
object _STexture2DRect : InputType()
object _FTexture1D : InputType()
object _FTexture2D : InputType()
object _FTexture3D : InputType()
object _FTextureCube : InputType()
object _FTexture1DArray : InputType()
object _FTexture2DArray : InputType()
object _FTexture2DMS : InputType()
object _FTexture2DMSArray : InputType()
object _FTextureBuffer : InputType()
object _FTexture2DRect : InputType()
object _ITexture1D : InputType()
object _ITexture2D : InputType()
object _ITexture3D : InputType()
object _ITextureCube : InputType()
object _ITexture1DArray : InputType()
object _ITexture2DArray : InputType()
object _ITexture2DMS : InputType()
object _ITexture2DMSArray : InputType()
object _ITextureBuffer : InputType()
object _ITexture2DRect : InputType()
object _UTexture1D : InputType()
object _UTexture2D : InputType()
object _UTexture3D : InputType()
object _UTextureCube : InputType()
object _UTexture1DArray : InputType()
object _UTexture2DArray : InputType()
object _UTexture2DMS : InputType()
object _UTexture2DMSArray : InputType()
object _UTextureBuffer : InputType()
object _UTexture2DRect : InputType()

sealed class PointSpriteCoordOrigin()
object _LowerLeft : PointSpriteCoordOrigin()
object _UpperLeft : PointSpriteCoordOrigin()

sealed class PointSize()
data class _PointSize(
  val _0 : Float,
) : PointSize()
object _ProgramPointSize : PointSize()

sealed class PolygonOffset()
object _NoOffset : PolygonOffset()
data class _Offset(
  val _0 : Float,
  val _1 : Float,
) : PolygonOffset()

sealed class FrontFace()
object _CCW : FrontFace()
object _CW : FrontFace()

sealed class PolygonMode()
data class _PolygonPoint(
  val _0 : PointSize,
) : PolygonMode()
data class _PolygonLine(
  val _0 : Float,
) : PolygonMode()
object _PolygonFill : PolygonMode()

sealed class ProvokingVertex()
object _FirstVertex : ProvokingVertex()
object _LastVertex : ProvokingVertex()

sealed class CullMode()
object _CullNone : CullMode()
data class _CullFront(
  val _0 : FrontFace,
) : CullMode()
data class _CullBack(
  val _0 : FrontFace,
) : CullMode()

sealed class ComparisonFunction()
object _Never : ComparisonFunction()
object _Less : ComparisonFunction()
object _Equal : ComparisonFunction()
object _Lequal : ComparisonFunction()
object _Greater : ComparisonFunction()
object _Notequal : ComparisonFunction()
object _Gequal : ComparisonFunction()
object _Always : ComparisonFunction()

typealias DepthFunction = ComparisonFunction

sealed class StencilOperation()
object _OpZero : StencilOperation()
object _OpKeep : StencilOperation()
object _OpReplace : StencilOperation()
object _OpIncr : StencilOperation()
object _OpIncrWrap : StencilOperation()
object _OpDecr : StencilOperation()
object _OpDecrWrap : StencilOperation()
object _OpInvert : StencilOperation()

sealed class BlendEquation()
object _FuncAdd : BlendEquation()
object _FuncSubtract : BlendEquation()
object _FuncReverseSubtract : BlendEquation()
object _Min : BlendEquation()
object _Max : BlendEquation()

sealed class BlendingFactor()
object _Zero : BlendingFactor()
object _One : BlendingFactor()
object _SrcColor : BlendingFactor()
object _OneMinusSrcColor : BlendingFactor()
object _DstColor : BlendingFactor()
object _OneMinusDstColor : BlendingFactor()
object _SrcAlpha : BlendingFactor()
object _OneMinusSrcAlpha : BlendingFactor()
object _DstAlpha : BlendingFactor()
object _OneMinusDstAlpha : BlendingFactor()
object _ConstantColor : BlendingFactor()
object _OneMinusConstantColor : BlendingFactor()
object _ConstantAlpha : BlendingFactor()
object _OneMinusConstantAlpha : BlendingFactor()
object _SrcAlphaSaturate : BlendingFactor()

sealed class LogicOperation()
object _Clear : LogicOperation()
object _And : LogicOperation()
object _AndReverse : LogicOperation()
object _Copy : LogicOperation()
object _AndInverted : LogicOperation()
object _Noop : LogicOperation()
object _Xor : LogicOperation()
object _Or : LogicOperation()
object _Nor : LogicOperation()
object _Equiv : LogicOperation()
object _Invert : LogicOperation()
object _OrReverse : LogicOperation()
object _CopyInverted : LogicOperation()
object _OrInverted : LogicOperation()
object _Nand : LogicOperation()
object _Set : LogicOperation()

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
object _Points : FetchPrimitive()
object _Lines : FetchPrimitive()
object _Triangles : FetchPrimitive()
object _LinesAdjacency : FetchPrimitive()
object _TrianglesAdjacency : FetchPrimitive()

sealed class OutputPrimitive()
object _TrianglesOutput : OutputPrimitive()
object _LinesOutput : OutputPrimitive()
object _PointsOutput : OutputPrimitive()

sealed class ColorArity()
object _Red : ColorArity()
object _RG : ColorArity()
object _RGB : ColorArity()
object _RGBA : ColorArity()

sealed class Blending()
object _NoBlending : Blending()
data class _BlendLogicOp(
  val _0 : LogicOperation,
) : Blending()
data class _Blend(
  val colorEqSrc : BlendEquation,
  val alphaEqSrc : BlendEquation,
  val colorFSrc : BlendingFactor,
  val colorFDst : BlendingFactor,
  val alphaFSrc : BlendingFactor,
  val alphaFDst : BlendingFactor,
  val color : V4F,
) : Blending()

sealed class RasterContext()
data class _PointCtx(
  val _0 : PointSize,
  val _1 : Float,
  val _2 : PointSpriteCoordOrigin,
) : RasterContext()
data class _LineCtx(
  val _0 : Float,
  val _1 : ProvokingVertex,
) : RasterContext()
data class _TriangleCtx(
  val _0 : CullMode,
  val _1 : PolygonMode,
  val _2 : PolygonOffset,
  val _3 : ProvokingVertex,
) : RasterContext()

sealed class FragmentOperation()
data class _DepthOp(
  val _0 : DepthFunction,
  val _1 : Bool,
) : FragmentOperation()
data class _StencilOp(
  val _0 : StencilTests,
  val _1 : StencilOps,
  val _2 : StencilOps,
) : FragmentOperation()
data class _ColorOp(
  val _0 : Blending,
  val _1 : Value,
) : FragmentOperation()

data class AccumulationContext(
  val accViewportName : String?,
  val accOperations : List<FragmentOperation>,
)

sealed class TextureDataType()
data class _FloatT(
  val _0 : ColorArity,
) : TextureDataType()
data class _IntT(
  val _0 : ColorArity,
) : TextureDataType()
data class _WordT(
  val _0 : ColorArity,
) : TextureDataType()
object _ShadowT : TextureDataType()

sealed class TextureType()
data class _Texture1D(
  val _0 : TextureDataType,
  val _1 : Int,
) : TextureType()
data class _Texture2D(
  val _0 : TextureDataType,
  val _1 : Int,
) : TextureType()
data class _Texture3D(
  val _0 : TextureDataType,
) : TextureType()
data class _TextureCube(
  val _0 : TextureDataType,
) : TextureType()
data class _TextureRect(
  val _0 : TextureDataType,
) : TextureType()
data class _Texture2DMS(
  val _0 : TextureDataType,
  val _1 : Int,
  val _2 : Int,
  val _3 : Bool,
) : TextureType()
data class _TextureBuffer(
  val _0 : TextureDataType,
) : TextureType()

sealed class MipMap()
data class _Mip(
  val _0 : Int,
  val _1 : Int,
) : MipMap()
object _NoMip : MipMap()
data class _AutoMip(
  val _0 : Int,
  val _1 : Int,
) : MipMap()

sealed class Filter()
object _Nearest : Filter()
object _Linear : Filter()
object _NearestMipmapNearest : Filter()
object _NearestMipmapLinear : Filter()
object _LinearMipmapNearest : Filter()
object _LinearMipmapLinear : Filter()

sealed class EdgeMode()
object _Repeat : EdgeMode()
object _MirroredRepeat : EdgeMode()
object _ClampToEdge : EdgeMode()
object _ClampToBorder : EdgeMode()

sealed class ImageSemantic()
object _Depth : ImageSemantic()
object _Stencil : ImageSemantic()
object _Color : ImageSemantic()

sealed class ImageRef()
data class _TextureImage(
  val _0 : TextureName,
  val _1 : Int,
  val _2 : Int?,
) : ImageRef()
data class _Framebuffer(
  val _0 : ImageSemantic,
) : ImageRef()

data class ClearImage(
  val imageSemantic : ImageSemantic,
  val clearValue : Value,
)

sealed class Command()
data class _SetRasterContext(
  val _0 : RasterContext,
) : Command()
data class _SetAccumulationContext(
  val _0 : AccumulationContext,
) : Command()
data class _SetRenderTarget(
  val _0 : RenderTargetName,
) : Command()
data class _SetProgram(
  val _0 : ProgramName,
) : Command()
data class _SetSamplerUniform(
  val _0 : UniformName,
  val _1 : TextureUnit,
) : Command()
data class _SetTexture(
  val _0 : TextureUnit,
  val _1 : TextureName,
) : Command()
data class _SetSampler(
  val _0 : TextureUnit,
  val _1 : SamplerName?,
) : Command()
data class _RenderSlot(
  val _0 : SlotName,
) : Command()
data class _RenderStream(
  val _0 : StreamName,
) : Command()
data class _ClearRenderTarget(
  val _0 : Array<ClearImage>,
) : Command()
data class _GenerateMipMap(
  val _0 : TextureUnit,
) : Command()
data class _SaveImage(
  val _0 : FrameBufferComponent,
  val _1 : ImageRef,
) : Command()
data class _LoadImage(
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
  val textureBaseLevel : Int,
  val textureMaxLevel : Int,
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
object _WebGL1 : Backend()
object _OpenGL33 : Backend()

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

