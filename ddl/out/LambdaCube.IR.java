// generated file, do not modify!
// 2016-03-14T10:58:29.577511000000Z


public class LambdaCube.IR {
  public class ArrayValue {
    public enum Tag { 
      VBoolArray,
      VIntArray,
      VWordArray,
      VFloatArray
    }
    public Tag tag;

    public class VBoolArray extends ArrayValue { 
      public ArrayList<Boolean> _0;
    }
    public class VIntArray extends ArrayValue { 
      public ArrayList<Integer> _0;
    }
    public class VWordArray extends ArrayValue { 
      public ArrayList<Integer> _0;
    }
    public class VFloatArray extends ArrayValue { 
      public ArrayList<Float> _0;
    }
  }

  public class Value {
    public enum Tag { 
      VBool,
      VV2B,
      VV3B,
      VV4B,
      VWord,
      VV2U,
      VV3U,
      VV4U,
      VInt,
      VV2I,
      VV3I,
      VV4I,
      VFloat,
      VV2F,
      VV3F,
      VV4F,
      VM22F,
      VM23F,
      VM24F,
      VM32F,
      VM33F,
      VM34F,
      VM42F,
      VM43F,
      VM44F
    }
    public Tag tag;

    public class VBool extends Value { 
      public Boolean _0;
    }
    public class VV2B extends Value { 
      public int _0;
    }
    public class VV3B extends Value { 
      public int _0;
    }
    public class VV4B extends Value { 
      public int _0;
    }
    public class VWord extends Value { 
      public Integer _0;
    }
    public class VV2U extends Value { 
      public int _0;
    }
    public class VV3U extends Value { 
      public int _0;
    }
    public class VV4U extends Value { 
      public int _0;
    }
    public class VInt extends Value { 
      public Integer _0;
    }
    public class VV2I extends Value { 
      public int _0;
    }
    public class VV3I extends Value { 
      public int _0;
    }
    public class VV4I extends Value { 
      public int _0;
    }
    public class VFloat extends Value { 
      public Float _0;
    }
    public class VV2F extends Value { 
      public int _0;
    }
    public class VV3F extends Value { 
      public int _0;
    }
    public class VV4F extends Value { 
      public int _0;
    }
    public class VM22F extends Value { 
      public int _0;
    }
    public class VM23F extends Value { 
      public int _0;
    }
    public class VM24F extends Value { 
      public int _0;
    }
    public class VM32F extends Value { 
      public int _0;
    }
    public class VM33F extends Value { 
      public int _0;
    }
    public class VM34F extends Value { 
      public int _0;
    }
    public class VM42F extends Value { 
      public int _0;
    }
    public class VM43F extends Value { 
      public int _0;
    }
    public class VM44F extends Value { 
      public int _0;
    }
  }

  public class InputType {
    public enum Tag { 
      Bool,
      V2B,
      V3B,
      V4B,
      Word,
      V2U,
      V3U,
      V4U,
      Int,
      V2I,
      V3I,
      V4I,
      Float,
      V2F,
      V3F,
      V4F,
      M22F,
      M23F,
      M24F,
      M32F,
      M33F,
      M34F,
      M42F,
      M43F,
      M44F,
      STexture1D,
      STexture2D,
      STextureCube,
      STexture1DArray,
      STexture2DArray,
      STexture2DRect,
      FTexture1D,
      FTexture2D,
      FTexture3D,
      FTextureCube,
      FTexture1DArray,
      FTexture2DArray,
      FTexture2DMS,
      FTexture2DMSArray,
      FTextureBuffer,
      FTexture2DRect,
      ITexture1D,
      ITexture2D,
      ITexture3D,
      ITextureCube,
      ITexture1DArray,
      ITexture2DArray,
      ITexture2DMS,
      ITexture2DMSArray,
      ITextureBuffer,
      ITexture2DRect,
      UTexture1D,
      UTexture2D,
      UTexture3D,
      UTextureCube,
      UTexture1DArray,
      UTexture2DArray,
      UTexture2DMS,
      UTexture2DMSArray,
      UTextureBuffer,
      UTexture2DRect
    }
    public Tag tag;

  }

  public class PointSpriteCoordOrigin {
    public enum Tag { 
      LowerLeft,
      UpperLeft
    }
    public Tag tag;

  }

  public class PointSize {
    public enum Tag { 
      PointSize,
      ProgramPointSize
    }
    public Tag tag;

    public class PointSize extends PointSize { 
      public Float _0;
    }
  }

  public class PolygonOffset {
    public enum Tag { 
      NoOffset,
      Offset
    }
    public Tag tag;

    public class Offset extends PolygonOffset { 
      public Float _0;
      public Float _1;
    }
  }

  public class FrontFace {
    public enum Tag { 
      CCW,
      CW
    }
    public Tag tag;

  }

  public class PolygonMode {
    public enum Tag { 
      PolygonPoint,
      PolygonLine,
      PolygonFill
    }
    public Tag tag;

    public class PolygonPoint extends PolygonMode { 
      public PointSize _0;
    }
    public class PolygonLine extends PolygonMode { 
      public Float _0;
    }
  }

  public class ProvokingVertex {
    public enum Tag { 
      FirstVertex,
      LastVertex
    }
    public Tag tag;

  }

  public class CullMode {
    public enum Tag { 
      CullNone,
      CullFront,
      CullBack
    }
    public Tag tag;

    public class CullFront extends CullMode { 
      public FrontFace _0;
    }
    public class CullBack extends CullMode { 
      public FrontFace _0;
    }
  }

  public class ComparisonFunction {
    public enum Tag { 
      Never,
      Less,
      Equal,
      Lequal,
      Greater,
      Notequal,
      Gequal,
      Always
    }
    public Tag tag;

  }

  public class StencilOperation {
    public enum Tag { 
      OpZero,
      OpKeep,
      OpReplace,
      OpIncr,
      OpIncrWrap,
      OpDecr,
      OpDecrWrap,
      OpInvert
    }
    public Tag tag;

  }

  public class BlendEquation {
    public enum Tag { 
      FuncAdd,
      FuncSubtract,
      FuncReverseSubtract,
      Min,
      Max
    }
    public Tag tag;

  }

  public class BlendingFactor {
    public enum Tag { 
      Zero,
      One,
      SrcColor,
      OneMinusSrcColor,
      DstColor,
      OneMinusDstColor,
      SrcAlpha,
      OneMinusSrcAlpha,
      DstAlpha,
      OneMinusDstAlpha,
      ConstantColor,
      OneMinusConstantColor,
      ConstantAlpha,
      OneMinusConstantAlpha,
      SrcAlphaSaturate
    }
    public Tag tag;

  }

  public class LogicOperation {
    public enum Tag { 
      Clear,
      And,
      AndReverse,
      Copy,
      AndInverted,
      Noop,
      Xor,
      Or,
      Nor,
      Equiv,
      Invert,
      OrReverse,
      CopyInverted,
      OrInverted,
      Nand,
      Set
    }
    public Tag tag;

  }

  public class StencilOps {
    public enum Tag { 
      StencilOps
    }
    public Tag tag;

    public class StencilOps extends StencilOps { 
      public StencilOperation frontStencilOp;
      public StencilOperation backStencilOp;
    }
  }

  public class StencilTest {
    public enum Tag { 
      StencilTest
    }
    public Tag tag;

    public class StencilTest extends StencilTest { 
      public ComparisonFunction stencilComparision;
      public Integer stencilReference;
      public Integer stencilMask;
    }
  }

  public class StencilTests {
    public enum Tag { 
      StencilTests
    }
    public Tag tag;

    public class StencilTests extends StencilTests { 
      public StencilTest _0;
      public StencilTest _1;
    }
  }

  public class FetchPrimitive {
    public enum Tag { 
      Points,
      Lines,
      Triangles,
      LinesAdjacency,
      TrianglesAdjacency
    }
    public Tag tag;

  }

  public class OutputPrimitive {
    public enum Tag { 
      TrianglesOutput,
      LinesOutput,
      PointsOutput
    }
    public Tag tag;

  }

  public class ColorArity {
    public enum Tag { 
      Red,
      RG,
      RGB,
      RGBA
    }
    public Tag tag;

  }

  public class Blending {
    public enum Tag { 
      NoBlending,
      BlendLogicOp,
      Blend
    }
    public Tag tag;

    public class BlendLogicOp extends Blending { 
      public LogicOperation _0;
    }
    public class Blend extends Blending { 
      public BlendEquation colorEqSrc;
      public BlendEquation alphaEqSrc;
      public BlendingFactor colorFSrc;
      public BlendingFactor colorFDst;
      public BlendingFactor alphaFSrc;
      public BlendingFactor alphaFDst;
      public int color;
    }
  }

  public class RasterContext {
    public enum Tag { 
      PointCtx,
      LineCtx,
      TriangleCtx
    }
    public Tag tag;

    public class PointCtx extends RasterContext { 
      public PointSize _0;
      public Float _1;
      public PointSpriteCoordOrigin _2;
    }
    public class LineCtx extends RasterContext { 
      public Float _0;
      public ProvokingVertex _1;
    }
    public class TriangleCtx extends RasterContext { 
      public CullMode _0;
      public PolygonMode _1;
      public PolygonOffset _2;
      public ProvokingVertex _3;
    }
  }

  public class FragmentOperation {
    public enum Tag { 
      DepthOp,
      StencilOp,
      ColorOp
    }
    public Tag tag;

    public class DepthOp extends FragmentOperation { 
      public ComparisonFunction _0;
      public Boolean _1;
    }
    public class StencilOp extends FragmentOperation { 
      public StencilTests _0;
      public StencilOps _1;
      public StencilOps _2;
    }
    public class ColorOp extends FragmentOperation { 
      public Blending _0;
      public Value _1;
    }
  }

  public class AccumulationContext {
    public enum Tag { 
      AccumulationContext
    }
    public Tag tag;

    public class AccumulationContext extends AccumulationContext { 
      public int accViewportName;
      public ArrayList<FragmentOperation> accOperations;
    }
  }

  public class TextureDataType {
    public enum Tag { 
      FloatT,
      IntT,
      WordT,
      ShadowT
    }
    public Tag tag;

    public class FloatT extends TextureDataType { 
      public ColorArity _0;
    }
    public class IntT extends TextureDataType { 
      public ColorArity _0;
    }
    public class WordT extends TextureDataType { 
      public ColorArity _0;
    }
  }

  public class TextureType {
    public enum Tag { 
      Texture1D,
      Texture2D,
      Texture3D,
      TextureCube,
      TextureRect,
      Texture2DMS,
      TextureBuffer
    }
    public Tag tag;

    public class Texture1D extends TextureType { 
      public TextureDataType _0;
      public Integer _1;
    }
    public class Texture2D extends TextureType { 
      public TextureDataType _0;
      public Integer _1;
    }
    public class Texture3D extends TextureType { 
      public TextureDataType _0;
    }
    public class TextureCube extends TextureType { 
      public TextureDataType _0;
    }
    public class TextureRect extends TextureType { 
      public TextureDataType _0;
    }
    public class Texture2DMS extends TextureType { 
      public TextureDataType _0;
      public Integer _1;
      public Integer _2;
      public Boolean _3;
    }
    public class TextureBuffer extends TextureType { 
      public TextureDataType _0;
    }
  }

  public class MipMap {
    public enum Tag { 
      Mip,
      NoMip,
      AutoMip
    }
    public Tag tag;

    public class Mip extends MipMap { 
      public Integer _0;
      public Integer _1;
    }
    public class AutoMip extends MipMap { 
      public Integer _0;
      public Integer _1;
    }
  }

  public class Filter {
    public enum Tag { 
      Nearest,
      Linear,
      NearestMipmapNearest,
      NearestMipmapLinear,
      LinearMipmapNearest,
      LinearMipmapLinear
    }
    public Tag tag;

  }

  public class EdgeMode {
    public enum Tag { 
      Repeat,
      MirroredRepeat,
      ClampToEdge,
      ClampToBorder
    }
    public Tag tag;

  }

  public class ImageSemantic {
    public enum Tag { 
      Depth,
      Stencil,
      Color
    }
    public Tag tag;

  }

  public class ImageRef {
    public enum Tag { 
      TextureImage,
      Framebuffer
    }
    public Tag tag;

    public class TextureImage extends ImageRef { 
      public Integer _0;
      public Integer _1;
      public int _2;
    }
    public class Framebuffer extends ImageRef { 
      public ImageSemantic _0;
    }
  }

  public class ClearImage {
    public enum Tag { 
      ClearImage
    }
    public Tag tag;

    public class ClearImage extends ClearImage { 
      public ImageSemantic imageSemantic;
      public Value clearValue;
    }
  }

  public class Command {
    public enum Tag { 
      SetRasterContext,
      SetAccumulationContext,
      SetRenderTarget,
      SetProgram,
      SetSamplerUniform,
      SetTexture,
      SetSampler,
      RenderSlot,
      RenderStream,
      ClearRenderTarget,
      GenerateMipMap,
      SaveImage,
      LoadImage
    }
    public Tag tag;

    public class SetRasterContext extends Command { 
      public RasterContext _0;
    }
    public class SetAccumulationContext extends Command { 
      public AccumulationContext _0;
    }
    public class SetRenderTarget extends Command { 
      public Integer _0;
    }
    public class SetProgram extends Command { 
      public Integer _0;
    }
    public class SetSamplerUniform extends Command { 
      public String _0;
      public Integer _1;
    }
    public class SetTexture extends Command { 
      public Integer _0;
      public Integer _1;
    }
    public class SetSampler extends Command { 
      public Integer _0;
      public int _1;
    }
    public class RenderSlot extends Command { 
      public Integer _0;
    }
    public class RenderStream extends Command { 
      public Integer _0;
    }
    public class ClearRenderTarget extends Command { 
      public ArrayList<ClearImage> _0;
    }
    public class GenerateMipMap extends Command { 
      public Integer _0;
    }
    public class SaveImage extends Command { 
      public Integer _0;
      public ImageRef _1;
    }
    public class LoadImage extends Command { 
      public ImageRef _0;
      public Integer _1;
    }
  }

  public class SamplerDescriptor {
    public enum Tag { 
      SamplerDescriptor
    }
    public Tag tag;

    public class SamplerDescriptor extends SamplerDescriptor { 
      public EdgeMode samplerWrapS;
      public int samplerWrapT;
      public int samplerWrapR;
      public Filter samplerMinFilter;
      public Filter samplerMagFilter;
      public Value samplerBorderColor;
      public int samplerMinLod;
      public int samplerMaxLod;
      public Float samplerLodBias;
      public int samplerCompareFunc;
    }
  }

  public class TextureDescriptor {
    public enum Tag { 
      TextureDescriptor
    }
    public Tag tag;

    public class TextureDescriptor extends TextureDescriptor { 
      public TextureType textureType;
      public Value textureSize;
      public ImageSemantic textureSemantic;
      public SamplerDescriptor textureSampler;
      public Integer textureBaseLevel;
      public Integer textureMaxLevel;
    }
  }

  public class Parameter {
    public enum Tag { 
      Parameter
    }
    public Tag tag;

    public class Parameter extends Parameter { 
      public String name;
      public InputType ty;
    }
  }

  public class Program {
    public enum Tag { 
      Program
    }
    public Tag tag;

    public class Program extends Program { 
      public HashMap<String, InputType> programUniforms;
      public HashMap<String, Parameter> programStreams;
      public HashMap<String, InputType> programInTextures;
      public ArrayList<Parameter> programOutput;
      public String vertexShader;
      public int geometryShader;
      public String fragmentShader;
    }
  }

  public class Slot {
    public enum Tag { 
      Slot
    }
    public Tag tag;

    public class Slot extends Slot { 
      public String slotName;
      public HashMap<String, InputType> slotStreams;
      public HashMap<String, InputType> slotUniforms;
      public FetchPrimitive slotPrimitive;
      public ArrayList<Integer> slotPrograms;
    }
  }

  public class StreamData {
    public enum Tag { 
      StreamData
    }
    public Tag tag;

    public class StreamData extends StreamData { 
      public HashMap<String, ArrayValue> streamData;
      public HashMap<String, InputType> streamType;
      public FetchPrimitive streamPrimitive;
      public ArrayList<Integer> streamPrograms;
    }
  }

  public class TargetItem {
    public enum Tag { 
      TargetItem
    }
    public Tag tag;

    public class TargetItem extends TargetItem { 
      public ImageSemantic targetSemantic;
      public int targetRef;
    }
  }

  public class RenderTarget {
    public enum Tag { 
      RenderTarget
    }
    public Tag tag;

    public class RenderTarget extends RenderTarget { 
      public ArrayList<TargetItem> renderTargets;
    }
  }

  public class Backend {
    public enum Tag { 
      WebGL1,
      OpenGL33
    }
    public Tag tag;

  }

  public class Pipeline {
    public enum Tag { 
      Pipeline
    }
    public Tag tag;

    public class Pipeline extends Pipeline { 
      public String info;
      public Backend backend;
      public ArrayList<TextureDescriptor> textures;
      public ArrayList<SamplerDescriptor> samplers;
      public ArrayList<RenderTarget> targets;
      public ArrayList<Program> programs;
      public ArrayList<Slot> slots;
      public ArrayList<StreamData> streams;
      public ArrayList<Command> commands;
    }
  }

}