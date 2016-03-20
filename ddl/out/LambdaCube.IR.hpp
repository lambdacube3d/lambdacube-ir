// generated file, do not modify!
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.426854000000Z
=======
// 2016-03-20T21:42:12.172652000000Z
>>>>>>> working c# backend

#ifndef HEADER_LambdaCube.IR_H
#define HEADER_LambdaCube.IR_H

#include "RT.hpp"


typedef Int StreamName;

typedef Int ProgramName;

typedef Int TextureName;

typedef Int SamplerName;

typedef String UniformName;

typedef Int SlotName;

typedef Int FrameBufferComponent;

typedef Int TextureUnit;

typedef Int RenderTargetName;

typedef std::map<::UniformName, ::TextureUnit> TextureUnitMapping;

class ArrayValue {
  public:
    enum class tag { 
      VBoolArray,
      VIntArray,
      VWordArray,
      VFloatArray
    } tag;
};
namespace data { 
  class VBoolArray : public ::ArrayValue {
    public:
      std::vector<Bool> _0;
      VBoolArray() { tag = tag::VBoolArray; }
  };
  class VIntArray : public ::ArrayValue {
    public:
      std::vector<Int32> _0;
      VIntArray() { tag = tag::VIntArray; }
  };
  class VWordArray : public ::ArrayValue {
    public:
      std::vector<Word32> _0;
      VWordArray() { tag = tag::VWordArray; }
  };
  class VFloatArray : public ::ArrayValue {
    public:
      std::vector<Float> _0;
      VFloatArray() { tag = tag::VFloatArray; }
  };
}
class Value {
  public:
    enum class tag { 
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
    } tag;
};
namespace data { 
  class VBool : public ::Value {
    public:
      Bool _0;
      VBool() { tag = tag::VBool; }
  };
  class VV2B : public ::Value {
    public:
      V2B _0;
      VV2B() { tag = tag::VV2B; }
  };
  class VV3B : public ::Value {
    public:
      V3B _0;
      VV3B() { tag = tag::VV3B; }
  };
  class VV4B : public ::Value {
    public:
      V4B _0;
      VV4B() { tag = tag::VV4B; }
  };
  class VWord : public ::Value {
    public:
      Word32 _0;
      VWord() { tag = tag::VWord; }
  };
  class VV2U : public ::Value {
    public:
      V2U _0;
      VV2U() { tag = tag::VV2U; }
  };
  class VV3U : public ::Value {
    public:
      V3U _0;
      VV3U() { tag = tag::VV3U; }
  };
  class VV4U : public ::Value {
    public:
      V4U _0;
      VV4U() { tag = tag::VV4U; }
  };
  class VInt : public ::Value {
    public:
      Int32 _0;
      VInt() { tag = tag::VInt; }
  };
  class VV2I : public ::Value {
    public:
      V2I _0;
      VV2I() { tag = tag::VV2I; }
  };
  class VV3I : public ::Value {
    public:
      V3I _0;
      VV3I() { tag = tag::VV3I; }
  };
  class VV4I : public ::Value {
    public:
      V4I _0;
      VV4I() { tag = tag::VV4I; }
  };
  class VFloat : public ::Value {
    public:
      Float _0;
      VFloat() { tag = tag::VFloat; }
  };
  class VV2F : public ::Value {
    public:
      V2F _0;
      VV2F() { tag = tag::VV2F; }
  };
  class VV3F : public ::Value {
    public:
      V3F _0;
      VV3F() { tag = tag::VV3F; }
  };
  class VV4F : public ::Value {
    public:
      V4F _0;
      VV4F() { tag = tag::VV4F; }
  };
  class VM22F : public ::Value {
    public:
      M22F _0;
      VM22F() { tag = tag::VM22F; }
  };
  class VM23F : public ::Value {
    public:
      M23F _0;
      VM23F() { tag = tag::VM23F; }
  };
  class VM24F : public ::Value {
    public:
      M24F _0;
      VM24F() { tag = tag::VM24F; }
  };
  class VM32F : public ::Value {
    public:
      M32F _0;
      VM32F() { tag = tag::VM32F; }
  };
  class VM33F : public ::Value {
    public:
      M33F _0;
      VM33F() { tag = tag::VM33F; }
  };
  class VM34F : public ::Value {
    public:
      M34F _0;
      VM34F() { tag = tag::VM34F; }
  };
  class VM42F : public ::Value {
    public:
      M42F _0;
      VM42F() { tag = tag::VM42F; }
  };
  class VM43F : public ::Value {
    public:
      M43F _0;
      VM43F() { tag = tag::VM43F; }
  };
  class VM44F : public ::Value {
    public:
      M44F _0;
      VM44F() { tag = tag::VM44F; }
  };
}
class InputType {
  public:
    enum class tag { 
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
    } tag;
};
namespace data { 
}
class PointSpriteCoordOrigin {
  public:
    enum class tag { 
      LowerLeft,
      UpperLeft
    } tag;
};
namespace data { 
}
class PointSize {
  public:
    enum class tag { 
      PointSize,
      ProgramPointSize
    } tag;
};
namespace data { 
  class PointSize : public ::PointSize {
    public:
      Float _0;
      PointSize() { tag = tag::PointSize; }
  };
}
class PolygonOffset {
  public:
    enum class tag { 
      NoOffset,
      Offset
    } tag;
};
namespace data { 
  class Offset : public ::PolygonOffset {
    public:
      Float _0;
      Float _1;
      Offset() { tag = tag::Offset; }
  };
}
class FrontFace {
  public:
    enum class tag { 
      CCW,
      CW
    } tag;
};
namespace data { 
}
class PolygonMode {
  public:
    enum class tag { 
      PolygonPoint,
      PolygonLine,
      PolygonFill
    } tag;
};
namespace data { 
  class PolygonPoint : public ::PolygonMode {
    public:
      std::shared_ptr<::PointSize> _0;
      PolygonPoint() { tag = tag::PolygonPoint; }
  };
  class PolygonLine : public ::PolygonMode {
    public:
      Float _0;
      PolygonLine() { tag = tag::PolygonLine; }
  };
}
class ProvokingVertex {
  public:
    enum class tag { 
      FirstVertex,
      LastVertex
    } tag;
};
namespace data { 
}
class CullMode {
  public:
    enum class tag { 
      CullNone,
      CullFront,
      CullBack
    } tag;
};
namespace data { 
  class CullFront : public ::CullMode {
    public:
      std::shared_ptr<::FrontFace> _0;
      CullFront() { tag = tag::CullFront; }
  };
  class CullBack : public ::CullMode {
    public:
      std::shared_ptr<::FrontFace> _0;
      CullBack() { tag = tag::CullBack; }
  };
}
class ComparisonFunction {
  public:
    enum class tag { 
      Never,
      Less,
      Equal,
      Lequal,
      Greater,
      Notequal,
      Gequal,
      Always
    } tag;
};
namespace data { 
}
typedef ComparisonFunction DepthFunction;

class StencilOperation {
  public:
    enum class tag { 
      OpZero,
      OpKeep,
      OpReplace,
      OpIncr,
      OpIncrWrap,
      OpDecr,
      OpDecrWrap,
      OpInvert
    } tag;
};
namespace data { 
}
class BlendEquation {
  public:
    enum class tag { 
      FuncAdd,
      FuncSubtract,
      FuncReverseSubtract,
      Min,
      Max
    } tag;
};
namespace data { 
}
class BlendingFactor {
  public:
    enum class tag { 
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
    } tag;
};
namespace data { 
}
class LogicOperation {
  public:
    enum class tag { 
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
    } tag;
};
namespace data { 
}
class StencilOps {
  public:
    enum class tag { 
      StencilOps
    } tag;
};
namespace data { 
  class StencilOps : public ::StencilOps {
    public:
      std::shared_ptr<::StencilOperation> frontStencilOp;
      std::shared_ptr<::StencilOperation> backStencilOp;
      StencilOps() { tag = tag::StencilOps; }
  };
}
class StencilTest {
  public:
    enum class tag { 
      StencilTest
    } tag;
};
namespace data { 
  class StencilTest : public ::StencilTest {
    public:
      std::shared_ptr<::ComparisonFunction> stencilComparision;
      Int32 stencilReference;
      Word32 stencilMask;
      StencilTest() { tag = tag::StencilTest; }
  };
}
class StencilTests {
  public:
    enum class tag { 
      StencilTests
    } tag;
};
namespace data { 
  class StencilTests : public ::StencilTests {
    public:
      std::shared_ptr<::StencilTest> _0;
      std::shared_ptr<::StencilTest> _1;
      StencilTests() { tag = tag::StencilTests; }
  };
}
class FetchPrimitive {
  public:
    enum class tag { 
      Points,
      Lines,
      Triangles,
      LinesAdjacency,
      TrianglesAdjacency
    } tag;
};
namespace data { 
}
class OutputPrimitive {
  public:
    enum class tag { 
      TrianglesOutput,
      LinesOutput,
      PointsOutput
    } tag;
};
namespace data { 
}
class ColorArity {
  public:
    enum class tag { 
      Red,
      RG,
      RGB,
      RGBA
    } tag;
};
namespace data { 
}
class Blending {
  public:
    enum class tag { 
      NoBlending,
      BlendLogicOp,
      Blend
    } tag;
};
namespace data { 
  class BlendLogicOp : public ::Blending {
    public:
      std::shared_ptr<::LogicOperation> _0;
      BlendLogicOp() { tag = tag::BlendLogicOp; }
  };
  class Blend : public ::Blending {
    public:
      std::shared_ptr<::BlendEquation> colorEqSrc;
      std::shared_ptr<::BlendEquation> alphaEqSrc;
      std::shared_ptr<::BlendingFactor> colorFSrc;
      std::shared_ptr<::BlendingFactor> colorFDst;
      std::shared_ptr<::BlendingFactor> alphaFSrc;
      std::shared_ptr<::BlendingFactor> alphaFDst;
      V4F color;
      Blend() { tag = tag::Blend; }
  };
}
class RasterContext {
  public:
    enum class tag { 
      PointCtx,
      LineCtx,
      TriangleCtx
    } tag;
};
namespace data { 
  class PointCtx : public ::RasterContext {
    public:
      std::shared_ptr<::PointSize> _0;
      Float _1;
      std::shared_ptr<::PointSpriteCoordOrigin> _2;
      PointCtx() { tag = tag::PointCtx; }
  };
  class LineCtx : public ::RasterContext {
    public:
      Float _0;
      std::shared_ptr<::ProvokingVertex> _1;
      LineCtx() { tag = tag::LineCtx; }
  };
  class TriangleCtx : public ::RasterContext {
    public:
      std::shared_ptr<::CullMode> _0;
      std::shared_ptr<::PolygonMode> _1;
      std::shared_ptr<::PolygonOffset> _2;
      std::shared_ptr<::ProvokingVertex> _3;
      TriangleCtx() { tag = tag::TriangleCtx; }
  };
}
class FragmentOperation {
  public:
    enum class tag { 
      DepthOp,
      StencilOp,
      ColorOp
    } tag;
};
namespace data { 
  class DepthOp : public ::FragmentOperation {
    public:
      std::shared_ptr<::DepthFunction> _0;
      Bool _1;
      DepthOp() { tag = tag::DepthOp; }
  };
  class StencilOp : public ::FragmentOperation {
    public:
      std::shared_ptr<::StencilTests> _0;
      std::shared_ptr<::StencilOps> _1;
      std::shared_ptr<::StencilOps> _2;
      StencilOp() { tag = tag::StencilOp; }
  };
  class ColorOp : public ::FragmentOperation {
    public:
      std::shared_ptr<::Blending> _0;
      std::shared_ptr<::Value> _1;
      ColorOp() { tag = tag::ColorOp; }
  };
}
class AccumulationContext {
  public:
    enum class tag { 
      AccumulationContext
    } tag;
};
namespace data { 
  class AccumulationContext : public ::AccumulationContext {
    public:
      Maybe<String> accViewportName;
      std::vector<std::shared_ptr<::FragmentOperation>> accOperations;
      AccumulationContext() { tag = tag::AccumulationContext; }
  };
}
class TextureDataType {
  public:
    enum class tag { 
      FloatT,
      IntT,
      WordT,
      ShadowT
    } tag;
};
namespace data { 
  class FloatT : public ::TextureDataType {
    public:
      std::shared_ptr<::ColorArity> _0;
      FloatT() { tag = tag::FloatT; }
  };
  class IntT : public ::TextureDataType {
    public:
      std::shared_ptr<::ColorArity> _0;
      IntT() { tag = tag::IntT; }
  };
  class WordT : public ::TextureDataType {
    public:
      std::shared_ptr<::ColorArity> _0;
      WordT() { tag = tag::WordT; }
  };
}
class TextureType {
  public:
    enum class tag { 
      Texture1D,
      Texture2D,
      Texture3D,
      TextureCube,
      TextureRect,
      Texture2DMS,
      TextureBuffer
    } tag;
};
namespace data { 
  class Texture1D : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      Int _1;
      Texture1D() { tag = tag::Texture1D; }
  };
  class Texture2D : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      Int _1;
      Texture2D() { tag = tag::Texture2D; }
  };
  class Texture3D : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      Texture3D() { tag = tag::Texture3D; }
  };
  class TextureCube : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      TextureCube() { tag = tag::TextureCube; }
  };
  class TextureRect : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      TextureRect() { tag = tag::TextureRect; }
  };
  class Texture2DMS : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      Int _1;
      Int _2;
      Bool _3;
      Texture2DMS() { tag = tag::Texture2DMS; }
  };
  class TextureBuffer : public ::TextureType {
    public:
      std::shared_ptr<::TextureDataType> _0;
      TextureBuffer() { tag = tag::TextureBuffer; }
  };
}
class MipMap {
  public:
    enum class tag { 
      Mip,
      NoMip,
      AutoMip
    } tag;
};
namespace data { 
  class Mip : public ::MipMap {
    public:
      Int _0;
      Int _1;
      Mip() { tag = tag::Mip; }
  };
  class AutoMip : public ::MipMap {
    public:
      Int _0;
      Int _1;
      AutoMip() { tag = tag::AutoMip; }
  };
}
class Filter {
  public:
    enum class tag { 
      Nearest,
      Linear,
      NearestMipmapNearest,
      NearestMipmapLinear,
      LinearMipmapNearest,
      LinearMipmapLinear
    } tag;
};
namespace data { 
}
class EdgeMode {
  public:
    enum class tag { 
      Repeat,
      MirroredRepeat,
      ClampToEdge,
      ClampToBorder
    } tag;
};
namespace data { 
}
class ImageSemantic {
  public:
    enum class tag { 
      Depth,
      Stencil,
      Color
    } tag;
};
namespace data { 
}
class ImageRef {
  public:
    enum class tag { 
      TextureImage,
      Framebuffer
    } tag;
};
namespace data { 
  class TextureImage : public ::ImageRef {
    public:
      ::TextureName _0;
      Int _1;
      Maybe<Int> _2;
      TextureImage() { tag = tag::TextureImage; }
  };
  class Framebuffer : public ::ImageRef {
    public:
      std::shared_ptr<::ImageSemantic> _0;
      Framebuffer() { tag = tag::Framebuffer; }
  };
}
class ClearImage {
  public:
    enum class tag { 
      ClearImage
    } tag;
};
namespace data { 
  class ClearImage : public ::ClearImage {
    public:
      std::shared_ptr<::ImageSemantic> imageSemantic;
      std::shared_ptr<::Value> clearValue;
      ClearImage() { tag = tag::ClearImage; }
  };
}
class Command {
  public:
    enum class tag { 
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
    } tag;
};
namespace data { 
  class SetRasterContext : public ::Command {
    public:
      std::shared_ptr<::RasterContext> _0;
      SetRasterContext() { tag = tag::SetRasterContext; }
  };
  class SetAccumulationContext : public ::Command {
    public:
      std::shared_ptr<::AccumulationContext> _0;
      SetAccumulationContext() { tag = tag::SetAccumulationContext; }
  };
  class SetRenderTarget : public ::Command {
    public:
      ::RenderTargetName _0;
      SetRenderTarget() { tag = tag::SetRenderTarget; }
  };
  class SetProgram : public ::Command {
    public:
      ::ProgramName _0;
      SetProgram() { tag = tag::SetProgram; }
  };
  class SetSamplerUniform : public ::Command {
    public:
      ::UniformName _0;
      ::TextureUnit _1;
      SetSamplerUniform() { tag = tag::SetSamplerUniform; }
  };
  class SetTexture : public ::Command {
    public:
      ::TextureUnit _0;
      ::TextureName _1;
      SetTexture() { tag = tag::SetTexture; }
  };
  class SetSampler : public ::Command {
    public:
      ::TextureUnit _0;
      Maybe<::SamplerName> _1;
      SetSampler() { tag = tag::SetSampler; }
  };
  class RenderSlot : public ::Command {
    public:
      ::SlotName _0;
      RenderSlot() { tag = tag::RenderSlot; }
  };
  class RenderStream : public ::Command {
    public:
      ::StreamName _0;
      RenderStream() { tag = tag::RenderStream; }
  };
  class ClearRenderTarget : public ::Command {
    public:
      std::vector<std::shared_ptr<::ClearImage>> _0;
      ClearRenderTarget() { tag = tag::ClearRenderTarget; }
  };
  class GenerateMipMap : public ::Command {
    public:
      ::TextureUnit _0;
      GenerateMipMap() { tag = tag::GenerateMipMap; }
  };
  class SaveImage : public ::Command {
    public:
      ::FrameBufferComponent _0;
      std::shared_ptr<::ImageRef> _1;
      SaveImage() { tag = tag::SaveImage; }
  };
  class LoadImage : public ::Command {
    public:
      std::shared_ptr<::ImageRef> _0;
      ::FrameBufferComponent _1;
      LoadImage() { tag = tag::LoadImage; }
  };
}
class SamplerDescriptor {
  public:
    enum class tag { 
      SamplerDescriptor
    } tag;
};
namespace data { 
  class SamplerDescriptor : public ::SamplerDescriptor {
    public:
      std::shared_ptr<::EdgeMode> samplerWrapS;
      Maybe<std::shared_ptr<::EdgeMode>> samplerWrapT;
      Maybe<std::shared_ptr<::EdgeMode>> samplerWrapR;
      std::shared_ptr<::Filter> samplerMinFilter;
      std::shared_ptr<::Filter> samplerMagFilter;
      std::shared_ptr<::Value> samplerBorderColor;
      Maybe<Float> samplerMinLod;
      Maybe<Float> samplerMaxLod;
      Float samplerLodBias;
      Maybe<std::shared_ptr<::ComparisonFunction>> samplerCompareFunc;
      SamplerDescriptor() { tag = tag::SamplerDescriptor; }
  };
}
class TextureDescriptor {
  public:
    enum class tag { 
      TextureDescriptor
    } tag;
};
namespace data { 
  class TextureDescriptor : public ::TextureDescriptor {
    public:
      std::shared_ptr<::TextureType> textureType;
      std::shared_ptr<::Value> textureSize;
      std::shared_ptr<::ImageSemantic> textureSemantic;
      std::shared_ptr<::SamplerDescriptor> textureSampler;
      Int textureBaseLevel;
      Int textureMaxLevel;
      TextureDescriptor() { tag = tag::TextureDescriptor; }
  };
}
class Parameter {
  public:
    enum class tag { 
      Parameter
    } tag;
};
namespace data { 
  class Parameter : public ::Parameter {
    public:
      String name;
      std::shared_ptr<::InputType> ty;
      Parameter() { tag = tag::Parameter; }
  };
}
class Program {
  public:
    enum class tag { 
      Program
    } tag;
};
namespace data { 
  class Program : public ::Program {
    public:
      std::map<::UniformName, std::shared_ptr<::InputType>> programUniforms;
      std::map<::UniformName, std::shared_ptr<::Parameter>> programStreams;
      std::map<::UniformName, std::shared_ptr<::InputType>> programInTextures;
      std::vector<std::shared_ptr<::Parameter>> programOutput;
      String vertexShader;
      Maybe<String> geometryShader;
      String fragmentShader;
      Program() { tag = tag::Program; }
  };
}
class Slot {
  public:
    enum class tag { 
      Slot
    } tag;
};
namespace data { 
  class Slot : public ::Slot {
    public:
      String slotName;
      std::map<String, std::shared_ptr<::InputType>> slotStreams;
      std::map<::UniformName, std::shared_ptr<::InputType>> slotUniforms;
      std::shared_ptr<::FetchPrimitive> slotPrimitive;
      std::vector<::ProgramName> slotPrograms;
      Slot() { tag = tag::Slot; }
  };
}
class StreamData {
  public:
    enum class tag { 
      StreamData
    } tag;
};
namespace data { 
  class StreamData : public ::StreamData {
    public:
      std::map<String, std::shared_ptr<::ArrayValue>> streamData;
      std::map<String, std::shared_ptr<::InputType>> streamType;
      std::shared_ptr<::FetchPrimitive> streamPrimitive;
      std::vector<::ProgramName> streamPrograms;
      StreamData() { tag = tag::StreamData; }
  };
}
class TargetItem {
  public:
    enum class tag { 
      TargetItem
    } tag;
};
namespace data { 
  class TargetItem : public ::TargetItem {
    public:
      std::shared_ptr<::ImageSemantic> targetSemantic;
      Maybe<std::shared_ptr<::ImageRef>> targetRef;
      TargetItem() { tag = tag::TargetItem; }
  };
}
class RenderTarget {
  public:
    enum class tag { 
      RenderTarget
    } tag;
};
namespace data { 
  class RenderTarget : public ::RenderTarget {
    public:
      std::vector<std::shared_ptr<::TargetItem>> renderTargets;
      RenderTarget() { tag = tag::RenderTarget; }
  };
}
class Backend {
  public:
    enum class tag { 
      WebGL1,
      OpenGL33
    } tag;
};
namespace data { 
}
class Pipeline {
  public:
    enum class tag { 
      Pipeline
    } tag;
};
namespace data { 
  class Pipeline : public ::Pipeline {
    public:
      String info;
      std::shared_ptr<::Backend> backend;
      std::vector<std::shared_ptr<::TextureDescriptor>> textures;
      std::vector<std::shared_ptr<::SamplerDescriptor>> samplers;
      std::vector<std::shared_ptr<::RenderTarget>> targets;
      std::vector<std::shared_ptr<::Program>> programs;
      std::vector<std::shared_ptr<::Slot>> slots;
      std::vector<std::shared_ptr<::StreamData>> streams;
      std::vector<std::shared_ptr<::Command>> commands;
      Pipeline() { tag = tag::Pipeline; }
  };
}
#endif
