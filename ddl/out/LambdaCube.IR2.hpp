// generated file, do not modify!
// 2016-11-10T15:07:10.798971000000Z

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

namespace data { 
  class VBoolArray {
  public: 
    std::vector<Bool> _0;
  };
  class VIntArray {
  public: 
    std::vector<Int32> _0;
  };
  class VWordArray {
  public: 
    std::vector<Word32> _0;
  };
  class VFloatArray {
  public: 
    std::vector<Float> _0;
  };
}
class ArrayValue {
public:
  enum class tag { 
    VBoolArray,
    VIntArray,
    VWordArray,
    VFloatArray
  } tag;
  std::shared_ptr<data::VBoolArray> VBoolArray;
  std::shared_ptr<data::VIntArray> VIntArray;
  std::shared_ptr<data::VWordArray> VWordArray;
  std::shared_ptr<data::VFloatArray> VFloatArray;
};
namespace data { 
  class VBool {
  public: 
    Bool _0;
  };
  class VV2B {
  public: 
    V2B _0;
  };
  class VV3B {
  public: 
    V3B _0;
  };
  class VV4B {
  public: 
    V4B _0;
  };
  class VWord {
  public: 
    Word32 _0;
  };
  class VV2U {
  public: 
    V2U _0;
  };
  class VV3U {
  public: 
    V3U _0;
  };
  class VV4U {
  public: 
    V4U _0;
  };
  class VInt {
  public: 
    Int32 _0;
  };
  class VV2I {
  public: 
    V2I _0;
  };
  class VV3I {
  public: 
    V3I _0;
  };
  class VV4I {
  public: 
    V4I _0;
  };
  class VFloat {
  public: 
    Float _0;
  };
  class VV2F {
  public: 
    V2F _0;
  };
  class VV3F {
  public: 
    V3F _0;
  };
  class VV4F {
  public: 
    V4F _0;
  };
  class VM22F {
  public: 
    M22F _0;
  };
  class VM23F {
  public: 
    M23F _0;
  };
  class VM24F {
  public: 
    M24F _0;
  };
  class VM32F {
  public: 
    M32F _0;
  };
  class VM33F {
  public: 
    M33F _0;
  };
  class VM34F {
  public: 
    M34F _0;
  };
  class VM42F {
  public: 
    M42F _0;
  };
  class VM43F {
  public: 
    M43F _0;
  };
  class VM44F {
  public: 
    M44F _0;
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
  std::shared_ptr<data::VBool> VBool;
  std::shared_ptr<data::VV2B> VV2B;
  std::shared_ptr<data::VV3B> VV3B;
  std::shared_ptr<data::VV4B> VV4B;
  std::shared_ptr<data::VWord> VWord;
  std::shared_ptr<data::VV2U> VV2U;
  std::shared_ptr<data::VV3U> VV3U;
  std::shared_ptr<data::VV4U> VV4U;
  std::shared_ptr<data::VInt> VInt;
  std::shared_ptr<data::VV2I> VV2I;
  std::shared_ptr<data::VV3I> VV3I;
  std::shared_ptr<data::VV4I> VV4I;
  std::shared_ptr<data::VFloat> VFloat;
  std::shared_ptr<data::VV2F> VV2F;
  std::shared_ptr<data::VV3F> VV3F;
  std::shared_ptr<data::VV4F> VV4F;
  std::shared_ptr<data::VM22F> VM22F;
  std::shared_ptr<data::VM23F> VM23F;
  std::shared_ptr<data::VM24F> VM24F;
  std::shared_ptr<data::VM32F> VM32F;
  std::shared_ptr<data::VM33F> VM33F;
  std::shared_ptr<data::VM34F> VM34F;
  std::shared_ptr<data::VM42F> VM42F;
  std::shared_ptr<data::VM43F> VM43F;
  std::shared_ptr<data::VM44F> VM44F;
};
namespace data { 
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
  class PointSize {
  public: 
    Float _0;
  };
}
class PointSize {
public:
  enum class tag { 
    PointSize,
    ProgramPointSize
  } tag;
  std::shared_ptr<data::PointSize> PointSize;
};
namespace data { 
  class Offset {
  public: 
    Float _0;
    Float _1;
  };
}
class PolygonOffset {
public:
  enum class tag { 
    NoOffset,
    Offset
  } tag;
  std::shared_ptr<data::Offset> Offset;
};
namespace data { 
}
class FrontFace {
public:
  enum class tag { 
    CCW,
    CW
  } tag;
};
namespace data { 
  class PolygonPoint {
  public: 
    std::shared_ptr<::PointSize> _0;
  };
  class PolygonLine {
  public: 
    Float _0;
  };
}
class PolygonMode {
public:
  enum class tag { 
    PolygonPoint,
    PolygonLine,
    PolygonFill
  } tag;
  std::shared_ptr<data::PolygonPoint> PolygonPoint;
  std::shared_ptr<data::PolygonLine> PolygonLine;
};
namespace data { 
}
class ProvokingVertex {
public:
  enum class tag { 
    FirstVertex,
    LastVertex
  } tag;
};
namespace data { 
  class CullFront {
  public: 
    std::shared_ptr<::FrontFace> _0;
  };
  class CullBack {
  public: 
    std::shared_ptr<::FrontFace> _0;
  };
}
class CullMode {
public:
  enum class tag { 
    CullNone,
    CullFront,
    CullBack
  } tag;
  std::shared_ptr<data::CullFront> CullFront;
  std::shared_ptr<data::CullBack> CullBack;
};
namespace data { 
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
typedef ComparisonFunction DepthFunction;

namespace data { 
}
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
  class StencilOps {
  public: 
    std::shared_ptr<::StencilOperation> frontStencilOp;
    std::shared_ptr<::StencilOperation> backStencilOp;
  };
}
class StencilOps {
public:
  enum class tag { 
    StencilOps
  } tag;
  std::shared_ptr<data::StencilOps> StencilOps;
};
namespace data { 
  class StencilTest {
  public: 
    std::shared_ptr<::ComparisonFunction> stencilComparision;
    Int32 stencilReference;
    Word32 stencilMask;
  };
}
class StencilTest {
public:
  enum class tag { 
    StencilTest
  } tag;
  std::shared_ptr<data::StencilTest> StencilTest;
};
namespace data { 
  class StencilTests {
  public: 
    std::shared_ptr<::StencilTest> _0;
    std::shared_ptr<::StencilTest> _1;
  };
}
class StencilTests {
public:
  enum class tag { 
    StencilTests
  } tag;
  std::shared_ptr<data::StencilTests> StencilTests;
};
namespace data { 
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
  class BlendLogicOp {
  public: 
    std::shared_ptr<::LogicOperation> _0;
  };
  class Blend {
  public: 
    std::shared_ptr<::BlendEquation> colorEqSrc;
    std::shared_ptr<::BlendEquation> alphaEqSrc;
    std::shared_ptr<::BlendingFactor> colorFSrc;
    std::shared_ptr<::BlendingFactor> colorFDst;
    std::shared_ptr<::BlendingFactor> alphaFSrc;
    std::shared_ptr<::BlendingFactor> alphaFDst;
    V4F color;
  };
}
class Blending {
public:
  enum class tag { 
    NoBlending,
    BlendLogicOp,
    Blend
  } tag;
  std::shared_ptr<data::BlendLogicOp> BlendLogicOp;
  std::shared_ptr<data::Blend> Blend;
};
namespace data { 
  class PointCtx {
  public: 
    std::shared_ptr<::PointSize> _0;
    Float _1;
    std::shared_ptr<::PointSpriteCoordOrigin> _2;
  };
  class LineCtx {
  public: 
    Float _0;
    std::shared_ptr<::ProvokingVertex> _1;
  };
  class TriangleCtx {
  public: 
    std::shared_ptr<::CullMode> _0;
    std::shared_ptr<::PolygonMode> _1;
    std::shared_ptr<::PolygonOffset> _2;
    std::shared_ptr<::ProvokingVertex> _3;
  };
}
class RasterContext {
public:
  enum class tag { 
    PointCtx,
    LineCtx,
    TriangleCtx
  } tag;
  std::shared_ptr<data::PointCtx> PointCtx;
  std::shared_ptr<data::LineCtx> LineCtx;
  std::shared_ptr<data::TriangleCtx> TriangleCtx;
};
namespace data { 
  class DepthOp {
  public: 
    std::shared_ptr<::DepthFunction> _0;
    Bool _1;
  };
  class StencilOp {
  public: 
    std::shared_ptr<::StencilTests> _0;
    std::shared_ptr<::StencilOps> _1;
    std::shared_ptr<::StencilOps> _2;
  };
  class ColorOp {
  public: 
    std::shared_ptr<::Blending> _0;
    std::shared_ptr<::Value> _1;
  };
}
class FragmentOperation {
public:
  enum class tag { 
    DepthOp,
    StencilOp,
    ColorOp
  } tag;
  std::shared_ptr<data::DepthOp> DepthOp;
  std::shared_ptr<data::StencilOp> StencilOp;
  std::shared_ptr<data::ColorOp> ColorOp;
};
namespace data { 
  class AccumulationContext {
  public: 
    Maybe<String> accViewportName;
    std::vector<std::shared_ptr<::FragmentOperation>> accOperations;
  };
}
class AccumulationContext {
public:
  enum class tag { 
    AccumulationContext
  } tag;
  std::shared_ptr<data::AccumulationContext> AccumulationContext;
};
namespace data { 
  class FloatT {
  public: 
    std::shared_ptr<::ColorArity> _0;
  };
  class IntT {
  public: 
    std::shared_ptr<::ColorArity> _0;
  };
  class WordT {
  public: 
    std::shared_ptr<::ColorArity> _0;
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
  std::shared_ptr<data::FloatT> FloatT;
  std::shared_ptr<data::IntT> IntT;
  std::shared_ptr<data::WordT> WordT;
};
namespace data { 
  class Texture1D {
  public: 
    std::shared_ptr<::TextureDataType> _0;
    Int _1;
  };
  class Texture2D {
  public: 
    std::shared_ptr<::TextureDataType> _0;
    Int _1;
  };
  class Texture3D {
  public: 
    std::shared_ptr<::TextureDataType> _0;
  };
  class TextureCube {
  public: 
    std::shared_ptr<::TextureDataType> _0;
  };
  class TextureRect {
  public: 
    std::shared_ptr<::TextureDataType> _0;
  };
  class Texture2DMS {
  public: 
    std::shared_ptr<::TextureDataType> _0;
    Int _1;
    Int _2;
    Bool _3;
  };
  class TextureBuffer {
  public: 
    std::shared_ptr<::TextureDataType> _0;
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
  std::shared_ptr<data::Texture1D> Texture1D;
  std::shared_ptr<data::Texture2D> Texture2D;
  std::shared_ptr<data::Texture3D> Texture3D;
  std::shared_ptr<data::TextureCube> TextureCube;
  std::shared_ptr<data::TextureRect> TextureRect;
  std::shared_ptr<data::Texture2DMS> Texture2DMS;
  std::shared_ptr<data::TextureBuffer> TextureBuffer;
};
namespace data { 
  class Mip {
  public: 
    Int _0;
    Int _1;
  };
  class AutoMip {
  public: 
    Int _0;
    Int _1;
  };
}
class MipMap {
public:
  enum class tag { 
    Mip,
    NoMip,
    AutoMip
  } tag;
  std::shared_ptr<data::Mip> Mip;
  std::shared_ptr<data::AutoMip> AutoMip;
};
namespace data { 
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
  class TextureImage {
  public: 
    ::TextureName _0;
    Int _1;
    Maybe<Int> _2;
  };
  class Framebuffer {
  public: 
    std::shared_ptr<::ImageSemantic> _0;
  };
}
class ImageRef {
public:
  enum class tag { 
    TextureImage,
    Framebuffer
  } tag;
  std::shared_ptr<data::TextureImage> TextureImage;
  std::shared_ptr<data::Framebuffer> Framebuffer;
};
namespace data { 
  class ClearImage {
  public: 
    std::shared_ptr<::ImageSemantic> imageSemantic;
    std::shared_ptr<::Value> clearValue;
  };
}
class ClearImage {
public:
  enum class tag { 
    ClearImage
  } tag;
  std::shared_ptr<data::ClearImage> ClearImage;
};
namespace data { 
  class SetRasterContext {
  public: 
    std::shared_ptr<::RasterContext> _0;
  };
  class SetAccumulationContext {
  public: 
    std::shared_ptr<::AccumulationContext> _0;
  };
  class SetRenderTarget {
  public: 
    ::RenderTargetName _0;
  };
  class SetProgram {
  public: 
    ::ProgramName _0;
  };
  class SetSamplerUniform {
  public: 
    ::UniformName _0;
    ::TextureUnit _1;
  };
  class SetTexture {
  public: 
    ::TextureUnit _0;
    ::TextureName _1;
  };
  class SetSampler {
  public: 
    ::TextureUnit _0;
    Maybe<::SamplerName> _1;
  };
  class RenderSlot {
  public: 
    ::SlotName _0;
  };
  class RenderStream {
  public: 
    ::StreamName _0;
  };
  class ClearRenderTarget {
  public: 
    std::vector<std::shared_ptr<::ClearImage>> _0;
  };
  class GenerateMipMap {
  public: 
    ::TextureUnit _0;
  };
  class SaveImage {
  public: 
    ::FrameBufferComponent _0;
    std::shared_ptr<::ImageRef> _1;
  };
  class LoadImage {
  public: 
    std::shared_ptr<::ImageRef> _0;
    ::FrameBufferComponent _1;
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
  std::shared_ptr<data::SetRasterContext> SetRasterContext;
  std::shared_ptr<data::SetAccumulationContext> SetAccumulationContext;
  std::shared_ptr<data::SetRenderTarget> SetRenderTarget;
  std::shared_ptr<data::SetProgram> SetProgram;
  std::shared_ptr<data::SetSamplerUniform> SetSamplerUniform;
  std::shared_ptr<data::SetTexture> SetTexture;
  std::shared_ptr<data::SetSampler> SetSampler;
  std::shared_ptr<data::RenderSlot> RenderSlot;
  std::shared_ptr<data::RenderStream> RenderStream;
  std::shared_ptr<data::ClearRenderTarget> ClearRenderTarget;
  std::shared_ptr<data::GenerateMipMap> GenerateMipMap;
  std::shared_ptr<data::SaveImage> SaveImage;
  std::shared_ptr<data::LoadImage> LoadImage;
};
namespace data { 
  class SamplerDescriptor {
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
  };
}
class SamplerDescriptor {
public:
  enum class tag { 
    SamplerDescriptor
  } tag;
  std::shared_ptr<data::SamplerDescriptor> SamplerDescriptor;
};
namespace data { 
  class TextureDescriptor {
  public: 
    std::shared_ptr<::TextureType> textureType;
    std::shared_ptr<::Value> textureSize;
    std::shared_ptr<::ImageSemantic> textureSemantic;
    std::shared_ptr<::SamplerDescriptor> textureSampler;
    Int textureBaseLevel;
    Int textureMaxLevel;
  };
}
class TextureDescriptor {
public:
  enum class tag { 
    TextureDescriptor
  } tag;
  std::shared_ptr<data::TextureDescriptor> TextureDescriptor;
};
namespace data { 
  class Parameter {
  public: 
    String name;
    std::shared_ptr<::InputType> ty;
  };
}
class Parameter {
public:
  enum class tag { 
    Parameter
  } tag;
  std::shared_ptr<data::Parameter> Parameter;
};
namespace data { 
  class Program {
  public: 
    std::map<::UniformName, std::shared_ptr<::InputType>> programUniforms;
    std::map<::UniformName, std::shared_ptr<::Parameter>> programStreams;
    std::map<::UniformName, std::shared_ptr<::InputType>> programInTextures;
    std::vector<std::shared_ptr<::Parameter>> programOutput;
    String vertexShader;
    Maybe<String> geometryShader;
    String fragmentShader;
  };
}
class Program {
public:
  enum class tag { 
    Program
  } tag;
  std::shared_ptr<data::Program> Program;
};
namespace data { 
  class Slot {
  public: 
    String slotName;
    std::map<String, std::shared_ptr<::InputType>> slotStreams;
    std::map<::UniformName, std::shared_ptr<::InputType>> slotUniforms;
    std::shared_ptr<::FetchPrimitive> slotPrimitive;
    std::vector<::ProgramName> slotPrograms;
  };
}
class Slot {
public:
  enum class tag { 
    Slot
  } tag;
  std::shared_ptr<data::Slot> Slot;
};
namespace data { 
  class StreamData {
  public: 
    std::map<String, std::shared_ptr<::ArrayValue>> streamData;
    std::map<String, std::shared_ptr<::InputType>> streamType;
    std::shared_ptr<::FetchPrimitive> streamPrimitive;
    std::vector<::ProgramName> streamPrograms;
  };
}
class StreamData {
public:
  enum class tag { 
    StreamData
  } tag;
  std::shared_ptr<data::StreamData> StreamData;
};
namespace data { 
  class TargetItem {
  public: 
    std::shared_ptr<::ImageSemantic> targetSemantic;
    Maybe<std::shared_ptr<::ImageRef>> targetRef;
  };
}
class TargetItem {
public:
  enum class tag { 
    TargetItem
  } tag;
  std::shared_ptr<data::TargetItem> TargetItem;
};
namespace data { 
  class RenderTarget {
  public: 
    std::vector<std::shared_ptr<::TargetItem>> renderTargets;
  };
}
class RenderTarget {
public:
  enum class tag { 
    RenderTarget
  } tag;
  std::shared_ptr<data::RenderTarget> RenderTarget;
};
namespace data { 
}
class Backend {
public:
  enum class tag { 
    WebGL1,
    OpenGL33,
    DirectX11
  } tag;
};
namespace data { 
  class Pipeline {
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
  };
}
class Pipeline {
public:
  enum class tag { 
    Pipeline
  } tag;
  std::shared_ptr<data::Pipeline> Pipeline;
};
#endif
