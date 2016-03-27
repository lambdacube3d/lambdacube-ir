// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

typealias StreamName = Int

typealias ProgramName = Int

typealias TextureName = Int

typealias SamplerName = Int

typealias UniformName = String

typealias SlotName = Int

typealias FrameBufferComponent = Int

typealias TextureUnit = Int

typealias RenderTargetName = Int

typealias TextureUnitMapping = Dictionary<UniformName, TextureUnit>

enum ArrayValue {
  case VBoolArray(Array<Bool>)
  case VIntArray(Array<Int32>)
  case VWordArray(Array<UInt32>)
  case VFloatArray(Array<Float>)
}

enum Value {
  case VBool(Bool)
  case VV2B(Int)
  case VV3B(Int)
  case VV4B(Int)
  case VWord(UInt32)
  case VV2U(Int)
  case VV3U(Int)
  case VV4U(Int)
  case VInt(Int32)
  case VV2I(Int)
  case VV3I(Int)
  case VV4I(Int)
  case VFloat(Float)
  case VV2F(Int)
  case VV3F(Int)
  case VV4F(Int)
  case VM22F(Int)
  case VM23F(Int)
  case VM24F(Int)
  case VM32F(Int)
  case VM33F(Int)
  case VM34F(Int)
  case VM42F(Int)
  case VM43F(Int)
  case VM44F(Int)
}

enum InputType {
  case Bool
  case V2B
  case V3B
  case V4B
  case Word
  case V2U
  case V3U
  case V4U
  case Int
  case V2I
  case V3I
  case V4I
  case Float
  case V2F
  case V3F
  case V4F
  case M22F
  case M23F
  case M24F
  case M32F
  case M33F
  case M34F
  case M42F
  case M43F
  case M44F
  case STexture1D
  case STexture2D
  case STextureCube
  case STexture1DArray
  case STexture2DArray
  case STexture2DRect
  case FTexture1D
  case FTexture2D
  case FTexture3D
  case FTextureCube
  case FTexture1DArray
  case FTexture2DArray
  case FTexture2DMS
  case FTexture2DMSArray
  case FTextureBuffer
  case FTexture2DRect
  case ITexture1D
  case ITexture2D
  case ITexture3D
  case ITextureCube
  case ITexture1DArray
  case ITexture2DArray
  case ITexture2DMS
  case ITexture2DMSArray
  case ITextureBuffer
  case ITexture2DRect
  case UTexture1D
  case UTexture2D
  case UTexture3D
  case UTextureCube
  case UTexture1DArray
  case UTexture2DArray
  case UTexture2DMS
  case UTexture2DMSArray
  case UTextureBuffer
  case UTexture2DRect
}

enum PointSpriteCoordOrigin {
  case LowerLeft
  case UpperLeft
}

enum PointSize {
  case PointSize(Float)
  case ProgramPointSize
}

enum PolygonOffset {
  case NoOffset
  case Offset(Float,Float)
}

enum FrontFace {
  case CCW
  case CW
}

enum PolygonMode {
  case PolygonPoint(PointSize)
  case PolygonLine(Float)
  case PolygonFill
}

enum ProvokingVertex {
  case FirstVertex
  case LastVertex
}

enum CullMode {
  case CullNone
  case CullFront(FrontFace)
  case CullBack(FrontFace)
}

enum ComparisonFunction {
  case Never
  case Less
  case Equal
  case Lequal
  case Greater
  case Notequal
  case Gequal
  case Always
}

typealias DepthFunction = ComparisonFunction

enum StencilOperation {
  case OpZero
  case OpKeep
  case OpReplace
  case OpIncr
  case OpIncrWrap
  case OpDecr
  case OpDecrWrap
  case OpInvert
}

enum BlendEquation {
  case FuncAdd
  case FuncSubtract
  case FuncReverseSubtract
  case Min
  case Max
}

enum BlendingFactor {
  case Zero
  case One
  case SrcColor
  case OneMinusSrcColor
  case DstColor
  case OneMinusDstColor
  case SrcAlpha
  case OneMinusSrcAlpha
  case DstAlpha
  case OneMinusDstAlpha
  case ConstantColor
  case OneMinusConstantColor
  case ConstantAlpha
  case OneMinusConstantAlpha
  case SrcAlphaSaturate
}

enum LogicOperation {
  case Clear
  case And
  case AndReverse
  case Copy
  case AndInverted
  case Noop
  case Xor
  case Or
  case Nor
  case Equiv
  case Invert
  case OrReverse
  case CopyInverted
  case OrInverted
  case Nand
  case Set
}

enum StencilOps {
  case StencilOps(StencilOps_Data)
    struct StencilOps_Data {
      var frontStencilOp : StencilOperation
      var backStencilOp : StencilOperation
    }
}

enum StencilTest {
  case StencilTest(StencilTest_Data)
    struct StencilTest_Data {
      var stencilComparision : ComparisonFunction
      var stencilReference : Int32
      var stencilMask : UInt32
    }
}

enum StencilTests {
  case StencilTests(StencilTest,StencilTest)
}

enum FetchPrimitive {
  case Points
  case Lines
  case Triangles
  case LinesAdjacency
  case TrianglesAdjacency
}

enum OutputPrimitive {
  case TrianglesOutput
  case LinesOutput
  case PointsOutput
}

enum ColorArity {
  case Red
  case RG
  case RGB
  case RGBA
}

enum Blending {
  case NoBlending
  case BlendLogicOp(LogicOperation)
  case Blend(Blend_Data)
    struct Blend_Data {
      var colorEqSrc : BlendEquation
      var alphaEqSrc : BlendEquation
      var colorFSrc : BlendingFactor
      var colorFDst : BlendingFactor
      var alphaFSrc : BlendingFactor
      var alphaFDst : BlendingFactor
      var color : Int
    }
}

enum RasterContext {
  case PointCtx(PointSize,Float,PointSpriteCoordOrigin)
  case LineCtx(Float,ProvokingVertex)
  case TriangleCtx(CullMode,PolygonMode,PolygonOffset,ProvokingVertex)
}

enum FragmentOperation {
  case DepthOp(DepthFunction,Bool)
  case StencilOp(StencilTests,StencilOps,StencilOps)
  case ColorOp(Blending,Value)
}

enum AccumulationContext {
  case AccumulationContext(AccumulationContext_Data)
    struct AccumulationContext_Data {
      var accViewportName : Maybe<String>
      var accOperations : Array<FragmentOperation>
    }
}

enum TextureDataType {
  case FloatT(ColorArity)
  case IntT(ColorArity)
  case WordT(ColorArity)
  case ShadowT
}

enum TextureType {
  case Texture1D(TextureDataType,Int)
  case Texture2D(TextureDataType,Int)
  case Texture3D(TextureDataType)
  case TextureCube(TextureDataType)
  case TextureRect(TextureDataType)
  case Texture2DMS(TextureDataType,Int,Int,Bool)
  case TextureBuffer(TextureDataType)
}

enum MipMap {
  case Mip(Int,Int)
  case NoMip
  case AutoMip(Int,Int)
}

enum Filter {
  case Nearest
  case Linear
  case NearestMipmapNearest
  case NearestMipmapLinear
  case LinearMipmapNearest
  case LinearMipmapLinear
}

enum EdgeMode {
  case Repeat
  case MirroredRepeat
  case ClampToEdge
  case ClampToBorder
}

enum ImageSemantic {
  case Depth
  case Stencil
  case Color
}

enum ImageRef {
  case TextureImage(TextureName,Int,Maybe<Int>)
  case Framebuffer(ImageSemantic)
}

enum ClearImage {
  case ClearImage(ClearImage_Data)
    struct ClearImage_Data {
      var imageSemantic : ImageSemantic
      var clearValue : Value
    }
}

enum Command {
  case SetRasterContext(RasterContext)
  case SetAccumulationContext(AccumulationContext)
  case SetRenderTarget(RenderTargetName)
  case SetProgram(ProgramName)
  case SetSamplerUniform(UniformName,TextureUnit)
  case SetTexture(TextureUnit,TextureName)
  case SetSampler(TextureUnit,Maybe<SamplerName>)
  case RenderSlot(SlotName)
  case RenderStream(StreamName)
  case ClearRenderTarget(Array<ClearImage>)
  case GenerateMipMap(TextureUnit)
  case SaveImage(FrameBufferComponent,ImageRef)
  case LoadImage(ImageRef,FrameBufferComponent)
}

enum SamplerDescriptor {
  case SamplerDescriptor(SamplerDescriptor_Data)
    struct SamplerDescriptor_Data {
      var samplerWrapS : EdgeMode
      var samplerWrapT : Maybe<EdgeMode>
      var samplerWrapR : Maybe<EdgeMode>
      var samplerMinFilter : Filter
      var samplerMagFilter : Filter
      var samplerBorderColor : Value
      var samplerMinLod : Maybe<Float>
      var samplerMaxLod : Maybe<Float>
      var samplerLodBias : Float
      var samplerCompareFunc : Maybe<ComparisonFunction>
    }
}

enum TextureDescriptor {
  case TextureDescriptor(TextureDescriptor_Data)
    struct TextureDescriptor_Data {
      var textureType : TextureType
      var textureSize : Value
      var textureSemantic : ImageSemantic
      var textureSampler : SamplerDescriptor
      var textureBaseLevel : Int
      var textureMaxLevel : Int
    }
}

enum Parameter {
  case Parameter(Parameter_Data)
    struct Parameter_Data {
      var name : String
      var ty : InputType
    }
}

enum Program {
  case Program(Program_Data)
    struct Program_Data {
      var programUniforms : Dictionary<UniformName, InputType>
      var programStreams : Dictionary<UniformName, Parameter>
      var programInTextures : Dictionary<UniformName, InputType>
      var programOutput : Array<Parameter>
      var vertexShader : String
      var geometryShader : Maybe<String>
      var fragmentShader : String
    }
}

enum Slot {
  case Slot(Slot_Data)
    struct Slot_Data {
      var slotName : String
      var slotStreams : Dictionary<String, InputType>
      var slotUniforms : Dictionary<UniformName, InputType>
      var slotPrimitive : FetchPrimitive
      var slotPrograms : Array<ProgramName>
    }
}

enum StreamData {
  case StreamData(StreamData_Data)
    struct StreamData_Data {
      var streamData : Dictionary<String, ArrayValue>
      var streamType : Dictionary<String, InputType>
      var streamPrimitive : FetchPrimitive
      var streamPrograms : Array<ProgramName>
    }
}

enum TargetItem {
  case TargetItem(TargetItem_Data)
    struct TargetItem_Data {
      var targetSemantic : ImageSemantic
      var targetRef : Maybe<ImageRef>
    }
}

enum RenderTarget {
  case RenderTarget(RenderTarget_Data)
    struct RenderTarget_Data {
      var renderTargets : Array<TargetItem>
    }
}

enum Backend {
  case WebGL1
  case OpenGL33
  case DirectX11
}

enum Pipeline {
  case Pipeline(Pipeline_Data)
    struct Pipeline_Data {
      var info : String
      var backend : Backend
      var textures : Array<TextureDescriptor>
      var samplers : Array<SamplerDescriptor>
      var targets : Array<RenderTarget>
      var programs : Array<Program>
      var slots : Array<Slot>
      var streams : Array<StreamData>
      var commands : Array<Command>
    }
}


extension Int {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Int32 {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension UInt {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension UInt32 {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Float {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Bool {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension String {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Array {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Dictionary {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Maybe {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}



extension ArrayValue {
  var toJSON : [String: AnyObject] {
    switch self {
      case .VBoolArray(let arg0):
        return [ "tag" : "VBoolArray", "arg0" : arg0.toJSON]
      case .VIntArray(let arg0):
        return [ "tag" : "VIntArray", "arg0" : arg0.toJSON]
      case .VWordArray(let arg0):
        return [ "tag" : "VWordArray", "arg0" : arg0.toJSON]
      case .VFloatArray(let arg0):
        return [ "tag" : "VFloatArray", "arg0" : arg0.toJSON]
    }
  }
}
extension Value {
  var toJSON : [String: AnyObject] {
    switch self {
      case .VBool(let arg0):
        return [ "tag" : "VBool", "arg0" : arg0.toJSON]
      case .VV2B(let arg0):
        return [ "tag" : "VV2B", "arg0" : arg0.toJSON]
      case .VV3B(let arg0):
        return [ "tag" : "VV3B", "arg0" : arg0.toJSON]
      case .VV4B(let arg0):
        return [ "tag" : "VV4B", "arg0" : arg0.toJSON]
      case .VWord(let arg0):
        return [ "tag" : "VWord", "arg0" : arg0.toJSON]
      case .VV2U(let arg0):
        return [ "tag" : "VV2U", "arg0" : arg0.toJSON]
      case .VV3U(let arg0):
        return [ "tag" : "VV3U", "arg0" : arg0.toJSON]
      case .VV4U(let arg0):
        return [ "tag" : "VV4U", "arg0" : arg0.toJSON]
      case .VInt(let arg0):
        return [ "tag" : "VInt", "arg0" : arg0.toJSON]
      case .VV2I(let arg0):
        return [ "tag" : "VV2I", "arg0" : arg0.toJSON]
      case .VV3I(let arg0):
        return [ "tag" : "VV3I", "arg0" : arg0.toJSON]
      case .VV4I(let arg0):
        return [ "tag" : "VV4I", "arg0" : arg0.toJSON]
      case .VFloat(let arg0):
        return [ "tag" : "VFloat", "arg0" : arg0.toJSON]
      case .VV2F(let arg0):
        return [ "tag" : "VV2F", "arg0" : arg0.toJSON]
      case .VV3F(let arg0):
        return [ "tag" : "VV3F", "arg0" : arg0.toJSON]
      case .VV4F(let arg0):
        return [ "tag" : "VV4F", "arg0" : arg0.toJSON]
      case .VM22F(let arg0):
        return [ "tag" : "VM22F", "arg0" : arg0.toJSON]
      case .VM23F(let arg0):
        return [ "tag" : "VM23F", "arg0" : arg0.toJSON]
      case .VM24F(let arg0):
        return [ "tag" : "VM24F", "arg0" : arg0.toJSON]
      case .VM32F(let arg0):
        return [ "tag" : "VM32F", "arg0" : arg0.toJSON]
      case .VM33F(let arg0):
        return [ "tag" : "VM33F", "arg0" : arg0.toJSON]
      case .VM34F(let arg0):
        return [ "tag" : "VM34F", "arg0" : arg0.toJSON]
      case .VM42F(let arg0):
        return [ "tag" : "VM42F", "arg0" : arg0.toJSON]
      case .VM43F(let arg0):
        return [ "tag" : "VM43F", "arg0" : arg0.toJSON]
      case .VM44F(let arg0):
        return [ "tag" : "VM44F", "arg0" : arg0.toJSON]
    }
  }
}
extension InputType {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Bool:
        return [ "tag" : "Bool"]
      case .V2B:
        return [ "tag" : "V2B"]
      case .V3B:
        return [ "tag" : "V3B"]
      case .V4B:
        return [ "tag" : "V4B"]
      case .Word:
        return [ "tag" : "Word"]
      case .V2U:
        return [ "tag" : "V2U"]
      case .V3U:
        return [ "tag" : "V3U"]
      case .V4U:
        return [ "tag" : "V4U"]
      case .Int:
        return [ "tag" : "Int"]
      case .V2I:
        return [ "tag" : "V2I"]
      case .V3I:
        return [ "tag" : "V3I"]
      case .V4I:
        return [ "tag" : "V4I"]
      case .Float:
        return [ "tag" : "Float"]
      case .V2F:
        return [ "tag" : "V2F"]
      case .V3F:
        return [ "tag" : "V3F"]
      case .V4F:
        return [ "tag" : "V4F"]
      case .M22F:
        return [ "tag" : "M22F"]
      case .M23F:
        return [ "tag" : "M23F"]
      case .M24F:
        return [ "tag" : "M24F"]
      case .M32F:
        return [ "tag" : "M32F"]
      case .M33F:
        return [ "tag" : "M33F"]
      case .M34F:
        return [ "tag" : "M34F"]
      case .M42F:
        return [ "tag" : "M42F"]
      case .M43F:
        return [ "tag" : "M43F"]
      case .M44F:
        return [ "tag" : "M44F"]
      case .STexture1D:
        return [ "tag" : "STexture1D"]
      case .STexture2D:
        return [ "tag" : "STexture2D"]
      case .STextureCube:
        return [ "tag" : "STextureCube"]
      case .STexture1DArray:
        return [ "tag" : "STexture1DArray"]
      case .STexture2DArray:
        return [ "tag" : "STexture2DArray"]
      case .STexture2DRect:
        return [ "tag" : "STexture2DRect"]
      case .FTexture1D:
        return [ "tag" : "FTexture1D"]
      case .FTexture2D:
        return [ "tag" : "FTexture2D"]
      case .FTexture3D:
        return [ "tag" : "FTexture3D"]
      case .FTextureCube:
        return [ "tag" : "FTextureCube"]
      case .FTexture1DArray:
        return [ "tag" : "FTexture1DArray"]
      case .FTexture2DArray:
        return [ "tag" : "FTexture2DArray"]
      case .FTexture2DMS:
        return [ "tag" : "FTexture2DMS"]
      case .FTexture2DMSArray:
        return [ "tag" : "FTexture2DMSArray"]
      case .FTextureBuffer:
        return [ "tag" : "FTextureBuffer"]
      case .FTexture2DRect:
        return [ "tag" : "FTexture2DRect"]
      case .ITexture1D:
        return [ "tag" : "ITexture1D"]
      case .ITexture2D:
        return [ "tag" : "ITexture2D"]
      case .ITexture3D:
        return [ "tag" : "ITexture3D"]
      case .ITextureCube:
        return [ "tag" : "ITextureCube"]
      case .ITexture1DArray:
        return [ "tag" : "ITexture1DArray"]
      case .ITexture2DArray:
        return [ "tag" : "ITexture2DArray"]
      case .ITexture2DMS:
        return [ "tag" : "ITexture2DMS"]
      case .ITexture2DMSArray:
        return [ "tag" : "ITexture2DMSArray"]
      case .ITextureBuffer:
        return [ "tag" : "ITextureBuffer"]
      case .ITexture2DRect:
        return [ "tag" : "ITexture2DRect"]
      case .UTexture1D:
        return [ "tag" : "UTexture1D"]
      case .UTexture2D:
        return [ "tag" : "UTexture2D"]
      case .UTexture3D:
        return [ "tag" : "UTexture3D"]
      case .UTextureCube:
        return [ "tag" : "UTextureCube"]
      case .UTexture1DArray:
        return [ "tag" : "UTexture1DArray"]
      case .UTexture2DArray:
        return [ "tag" : "UTexture2DArray"]
      case .UTexture2DMS:
        return [ "tag" : "UTexture2DMS"]
      case .UTexture2DMSArray:
        return [ "tag" : "UTexture2DMSArray"]
      case .UTextureBuffer:
        return [ "tag" : "UTextureBuffer"]
      case .UTexture2DRect:
        return [ "tag" : "UTexture2DRect"]
    }
  }
}
extension PointSpriteCoordOrigin {
  var toJSON : [String: AnyObject] {
    switch self {
      case .LowerLeft:
        return [ "tag" : "LowerLeft"]
      case .UpperLeft:
        return [ "tag" : "UpperLeft"]
    }
  }
}
extension PointSize {
  var toJSON : [String: AnyObject] {
    switch self {
      case .PointSize(let arg0):
        return [ "tag" : "PointSize", "arg0" : arg0.toJSON]
      case .ProgramPointSize:
        return [ "tag" : "ProgramPointSize"]
    }
  }
}
extension PolygonOffset {
  var toJSON : [String: AnyObject] {
    switch self {
      case .NoOffset:
        return [ "tag" : "NoOffset"]
      case .Offset(let arg0, let arg1):
        return [ "tag" : "Offset", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
    }
  }
}
extension FrontFace {
  var toJSON : [String: AnyObject] {
    switch self {
      case .CCW:
        return [ "tag" : "CCW"]
      case .CW:
        return [ "tag" : "CW"]
    }
  }
}
extension PolygonMode {
  var toJSON : [String: AnyObject] {
    switch self {
      case .PolygonPoint(let arg0):
        return [ "tag" : "PolygonPoint", "arg0" : arg0.toJSON]
      case .PolygonLine(let arg0):
        return [ "tag" : "PolygonLine", "arg0" : arg0.toJSON]
      case .PolygonFill:
        return [ "tag" : "PolygonFill"]
    }
  }
}
extension ProvokingVertex {
  var toJSON : [String: AnyObject] {
    switch self {
      case .FirstVertex:
        return [ "tag" : "FirstVertex"]
      case .LastVertex:
        return [ "tag" : "LastVertex"]
    }
  }
}
extension CullMode {
  var toJSON : [String: AnyObject] {
    switch self {
      case .CullNone:
        return [ "tag" : "CullNone"]
      case .CullFront(let arg0):
        return [ "tag" : "CullFront", "arg0" : arg0.toJSON]
      case .CullBack(let arg0):
        return [ "tag" : "CullBack", "arg0" : arg0.toJSON]
    }
  }
}
extension ComparisonFunction {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Never:
        return [ "tag" : "Never"]
      case .Less:
        return [ "tag" : "Less"]
      case .Equal:
        return [ "tag" : "Equal"]
      case .Lequal:
        return [ "tag" : "Lequal"]
      case .Greater:
        return [ "tag" : "Greater"]
      case .Notequal:
        return [ "tag" : "Notequal"]
      case .Gequal:
        return [ "tag" : "Gequal"]
      case .Always:
        return [ "tag" : "Always"]
    }
  }
}
extension StencilOperation {
  var toJSON : [String: AnyObject] {
    switch self {
      case .OpZero:
        return [ "tag" : "OpZero"]
      case .OpKeep:
        return [ "tag" : "OpKeep"]
      case .OpReplace:
        return [ "tag" : "OpReplace"]
      case .OpIncr:
        return [ "tag" : "OpIncr"]
      case .OpIncrWrap:
        return [ "tag" : "OpIncrWrap"]
      case .OpDecr:
        return [ "tag" : "OpDecr"]
      case .OpDecrWrap:
        return [ "tag" : "OpDecrWrap"]
      case .OpInvert:
        return [ "tag" : "OpInvert"]
    }
  }
}
extension BlendEquation {
  var toJSON : [String: AnyObject] {
    switch self {
      case .FuncAdd:
        return [ "tag" : "FuncAdd"]
      case .FuncSubtract:
        return [ "tag" : "FuncSubtract"]
      case .FuncReverseSubtract:
        return [ "tag" : "FuncReverseSubtract"]
      case .Min:
        return [ "tag" : "Min"]
      case .Max:
        return [ "tag" : "Max"]
    }
  }
}
extension BlendingFactor {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Zero:
        return [ "tag" : "Zero"]
      case .One:
        return [ "tag" : "One"]
      case .SrcColor:
        return [ "tag" : "SrcColor"]
      case .OneMinusSrcColor:
        return [ "tag" : "OneMinusSrcColor"]
      case .DstColor:
        return [ "tag" : "DstColor"]
      case .OneMinusDstColor:
        return [ "tag" : "OneMinusDstColor"]
      case .SrcAlpha:
        return [ "tag" : "SrcAlpha"]
      case .OneMinusSrcAlpha:
        return [ "tag" : "OneMinusSrcAlpha"]
      case .DstAlpha:
        return [ "tag" : "DstAlpha"]
      case .OneMinusDstAlpha:
        return [ "tag" : "OneMinusDstAlpha"]
      case .ConstantColor:
        return [ "tag" : "ConstantColor"]
      case .OneMinusConstantColor:
        return [ "tag" : "OneMinusConstantColor"]
      case .ConstantAlpha:
        return [ "tag" : "ConstantAlpha"]
      case .OneMinusConstantAlpha:
        return [ "tag" : "OneMinusConstantAlpha"]
      case .SrcAlphaSaturate:
        return [ "tag" : "SrcAlphaSaturate"]
    }
  }
}
extension LogicOperation {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Clear:
        return [ "tag" : "Clear"]
      case .And:
        return [ "tag" : "And"]
      case .AndReverse:
        return [ "tag" : "AndReverse"]
      case .Copy:
        return [ "tag" : "Copy"]
      case .AndInverted:
        return [ "tag" : "AndInverted"]
      case .Noop:
        return [ "tag" : "Noop"]
      case .Xor:
        return [ "tag" : "Xor"]
      case .Or:
        return [ "tag" : "Or"]
      case .Nor:
        return [ "tag" : "Nor"]
      case .Equiv:
        return [ "tag" : "Equiv"]
      case .Invert:
        return [ "tag" : "Invert"]
      case .OrReverse:
        return [ "tag" : "OrReverse"]
      case .CopyInverted:
        return [ "tag" : "CopyInverted"]
      case .OrInverted:
        return [ "tag" : "OrInverted"]
      case .Nand:
        return [ "tag" : "Nand"]
      case .Set:
        return [ "tag" : "Set"]
    }
  }
}
extension StencilOps {
  var toJSON : [String: AnyObject] {
    switch self {
      case .StencilOps(let v):
        return [ "tag" : "StencilOps"
               , "frontStencilOp" : v.frontStencilOp.toJSON
               , "backStencilOp" : v.backStencilOp.toJSON
               ]
    }
  }
}
extension StencilTest {
  var toJSON : [String: AnyObject] {
    switch self {
      case .StencilTest(let v):
        return [ "tag" : "StencilTest"
               , "stencilComparision" : v.stencilComparision.toJSON
               , "stencilReference" : v.stencilReference.toJSON
               , "stencilMask" : v.stencilMask.toJSON
               ]
    }
  }
}
extension StencilTests {
  var toJSON : [String: AnyObject] {
    switch self {
      case .StencilTests(let arg0, let arg1):
        return [ "tag" : "StencilTests", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
    }
  }
}
extension FetchPrimitive {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Points:
        return [ "tag" : "Points"]
      case .Lines:
        return [ "tag" : "Lines"]
      case .Triangles:
        return [ "tag" : "Triangles"]
      case .LinesAdjacency:
        return [ "tag" : "LinesAdjacency"]
      case .TrianglesAdjacency:
        return [ "tag" : "TrianglesAdjacency"]
    }
  }
}
extension OutputPrimitive {
  var toJSON : [String: AnyObject] {
    switch self {
      case .TrianglesOutput:
        return [ "tag" : "TrianglesOutput"]
      case .LinesOutput:
        return [ "tag" : "LinesOutput"]
      case .PointsOutput:
        return [ "tag" : "PointsOutput"]
    }
  }
}
extension ColorArity {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Red:
        return [ "tag" : "Red"]
      case .RG:
        return [ "tag" : "RG"]
      case .RGB:
        return [ "tag" : "RGB"]
      case .RGBA:
        return [ "tag" : "RGBA"]
    }
  }
}
extension Blending {
  var toJSON : [String: AnyObject] {
    switch self {
      case .NoBlending:
        return [ "tag" : "NoBlending"]
      case .BlendLogicOp(let arg0):
        return [ "tag" : "BlendLogicOp", "arg0" : arg0.toJSON]
      case .Blend(let v):
        return [ "tag" : "Blend"
               , "colorEqSrc" : v.colorEqSrc.toJSON
               , "alphaEqSrc" : v.alphaEqSrc.toJSON
               , "colorFSrc" : v.colorFSrc.toJSON
               , "colorFDst" : v.colorFDst.toJSON
               , "alphaFSrc" : v.alphaFSrc.toJSON
               , "alphaFDst" : v.alphaFDst.toJSON
               , "color" : v.color.toJSON
               ]
    }
  }
}
extension RasterContext {
  var toJSON : [String: AnyObject] {
    switch self {
      case .PointCtx(let arg0, let arg1, let arg2):
        return [ "tag" : "PointCtx", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON, "arg2" : arg2.toJSON]
      case .LineCtx(let arg0, let arg1):
        return [ "tag" : "LineCtx", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .TriangleCtx(let arg0, let arg1, let arg2, let arg3):
        return [ "tag" : "TriangleCtx", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON, "arg2" : arg2.toJSON, "arg3" : arg3.toJSON]
    }
  }
}
extension FragmentOperation {
  var toJSON : [String: AnyObject] {
    switch self {
      case .DepthOp(let arg0, let arg1):
        return [ "tag" : "DepthOp", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .StencilOp(let arg0, let arg1, let arg2):
        return [ "tag" : "StencilOp", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON, "arg2" : arg2.toJSON]
      case .ColorOp(let arg0, let arg1):
        return [ "tag" : "ColorOp", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
    }
  }
}
extension AccumulationContext {
  var toJSON : [String: AnyObject] {
    switch self {
      case .AccumulationContext(let v):
        return [ "tag" : "AccumulationContext"
               , "accViewportName" : v.accViewportName.toJSON
               , "accOperations" : v.accOperations.toJSON
               ]
    }
  }
}
extension TextureDataType {
  var toJSON : [String: AnyObject] {
    switch self {
      case .FloatT(let arg0):
        return [ "tag" : "FloatT", "arg0" : arg0.toJSON]
      case .IntT(let arg0):
        return [ "tag" : "IntT", "arg0" : arg0.toJSON]
      case .WordT(let arg0):
        return [ "tag" : "WordT", "arg0" : arg0.toJSON]
      case .ShadowT:
        return [ "tag" : "ShadowT"]
    }
  }
}
extension TextureType {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Texture1D(let arg0, let arg1):
        return [ "tag" : "Texture1D", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .Texture2D(let arg0, let arg1):
        return [ "tag" : "Texture2D", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .Texture3D(let arg0):
        return [ "tag" : "Texture3D", "arg0" : arg0.toJSON]
      case .TextureCube(let arg0):
        return [ "tag" : "TextureCube", "arg0" : arg0.toJSON]
      case .TextureRect(let arg0):
        return [ "tag" : "TextureRect", "arg0" : arg0.toJSON]
      case .Texture2DMS(let arg0, let arg1, let arg2, let arg3):
        return [ "tag" : "Texture2DMS", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON, "arg2" : arg2.toJSON, "arg3" : arg3.toJSON]
      case .TextureBuffer(let arg0):
        return [ "tag" : "TextureBuffer", "arg0" : arg0.toJSON]
    }
  }
}
extension MipMap {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Mip(let arg0, let arg1):
        return [ "tag" : "Mip", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .NoMip:
        return [ "tag" : "NoMip"]
      case .AutoMip(let arg0, let arg1):
        return [ "tag" : "AutoMip", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
    }
  }
}
extension Filter {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Nearest:
        return [ "tag" : "Nearest"]
      case .Linear:
        return [ "tag" : "Linear"]
      case .NearestMipmapNearest:
        return [ "tag" : "NearestMipmapNearest"]
      case .NearestMipmapLinear:
        return [ "tag" : "NearestMipmapLinear"]
      case .LinearMipmapNearest:
        return [ "tag" : "LinearMipmapNearest"]
      case .LinearMipmapLinear:
        return [ "tag" : "LinearMipmapLinear"]
    }
  }
}
extension EdgeMode {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Repeat:
        return [ "tag" : "Repeat"]
      case .MirroredRepeat:
        return [ "tag" : "MirroredRepeat"]
      case .ClampToEdge:
        return [ "tag" : "ClampToEdge"]
      case .ClampToBorder:
        return [ "tag" : "ClampToBorder"]
    }
  }
}
extension ImageSemantic {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Depth:
        return [ "tag" : "Depth"]
      case .Stencil:
        return [ "tag" : "Stencil"]
      case .Color:
        return [ "tag" : "Color"]
    }
  }
}
extension ImageRef {
  var toJSON : [String: AnyObject] {
    switch self {
      case .TextureImage(let arg0, let arg1, let arg2):
        return [ "tag" : "TextureImage", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON, "arg2" : arg2.toJSON]
      case .Framebuffer(let arg0):
        return [ "tag" : "Framebuffer", "arg0" : arg0.toJSON]
    }
  }
}
extension ClearImage {
  var toJSON : [String: AnyObject] {
    switch self {
      case .ClearImage(let v):
        return [ "tag" : "ClearImage"
               , "imageSemantic" : v.imageSemantic.toJSON
               , "clearValue" : v.clearValue.toJSON
               ]
    }
  }
}
extension Command {
  var toJSON : [String: AnyObject] {
    switch self {
      case .SetRasterContext(let arg0):
        return [ "tag" : "SetRasterContext", "arg0" : arg0.toJSON]
      case .SetAccumulationContext(let arg0):
        return [ "tag" : "SetAccumulationContext", "arg0" : arg0.toJSON]
      case .SetRenderTarget(let arg0):
        return [ "tag" : "SetRenderTarget", "arg0" : arg0.toJSON]
      case .SetProgram(let arg0):
        return [ "tag" : "SetProgram", "arg0" : arg0.toJSON]
      case .SetSamplerUniform(let arg0, let arg1):
        return [ "tag" : "SetSamplerUniform", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .SetTexture(let arg0, let arg1):
        return [ "tag" : "SetTexture", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .SetSampler(let arg0, let arg1):
        return [ "tag" : "SetSampler", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .RenderSlot(let arg0):
        return [ "tag" : "RenderSlot", "arg0" : arg0.toJSON]
      case .RenderStream(let arg0):
        return [ "tag" : "RenderStream", "arg0" : arg0.toJSON]
      case .ClearRenderTarget(let arg0):
        return [ "tag" : "ClearRenderTarget", "arg0" : arg0.toJSON]
      case .GenerateMipMap(let arg0):
        return [ "tag" : "GenerateMipMap", "arg0" : arg0.toJSON]
      case .SaveImage(let arg0, let arg1):
        return [ "tag" : "SaveImage", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
      case .LoadImage(let arg0, let arg1):
        return [ "tag" : "LoadImage", "arg0" : arg0.toJSON, "arg1" : arg1.toJSON]
    }
  }
}
extension SamplerDescriptor {
  var toJSON : [String: AnyObject] {
    switch self {
      case .SamplerDescriptor(let v):
        return [ "tag" : "SamplerDescriptor"
               , "samplerWrapS" : v.samplerWrapS.toJSON
               , "samplerWrapT" : v.samplerWrapT.toJSON
               , "samplerWrapR" : v.samplerWrapR.toJSON
               , "samplerMinFilter" : v.samplerMinFilter.toJSON
               , "samplerMagFilter" : v.samplerMagFilter.toJSON
               , "samplerBorderColor" : v.samplerBorderColor.toJSON
               , "samplerMinLod" : v.samplerMinLod.toJSON
               , "samplerMaxLod" : v.samplerMaxLod.toJSON
               , "samplerLodBias" : v.samplerLodBias.toJSON
               , "samplerCompareFunc" : v.samplerCompareFunc.toJSON
               ]
    }
  }
}
extension TextureDescriptor {
  var toJSON : [String: AnyObject] {
    switch self {
      case .TextureDescriptor(let v):
        return [ "tag" : "TextureDescriptor"
               , "textureType" : v.textureType.toJSON
               , "textureSize" : v.textureSize.toJSON
               , "textureSemantic" : v.textureSemantic.toJSON
               , "textureSampler" : v.textureSampler.toJSON
               , "textureBaseLevel" : v.textureBaseLevel.toJSON
               , "textureMaxLevel" : v.textureMaxLevel.toJSON
               ]
    }
  }
}
extension Parameter {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Parameter(let v):
        return [ "tag" : "Parameter"
               , "name" : v.name.toJSON
               , "ty" : v.ty.toJSON
               ]
    }
  }
}
extension Program {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Program(let v):
        return [ "tag" : "Program"
               , "programUniforms" : v.programUniforms.toJSON
               , "programStreams" : v.programStreams.toJSON
               , "programInTextures" : v.programInTextures.toJSON
               , "programOutput" : v.programOutput.toJSON
               , "vertexShader" : v.vertexShader.toJSON
               , "geometryShader" : v.geometryShader.toJSON
               , "fragmentShader" : v.fragmentShader.toJSON
               ]
    }
  }
}
extension Slot {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Slot(let v):
        return [ "tag" : "Slot"
               , "slotName" : v.slotName.toJSON
               , "slotStreams" : v.slotStreams.toJSON
               , "slotUniforms" : v.slotUniforms.toJSON
               , "slotPrimitive" : v.slotPrimitive.toJSON
               , "slotPrograms" : v.slotPrograms.toJSON
               ]
    }
  }
}
extension StreamData {
  var toJSON : [String: AnyObject] {
    switch self {
      case .StreamData(let v):
        return [ "tag" : "StreamData"
               , "streamData" : v.streamData.toJSON
               , "streamType" : v.streamType.toJSON
               , "streamPrimitive" : v.streamPrimitive.toJSON
               , "streamPrograms" : v.streamPrograms.toJSON
               ]
    }
  }
}
extension TargetItem {
  var toJSON : [String: AnyObject] {
    switch self {
      case .TargetItem(let v):
        return [ "tag" : "TargetItem"
               , "targetSemantic" : v.targetSemantic.toJSON
               , "targetRef" : v.targetRef.toJSON
               ]
    }
  }
}
extension RenderTarget {
  var toJSON : [String: AnyObject] {
    switch self {
      case .RenderTarget(let v):
        return [ "tag" : "RenderTarget"
               , "renderTargets" : v.renderTargets.toJSON
               ]
    }
  }
}
extension Backend {
  var toJSON : [String: AnyObject] {
    switch self {
      case .WebGL1:
        return [ "tag" : "WebGL1"]
      case .OpenGL33:
        return [ "tag" : "OpenGL33"]
      case .DirectX11:
        return [ "tag" : "DirectX11"]
    }
  }
}
extension Pipeline {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Pipeline(let v):
        return [ "tag" : "Pipeline"
               , "info" : v.info.toJSON
               , "backend" : v.backend.toJSON
               , "textures" : v.textures.toJSON
               , "samplers" : v.samplers.toJSON
               , "targets" : v.targets.toJSON
               , "programs" : v.programs.toJSON
               , "slots" : v.slots.toJSON
               , "streams" : v.streams.toJSON
               , "commands" : v.commands.toJSON
               ]
    }
  }
}

enum Maybe<T> {
  case Nothing
  case Just(T)
}

enum Type {
  case Int
  case Int32
  case Word
  case Word32
  case Float
  case Bool
  case String
  case Array(Type)
  case List(Type)
  case Maybe(Type)
  case Map(Type,Type)
  case ArrayValue
  case Value
  case InputType
  case PointSpriteCoordOrigin
  case PointSize
  case PolygonOffset
  case FrontFace
  case PolygonMode
  case ProvokingVertex
  case CullMode
  case ComparisonFunction
  case StencilOperation
  case BlendEquation
  case BlendingFactor
  case LogicOperation
  case StencilOps
  case StencilTest
  case StencilTests
  case FetchPrimitive
  case OutputPrimitive
  case ColorArity
  case Blending
  case RasterContext
  case FragmentOperation
  case AccumulationContext
  case TextureDataType
  case TextureType
  case MipMap
  case Filter
  case EdgeMode
  case ImageSemantic
  case ImageRef
  case ClearImage
  case Command
  case SamplerDescriptor
  case TextureDescriptor
  case Parameter
  case Program
  case Slot
  case StreamData
  case TargetItem
  case RenderTarget
  case Backend
  case Pipeline
}

func fromJSON(type: Type, personName: String) -> Any {
  switch type {
    case .Int:    return 0
    case .Int32:  return 0
    case .Word:   return 0
    case .Word32: return 0
    case .Float:  return 0.0
    case .Bool:   return false
    case .String: return ""
    case .Array(let a): return fromJSON(a,personName)
    case .List(let a):  return fromJSON(a,personName)
    case .Maybe(let a): return fromJSON(a,personName)
  }
  return 0;
}