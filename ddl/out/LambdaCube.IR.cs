// generated file, do not modify!
// 2016-03-21T13:14:17.421561000000Z

using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json.Linq;


namespace LambdaCube.IR {
  class ArrayValue {
      public enum Tag { 
        VBoolArray,
        VIntArray,
        VWordArray,
        VFloatArray
      };
      public Tag tag;
  };

  namespace data { 
    class VBoolArray : LambdaCube.IR.ArrayValue { 
      public List<bool> _0;
      public VBoolArray() { tag = LambdaCube.IR.ArrayValue.Tag.VBoolArray; }
    };
    class VIntArray : LambdaCube.IR.ArrayValue { 
      public List<int> _0;
      public VIntArray() { tag = LambdaCube.IR.ArrayValue.Tag.VIntArray; }
    };
    class VWordArray : LambdaCube.IR.ArrayValue { 
      public List<uint> _0;
      public VWordArray() { tag = LambdaCube.IR.ArrayValue.Tag.VWordArray; }
    };
    class VFloatArray : LambdaCube.IR.ArrayValue { 
      public List<float> _0;
      public VFloatArray() { tag = LambdaCube.IR.ArrayValue.Tag.VFloatArray; }
    };
  }
  class Value {
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
      };
      public Tag tag;
  };

  namespace data { 
    class VBool : LambdaCube.IR.Value { 
      public bool _0;
      public VBool() { tag = LambdaCube.IR.Value.Tag.VBool; }
    };
    class VV2B : LambdaCube.IR.Value { 
      public V2<bool> _0;
      public VV2B() { tag = LambdaCube.IR.Value.Tag.VV2B; }
    };
    class VV3B : LambdaCube.IR.Value { 
      public V3<bool> _0;
      public VV3B() { tag = LambdaCube.IR.Value.Tag.VV3B; }
    };
    class VV4B : LambdaCube.IR.Value { 
      public V4<bool> _0;
      public VV4B() { tag = LambdaCube.IR.Value.Tag.VV4B; }
    };
    class VWord : LambdaCube.IR.Value { 
      public uint _0;
      public VWord() { tag = LambdaCube.IR.Value.Tag.VWord; }
    };
    class VV2U : LambdaCube.IR.Value { 
      public V2<uint> _0;
      public VV2U() { tag = LambdaCube.IR.Value.Tag.VV2U; }
    };
    class VV3U : LambdaCube.IR.Value { 
      public V3<uint> _0;
      public VV3U() { tag = LambdaCube.IR.Value.Tag.VV3U; }
    };
    class VV4U : LambdaCube.IR.Value { 
      public V4<uint> _0;
      public VV4U() { tag = LambdaCube.IR.Value.Tag.VV4U; }
    };
    class VInt : LambdaCube.IR.Value { 
      public int _0;
      public VInt() { tag = LambdaCube.IR.Value.Tag.VInt; }
    };
    class VV2I : LambdaCube.IR.Value { 
      public V2<int> _0;
      public VV2I() { tag = LambdaCube.IR.Value.Tag.VV2I; }
    };
    class VV3I : LambdaCube.IR.Value { 
      public V3<int> _0;
      public VV3I() { tag = LambdaCube.IR.Value.Tag.VV3I; }
    };
    class VV4I : LambdaCube.IR.Value { 
      public V4<int> _0;
      public VV4I() { tag = LambdaCube.IR.Value.Tag.VV4I; }
    };
    class VFloat : LambdaCube.IR.Value { 
      public float _0;
      public VFloat() { tag = LambdaCube.IR.Value.Tag.VFloat; }
    };
    class VV2F : LambdaCube.IR.Value { 
      public V2<float> _0;
      public VV2F() { tag = LambdaCube.IR.Value.Tag.VV2F; }
    };
    class VV3F : LambdaCube.IR.Value { 
      public V3<float> _0;
      public VV3F() { tag = LambdaCube.IR.Value.Tag.VV3F; }
    };
    class VV4F : LambdaCube.IR.Value { 
      public V4<float> _0;
      public VV4F() { tag = LambdaCube.IR.Value.Tag.VV4F; }
    };
    class VM22F : LambdaCube.IR.Value { 
      public V2<V2<float>> _0;
      public VM22F() { tag = LambdaCube.IR.Value.Tag.VM22F; }
    };
    class VM23F : LambdaCube.IR.Value { 
      public V3<V2<float>> _0;
      public VM23F() { tag = LambdaCube.IR.Value.Tag.VM23F; }
    };
    class VM24F : LambdaCube.IR.Value { 
      public V4<V2<float>> _0;
      public VM24F() { tag = LambdaCube.IR.Value.Tag.VM24F; }
    };
    class VM32F : LambdaCube.IR.Value { 
      public V2<V3<float>> _0;
      public VM32F() { tag = LambdaCube.IR.Value.Tag.VM32F; }
    };
    class VM33F : LambdaCube.IR.Value { 
      public V3<V3<float>> _0;
      public VM33F() { tag = LambdaCube.IR.Value.Tag.VM33F; }
    };
    class VM34F : LambdaCube.IR.Value { 
      public V4<V3<float>> _0;
      public VM34F() { tag = LambdaCube.IR.Value.Tag.VM34F; }
    };
    class VM42F : LambdaCube.IR.Value { 
      public V2<V4<float>> _0;
      public VM42F() { tag = LambdaCube.IR.Value.Tag.VM42F; }
    };
    class VM43F : LambdaCube.IR.Value { 
      public V3<V4<float>> _0;
      public VM43F() { tag = LambdaCube.IR.Value.Tag.VM43F; }
    };
    class VM44F : LambdaCube.IR.Value { 
      public V4<V4<float>> _0;
      public VM44F() { tag = LambdaCube.IR.Value.Tag.VM44F; }
    };
  }
  class InputType {
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
      };
      public Tag tag;
  };

  namespace data { 
  }
  class PointSpriteCoordOrigin {
      public enum Tag { 
        LowerLeft,
        UpperLeft
      };
      public Tag tag;
  };

  namespace data { 
  }
  class PointSize {
      public enum Tag { 
        PointSize,
        ProgramPointSize
      };
      public Tag tag;
  };

  namespace data { 
    class PointSize : LambdaCube.IR.PointSize { 
      public float _0;
      public PointSize() { tag = LambdaCube.IR.PointSize.Tag.PointSize; }
    };
  }
  class PolygonOffset {
      public enum Tag { 
        NoOffset,
        Offset
      };
      public Tag tag;
  };

  namespace data { 
    class Offset : LambdaCube.IR.PolygonOffset { 
      public float _0;
      public float _1;
      public Offset() { tag = LambdaCube.IR.PolygonOffset.Tag.Offset; }
    };
  }
  class FrontFace {
      public enum Tag { 
        CCW,
        CW
      };
      public Tag tag;
  };

  namespace data { 
  }
  class PolygonMode {
      public enum Tag { 
        PolygonPoint,
        PolygonLine,
        PolygonFill
      };
      public Tag tag;
  };

  namespace data { 
    class PolygonPoint : LambdaCube.IR.PolygonMode { 
      public global::LambdaCube.IR.PointSize _0;
      public PolygonPoint() { tag = LambdaCube.IR.PolygonMode.Tag.PolygonPoint; }
    };
    class PolygonLine : LambdaCube.IR.PolygonMode { 
      public float _0;
      public PolygonLine() { tag = LambdaCube.IR.PolygonMode.Tag.PolygonLine; }
    };
  }
  class ProvokingVertex {
      public enum Tag { 
        FirstVertex,
        LastVertex
      };
      public Tag tag;
  };

  namespace data { 
  }
  class CullMode {
      public enum Tag { 
        CullNone,
        CullFront,
        CullBack
      };
      public Tag tag;
  };

  namespace data { 
    class CullFront : LambdaCube.IR.CullMode { 
      public global::LambdaCube.IR.FrontFace _0;
      public CullFront() { tag = LambdaCube.IR.CullMode.Tag.CullFront; }
    };
    class CullBack : LambdaCube.IR.CullMode { 
      public global::LambdaCube.IR.FrontFace _0;
      public CullBack() { tag = LambdaCube.IR.CullMode.Tag.CullBack; }
    };
  }
  class ComparisonFunction {
      public enum Tag { 
        Never,
        Less,
        Equal,
        Lequal,
        Greater,
        Notequal,
        Gequal,
        Always
      };
      public Tag tag;
  };

  namespace data { 
  }
  class StencilOperation {
      public enum Tag { 
        OpZero,
        OpKeep,
        OpReplace,
        OpIncr,
        OpIncrWrap,
        OpDecr,
        OpDecrWrap,
        OpInvert
      };
      public Tag tag;
  };

  namespace data { 
  }
  class BlendEquation {
      public enum Tag { 
        FuncAdd,
        FuncSubtract,
        FuncReverseSubtract,
        Min,
        Max
      };
      public Tag tag;
  };

  namespace data { 
  }
  class BlendingFactor {
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
      };
      public Tag tag;
  };

  namespace data { 
  }
  class LogicOperation {
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
      };
      public Tag tag;
  };

  namespace data { 
  }
  class StencilOps {
      public enum Tag { 
        StencilOps
      };
      public Tag tag;
  };

  namespace data { 
    class StencilOps : LambdaCube.IR.StencilOps { 
      public global::LambdaCube.IR.StencilOperation frontStencilOp;
      public global::LambdaCube.IR.StencilOperation backStencilOp;
      public StencilOps() { tag = LambdaCube.IR.StencilOps.Tag.StencilOps; }
    };
  }
  class StencilTest {
      public enum Tag { 
        StencilTest
      };
      public Tag tag;
  };

  namespace data { 
    class StencilTest : LambdaCube.IR.StencilTest { 
      public global::LambdaCube.IR.ComparisonFunction stencilComparision;
      public int stencilReference;
      public uint stencilMask;
      public StencilTest() { tag = LambdaCube.IR.StencilTest.Tag.StencilTest; }
    };
  }
  class StencilTests {
      public enum Tag { 
        StencilTests
      };
      public Tag tag;
  };

  namespace data { 
    class StencilTests : LambdaCube.IR.StencilTests { 
      public global::LambdaCube.IR.StencilTest _0;
      public global::LambdaCube.IR.StencilTest _1;
      public StencilTests() { tag = LambdaCube.IR.StencilTests.Tag.StencilTests; }
    };
  }
  class FetchPrimitive {
      public enum Tag { 
        Points,
        Lines,
        Triangles,
        LinesAdjacency,
        TrianglesAdjacency
      };
      public Tag tag;
  };

  namespace data { 
  }
  class OutputPrimitive {
      public enum Tag { 
        TrianglesOutput,
        LinesOutput,
        PointsOutput
      };
      public Tag tag;
  };

  namespace data { 
  }
  class ColorArity {
      public enum Tag { 
        Red,
        RG,
        RGB,
        RGBA
      };
      public Tag tag;
  };

  namespace data { 
  }
  class Blending {
      public enum Tag { 
        NoBlending,
        BlendLogicOp,
        Blend
      };
      public Tag tag;
  };

  namespace data { 
    class BlendLogicOp : LambdaCube.IR.Blending { 
      public global::LambdaCube.IR.LogicOperation _0;
      public BlendLogicOp() { tag = LambdaCube.IR.Blending.Tag.BlendLogicOp; }
    };
    class Blend : LambdaCube.IR.Blending { 
      public global::LambdaCube.IR.BlendEquation colorEqSrc;
      public global::LambdaCube.IR.BlendEquation alphaEqSrc;
      public global::LambdaCube.IR.BlendingFactor colorFSrc;
      public global::LambdaCube.IR.BlendingFactor colorFDst;
      public global::LambdaCube.IR.BlendingFactor alphaFSrc;
      public global::LambdaCube.IR.BlendingFactor alphaFDst;
      public V4<float> color;
      public Blend() { tag = LambdaCube.IR.Blending.Tag.Blend; }
    };
  }
  class RasterContext {
      public enum Tag { 
        PointCtx,
        LineCtx,
        TriangleCtx
      };
      public Tag tag;
  };

  namespace data { 
    class PointCtx : LambdaCube.IR.RasterContext { 
      public global::LambdaCube.IR.PointSize _0;
      public float _1;
      public global::LambdaCube.IR.PointSpriteCoordOrigin _2;
      public PointCtx() { tag = LambdaCube.IR.RasterContext.Tag.PointCtx; }
    };
    class LineCtx : LambdaCube.IR.RasterContext { 
      public float _0;
      public global::LambdaCube.IR.ProvokingVertex _1;
      public LineCtx() { tag = LambdaCube.IR.RasterContext.Tag.LineCtx; }
    };
    class TriangleCtx : LambdaCube.IR.RasterContext { 
      public global::LambdaCube.IR.CullMode _0;
      public global::LambdaCube.IR.PolygonMode _1;
      public global::LambdaCube.IR.PolygonOffset _2;
      public global::LambdaCube.IR.ProvokingVertex _3;
      public TriangleCtx() { tag = LambdaCube.IR.RasterContext.Tag.TriangleCtx; }
    };
  }
  class FragmentOperation {
      public enum Tag { 
        DepthOp,
        StencilOp,
        ColorOp
      };
      public Tag tag;
  };

  namespace data { 
    class DepthOp : LambdaCube.IR.FragmentOperation { 
      public global::LambdaCube.IR.ComparisonFunction _0;
      public bool _1;
      public DepthOp() { tag = LambdaCube.IR.FragmentOperation.Tag.DepthOp; }
    };
    class StencilOp : LambdaCube.IR.FragmentOperation { 
      public global::LambdaCube.IR.StencilTests _0;
      public global::LambdaCube.IR.StencilOps _1;
      public global::LambdaCube.IR.StencilOps _2;
      public StencilOp() { tag = LambdaCube.IR.FragmentOperation.Tag.StencilOp; }
    };
    class ColorOp : LambdaCube.IR.FragmentOperation { 
      public global::LambdaCube.IR.Blending _0;
      public global::LambdaCube.IR.Value _1;
      public ColorOp() { tag = LambdaCube.IR.FragmentOperation.Tag.ColorOp; }
    };
  }
  class AccumulationContext {
      public enum Tag { 
        AccumulationContext
      };
      public Tag tag;
  };

  namespace data { 
    class AccumulationContext : LambdaCube.IR.AccumulationContext { 
      public Maybe<string> accViewportName;
      public List<global::LambdaCube.IR.FragmentOperation> accOperations;
      public AccumulationContext() { tag = LambdaCube.IR.AccumulationContext.Tag.AccumulationContext; }
    };
  }
  class TextureDataType {
      public enum Tag { 
        FloatT,
        IntT,
        WordT,
        ShadowT
      };
      public Tag tag;
  };

  namespace data { 
    class FloatT : LambdaCube.IR.TextureDataType { 
      public global::LambdaCube.IR.ColorArity _0;
      public FloatT() { tag = LambdaCube.IR.TextureDataType.Tag.FloatT; }
    };
    class IntT : LambdaCube.IR.TextureDataType { 
      public global::LambdaCube.IR.ColorArity _0;
      public IntT() { tag = LambdaCube.IR.TextureDataType.Tag.IntT; }
    };
    class WordT : LambdaCube.IR.TextureDataType { 
      public global::LambdaCube.IR.ColorArity _0;
      public WordT() { tag = LambdaCube.IR.TextureDataType.Tag.WordT; }
    };
  }
  class TextureType {
      public enum Tag { 
        Texture1D,
        Texture2D,
        Texture3D,
        TextureCube,
        TextureRect,
        Texture2DMS,
        TextureBuffer
      };
      public Tag tag;
  };

  namespace data { 
    class Texture1D : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public int _1;
      public Texture1D() { tag = LambdaCube.IR.TextureType.Tag.Texture1D; }
    };
    class Texture2D : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public int _1;
      public Texture2D() { tag = LambdaCube.IR.TextureType.Tag.Texture2D; }
    };
    class Texture3D : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public Texture3D() { tag = LambdaCube.IR.TextureType.Tag.Texture3D; }
    };
    class TextureCube : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public TextureCube() { tag = LambdaCube.IR.TextureType.Tag.TextureCube; }
    };
    class TextureRect : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public TextureRect() { tag = LambdaCube.IR.TextureType.Tag.TextureRect; }
    };
    class Texture2DMS : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public int _1;
      public int _2;
      public bool _3;
      public Texture2DMS() { tag = LambdaCube.IR.TextureType.Tag.Texture2DMS; }
    };
    class TextureBuffer : LambdaCube.IR.TextureType { 
      public global::LambdaCube.IR.TextureDataType _0;
      public TextureBuffer() { tag = LambdaCube.IR.TextureType.Tag.TextureBuffer; }
    };
  }
  class MipMap {
      public enum Tag { 
        Mip,
        NoMip,
        AutoMip
      };
      public Tag tag;
  };

  namespace data { 
    class Mip : LambdaCube.IR.MipMap { 
      public int _0;
      public int _1;
      public Mip() { tag = LambdaCube.IR.MipMap.Tag.Mip; }
    };
    class AutoMip : LambdaCube.IR.MipMap { 
      public int _0;
      public int _1;
      public AutoMip() { tag = LambdaCube.IR.MipMap.Tag.AutoMip; }
    };
  }
  class Filter {
      public enum Tag { 
        Nearest,
        Linear,
        NearestMipmapNearest,
        NearestMipmapLinear,
        LinearMipmapNearest,
        LinearMipmapLinear
      };
      public Tag tag;
  };

  namespace data { 
  }
  class EdgeMode {
      public enum Tag { 
        Repeat,
        MirroredRepeat,
        ClampToEdge,
        ClampToBorder
      };
      public Tag tag;
  };

  namespace data { 
  }
  class ImageSemantic {
      public enum Tag { 
        Depth,
        Stencil,
        Color
      };
      public Tag tag;
  };

  namespace data { 
  }
  class ImageRef {
      public enum Tag { 
        TextureImage,
        Framebuffer
      };
      public Tag tag;
  };

  namespace data { 
    class TextureImage : LambdaCube.IR.ImageRef { 
      public int _0;
      public int _1;
      public Maybe<int> _2;
      public TextureImage() { tag = LambdaCube.IR.ImageRef.Tag.TextureImage; }
    };
    class Framebuffer : LambdaCube.IR.ImageRef { 
      public global::LambdaCube.IR.ImageSemantic _0;
      public Framebuffer() { tag = LambdaCube.IR.ImageRef.Tag.Framebuffer; }
    };
  }
  class ClearImage {
      public enum Tag { 
        ClearImage
      };
      public Tag tag;
  };

  namespace data { 
    class ClearImage : LambdaCube.IR.ClearImage { 
      public global::LambdaCube.IR.ImageSemantic imageSemantic;
      public global::LambdaCube.IR.Value clearValue;
      public ClearImage() { tag = LambdaCube.IR.ClearImage.Tag.ClearImage; }
    };
  }
  class Command {
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
      };
      public Tag tag;
  };

  namespace data { 
    class SetRasterContext : LambdaCube.IR.Command { 
      public global::LambdaCube.IR.RasterContext _0;
      public SetRasterContext() { tag = LambdaCube.IR.Command.Tag.SetRasterContext; }
    };
    class SetAccumulationContext : LambdaCube.IR.Command { 
      public global::LambdaCube.IR.AccumulationContext _0;
      public SetAccumulationContext() { tag = LambdaCube.IR.Command.Tag.SetAccumulationContext; }
    };
    class SetRenderTarget : LambdaCube.IR.Command { 
      public int _0;
      public SetRenderTarget() { tag = LambdaCube.IR.Command.Tag.SetRenderTarget; }
    };
    class SetProgram : LambdaCube.IR.Command { 
      public int _0;
      public SetProgram() { tag = LambdaCube.IR.Command.Tag.SetProgram; }
    };
    class SetSamplerUniform : LambdaCube.IR.Command { 
      public string _0;
      public int _1;
      public SetSamplerUniform() { tag = LambdaCube.IR.Command.Tag.SetSamplerUniform; }
    };
    class SetTexture : LambdaCube.IR.Command { 
      public int _0;
      public int _1;
      public SetTexture() { tag = LambdaCube.IR.Command.Tag.SetTexture; }
    };
    class SetSampler : LambdaCube.IR.Command { 
      public int _0;
      public Maybe<int> _1;
      public SetSampler() { tag = LambdaCube.IR.Command.Tag.SetSampler; }
    };
    class RenderSlot : LambdaCube.IR.Command { 
      public int _0;
      public RenderSlot() { tag = LambdaCube.IR.Command.Tag.RenderSlot; }
    };
    class RenderStream : LambdaCube.IR.Command { 
      public int _0;
      public RenderStream() { tag = LambdaCube.IR.Command.Tag.RenderStream; }
    };
    class ClearRenderTarget : LambdaCube.IR.Command { 
      public List<global::LambdaCube.IR.ClearImage> _0;
      public ClearRenderTarget() { tag = LambdaCube.IR.Command.Tag.ClearRenderTarget; }
    };
    class GenerateMipMap : LambdaCube.IR.Command { 
      public int _0;
      public GenerateMipMap() { tag = LambdaCube.IR.Command.Tag.GenerateMipMap; }
    };
    class SaveImage : LambdaCube.IR.Command { 
      public int _0;
      public global::LambdaCube.IR.ImageRef _1;
      public SaveImage() { tag = LambdaCube.IR.Command.Tag.SaveImage; }
    };
    class LoadImage : LambdaCube.IR.Command { 
      public global::LambdaCube.IR.ImageRef _0;
      public int _1;
      public LoadImage() { tag = LambdaCube.IR.Command.Tag.LoadImage; }
    };
  }
  class SamplerDescriptor {
      public enum Tag { 
        SamplerDescriptor
      };
      public Tag tag;
  };

  namespace data { 
    class SamplerDescriptor : LambdaCube.IR.SamplerDescriptor { 
      public global::LambdaCube.IR.EdgeMode samplerWrapS;
      public Maybe<global::LambdaCube.IR.EdgeMode> samplerWrapT;
      public Maybe<global::LambdaCube.IR.EdgeMode> samplerWrapR;
      public global::LambdaCube.IR.Filter samplerMinFilter;
      public global::LambdaCube.IR.Filter samplerMagFilter;
      public global::LambdaCube.IR.Value samplerBorderColor;
      public Maybe<float> samplerMinLod;
      public Maybe<float> samplerMaxLod;
      public float samplerLodBias;
      public Maybe<global::LambdaCube.IR.ComparisonFunction> samplerCompareFunc;
      public SamplerDescriptor() { tag = LambdaCube.IR.SamplerDescriptor.Tag.SamplerDescriptor; }
    };
  }
  class TextureDescriptor {
      public enum Tag { 
        TextureDescriptor
      };
      public Tag tag;
  };

  namespace data { 
    class TextureDescriptor : LambdaCube.IR.TextureDescriptor { 
      public global::LambdaCube.IR.TextureType textureType;
      public global::LambdaCube.IR.Value textureSize;
      public global::LambdaCube.IR.ImageSemantic textureSemantic;
      public global::LambdaCube.IR.SamplerDescriptor textureSampler;
      public int textureBaseLevel;
      public int textureMaxLevel;
      public TextureDescriptor() { tag = LambdaCube.IR.TextureDescriptor.Tag.TextureDescriptor; }
    };
  }
  class Parameter {
      public enum Tag { 
        Parameter
      };
      public Tag tag;
  };

  namespace data { 
    class Parameter : LambdaCube.IR.Parameter { 
      public string name;
      public global::LambdaCube.IR.InputType ty;
      public Parameter() { tag = LambdaCube.IR.Parameter.Tag.Parameter; }
    };
  }
  class Program {
      public enum Tag { 
        Program
      };
      public Tag tag;
  };

  namespace data { 
    class Program : LambdaCube.IR.Program { 
      public Dictionary<string, global::LambdaCube.IR.InputType> programUniforms;
      public Dictionary<string, global::LambdaCube.IR.Parameter> programStreams;
      public Dictionary<string, global::LambdaCube.IR.InputType> programInTextures;
      public List<global::LambdaCube.IR.Parameter> programOutput;
      public string vertexShader;
      public Maybe<string> geometryShader;
      public string fragmentShader;
      public Program() { tag = LambdaCube.IR.Program.Tag.Program; }
    };
  }
  class Slot {
      public enum Tag { 
        Slot
      };
      public Tag tag;
  };

  namespace data { 
    class Slot : LambdaCube.IR.Slot { 
      public string slotName;
      public Dictionary<string, global::LambdaCube.IR.InputType> slotStreams;
      public Dictionary<string, global::LambdaCube.IR.InputType> slotUniforms;
      public global::LambdaCube.IR.FetchPrimitive slotPrimitive;
      public List<int> slotPrograms;
      public Slot() { tag = LambdaCube.IR.Slot.Tag.Slot; }
    };
  }
  class StreamData {
      public enum Tag { 
        StreamData
      };
      public Tag tag;
  };

  namespace data { 
    class StreamData : LambdaCube.IR.StreamData { 
      public Dictionary<string, global::LambdaCube.IR.ArrayValue> streamData;
      public Dictionary<string, global::LambdaCube.IR.InputType> streamType;
      public global::LambdaCube.IR.FetchPrimitive streamPrimitive;
      public List<int> streamPrograms;
      public StreamData() { tag = LambdaCube.IR.StreamData.Tag.StreamData; }
    };
  }
  class TargetItem {
      public enum Tag { 
        TargetItem
      };
      public Tag tag;
  };

  namespace data { 
    class TargetItem : LambdaCube.IR.TargetItem { 
      public global::LambdaCube.IR.ImageSemantic targetSemantic;
      public Maybe<global::LambdaCube.IR.ImageRef> targetRef;
      public TargetItem() { tag = LambdaCube.IR.TargetItem.Tag.TargetItem; }
    };
  }
  class RenderTarget {
      public enum Tag { 
        RenderTarget
      };
      public Tag tag;
  };

  namespace data { 
    class RenderTarget : LambdaCube.IR.RenderTarget { 
      public List<global::LambdaCube.IR.TargetItem> renderTargets;
      public RenderTarget() { tag = LambdaCube.IR.RenderTarget.Tag.RenderTarget; }
    };
  }
  class Backend {
      public enum Tag { 
        WebGL1,
        OpenGL33
      };
      public Tag tag;
  };

  namespace data { 
  }
  class Pipeline {
      public enum Tag { 
        Pipeline
      };
      public Tag tag;
  };

  namespace data { 
    class Pipeline : LambdaCube.IR.Pipeline { 
      public string info;
      public global::LambdaCube.IR.Backend backend;
      public List<global::LambdaCube.IR.TextureDescriptor> textures;
      public List<global::LambdaCube.IR.SamplerDescriptor> samplers;
      public List<global::LambdaCube.IR.RenderTarget> targets;
      public List<global::LambdaCube.IR.Program> programs;
      public List<global::LambdaCube.IR.Slot> slots;
      public List<global::LambdaCube.IR.StreamData> streams;
      public List<global::LambdaCube.IR.Command> commands;
      public Pipeline() { tag = LambdaCube.IR.Pipeline.Tag.Pipeline; }
    };
  }

  // JSON deserializer
  enum Type { 
    Int,
    Int32,
    Word,
    Word32,
    Float,
    Bool,
    String,
    V2_Int,
    V2_Word,
    V2_Float,
    V2_Bool,
    V2_V2_Float,
    V2_V3_Float,
    V2_V4_Float,
    V3_Int,
    V3_Word,
    V3_Float,
    V3_Bool,
    V3_V2_Float,
    V3_V3_Float,
    V3_V4_Float,
    V4_Int,
    V4_Word,
    V4_Float,
    V4_Bool,
    V4_V2_Float,
    V4_V3_Float,
    V4_V4_Float,
    Array_Int,
    Array_Int32,
    Array_Word32,
    Array_Float,
    Array_Bool,
    Array_ClearImage,
    Array_Command,
    Array_Parameter,
    Array_Program,
    Array_RenderTarget,
    Array_SamplerDescriptor,
    Array_Slot,
    Array_StreamData,
    Array_TargetItem,
    Array_TextureDescriptor,
    List_FragmentOperation,
    Maybe_Int,
    Maybe_Float,
    Maybe_String,
    Maybe_ComparisonFunction,
    Maybe_EdgeMode,
    Maybe_ImageRef,
    Map_String_ArrayValue,
    Map_String_InputType,
    Map_String_Parameter,
    AccumulationContext,
    ArrayValue,
    Backend,
    BlendEquation,
    Blending,
    BlendingFactor,
    ClearImage,
    ColorArity,
    Command,
    ComparisonFunction,
    CullMode,
    EdgeMode,
    FetchPrimitive,
    Filter,
    FragmentOperation,
    FrontFace,
    ImageRef,
    ImageSemantic,
    InputType,
    LogicOperation,
    MipMap,
    OutputPrimitive,
    Parameter,
    Pipeline,
    PointSize,
    PointSpriteCoordOrigin,
    PolygonMode,
    PolygonOffset,
    Program,
    ProvokingVertex,
    RasterContext,
    RenderTarget,
    SamplerDescriptor,
    Slot,
    StencilOperation,
    StencilOps,
    StencilTest,
    StencilTests,
    StreamData,
    TargetItem,
    TextureDataType,
    TextureDescriptor,
    TextureType,
    Value
  }

  class Loader {
    public static object fromJSON(Type type, JToken obj) {
      switch (type) {
        case Type.Int: return (int)obj;
        case Type.Int32: return (int)obj;
        case Type.Word: return (uint)obj;
        case Type.Word32: return (uint)obj;
        case Type.Float: return (float)obj;
        case Type.Bool: return (bool)obj;
        case Type.String: return (string)obj;
        case Type.V2_Int:
          return new V2<int>
            { x = (int)fromJSON(Type.Int,obj["x"])
            , y = (int)fromJSON(Type.Int,obj["y"])
            };
        case Type.V2_Word:
          return new V2<uint>
            { x = (uint)fromJSON(Type.Word,obj["x"])
            , y = (uint)fromJSON(Type.Word,obj["y"])
            };
        case Type.V2_Float:
          return new V2<float>
            { x = (float)fromJSON(Type.Float,obj["x"])
            , y = (float)fromJSON(Type.Float,obj["y"])
            };
        case Type.V2_Bool:
          return new V2<bool>
            { x = (bool)fromJSON(Type.Bool,obj["x"])
            , y = (bool)fromJSON(Type.Bool,obj["y"])
            };
        case Type.V2_V2_Float:
          return new V2<V2<float>>
            { x = (V2<float>)fromJSON(Type.V2_Float,obj["x"])
            , y = (V2<float>)fromJSON(Type.V2_Float,obj["y"])
            };
        case Type.V2_V3_Float:
          return new V2<V3<float>>
            { x = (V3<float>)fromJSON(Type.V3_Float,obj["x"])
            , y = (V3<float>)fromJSON(Type.V3_Float,obj["y"])
            };
        case Type.V2_V4_Float:
          return new V2<V4<float>>
            { x = (V4<float>)fromJSON(Type.V4_Float,obj["x"])
            , y = (V4<float>)fromJSON(Type.V4_Float,obj["y"])
            };
        case Type.V3_Int:
          return new V3<int>
            { x = (int)fromJSON(Type.Int,obj["x"])
            , y = (int)fromJSON(Type.Int,obj["y"])
            , z = (int)fromJSON(Type.Int,obj["z"])
            };
        case Type.V3_Word:
          return new V3<uint>
            { x = (uint)fromJSON(Type.Word,obj["x"])
            , y = (uint)fromJSON(Type.Word,obj["y"])
            , z = (uint)fromJSON(Type.Word,obj["z"])
            };
        case Type.V3_Float:
          return new V3<float>
            { x = (float)fromJSON(Type.Float,obj["x"])
            , y = (float)fromJSON(Type.Float,obj["y"])
            , z = (float)fromJSON(Type.Float,obj["z"])
            };
        case Type.V3_Bool:
          return new V3<bool>
            { x = (bool)fromJSON(Type.Bool,obj["x"])
            , y = (bool)fromJSON(Type.Bool,obj["y"])
            , z = (bool)fromJSON(Type.Bool,obj["z"])
            };
        case Type.V3_V2_Float:
          return new V3<V2<float>>
            { x = (V2<float>)fromJSON(Type.V2_Float,obj["x"])
            , y = (V2<float>)fromJSON(Type.V2_Float,obj["y"])
            , z = (V2<float>)fromJSON(Type.V2_Float,obj["z"])
            };
        case Type.V3_V3_Float:
          return new V3<V3<float>>
            { x = (V3<float>)fromJSON(Type.V3_Float,obj["x"])
            , y = (V3<float>)fromJSON(Type.V3_Float,obj["y"])
            , z = (V3<float>)fromJSON(Type.V3_Float,obj["z"])
            };
        case Type.V3_V4_Float:
          return new V3<V4<float>>
            { x = (V4<float>)fromJSON(Type.V4_Float,obj["x"])
            , y = (V4<float>)fromJSON(Type.V4_Float,obj["y"])
            , z = (V4<float>)fromJSON(Type.V4_Float,obj["z"])
            };
        case Type.V4_Int:
          return new V4<int>
            { x = (int)fromJSON(Type.Int,obj["x"])
            , y = (int)fromJSON(Type.Int,obj["y"])
            , z = (int)fromJSON(Type.Int,obj["z"])
            , w = (int)fromJSON(Type.Int,obj["w"])
            };
        case Type.V4_Word:
          return new V4<uint>
            { x = (uint)fromJSON(Type.Word,obj["x"])
            , y = (uint)fromJSON(Type.Word,obj["y"])
            , z = (uint)fromJSON(Type.Word,obj["z"])
            , w = (uint)fromJSON(Type.Word,obj["w"])
            };
        case Type.V4_Float:
          return new V4<float>
            { x = (float)fromJSON(Type.Float,obj["x"])
            , y = (float)fromJSON(Type.Float,obj["y"])
            , z = (float)fromJSON(Type.Float,obj["z"])
            , w = (float)fromJSON(Type.Float,obj["w"])
            };
        case Type.V4_Bool:
          return new V4<bool>
            { x = (bool)fromJSON(Type.Bool,obj["x"])
            , y = (bool)fromJSON(Type.Bool,obj["y"])
            , z = (bool)fromJSON(Type.Bool,obj["z"])
            , w = (bool)fromJSON(Type.Bool,obj["w"])
            };
        case Type.V4_V2_Float:
          return new V4<V2<float>>
            { x = (V2<float>)fromJSON(Type.V2_Float,obj["x"])
            , y = (V2<float>)fromJSON(Type.V2_Float,obj["y"])
            , z = (V2<float>)fromJSON(Type.V2_Float,obj["z"])
            , w = (V2<float>)fromJSON(Type.V2_Float,obj["w"])
            };
        case Type.V4_V3_Float:
          return new V4<V3<float>>
            { x = (V3<float>)fromJSON(Type.V3_Float,obj["x"])
            , y = (V3<float>)fromJSON(Type.V3_Float,obj["y"])
            , z = (V3<float>)fromJSON(Type.V3_Float,obj["z"])
            , w = (V3<float>)fromJSON(Type.V3_Float,obj["w"])
            };
        case Type.V4_V4_Float:
          return new V4<V4<float>>
            { x = (V4<float>)fromJSON(Type.V4_Float,obj["x"])
            , y = (V4<float>)fromJSON(Type.V4_Float,obj["y"])
            , z = (V4<float>)fromJSON(Type.V4_Float,obj["z"])
            , w = (V4<float>)fromJSON(Type.V4_Float,obj["w"])
            };
        case Type.Array_Int: return ((JArray)obj).Select(x => fromJSON (Type.Int, x)).ToList();
        case Type.Array_Int32: return ((JArray)obj).Select(x => fromJSON (Type.Int32, x)).ToList();
        case Type.Array_Word32: return ((JArray)obj).Select(x => fromJSON (Type.Word32, x)).ToList();
        case Type.Array_Float: return ((JArray)obj).Select(x => fromJSON (Type.Float, x)).ToList();
        case Type.Array_Bool: return ((JArray)obj).Select(x => fromJSON (Type.Bool, x)).ToList();
        case Type.Array_ClearImage: return ((JArray)obj).Select(x => fromJSON (Type.ClearImage, x)).ToList();
        case Type.Array_Command: return ((JArray)obj).Select(x => fromJSON (Type.Command, x)).ToList();
        case Type.Array_Parameter: return ((JArray)obj).Select(x => fromJSON (Type.Parameter, x)).ToList();
        case Type.Array_Program: return ((JArray)obj).Select(x => fromJSON (Type.Program, x)).ToList();
        case Type.Array_RenderTarget: return ((JArray)obj).Select(x => fromJSON (Type.RenderTarget, x)).ToList();
        case Type.Array_SamplerDescriptor: return ((JArray)obj).Select(x => fromJSON (Type.SamplerDescriptor, x)).ToList();
        case Type.Array_Slot: return ((JArray)obj).Select(x => fromJSON (Type.Slot, x)).ToList();
        case Type.Array_StreamData: return ((JArray)obj).Select(x => fromJSON (Type.StreamData, x)).ToList();
        case Type.Array_TargetItem: return ((JArray)obj).Select(x => fromJSON (Type.TargetItem, x)).ToList();
        case Type.Array_TextureDescriptor: return ((JArray)obj).Select(x => fromJSON (Type.TextureDescriptor, x)).ToList();
        case Type.List_FragmentOperation: return ((JArray)obj).Select(x => fromJSON (Type.FragmentOperation, x)).ToList();
        case Type.Maybe_Int: {
          var m = new Maybe<int> ();
          if (obj == null || obj.Type == JTokenType.Null) {
            m.valid = false;
          } else {
            m.valid = true;
            m.data = (int)fromJSON (Type.Int,obj);
          }
          return m;
        }
        case Type.Maybe_Float: {
          var m = new Maybe<float> ();
          if (obj == null || obj.Type == JTokenType.Null) {
            m.valid = false;
          } else {
            m.valid = true;
            m.data = (float)fromJSON (Type.Float,obj);
          }
          return m;
        }
        case Type.Maybe_String: {
          var m = new Maybe<string> ();
          if (obj == null || obj.Type == JTokenType.Null) {
            m.valid = false;
          } else {
            m.valid = true;
            m.data = (string)fromJSON (Type.String,obj);
          }
          return m;
        }
        case Type.Maybe_ComparisonFunction: {
          var m = new Maybe<global::LambdaCube.IR.ComparisonFunction> ();
          if (obj == null || obj.Type == JTokenType.Null) {
            m.valid = false;
          } else {
            m.valid = true;
            m.data = (global::LambdaCube.IR.ComparisonFunction)fromJSON (Type.ComparisonFunction,obj);
          }
          return m;
        }
        case Type.Maybe_EdgeMode: {
          var m = new Maybe<global::LambdaCube.IR.EdgeMode> ();
          if (obj == null || obj.Type == JTokenType.Null) {
            m.valid = false;
          } else {
            m.valid = true;
            m.data = (global::LambdaCube.IR.EdgeMode)fromJSON (Type.EdgeMode,obj);
          }
          return m;
        }
        case Type.Maybe_ImageRef: {
          var m = new Maybe<global::LambdaCube.IR.ImageRef> ();
          if (obj == null || obj.Type == JTokenType.Null) {
            m.valid = false;
          } else {
            m.valid = true;
            m.data = (global::LambdaCube.IR.ImageRef)fromJSON (Type.ImageRef,obj);
          }
          return m;
        }
        case Type.Map_String_ArrayValue: {
          var map = new Dictionary<string, global::LambdaCube.IR.ArrayValue> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.IR.ArrayValue)fromJSON(Type.ArrayValue,i.Value));
          }
          return map;
        }
        case Type.Map_String_InputType: {
          var map = new Dictionary<string, global::LambdaCube.IR.InputType> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.IR.InputType)fromJSON(Type.InputType,i.Value));
          }
          return map;
        }
        case Type.Map_String_Parameter: {
          var map = new Dictionary<string, global::LambdaCube.IR.Parameter> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.IR.Parameter)fromJSON(Type.Parameter,i.Value));
          }
          return map;
        }

        case Type.ArrayValue: {
          string tag = (string)obj["tag"];
          ArrayValue.Tag tagType;
          if (tag == "VBoolArray") {
            tagType = ArrayValue.Tag.VBoolArray;
            data.VBoolArray tv = new data.VBoolArray();
            tv._0 = (List<bool>)fromJSON(Type.Array_Bool,obj["arg0"]);
            return tv;
          }
          else if (tag == "VIntArray") {
            tagType = ArrayValue.Tag.VIntArray;
            data.VIntArray tv = new data.VIntArray();
            tv._0 = (List<int>)fromJSON(Type.Array_Int32,obj["arg0"]);
            return tv;
          }
          else if (tag == "VWordArray") {
            tagType = ArrayValue.Tag.VWordArray;
            data.VWordArray tv = new data.VWordArray();
            tv._0 = (List<uint>)fromJSON(Type.Array_Word32,obj["arg0"]);
            return tv;
          }
          else if (tag == "VFloatArray") {
            tagType = ArrayValue.Tag.VFloatArray;
            data.VFloatArray tv = new data.VFloatArray();
            tv._0 = (List<float>)fromJSON(Type.Array_Float,obj["arg0"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          ArrayValue o = new ArrayValue();
          o.tag = tagType;
          return o;
        }
        case Type.Value: {
          string tag = (string)obj["tag"];
          Value.Tag tagType;
          if (tag == "VBool") {
            tagType = Value.Tag.VBool;
            data.VBool tv = new data.VBool();
            tv._0 = (bool)fromJSON(Type.Bool,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV2B") {
            tagType = Value.Tag.VV2B;
            data.VV2B tv = new data.VV2B();
            tv._0 = (V2<bool>)fromJSON(Type.V2_Bool,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV3B") {
            tagType = Value.Tag.VV3B;
            data.VV3B tv = new data.VV3B();
            tv._0 = (V3<bool>)fromJSON(Type.V3_Bool,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV4B") {
            tagType = Value.Tag.VV4B;
            data.VV4B tv = new data.VV4B();
            tv._0 = (V4<bool>)fromJSON(Type.V4_Bool,obj["arg0"]);
            return tv;
          }
          else if (tag == "VWord") {
            tagType = Value.Tag.VWord;
            data.VWord tv = new data.VWord();
            tv._0 = (uint)fromJSON(Type.Word32,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV2U") {
            tagType = Value.Tag.VV2U;
            data.VV2U tv = new data.VV2U();
            tv._0 = (V2<uint>)fromJSON(Type.V2_Word,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV3U") {
            tagType = Value.Tag.VV3U;
            data.VV3U tv = new data.VV3U();
            tv._0 = (V3<uint>)fromJSON(Type.V3_Word,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV4U") {
            tagType = Value.Tag.VV4U;
            data.VV4U tv = new data.VV4U();
            tv._0 = (V4<uint>)fromJSON(Type.V4_Word,obj["arg0"]);
            return tv;
          }
          else if (tag == "VInt") {
            tagType = Value.Tag.VInt;
            data.VInt tv = new data.VInt();
            tv._0 = (int)fromJSON(Type.Int32,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV2I") {
            tagType = Value.Tag.VV2I;
            data.VV2I tv = new data.VV2I();
            tv._0 = (V2<int>)fromJSON(Type.V2_Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV3I") {
            tagType = Value.Tag.VV3I;
            data.VV3I tv = new data.VV3I();
            tv._0 = (V3<int>)fromJSON(Type.V3_Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV4I") {
            tagType = Value.Tag.VV4I;
            data.VV4I tv = new data.VV4I();
            tv._0 = (V4<int>)fromJSON(Type.V4_Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "VFloat") {
            tagType = Value.Tag.VFloat;
            data.VFloat tv = new data.VFloat();
            tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV2F") {
            tagType = Value.Tag.VV2F;
            data.VV2F tv = new data.VV2F();
            tv._0 = (V2<float>)fromJSON(Type.V2_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV3F") {
            tagType = Value.Tag.VV3F;
            data.VV3F tv = new data.VV3F();
            tv._0 = (V3<float>)fromJSON(Type.V3_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VV4F") {
            tagType = Value.Tag.VV4F;
            data.VV4F tv = new data.VV4F();
            tv._0 = (V4<float>)fromJSON(Type.V4_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM22F") {
            tagType = Value.Tag.VM22F;
            data.VM22F tv = new data.VM22F();
            tv._0 = (V2<V2<float>>)fromJSON(Type.V2_V2_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM23F") {
            tagType = Value.Tag.VM23F;
            data.VM23F tv = new data.VM23F();
            tv._0 = (V3<V2<float>>)fromJSON(Type.V3_V2_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM24F") {
            tagType = Value.Tag.VM24F;
            data.VM24F tv = new data.VM24F();
            tv._0 = (V4<V2<float>>)fromJSON(Type.V4_V2_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM32F") {
            tagType = Value.Tag.VM32F;
            data.VM32F tv = new data.VM32F();
            tv._0 = (V2<V3<float>>)fromJSON(Type.V2_V3_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM33F") {
            tagType = Value.Tag.VM33F;
            data.VM33F tv = new data.VM33F();
            tv._0 = (V3<V3<float>>)fromJSON(Type.V3_V3_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM34F") {
            tagType = Value.Tag.VM34F;
            data.VM34F tv = new data.VM34F();
            tv._0 = (V4<V3<float>>)fromJSON(Type.V4_V3_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM42F") {
            tagType = Value.Tag.VM42F;
            data.VM42F tv = new data.VM42F();
            tv._0 = (V2<V4<float>>)fromJSON(Type.V2_V4_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM43F") {
            tagType = Value.Tag.VM43F;
            data.VM43F tv = new data.VM43F();
            tv._0 = (V3<V4<float>>)fromJSON(Type.V3_V4_Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "VM44F") {
            tagType = Value.Tag.VM44F;
            data.VM44F tv = new data.VM44F();
            tv._0 = (V4<V4<float>>)fromJSON(Type.V4_V4_Float,obj["arg0"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Value o = new Value();
          o.tag = tagType;
          return o;
        }
        case Type.InputType: {
          string tag = (string)obj["tag"];
          InputType.Tag tagType;
          if (tag == "Bool") {
            tagType = InputType.Tag.Bool;
          }
          else if (tag == "V2B") {
            tagType = InputType.Tag.V2B;
          }
          else if (tag == "V3B") {
            tagType = InputType.Tag.V3B;
          }
          else if (tag == "V4B") {
            tagType = InputType.Tag.V4B;
          }
          else if (tag == "Word") {
            tagType = InputType.Tag.Word;
          }
          else if (tag == "V2U") {
            tagType = InputType.Tag.V2U;
          }
          else if (tag == "V3U") {
            tagType = InputType.Tag.V3U;
          }
          else if (tag == "V4U") {
            tagType = InputType.Tag.V4U;
          }
          else if (tag == "Int") {
            tagType = InputType.Tag.Int;
          }
          else if (tag == "V2I") {
            tagType = InputType.Tag.V2I;
          }
          else if (tag == "V3I") {
            tagType = InputType.Tag.V3I;
          }
          else if (tag == "V4I") {
            tagType = InputType.Tag.V4I;
          }
          else if (tag == "Float") {
            tagType = InputType.Tag.Float;
          }
          else if (tag == "V2F") {
            tagType = InputType.Tag.V2F;
          }
          else if (tag == "V3F") {
            tagType = InputType.Tag.V3F;
          }
          else if (tag == "V4F") {
            tagType = InputType.Tag.V4F;
          }
          else if (tag == "M22F") {
            tagType = InputType.Tag.M22F;
          }
          else if (tag == "M23F") {
            tagType = InputType.Tag.M23F;
          }
          else if (tag == "M24F") {
            tagType = InputType.Tag.M24F;
          }
          else if (tag == "M32F") {
            tagType = InputType.Tag.M32F;
          }
          else if (tag == "M33F") {
            tagType = InputType.Tag.M33F;
          }
          else if (tag == "M34F") {
            tagType = InputType.Tag.M34F;
          }
          else if (tag == "M42F") {
            tagType = InputType.Tag.M42F;
          }
          else if (tag == "M43F") {
            tagType = InputType.Tag.M43F;
          }
          else if (tag == "M44F") {
            tagType = InputType.Tag.M44F;
          }
          else if (tag == "STexture1D") {
            tagType = InputType.Tag.STexture1D;
          }
          else if (tag == "STexture2D") {
            tagType = InputType.Tag.STexture2D;
          }
          else if (tag == "STextureCube") {
            tagType = InputType.Tag.STextureCube;
          }
          else if (tag == "STexture1DArray") {
            tagType = InputType.Tag.STexture1DArray;
          }
          else if (tag == "STexture2DArray") {
            tagType = InputType.Tag.STexture2DArray;
          }
          else if (tag == "STexture2DRect") {
            tagType = InputType.Tag.STexture2DRect;
          }
          else if (tag == "FTexture1D") {
            tagType = InputType.Tag.FTexture1D;
          }
          else if (tag == "FTexture2D") {
            tagType = InputType.Tag.FTexture2D;
          }
          else if (tag == "FTexture3D") {
            tagType = InputType.Tag.FTexture3D;
          }
          else if (tag == "FTextureCube") {
            tagType = InputType.Tag.FTextureCube;
          }
          else if (tag == "FTexture1DArray") {
            tagType = InputType.Tag.FTexture1DArray;
          }
          else if (tag == "FTexture2DArray") {
            tagType = InputType.Tag.FTexture2DArray;
          }
          else if (tag == "FTexture2DMS") {
            tagType = InputType.Tag.FTexture2DMS;
          }
          else if (tag == "FTexture2DMSArray") {
            tagType = InputType.Tag.FTexture2DMSArray;
          }
          else if (tag == "FTextureBuffer") {
            tagType = InputType.Tag.FTextureBuffer;
          }
          else if (tag == "FTexture2DRect") {
            tagType = InputType.Tag.FTexture2DRect;
          }
          else if (tag == "ITexture1D") {
            tagType = InputType.Tag.ITexture1D;
          }
          else if (tag == "ITexture2D") {
            tagType = InputType.Tag.ITexture2D;
          }
          else if (tag == "ITexture3D") {
            tagType = InputType.Tag.ITexture3D;
          }
          else if (tag == "ITextureCube") {
            tagType = InputType.Tag.ITextureCube;
          }
          else if (tag == "ITexture1DArray") {
            tagType = InputType.Tag.ITexture1DArray;
          }
          else if (tag == "ITexture2DArray") {
            tagType = InputType.Tag.ITexture2DArray;
          }
          else if (tag == "ITexture2DMS") {
            tagType = InputType.Tag.ITexture2DMS;
          }
          else if (tag == "ITexture2DMSArray") {
            tagType = InputType.Tag.ITexture2DMSArray;
          }
          else if (tag == "ITextureBuffer") {
            tagType = InputType.Tag.ITextureBuffer;
          }
          else if (tag == "ITexture2DRect") {
            tagType = InputType.Tag.ITexture2DRect;
          }
          else if (tag == "UTexture1D") {
            tagType = InputType.Tag.UTexture1D;
          }
          else if (tag == "UTexture2D") {
            tagType = InputType.Tag.UTexture2D;
          }
          else if (tag == "UTexture3D") {
            tagType = InputType.Tag.UTexture3D;
          }
          else if (tag == "UTextureCube") {
            tagType = InputType.Tag.UTextureCube;
          }
          else if (tag == "UTexture1DArray") {
            tagType = InputType.Tag.UTexture1DArray;
          }
          else if (tag == "UTexture2DArray") {
            tagType = InputType.Tag.UTexture2DArray;
          }
          else if (tag == "UTexture2DMS") {
            tagType = InputType.Tag.UTexture2DMS;
          }
          else if (tag == "UTexture2DMSArray") {
            tagType = InputType.Tag.UTexture2DMSArray;
          }
          else if (tag == "UTextureBuffer") {
            tagType = InputType.Tag.UTextureBuffer;
          }
          else if (tag == "UTexture2DRect") {
            tagType = InputType.Tag.UTexture2DRect;
          }
          else throw new Exception("unknown constructor: " + tag);
          InputType o = new InputType();
          o.tag = tagType;
          return o;
        }
        case Type.PointSpriteCoordOrigin: {
          string tag = (string)obj["tag"];
          PointSpriteCoordOrigin.Tag tagType;
          if (tag == "LowerLeft") {
            tagType = PointSpriteCoordOrigin.Tag.LowerLeft;
          }
          else if (tag == "UpperLeft") {
            tagType = PointSpriteCoordOrigin.Tag.UpperLeft;
          }
          else throw new Exception("unknown constructor: " + tag);
          PointSpriteCoordOrigin o = new PointSpriteCoordOrigin();
          o.tag = tagType;
          return o;
        }
        case Type.PointSize: {
          string tag = (string)obj["tag"];
          PointSize.Tag tagType;
          if (tag == "PointSize") {
            tagType = PointSize.Tag.PointSize;
            data.PointSize tv = new data.PointSize();
            tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "ProgramPointSize") {
            tagType = PointSize.Tag.ProgramPointSize;
          }
          else throw new Exception("unknown constructor: " + tag);
          PointSize o = new PointSize();
          o.tag = tagType;
          return o;
        }
        case Type.PolygonOffset: {
          string tag = (string)obj["tag"];
          PolygonOffset.Tag tagType;
          if (tag == "NoOffset") {
            tagType = PolygonOffset.Tag.NoOffset;
          }
          else if (tag == "Offset") {
            tagType = PolygonOffset.Tag.Offset;
            data.Offset tv = new data.Offset();
            tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
            tv._1 = (float)fromJSON(Type.Float,obj["arg1"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          PolygonOffset o = new PolygonOffset();
          o.tag = tagType;
          return o;
        }
        case Type.FrontFace: {
          string tag = (string)obj["tag"];
          FrontFace.Tag tagType;
          if (tag == "CCW") {
            tagType = FrontFace.Tag.CCW;
          }
          else if (tag == "CW") {
            tagType = FrontFace.Tag.CW;
          }
          else throw new Exception("unknown constructor: " + tag);
          FrontFace o = new FrontFace();
          o.tag = tagType;
          return o;
        }
        case Type.PolygonMode: {
          string tag = (string)obj["tag"];
          PolygonMode.Tag tagType;
          if (tag == "PolygonPoint") {
            tagType = PolygonMode.Tag.PolygonPoint;
            data.PolygonPoint tv = new data.PolygonPoint();
            tv._0 = (global::LambdaCube.IR.PointSize)fromJSON(Type.PointSize,obj["arg0"]);
            return tv;
          }
          else if (tag == "PolygonLine") {
            tagType = PolygonMode.Tag.PolygonLine;
            data.PolygonLine tv = new data.PolygonLine();
            tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
            return tv;
          }
          else if (tag == "PolygonFill") {
            tagType = PolygonMode.Tag.PolygonFill;
          }
          else throw new Exception("unknown constructor: " + tag);
          PolygonMode o = new PolygonMode();
          o.tag = tagType;
          return o;
        }
        case Type.ProvokingVertex: {
          string tag = (string)obj["tag"];
          ProvokingVertex.Tag tagType;
          if (tag == "FirstVertex") {
            tagType = ProvokingVertex.Tag.FirstVertex;
          }
          else if (tag == "LastVertex") {
            tagType = ProvokingVertex.Tag.LastVertex;
          }
          else throw new Exception("unknown constructor: " + tag);
          ProvokingVertex o = new ProvokingVertex();
          o.tag = tagType;
          return o;
        }
        case Type.CullMode: {
          string tag = (string)obj["tag"];
          CullMode.Tag tagType;
          if (tag == "CullNone") {
            tagType = CullMode.Tag.CullNone;
          }
          else if (tag == "CullFront") {
            tagType = CullMode.Tag.CullFront;
            data.CullFront tv = new data.CullFront();
            tv._0 = (global::LambdaCube.IR.FrontFace)fromJSON(Type.FrontFace,obj["arg0"]);
            return tv;
          }
          else if (tag == "CullBack") {
            tagType = CullMode.Tag.CullBack;
            data.CullBack tv = new data.CullBack();
            tv._0 = (global::LambdaCube.IR.FrontFace)fromJSON(Type.FrontFace,obj["arg0"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          CullMode o = new CullMode();
          o.tag = tagType;
          return o;
        }
        case Type.ComparisonFunction: {
          string tag = (string)obj["tag"];
          ComparisonFunction.Tag tagType;
          if (tag == "Never") {
            tagType = ComparisonFunction.Tag.Never;
          }
          else if (tag == "Less") {
            tagType = ComparisonFunction.Tag.Less;
          }
          else if (tag == "Equal") {
            tagType = ComparisonFunction.Tag.Equal;
          }
          else if (tag == "Lequal") {
            tagType = ComparisonFunction.Tag.Lequal;
          }
          else if (tag == "Greater") {
            tagType = ComparisonFunction.Tag.Greater;
          }
          else if (tag == "Notequal") {
            tagType = ComparisonFunction.Tag.Notequal;
          }
          else if (tag == "Gequal") {
            tagType = ComparisonFunction.Tag.Gequal;
          }
          else if (tag == "Always") {
            tagType = ComparisonFunction.Tag.Always;
          }
          else throw new Exception("unknown constructor: " + tag);
          ComparisonFunction o = new ComparisonFunction();
          o.tag = tagType;
          return o;
        }
        case Type.StencilOperation: {
          string tag = (string)obj["tag"];
          StencilOperation.Tag tagType;
          if (tag == "OpZero") {
            tagType = StencilOperation.Tag.OpZero;
          }
          else if (tag == "OpKeep") {
            tagType = StencilOperation.Tag.OpKeep;
          }
          else if (tag == "OpReplace") {
            tagType = StencilOperation.Tag.OpReplace;
          }
          else if (tag == "OpIncr") {
            tagType = StencilOperation.Tag.OpIncr;
          }
          else if (tag == "OpIncrWrap") {
            tagType = StencilOperation.Tag.OpIncrWrap;
          }
          else if (tag == "OpDecr") {
            tagType = StencilOperation.Tag.OpDecr;
          }
          else if (tag == "OpDecrWrap") {
            tagType = StencilOperation.Tag.OpDecrWrap;
          }
          else if (tag == "OpInvert") {
            tagType = StencilOperation.Tag.OpInvert;
          }
          else throw new Exception("unknown constructor: " + tag);
          StencilOperation o = new StencilOperation();
          o.tag = tagType;
          return o;
        }
        case Type.BlendEquation: {
          string tag = (string)obj["tag"];
          BlendEquation.Tag tagType;
          if (tag == "FuncAdd") {
            tagType = BlendEquation.Tag.FuncAdd;
          }
          else if (tag == "FuncSubtract") {
            tagType = BlendEquation.Tag.FuncSubtract;
          }
          else if (tag == "FuncReverseSubtract") {
            tagType = BlendEquation.Tag.FuncReverseSubtract;
          }
          else if (tag == "Min") {
            tagType = BlendEquation.Tag.Min;
          }
          else if (tag == "Max") {
            tagType = BlendEquation.Tag.Max;
          }
          else throw new Exception("unknown constructor: " + tag);
          BlendEquation o = new BlendEquation();
          o.tag = tagType;
          return o;
        }
        case Type.BlendingFactor: {
          string tag = (string)obj["tag"];
          BlendingFactor.Tag tagType;
          if (tag == "Zero") {
            tagType = BlendingFactor.Tag.Zero;
          }
          else if (tag == "One") {
            tagType = BlendingFactor.Tag.One;
          }
          else if (tag == "SrcColor") {
            tagType = BlendingFactor.Tag.SrcColor;
          }
          else if (tag == "OneMinusSrcColor") {
            tagType = BlendingFactor.Tag.OneMinusSrcColor;
          }
          else if (tag == "DstColor") {
            tagType = BlendingFactor.Tag.DstColor;
          }
          else if (tag == "OneMinusDstColor") {
            tagType = BlendingFactor.Tag.OneMinusDstColor;
          }
          else if (tag == "SrcAlpha") {
            tagType = BlendingFactor.Tag.SrcAlpha;
          }
          else if (tag == "OneMinusSrcAlpha") {
            tagType = BlendingFactor.Tag.OneMinusSrcAlpha;
          }
          else if (tag == "DstAlpha") {
            tagType = BlendingFactor.Tag.DstAlpha;
          }
          else if (tag == "OneMinusDstAlpha") {
            tagType = BlendingFactor.Tag.OneMinusDstAlpha;
          }
          else if (tag == "ConstantColor") {
            tagType = BlendingFactor.Tag.ConstantColor;
          }
          else if (tag == "OneMinusConstantColor") {
            tagType = BlendingFactor.Tag.OneMinusConstantColor;
          }
          else if (tag == "ConstantAlpha") {
            tagType = BlendingFactor.Tag.ConstantAlpha;
          }
          else if (tag == "OneMinusConstantAlpha") {
            tagType = BlendingFactor.Tag.OneMinusConstantAlpha;
          }
          else if (tag == "SrcAlphaSaturate") {
            tagType = BlendingFactor.Tag.SrcAlphaSaturate;
          }
          else throw new Exception("unknown constructor: " + tag);
          BlendingFactor o = new BlendingFactor();
          o.tag = tagType;
          return o;
        }
        case Type.LogicOperation: {
          string tag = (string)obj["tag"];
          LogicOperation.Tag tagType;
          if (tag == "Clear") {
            tagType = LogicOperation.Tag.Clear;
          }
          else if (tag == "And") {
            tagType = LogicOperation.Tag.And;
          }
          else if (tag == "AndReverse") {
            tagType = LogicOperation.Tag.AndReverse;
          }
          else if (tag == "Copy") {
            tagType = LogicOperation.Tag.Copy;
          }
          else if (tag == "AndInverted") {
            tagType = LogicOperation.Tag.AndInverted;
          }
          else if (tag == "Noop") {
            tagType = LogicOperation.Tag.Noop;
          }
          else if (tag == "Xor") {
            tagType = LogicOperation.Tag.Xor;
          }
          else if (tag == "Or") {
            tagType = LogicOperation.Tag.Or;
          }
          else if (tag == "Nor") {
            tagType = LogicOperation.Tag.Nor;
          }
          else if (tag == "Equiv") {
            tagType = LogicOperation.Tag.Equiv;
          }
          else if (tag == "Invert") {
            tagType = LogicOperation.Tag.Invert;
          }
          else if (tag == "OrReverse") {
            tagType = LogicOperation.Tag.OrReverse;
          }
          else if (tag == "CopyInverted") {
            tagType = LogicOperation.Tag.CopyInverted;
          }
          else if (tag == "OrInverted") {
            tagType = LogicOperation.Tag.OrInverted;
          }
          else if (tag == "Nand") {
            tagType = LogicOperation.Tag.Nand;
          }
          else if (tag == "Set") {
            tagType = LogicOperation.Tag.Set;
          }
          else throw new Exception("unknown constructor: " + tag);
          LogicOperation o = new LogicOperation();
          o.tag = tagType;
          return o;
        }
        case Type.StencilOps: {
          string tag = (string)obj["tag"];
          StencilOps.Tag tagType;
          if (tag == "StencilOps") {
            tagType = StencilOps.Tag.StencilOps;
            data.StencilOps tv = new data.StencilOps();
            tv.frontStencilOp = (global::LambdaCube.IR.StencilOperation)fromJSON(Type.StencilOperation,obj["frontStencilOp"]);
            tv.backStencilOp = (global::LambdaCube.IR.StencilOperation)fromJSON(Type.StencilOperation,obj["backStencilOp"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          StencilOps o = new StencilOps();
          o.tag = tagType;
          return o;
        }
        case Type.StencilTest: {
          string tag = (string)obj["tag"];
          StencilTest.Tag tagType;
          if (tag == "StencilTest") {
            tagType = StencilTest.Tag.StencilTest;
            data.StencilTest tv = new data.StencilTest();
            tv.stencilComparision = (global::LambdaCube.IR.ComparisonFunction)fromJSON(Type.ComparisonFunction,obj["stencilComparision"]);
            tv.stencilReference = (int)fromJSON(Type.Int32,obj["stencilReference"]);
            tv.stencilMask = (uint)fromJSON(Type.Word32,obj["stencilMask"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          StencilTest o = new StencilTest();
          o.tag = tagType;
          return o;
        }
        case Type.StencilTests: {
          string tag = (string)obj["tag"];
          StencilTests.Tag tagType;
          if (tag == "StencilTests") {
            tagType = StencilTests.Tag.StencilTests;
            data.StencilTests tv = new data.StencilTests();
            tv._0 = (global::LambdaCube.IR.StencilTest)fromJSON(Type.StencilTest,obj["arg0"]);
            tv._1 = (global::LambdaCube.IR.StencilTest)fromJSON(Type.StencilTest,obj["arg1"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          StencilTests o = new StencilTests();
          o.tag = tagType;
          return o;
        }
        case Type.FetchPrimitive: {
          string tag = (string)obj["tag"];
          FetchPrimitive.Tag tagType;
          if (tag == "Points") {
            tagType = FetchPrimitive.Tag.Points;
          }
          else if (tag == "Lines") {
            tagType = FetchPrimitive.Tag.Lines;
          }
          else if (tag == "Triangles") {
            tagType = FetchPrimitive.Tag.Triangles;
          }
          else if (tag == "LinesAdjacency") {
            tagType = FetchPrimitive.Tag.LinesAdjacency;
          }
          else if (tag == "TrianglesAdjacency") {
            tagType = FetchPrimitive.Tag.TrianglesAdjacency;
          }
          else throw new Exception("unknown constructor: " + tag);
          FetchPrimitive o = new FetchPrimitive();
          o.tag = tagType;
          return o;
        }
        case Type.OutputPrimitive: {
          string tag = (string)obj["tag"];
          OutputPrimitive.Tag tagType;
          if (tag == "TrianglesOutput") {
            tagType = OutputPrimitive.Tag.TrianglesOutput;
          }
          else if (tag == "LinesOutput") {
            tagType = OutputPrimitive.Tag.LinesOutput;
          }
          else if (tag == "PointsOutput") {
            tagType = OutputPrimitive.Tag.PointsOutput;
          }
          else throw new Exception("unknown constructor: " + tag);
          OutputPrimitive o = new OutputPrimitive();
          o.tag = tagType;
          return o;
        }
        case Type.ColorArity: {
          string tag = (string)obj["tag"];
          ColorArity.Tag tagType;
          if (tag == "Red") {
            tagType = ColorArity.Tag.Red;
          }
          else if (tag == "RG") {
            tagType = ColorArity.Tag.RG;
          }
          else if (tag == "RGB") {
            tagType = ColorArity.Tag.RGB;
          }
          else if (tag == "RGBA") {
            tagType = ColorArity.Tag.RGBA;
          }
          else throw new Exception("unknown constructor: " + tag);
          ColorArity o = new ColorArity();
          o.tag = tagType;
          return o;
        }
        case Type.Blending: {
          string tag = (string)obj["tag"];
          Blending.Tag tagType;
          if (tag == "NoBlending") {
            tagType = Blending.Tag.NoBlending;
          }
          else if (tag == "BlendLogicOp") {
            tagType = Blending.Tag.BlendLogicOp;
            data.BlendLogicOp tv = new data.BlendLogicOp();
            tv._0 = (global::LambdaCube.IR.LogicOperation)fromJSON(Type.LogicOperation,obj["arg0"]);
            return tv;
          }
          else if (tag == "Blend") {
            tagType = Blending.Tag.Blend;
            data.Blend tv = new data.Blend();
            tv.colorEqSrc = (global::LambdaCube.IR.BlendEquation)fromJSON(Type.BlendEquation,obj["colorEqSrc"]);
            tv.alphaEqSrc = (global::LambdaCube.IR.BlendEquation)fromJSON(Type.BlendEquation,obj["alphaEqSrc"]);
            tv.colorFSrc = (global::LambdaCube.IR.BlendingFactor)fromJSON(Type.BlendingFactor,obj["colorFSrc"]);
            tv.colorFDst = (global::LambdaCube.IR.BlendingFactor)fromJSON(Type.BlendingFactor,obj["colorFDst"]);
            tv.alphaFSrc = (global::LambdaCube.IR.BlendingFactor)fromJSON(Type.BlendingFactor,obj["alphaFSrc"]);
            tv.alphaFDst = (global::LambdaCube.IR.BlendingFactor)fromJSON(Type.BlendingFactor,obj["alphaFDst"]);
            tv.color = (V4<float>)fromJSON(Type.V4_Float,obj["color"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Blending o = new Blending();
          o.tag = tagType;
          return o;
        }
        case Type.RasterContext: {
          string tag = (string)obj["tag"];
          RasterContext.Tag tagType;
          if (tag == "PointCtx") {
            tagType = RasterContext.Tag.PointCtx;
            data.PointCtx tv = new data.PointCtx();
            tv._0 = (global::LambdaCube.IR.PointSize)fromJSON(Type.PointSize,obj["arg0"]);
            tv._1 = (float)fromJSON(Type.Float,obj["arg1"]);
            tv._2 = (global::LambdaCube.IR.PointSpriteCoordOrigin)fromJSON(Type.PointSpriteCoordOrigin,obj["arg2"]);
            return tv;
          }
          else if (tag == "LineCtx") {
            tagType = RasterContext.Tag.LineCtx;
            data.LineCtx tv = new data.LineCtx();
            tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
            tv._1 = (global::LambdaCube.IR.ProvokingVertex)fromJSON(Type.ProvokingVertex,obj["arg1"]);
            return tv;
          }
          else if (tag == "TriangleCtx") {
            tagType = RasterContext.Tag.TriangleCtx;
            data.TriangleCtx tv = new data.TriangleCtx();
            tv._0 = (global::LambdaCube.IR.CullMode)fromJSON(Type.CullMode,obj["arg0"]);
            tv._1 = (global::LambdaCube.IR.PolygonMode)fromJSON(Type.PolygonMode,obj["arg1"]);
            tv._2 = (global::LambdaCube.IR.PolygonOffset)fromJSON(Type.PolygonOffset,obj["arg2"]);
            tv._3 = (global::LambdaCube.IR.ProvokingVertex)fromJSON(Type.ProvokingVertex,obj["arg3"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          RasterContext o = new RasterContext();
          o.tag = tagType;
          return o;
        }
        case Type.FragmentOperation: {
          string tag = (string)obj["tag"];
          FragmentOperation.Tag tagType;
          if (tag == "DepthOp") {
            tagType = FragmentOperation.Tag.DepthOp;
            data.DepthOp tv = new data.DepthOp();
            tv._0 = (global::LambdaCube.IR.ComparisonFunction)fromJSON(Type.ComparisonFunction,obj["arg0"]);
            tv._1 = (bool)fromJSON(Type.Bool,obj["arg1"]);
            return tv;
          }
          else if (tag == "StencilOp") {
            tagType = FragmentOperation.Tag.StencilOp;
            data.StencilOp tv = new data.StencilOp();
            tv._0 = (global::LambdaCube.IR.StencilTests)fromJSON(Type.StencilTests,obj["arg0"]);
            tv._1 = (global::LambdaCube.IR.StencilOps)fromJSON(Type.StencilOps,obj["arg1"]);
            tv._2 = (global::LambdaCube.IR.StencilOps)fromJSON(Type.StencilOps,obj["arg2"]);
            return tv;
          }
          else if (tag == "ColorOp") {
            tagType = FragmentOperation.Tag.ColorOp;
            data.ColorOp tv = new data.ColorOp();
            tv._0 = (global::LambdaCube.IR.Blending)fromJSON(Type.Blending,obj["arg0"]);
            tv._1 = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["arg1"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          FragmentOperation o = new FragmentOperation();
          o.tag = tagType;
          return o;
        }
        case Type.AccumulationContext: {
          string tag = (string)obj["tag"];
          AccumulationContext.Tag tagType;
          if (tag == "AccumulationContext") {
            tagType = AccumulationContext.Tag.AccumulationContext;
            data.AccumulationContext tv = new data.AccumulationContext();
            tv.accViewportName = (Maybe<string>)fromJSON(Type.Maybe_String,obj["accViewportName"]);
            tv.accOperations = (List<global::LambdaCube.IR.FragmentOperation>)fromJSON(Type.List_FragmentOperation,obj["accOperations"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          AccumulationContext o = new AccumulationContext();
          o.tag = tagType;
          return o;
        }
        case Type.TextureDataType: {
          string tag = (string)obj["tag"];
          TextureDataType.Tag tagType;
          if (tag == "FloatT") {
            tagType = TextureDataType.Tag.FloatT;
            data.FloatT tv = new data.FloatT();
            tv._0 = (global::LambdaCube.IR.ColorArity)fromJSON(Type.ColorArity,obj["arg0"]);
            return tv;
          }
          else if (tag == "IntT") {
            tagType = TextureDataType.Tag.IntT;
            data.IntT tv = new data.IntT();
            tv._0 = (global::LambdaCube.IR.ColorArity)fromJSON(Type.ColorArity,obj["arg0"]);
            return tv;
          }
          else if (tag == "WordT") {
            tagType = TextureDataType.Tag.WordT;
            data.WordT tv = new data.WordT();
            tv._0 = (global::LambdaCube.IR.ColorArity)fromJSON(Type.ColorArity,obj["arg0"]);
            return tv;
          }
          else if (tag == "ShadowT") {
            tagType = TextureDataType.Tag.ShadowT;
          }
          else throw new Exception("unknown constructor: " + tag);
          TextureDataType o = new TextureDataType();
          o.tag = tagType;
          return o;
        }
        case Type.TextureType: {
          string tag = (string)obj["tag"];
          TextureType.Tag tagType;
          if (tag == "Texture1D") {
            tagType = TextureType.Tag.Texture1D;
            data.Texture1D tv = new data.Texture1D();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else if (tag == "Texture2D") {
            tagType = TextureType.Tag.Texture2D;
            data.Texture2D tv = new data.Texture2D();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else if (tag == "Texture3D") {
            tagType = TextureType.Tag.Texture3D;
            data.Texture3D tv = new data.Texture3D();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            return tv;
          }
          else if (tag == "TextureCube") {
            tagType = TextureType.Tag.TextureCube;
            data.TextureCube tv = new data.TextureCube();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            return tv;
          }
          else if (tag == "TextureRect") {
            tagType = TextureType.Tag.TextureRect;
            data.TextureRect tv = new data.TextureRect();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            return tv;
          }
          else if (tag == "Texture2DMS") {
            tagType = TextureType.Tag.Texture2DMS;
            data.Texture2DMS tv = new data.Texture2DMS();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            tv._2 = (int)fromJSON(Type.Int,obj["arg2"]);
            tv._3 = (bool)fromJSON(Type.Bool,obj["arg3"]);
            return tv;
          }
          else if (tag == "TextureBuffer") {
            tagType = TextureType.Tag.TextureBuffer;
            data.TextureBuffer tv = new data.TextureBuffer();
            tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          TextureType o = new TextureType();
          o.tag = tagType;
          return o;
        }
        case Type.MipMap: {
          string tag = (string)obj["tag"];
          MipMap.Tag tagType;
          if (tag == "Mip") {
            tagType = MipMap.Tag.Mip;
            data.Mip tv = new data.Mip();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else if (tag == "NoMip") {
            tagType = MipMap.Tag.NoMip;
          }
          else if (tag == "AutoMip") {
            tagType = MipMap.Tag.AutoMip;
            data.AutoMip tv = new data.AutoMip();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          MipMap o = new MipMap();
          o.tag = tagType;
          return o;
        }
        case Type.Filter: {
          string tag = (string)obj["tag"];
          Filter.Tag tagType;
          if (tag == "Nearest") {
            tagType = Filter.Tag.Nearest;
          }
          else if (tag == "Linear") {
            tagType = Filter.Tag.Linear;
          }
          else if (tag == "NearestMipmapNearest") {
            tagType = Filter.Tag.NearestMipmapNearest;
          }
          else if (tag == "NearestMipmapLinear") {
            tagType = Filter.Tag.NearestMipmapLinear;
          }
          else if (tag == "LinearMipmapNearest") {
            tagType = Filter.Tag.LinearMipmapNearest;
          }
          else if (tag == "LinearMipmapLinear") {
            tagType = Filter.Tag.LinearMipmapLinear;
          }
          else throw new Exception("unknown constructor: " + tag);
          Filter o = new Filter();
          o.tag = tagType;
          return o;
        }
        case Type.EdgeMode: {
          string tag = (string)obj["tag"];
          EdgeMode.Tag tagType;
          if (tag == "Repeat") {
            tagType = EdgeMode.Tag.Repeat;
          }
          else if (tag == "MirroredRepeat") {
            tagType = EdgeMode.Tag.MirroredRepeat;
          }
          else if (tag == "ClampToEdge") {
            tagType = EdgeMode.Tag.ClampToEdge;
          }
          else if (tag == "ClampToBorder") {
            tagType = EdgeMode.Tag.ClampToBorder;
          }
          else throw new Exception("unknown constructor: " + tag);
          EdgeMode o = new EdgeMode();
          o.tag = tagType;
          return o;
        }
        case Type.ImageSemantic: {
          string tag = (string)obj["tag"];
          ImageSemantic.Tag tagType;
          if (tag == "Depth") {
            tagType = ImageSemantic.Tag.Depth;
          }
          else if (tag == "Stencil") {
            tagType = ImageSemantic.Tag.Stencil;
          }
          else if (tag == "Color") {
            tagType = ImageSemantic.Tag.Color;
          }
          else throw new Exception("unknown constructor: " + tag);
          ImageSemantic o = new ImageSemantic();
          o.tag = tagType;
          return o;
        }
        case Type.ImageRef: {
          string tag = (string)obj["tag"];
          ImageRef.Tag tagType;
          if (tag == "TextureImage") {
            tagType = ImageRef.Tag.TextureImage;
            data.TextureImage tv = new data.TextureImage();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            tv._2 = (Maybe<int>)fromJSON(Type.Maybe_Int,obj["arg2"]);
            return tv;
          }
          else if (tag == "Framebuffer") {
            tagType = ImageRef.Tag.Framebuffer;
            data.Framebuffer tv = new data.Framebuffer();
            tv._0 = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["arg0"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          ImageRef o = new ImageRef();
          o.tag = tagType;
          return o;
        }
        case Type.ClearImage: {
          string tag = (string)obj["tag"];
          ClearImage.Tag tagType;
          if (tag == "ClearImage") {
            tagType = ClearImage.Tag.ClearImage;
            data.ClearImage tv = new data.ClearImage();
            tv.imageSemantic = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["imageSemantic"]);
            tv.clearValue = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["clearValue"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          ClearImage o = new ClearImage();
          o.tag = tagType;
          return o;
        }
        case Type.Command: {
          string tag = (string)obj["tag"];
          Command.Tag tagType;
          if (tag == "SetRasterContext") {
            tagType = Command.Tag.SetRasterContext;
            data.SetRasterContext tv = new data.SetRasterContext();
            tv._0 = (global::LambdaCube.IR.RasterContext)fromJSON(Type.RasterContext,obj["arg0"]);
            return tv;
          }
          else if (tag == "SetAccumulationContext") {
            tagType = Command.Tag.SetAccumulationContext;
            data.SetAccumulationContext tv = new data.SetAccumulationContext();
            tv._0 = (global::LambdaCube.IR.AccumulationContext)fromJSON(Type.AccumulationContext,obj["arg0"]);
            return tv;
          }
          else if (tag == "SetRenderTarget") {
            tagType = Command.Tag.SetRenderTarget;
            data.SetRenderTarget tv = new data.SetRenderTarget();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "SetProgram") {
            tagType = Command.Tag.SetProgram;
            data.SetProgram tv = new data.SetProgram();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "SetSamplerUniform") {
            tagType = Command.Tag.SetSamplerUniform;
            data.SetSamplerUniform tv = new data.SetSamplerUniform();
            tv._0 = (string)fromJSON(Type.String,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else if (tag == "SetTexture") {
            tagType = Command.Tag.SetTexture;
            data.SetTexture tv = new data.SetTexture();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else if (tag == "SetSampler") {
            tagType = Command.Tag.SetSampler;
            data.SetSampler tv = new data.SetSampler();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            tv._1 = (Maybe<int>)fromJSON(Type.Maybe_Int,obj["arg1"]);
            return tv;
          }
          else if (tag == "RenderSlot") {
            tagType = Command.Tag.RenderSlot;
            data.RenderSlot tv = new data.RenderSlot();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "RenderStream") {
            tagType = Command.Tag.RenderStream;
            data.RenderStream tv = new data.RenderStream();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "ClearRenderTarget") {
            tagType = Command.Tag.ClearRenderTarget;
            data.ClearRenderTarget tv = new data.ClearRenderTarget();
            tv._0 = (List<global::LambdaCube.IR.ClearImage>)fromJSON(Type.Array_ClearImage,obj["arg0"]);
            return tv;
          }
          else if (tag == "GenerateMipMap") {
            tagType = Command.Tag.GenerateMipMap;
            data.GenerateMipMap tv = new data.GenerateMipMap();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            return tv;
          }
          else if (tag == "SaveImage") {
            tagType = Command.Tag.SaveImage;
            data.SaveImage tv = new data.SaveImage();
            tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
            tv._1 = (global::LambdaCube.IR.ImageRef)fromJSON(Type.ImageRef,obj["arg1"]);
            return tv;
          }
          else if (tag == "LoadImage") {
            tagType = Command.Tag.LoadImage;
            data.LoadImage tv = new data.LoadImage();
            tv._0 = (global::LambdaCube.IR.ImageRef)fromJSON(Type.ImageRef,obj["arg0"]);
            tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Command o = new Command();
          o.tag = tagType;
          return o;
        }
        case Type.SamplerDescriptor: {
          string tag = (string)obj["tag"];
          SamplerDescriptor.Tag tagType;
          if (tag == "SamplerDescriptor") {
            tagType = SamplerDescriptor.Tag.SamplerDescriptor;
            data.SamplerDescriptor tv = new data.SamplerDescriptor();
            tv.samplerWrapS = (global::LambdaCube.IR.EdgeMode)fromJSON(Type.EdgeMode,obj["samplerWrapS"]);
            tv.samplerWrapT = (Maybe<global::LambdaCube.IR.EdgeMode>)fromJSON(Type.Maybe_EdgeMode,obj["samplerWrapT"]);
            tv.samplerWrapR = (Maybe<global::LambdaCube.IR.EdgeMode>)fromJSON(Type.Maybe_EdgeMode,obj["samplerWrapR"]);
            tv.samplerMinFilter = (global::LambdaCube.IR.Filter)fromJSON(Type.Filter,obj["samplerMinFilter"]);
            tv.samplerMagFilter = (global::LambdaCube.IR.Filter)fromJSON(Type.Filter,obj["samplerMagFilter"]);
            tv.samplerBorderColor = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["samplerBorderColor"]);
            tv.samplerMinLod = (Maybe<float>)fromJSON(Type.Maybe_Float,obj["samplerMinLod"]);
            tv.samplerMaxLod = (Maybe<float>)fromJSON(Type.Maybe_Float,obj["samplerMaxLod"]);
            tv.samplerLodBias = (float)fromJSON(Type.Float,obj["samplerLodBias"]);
            tv.samplerCompareFunc = (Maybe<global::LambdaCube.IR.ComparisonFunction>)fromJSON(Type.Maybe_ComparisonFunction,obj["samplerCompareFunc"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          SamplerDescriptor o = new SamplerDescriptor();
          o.tag = tagType;
          return o;
        }
        case Type.TextureDescriptor: {
          string tag = (string)obj["tag"];
          TextureDescriptor.Tag tagType;
          if (tag == "TextureDescriptor") {
            tagType = TextureDescriptor.Tag.TextureDescriptor;
            data.TextureDescriptor tv = new data.TextureDescriptor();
            tv.textureType = (global::LambdaCube.IR.TextureType)fromJSON(Type.TextureType,obj["textureType"]);
            tv.textureSize = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["textureSize"]);
            tv.textureSemantic = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["textureSemantic"]);
            tv.textureSampler = (global::LambdaCube.IR.SamplerDescriptor)fromJSON(Type.SamplerDescriptor,obj["textureSampler"]);
            tv.textureBaseLevel = (int)fromJSON(Type.Int,obj["textureBaseLevel"]);
            tv.textureMaxLevel = (int)fromJSON(Type.Int,obj["textureMaxLevel"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          TextureDescriptor o = new TextureDescriptor();
          o.tag = tagType;
          return o;
        }
        case Type.Parameter: {
          string tag = (string)obj["tag"];
          Parameter.Tag tagType;
          if (tag == "Parameter") {
            tagType = Parameter.Tag.Parameter;
            data.Parameter tv = new data.Parameter();
            tv.name = (string)fromJSON(Type.String,obj["name"]);
            tv.ty = (global::LambdaCube.IR.InputType)fromJSON(Type.InputType,obj["ty"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Parameter o = new Parameter();
          o.tag = tagType;
          return o;
        }
        case Type.Program: {
          string tag = (string)obj["tag"];
          Program.Tag tagType;
          if (tag == "Program") {
            tagType = Program.Tag.Program;
            data.Program tv = new data.Program();
            tv.programUniforms = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["programUniforms"]);
            tv.programStreams = (Dictionary<string, global::LambdaCube.IR.Parameter>)fromJSON(Type.Map_String_Parameter,obj["programStreams"]);
            tv.programInTextures = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["programInTextures"]);
            tv.programOutput = (List<global::LambdaCube.IR.Parameter>)fromJSON(Type.Array_Parameter,obj["programOutput"]);
            tv.vertexShader = (string)fromJSON(Type.String,obj["vertexShader"]);
            tv.geometryShader = (Maybe<string>)fromJSON(Type.Maybe_String,obj["geometryShader"]);
            tv.fragmentShader = (string)fromJSON(Type.String,obj["fragmentShader"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Program o = new Program();
          o.tag = tagType;
          return o;
        }
        case Type.Slot: {
          string tag = (string)obj["tag"];
          Slot.Tag tagType;
          if (tag == "Slot") {
            tagType = Slot.Tag.Slot;
            data.Slot tv = new data.Slot();
            tv.slotName = (string)fromJSON(Type.String,obj["slotName"]);
            tv.slotStreams = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["slotStreams"]);
            tv.slotUniforms = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["slotUniforms"]);
            tv.slotPrimitive = (global::LambdaCube.IR.FetchPrimitive)fromJSON(Type.FetchPrimitive,obj["slotPrimitive"]);
            tv.slotPrograms = (List<int>)fromJSON(Type.Array_Int,obj["slotPrograms"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Slot o = new Slot();
          o.tag = tagType;
          return o;
        }
        case Type.StreamData: {
          string tag = (string)obj["tag"];
          StreamData.Tag tagType;
          if (tag == "StreamData") {
            tagType = StreamData.Tag.StreamData;
            data.StreamData tv = new data.StreamData();
            tv.streamData = (Dictionary<string, global::LambdaCube.IR.ArrayValue>)fromJSON(Type.Map_String_ArrayValue,obj["streamData"]);
            tv.streamType = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["streamType"]);
            tv.streamPrimitive = (global::LambdaCube.IR.FetchPrimitive)fromJSON(Type.FetchPrimitive,obj["streamPrimitive"]);
            tv.streamPrograms = (List<int>)fromJSON(Type.Array_Int,obj["streamPrograms"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          StreamData o = new StreamData();
          o.tag = tagType;
          return o;
        }
        case Type.TargetItem: {
          string tag = (string)obj["tag"];
          TargetItem.Tag tagType;
          if (tag == "TargetItem") {
            tagType = TargetItem.Tag.TargetItem;
            data.TargetItem tv = new data.TargetItem();
            tv.targetSemantic = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["targetSemantic"]);
            tv.targetRef = (Maybe<global::LambdaCube.IR.ImageRef>)fromJSON(Type.Maybe_ImageRef,obj["targetRef"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          TargetItem o = new TargetItem();
          o.tag = tagType;
          return o;
        }
        case Type.RenderTarget: {
          string tag = (string)obj["tag"];
          RenderTarget.Tag tagType;
          if (tag == "RenderTarget") {
            tagType = RenderTarget.Tag.RenderTarget;
            data.RenderTarget tv = new data.RenderTarget();
            tv.renderTargets = (List<global::LambdaCube.IR.TargetItem>)fromJSON(Type.Array_TargetItem,obj["renderTargets"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          RenderTarget o = new RenderTarget();
          o.tag = tagType;
          return o;
        }
        case Type.Backend: {
          string tag = (string)obj["tag"];
          Backend.Tag tagType;
          if (tag == "WebGL1") {
            tagType = Backend.Tag.WebGL1;
          }
          else if (tag == "OpenGL33") {
            tagType = Backend.Tag.OpenGL33;
          }
          else throw new Exception("unknown constructor: " + tag);
          Backend o = new Backend();
          o.tag = tagType;
          return o;
        }
        case Type.Pipeline: {
          string tag = (string)obj["tag"];
          Pipeline.Tag tagType;
          if (tag == "Pipeline") {
            tagType = Pipeline.Tag.Pipeline;
            data.Pipeline tv = new data.Pipeline();
            tv.info = (string)fromJSON(Type.String,obj["info"]);
            tv.backend = (global::LambdaCube.IR.Backend)fromJSON(Type.Backend,obj["backend"]);
            tv.textures = (List<global::LambdaCube.IR.TextureDescriptor>)fromJSON(Type.Array_TextureDescriptor,obj["textures"]);
            tv.samplers = (List<global::LambdaCube.IR.SamplerDescriptor>)fromJSON(Type.Array_SamplerDescriptor,obj["samplers"]);
            tv.targets = (List<global::LambdaCube.IR.RenderTarget>)fromJSON(Type.Array_RenderTarget,obj["targets"]);
            tv.programs = (List<global::LambdaCube.IR.Program>)fromJSON(Type.Array_Program,obj["programs"]);
            tv.slots = (List<global::LambdaCube.IR.Slot>)fromJSON(Type.Array_Slot,obj["slots"]);
            tv.streams = (List<global::LambdaCube.IR.StreamData>)fromJSON(Type.Array_StreamData,obj["streams"]);
            tv.commands = (List<global::LambdaCube.IR.Command>)fromJSON(Type.Array_Command,obj["commands"]);
            return tv;
          }
          else throw new Exception("unknown constructor: " + tag);
          Pipeline o = new Pipeline();
          o.tag = tagType;
          return o;
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    JToken toJSON(ArrayValue v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ArrayValue.Tag.VBoolArray:
          obj["tag"] = "VBoolArray";
          {
            var tv = (data.VBoolArray)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case ArrayValue.Tag.VIntArray:
          obj["tag"] = "VIntArray";
          {
            var tv = (data.VIntArray)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case ArrayValue.Tag.VWordArray:
          obj["tag"] = "VWordArray";
          {
            var tv = (data.VWordArray)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case ArrayValue.Tag.VFloatArray:
          obj["tag"] = "VFloatArray";
          {
            var tv = (data.VFloatArray)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Value v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Value.Tag.VBool:
          obj["tag"] = "VBool";
          {
            var tv = (data.VBool)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV2B:
          obj["tag"] = "VV2B";
          {
            var tv = (data.VV2B)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV3B:
          obj["tag"] = "VV3B";
          {
            var tv = (data.VV3B)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV4B:
          obj["tag"] = "VV4B";
          {
            var tv = (data.VV4B)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VWord:
          obj["tag"] = "VWord";
          {
            var tv = (data.VWord)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV2U:
          obj["tag"] = "VV2U";
          {
            var tv = (data.VV2U)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV3U:
          obj["tag"] = "VV3U";
          {
            var tv = (data.VV3U)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV4U:
          obj["tag"] = "VV4U";
          {
            var tv = (data.VV4U)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VInt:
          obj["tag"] = "VInt";
          {
            var tv = (data.VInt)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV2I:
          obj["tag"] = "VV2I";
          {
            var tv = (data.VV2I)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV3I:
          obj["tag"] = "VV3I";
          {
            var tv = (data.VV3I)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV4I:
          obj["tag"] = "VV4I";
          {
            var tv = (data.VV4I)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VFloat:
          obj["tag"] = "VFloat";
          {
            var tv = (data.VFloat)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV2F:
          obj["tag"] = "VV2F";
          {
            var tv = (data.VV2F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV3F:
          obj["tag"] = "VV3F";
          {
            var tv = (data.VV3F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VV4F:
          obj["tag"] = "VV4F";
          {
            var tv = (data.VV4F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM22F:
          obj["tag"] = "VM22F";
          {
            var tv = (data.VM22F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM23F:
          obj["tag"] = "VM23F";
          {
            var tv = (data.VM23F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM24F:
          obj["tag"] = "VM24F";
          {
            var tv = (data.VM24F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM32F:
          obj["tag"] = "VM32F";
          {
            var tv = (data.VM32F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM33F:
          obj["tag"] = "VM33F";
          {
            var tv = (data.VM33F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM34F:
          obj["tag"] = "VM34F";
          {
            var tv = (data.VM34F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM42F:
          obj["tag"] = "VM42F";
          {
            var tv = (data.VM42F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM43F:
          obj["tag"] = "VM43F";
          {
            var tv = (data.VM43F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Value.Tag.VM44F:
          obj["tag"] = "VM44F";
          {
            var tv = (data.VM44F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(InputType v) {
      var obj = new JObject();
      switch (v.tag) { 
        case InputType.Tag.Bool:
          obj["tag"] = "Bool";
          break;
        case InputType.Tag.V2B:
          obj["tag"] = "V2B";
          break;
        case InputType.Tag.V3B:
          obj["tag"] = "V3B";
          break;
        case InputType.Tag.V4B:
          obj["tag"] = "V4B";
          break;
        case InputType.Tag.Word:
          obj["tag"] = "Word";
          break;
        case InputType.Tag.V2U:
          obj["tag"] = "V2U";
          break;
        case InputType.Tag.V3U:
          obj["tag"] = "V3U";
          break;
        case InputType.Tag.V4U:
          obj["tag"] = "V4U";
          break;
        case InputType.Tag.Int:
          obj["tag"] = "Int";
          break;
        case InputType.Tag.V2I:
          obj["tag"] = "V2I";
          break;
        case InputType.Tag.V3I:
          obj["tag"] = "V3I";
          break;
        case InputType.Tag.V4I:
          obj["tag"] = "V4I";
          break;
        case InputType.Tag.Float:
          obj["tag"] = "Float";
          break;
        case InputType.Tag.V2F:
          obj["tag"] = "V2F";
          break;
        case InputType.Tag.V3F:
          obj["tag"] = "V3F";
          break;
        case InputType.Tag.V4F:
          obj["tag"] = "V4F";
          break;
        case InputType.Tag.M22F:
          obj["tag"] = "M22F";
          break;
        case InputType.Tag.M23F:
          obj["tag"] = "M23F";
          break;
        case InputType.Tag.M24F:
          obj["tag"] = "M24F";
          break;
        case InputType.Tag.M32F:
          obj["tag"] = "M32F";
          break;
        case InputType.Tag.M33F:
          obj["tag"] = "M33F";
          break;
        case InputType.Tag.M34F:
          obj["tag"] = "M34F";
          break;
        case InputType.Tag.M42F:
          obj["tag"] = "M42F";
          break;
        case InputType.Tag.M43F:
          obj["tag"] = "M43F";
          break;
        case InputType.Tag.M44F:
          obj["tag"] = "M44F";
          break;
        case InputType.Tag.STexture1D:
          obj["tag"] = "STexture1D";
          break;
        case InputType.Tag.STexture2D:
          obj["tag"] = "STexture2D";
          break;
        case InputType.Tag.STextureCube:
          obj["tag"] = "STextureCube";
          break;
        case InputType.Tag.STexture1DArray:
          obj["tag"] = "STexture1DArray";
          break;
        case InputType.Tag.STexture2DArray:
          obj["tag"] = "STexture2DArray";
          break;
        case InputType.Tag.STexture2DRect:
          obj["tag"] = "STexture2DRect";
          break;
        case InputType.Tag.FTexture1D:
          obj["tag"] = "FTexture1D";
          break;
        case InputType.Tag.FTexture2D:
          obj["tag"] = "FTexture2D";
          break;
        case InputType.Tag.FTexture3D:
          obj["tag"] = "FTexture3D";
          break;
        case InputType.Tag.FTextureCube:
          obj["tag"] = "FTextureCube";
          break;
        case InputType.Tag.FTexture1DArray:
          obj["tag"] = "FTexture1DArray";
          break;
        case InputType.Tag.FTexture2DArray:
          obj["tag"] = "FTexture2DArray";
          break;
        case InputType.Tag.FTexture2DMS:
          obj["tag"] = "FTexture2DMS";
          break;
        case InputType.Tag.FTexture2DMSArray:
          obj["tag"] = "FTexture2DMSArray";
          break;
        case InputType.Tag.FTextureBuffer:
          obj["tag"] = "FTextureBuffer";
          break;
        case InputType.Tag.FTexture2DRect:
          obj["tag"] = "FTexture2DRect";
          break;
        case InputType.Tag.ITexture1D:
          obj["tag"] = "ITexture1D";
          break;
        case InputType.Tag.ITexture2D:
          obj["tag"] = "ITexture2D";
          break;
        case InputType.Tag.ITexture3D:
          obj["tag"] = "ITexture3D";
          break;
        case InputType.Tag.ITextureCube:
          obj["tag"] = "ITextureCube";
          break;
        case InputType.Tag.ITexture1DArray:
          obj["tag"] = "ITexture1DArray";
          break;
        case InputType.Tag.ITexture2DArray:
          obj["tag"] = "ITexture2DArray";
          break;
        case InputType.Tag.ITexture2DMS:
          obj["tag"] = "ITexture2DMS";
          break;
        case InputType.Tag.ITexture2DMSArray:
          obj["tag"] = "ITexture2DMSArray";
          break;
        case InputType.Tag.ITextureBuffer:
          obj["tag"] = "ITextureBuffer";
          break;
        case InputType.Tag.ITexture2DRect:
          obj["tag"] = "ITexture2DRect";
          break;
        case InputType.Tag.UTexture1D:
          obj["tag"] = "UTexture1D";
          break;
        case InputType.Tag.UTexture2D:
          obj["tag"] = "UTexture2D";
          break;
        case InputType.Tag.UTexture3D:
          obj["tag"] = "UTexture3D";
          break;
        case InputType.Tag.UTextureCube:
          obj["tag"] = "UTextureCube";
          break;
        case InputType.Tag.UTexture1DArray:
          obj["tag"] = "UTexture1DArray";
          break;
        case InputType.Tag.UTexture2DArray:
          obj["tag"] = "UTexture2DArray";
          break;
        case InputType.Tag.UTexture2DMS:
          obj["tag"] = "UTexture2DMS";
          break;
        case InputType.Tag.UTexture2DMSArray:
          obj["tag"] = "UTexture2DMSArray";
          break;
        case InputType.Tag.UTextureBuffer:
          obj["tag"] = "UTextureBuffer";
          break;
        case InputType.Tag.UTexture2DRect:
          obj["tag"] = "UTexture2DRect";
          break;
      }
      return obj;
    }
    JToken toJSON(PointSpriteCoordOrigin v) {
      var obj = new JObject();
      switch (v.tag) { 
        case PointSpriteCoordOrigin.Tag.LowerLeft:
          obj["tag"] = "LowerLeft";
          break;
        case PointSpriteCoordOrigin.Tag.UpperLeft:
          obj["tag"] = "UpperLeft";
          break;
      }
      return obj;
    }
    JToken toJSON(PointSize v) {
      var obj = new JObject();
      switch (v.tag) { 
        case PointSize.Tag.PointSize:
          obj["tag"] = "PointSize";
          {
            var tv = (data.PointSize)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case PointSize.Tag.ProgramPointSize:
          obj["tag"] = "ProgramPointSize";
          break;
      }
      return obj;
    }
    JToken toJSON(PolygonOffset v) {
      var obj = new JObject();
      switch (v.tag) { 
        case PolygonOffset.Tag.NoOffset:
          obj["tag"] = "NoOffset";
          break;
        case PolygonOffset.Tag.Offset:
          obj["tag"] = "Offset";
          {
            var tv = (data.Offset)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(FrontFace v) {
      var obj = new JObject();
      switch (v.tag) { 
        case FrontFace.Tag.CCW:
          obj["tag"] = "CCW";
          break;
        case FrontFace.Tag.CW:
          obj["tag"] = "CW";
          break;
      }
      return obj;
    }
    JToken toJSON(PolygonMode v) {
      var obj = new JObject();
      switch (v.tag) { 
        case PolygonMode.Tag.PolygonPoint:
          obj["tag"] = "PolygonPoint";
          {
            var tv = (data.PolygonPoint)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case PolygonMode.Tag.PolygonLine:
          obj["tag"] = "PolygonLine";
          {
            var tv = (data.PolygonLine)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case PolygonMode.Tag.PolygonFill:
          obj["tag"] = "PolygonFill";
          break;
      }
      return obj;
    }
    JToken toJSON(ProvokingVertex v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ProvokingVertex.Tag.FirstVertex:
          obj["tag"] = "FirstVertex";
          break;
        case ProvokingVertex.Tag.LastVertex:
          obj["tag"] = "LastVertex";
          break;
      }
      return obj;
    }
    JToken toJSON(CullMode v) {
      var obj = new JObject();
      switch (v.tag) { 
        case CullMode.Tag.CullNone:
          obj["tag"] = "CullNone";
          break;
        case CullMode.Tag.CullFront:
          obj["tag"] = "CullFront";
          {
            var tv = (data.CullFront)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case CullMode.Tag.CullBack:
          obj["tag"] = "CullBack";
          {
            var tv = (data.CullBack)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(ComparisonFunction v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ComparisonFunction.Tag.Never:
          obj["tag"] = "Never";
          break;
        case ComparisonFunction.Tag.Less:
          obj["tag"] = "Less";
          break;
        case ComparisonFunction.Tag.Equal:
          obj["tag"] = "Equal";
          break;
        case ComparisonFunction.Tag.Lequal:
          obj["tag"] = "Lequal";
          break;
        case ComparisonFunction.Tag.Greater:
          obj["tag"] = "Greater";
          break;
        case ComparisonFunction.Tag.Notequal:
          obj["tag"] = "Notequal";
          break;
        case ComparisonFunction.Tag.Gequal:
          obj["tag"] = "Gequal";
          break;
        case ComparisonFunction.Tag.Always:
          obj["tag"] = "Always";
          break;
      }
      return obj;
    }
    JToken toJSON(StencilOperation v) {
      var obj = new JObject();
      switch (v.tag) { 
        case StencilOperation.Tag.OpZero:
          obj["tag"] = "OpZero";
          break;
        case StencilOperation.Tag.OpKeep:
          obj["tag"] = "OpKeep";
          break;
        case StencilOperation.Tag.OpReplace:
          obj["tag"] = "OpReplace";
          break;
        case StencilOperation.Tag.OpIncr:
          obj["tag"] = "OpIncr";
          break;
        case StencilOperation.Tag.OpIncrWrap:
          obj["tag"] = "OpIncrWrap";
          break;
        case StencilOperation.Tag.OpDecr:
          obj["tag"] = "OpDecr";
          break;
        case StencilOperation.Tag.OpDecrWrap:
          obj["tag"] = "OpDecrWrap";
          break;
        case StencilOperation.Tag.OpInvert:
          obj["tag"] = "OpInvert";
          break;
      }
      return obj;
    }
    JToken toJSON(BlendEquation v) {
      var obj = new JObject();
      switch (v.tag) { 
        case BlendEquation.Tag.FuncAdd:
          obj["tag"] = "FuncAdd";
          break;
        case BlendEquation.Tag.FuncSubtract:
          obj["tag"] = "FuncSubtract";
          break;
        case BlendEquation.Tag.FuncReverseSubtract:
          obj["tag"] = "FuncReverseSubtract";
          break;
        case BlendEquation.Tag.Min:
          obj["tag"] = "Min";
          break;
        case BlendEquation.Tag.Max:
          obj["tag"] = "Max";
          break;
      }
      return obj;
    }
    JToken toJSON(BlendingFactor v) {
      var obj = new JObject();
      switch (v.tag) { 
        case BlendingFactor.Tag.Zero:
          obj["tag"] = "Zero";
          break;
        case BlendingFactor.Tag.One:
          obj["tag"] = "One";
          break;
        case BlendingFactor.Tag.SrcColor:
          obj["tag"] = "SrcColor";
          break;
        case BlendingFactor.Tag.OneMinusSrcColor:
          obj["tag"] = "OneMinusSrcColor";
          break;
        case BlendingFactor.Tag.DstColor:
          obj["tag"] = "DstColor";
          break;
        case BlendingFactor.Tag.OneMinusDstColor:
          obj["tag"] = "OneMinusDstColor";
          break;
        case BlendingFactor.Tag.SrcAlpha:
          obj["tag"] = "SrcAlpha";
          break;
        case BlendingFactor.Tag.OneMinusSrcAlpha:
          obj["tag"] = "OneMinusSrcAlpha";
          break;
        case BlendingFactor.Tag.DstAlpha:
          obj["tag"] = "DstAlpha";
          break;
        case BlendingFactor.Tag.OneMinusDstAlpha:
          obj["tag"] = "OneMinusDstAlpha";
          break;
        case BlendingFactor.Tag.ConstantColor:
          obj["tag"] = "ConstantColor";
          break;
        case BlendingFactor.Tag.OneMinusConstantColor:
          obj["tag"] = "OneMinusConstantColor";
          break;
        case BlendingFactor.Tag.ConstantAlpha:
          obj["tag"] = "ConstantAlpha";
          break;
        case BlendingFactor.Tag.OneMinusConstantAlpha:
          obj["tag"] = "OneMinusConstantAlpha";
          break;
        case BlendingFactor.Tag.SrcAlphaSaturate:
          obj["tag"] = "SrcAlphaSaturate";
          break;
      }
      return obj;
    }
    JToken toJSON(LogicOperation v) {
      var obj = new JObject();
      switch (v.tag) { 
        case LogicOperation.Tag.Clear:
          obj["tag"] = "Clear";
          break;
        case LogicOperation.Tag.And:
          obj["tag"] = "And";
          break;
        case LogicOperation.Tag.AndReverse:
          obj["tag"] = "AndReverse";
          break;
        case LogicOperation.Tag.Copy:
          obj["tag"] = "Copy";
          break;
        case LogicOperation.Tag.AndInverted:
          obj["tag"] = "AndInverted";
          break;
        case LogicOperation.Tag.Noop:
          obj["tag"] = "Noop";
          break;
        case LogicOperation.Tag.Xor:
          obj["tag"] = "Xor";
          break;
        case LogicOperation.Tag.Or:
          obj["tag"] = "Or";
          break;
        case LogicOperation.Tag.Nor:
          obj["tag"] = "Nor";
          break;
        case LogicOperation.Tag.Equiv:
          obj["tag"] = "Equiv";
          break;
        case LogicOperation.Tag.Invert:
          obj["tag"] = "Invert";
          break;
        case LogicOperation.Tag.OrReverse:
          obj["tag"] = "OrReverse";
          break;
        case LogicOperation.Tag.CopyInverted:
          obj["tag"] = "CopyInverted";
          break;
        case LogicOperation.Tag.OrInverted:
          obj["tag"] = "OrInverted";
          break;
        case LogicOperation.Tag.Nand:
          obj["tag"] = "Nand";
          break;
        case LogicOperation.Tag.Set:
          obj["tag"] = "Set";
          break;
      }
      return obj;
    }
    JToken toJSON(StencilOps v) {
      var obj = new JObject();
      switch (v.tag) { 
        case StencilOps.Tag.StencilOps:
          obj["tag"] = "StencilOps";
          {
            var tv = (data.StencilOps)v;
            obj["frontStencilOp"] = toJSON(tv.frontStencilOp);
            obj["backStencilOp"] = toJSON(tv.backStencilOp);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(StencilTest v) {
      var obj = new JObject();
      switch (v.tag) { 
        case StencilTest.Tag.StencilTest:
          obj["tag"] = "StencilTest";
          {
            var tv = (data.StencilTest)v;
            obj["stencilComparision"] = toJSON(tv.stencilComparision);
            obj["stencilReference"] = toJSON(tv.stencilReference);
            obj["stencilMask"] = toJSON(tv.stencilMask);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(StencilTests v) {
      var obj = new JObject();
      switch (v.tag) { 
        case StencilTests.Tag.StencilTests:
          obj["tag"] = "StencilTests";
          {
            var tv = (data.StencilTests)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(FetchPrimitive v) {
      var obj = new JObject();
      switch (v.tag) { 
        case FetchPrimitive.Tag.Points:
          obj["tag"] = "Points";
          break;
        case FetchPrimitive.Tag.Lines:
          obj["tag"] = "Lines";
          break;
        case FetchPrimitive.Tag.Triangles:
          obj["tag"] = "Triangles";
          break;
        case FetchPrimitive.Tag.LinesAdjacency:
          obj["tag"] = "LinesAdjacency";
          break;
        case FetchPrimitive.Tag.TrianglesAdjacency:
          obj["tag"] = "TrianglesAdjacency";
          break;
      }
      return obj;
    }
    JToken toJSON(OutputPrimitive v) {
      var obj = new JObject();
      switch (v.tag) { 
        case OutputPrimitive.Tag.TrianglesOutput:
          obj["tag"] = "TrianglesOutput";
          break;
        case OutputPrimitive.Tag.LinesOutput:
          obj["tag"] = "LinesOutput";
          break;
        case OutputPrimitive.Tag.PointsOutput:
          obj["tag"] = "PointsOutput";
          break;
      }
      return obj;
    }
    JToken toJSON(ColorArity v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ColorArity.Tag.Red:
          obj["tag"] = "Red";
          break;
        case ColorArity.Tag.RG:
          obj["tag"] = "RG";
          break;
        case ColorArity.Tag.RGB:
          obj["tag"] = "RGB";
          break;
        case ColorArity.Tag.RGBA:
          obj["tag"] = "RGBA";
          break;
      }
      return obj;
    }
    JToken toJSON(Blending v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Blending.Tag.NoBlending:
          obj["tag"] = "NoBlending";
          break;
        case Blending.Tag.BlendLogicOp:
          obj["tag"] = "BlendLogicOp";
          {
            var tv = (data.BlendLogicOp)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Blending.Tag.Blend:
          obj["tag"] = "Blend";
          {
            var tv = (data.Blend)v;
            obj["colorEqSrc"] = toJSON(tv.colorEqSrc);
            obj["alphaEqSrc"] = toJSON(tv.alphaEqSrc);
            obj["colorFSrc"] = toJSON(tv.colorFSrc);
            obj["colorFDst"] = toJSON(tv.colorFDst);
            obj["alphaFSrc"] = toJSON(tv.alphaFSrc);
            obj["alphaFDst"] = toJSON(tv.alphaFDst);
            obj["color"] = toJSON(tv.color);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(RasterContext v) {
      var obj = new JObject();
      switch (v.tag) { 
        case RasterContext.Tag.PointCtx:
          obj["tag"] = "PointCtx";
          {
            var tv = (data.PointCtx)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
          }
          break;
        case RasterContext.Tag.LineCtx:
          obj["tag"] = "LineCtx";
          {
            var tv = (data.LineCtx)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case RasterContext.Tag.TriangleCtx:
          obj["tag"] = "TriangleCtx";
          {
            var tv = (data.TriangleCtx)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
            obj["arg3"] = toJSON(tv._3);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(FragmentOperation v) {
      var obj = new JObject();
      switch (v.tag) { 
        case FragmentOperation.Tag.DepthOp:
          obj["tag"] = "DepthOp";
          {
            var tv = (data.DepthOp)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case FragmentOperation.Tag.StencilOp:
          obj["tag"] = "StencilOp";
          {
            var tv = (data.StencilOp)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
          }
          break;
        case FragmentOperation.Tag.ColorOp:
          obj["tag"] = "ColorOp";
          {
            var tv = (data.ColorOp)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(AccumulationContext v) {
      var obj = new JObject();
      switch (v.tag) { 
        case AccumulationContext.Tag.AccumulationContext:
          obj["tag"] = "AccumulationContext";
          {
            var tv = (data.AccumulationContext)v;
            obj["accViewportName"] = toJSON(tv.accViewportName);
            obj["accOperations"] = toJSON(tv.accOperations);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(TextureDataType v) {
      var obj = new JObject();
      switch (v.tag) { 
        case TextureDataType.Tag.FloatT:
          obj["tag"] = "FloatT";
          {
            var tv = (data.FloatT)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case TextureDataType.Tag.IntT:
          obj["tag"] = "IntT";
          {
            var tv = (data.IntT)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case TextureDataType.Tag.WordT:
          obj["tag"] = "WordT";
          {
            var tv = (data.WordT)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case TextureDataType.Tag.ShadowT:
          obj["tag"] = "ShadowT";
          break;
      }
      return obj;
    }
    JToken toJSON(TextureType v) {
      var obj = new JObject();
      switch (v.tag) { 
        case TextureType.Tag.Texture1D:
          obj["tag"] = "Texture1D";
          {
            var tv = (data.Texture1D)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case TextureType.Tag.Texture2D:
          obj["tag"] = "Texture2D";
          {
            var tv = (data.Texture2D)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case TextureType.Tag.Texture3D:
          obj["tag"] = "Texture3D";
          {
            var tv = (data.Texture3D)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case TextureType.Tag.TextureCube:
          obj["tag"] = "TextureCube";
          {
            var tv = (data.TextureCube)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case TextureType.Tag.TextureRect:
          obj["tag"] = "TextureRect";
          {
            var tv = (data.TextureRect)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case TextureType.Tag.Texture2DMS:
          obj["tag"] = "Texture2DMS";
          {
            var tv = (data.Texture2DMS)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
            obj["arg3"] = toJSON(tv._3);
          }
          break;
        case TextureType.Tag.TextureBuffer:
          obj["tag"] = "TextureBuffer";
          {
            var tv = (data.TextureBuffer)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(MipMap v) {
      var obj = new JObject();
      switch (v.tag) { 
        case MipMap.Tag.Mip:
          obj["tag"] = "Mip";
          {
            var tv = (data.Mip)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case MipMap.Tag.NoMip:
          obj["tag"] = "NoMip";
          break;
        case MipMap.Tag.AutoMip:
          obj["tag"] = "AutoMip";
          {
            var tv = (data.AutoMip)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Filter v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Filter.Tag.Nearest:
          obj["tag"] = "Nearest";
          break;
        case Filter.Tag.Linear:
          obj["tag"] = "Linear";
          break;
        case Filter.Tag.NearestMipmapNearest:
          obj["tag"] = "NearestMipmapNearest";
          break;
        case Filter.Tag.NearestMipmapLinear:
          obj["tag"] = "NearestMipmapLinear";
          break;
        case Filter.Tag.LinearMipmapNearest:
          obj["tag"] = "LinearMipmapNearest";
          break;
        case Filter.Tag.LinearMipmapLinear:
          obj["tag"] = "LinearMipmapLinear";
          break;
      }
      return obj;
    }
    JToken toJSON(EdgeMode v) {
      var obj = new JObject();
      switch (v.tag) { 
        case EdgeMode.Tag.Repeat:
          obj["tag"] = "Repeat";
          break;
        case EdgeMode.Tag.MirroredRepeat:
          obj["tag"] = "MirroredRepeat";
          break;
        case EdgeMode.Tag.ClampToEdge:
          obj["tag"] = "ClampToEdge";
          break;
        case EdgeMode.Tag.ClampToBorder:
          obj["tag"] = "ClampToBorder";
          break;
      }
      return obj;
    }
    JToken toJSON(ImageSemantic v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ImageSemantic.Tag.Depth:
          obj["tag"] = "Depth";
          break;
        case ImageSemantic.Tag.Stencil:
          obj["tag"] = "Stencil";
          break;
        case ImageSemantic.Tag.Color:
          obj["tag"] = "Color";
          break;
      }
      return obj;
    }
    JToken toJSON(ImageRef v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ImageRef.Tag.TextureImage:
          obj["tag"] = "TextureImage";
          {
            var tv = (data.TextureImage)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
          }
          break;
        case ImageRef.Tag.Framebuffer:
          obj["tag"] = "Framebuffer";
          {
            var tv = (data.Framebuffer)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(ClearImage v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ClearImage.Tag.ClearImage:
          obj["tag"] = "ClearImage";
          {
            var tv = (data.ClearImage)v;
            obj["imageSemantic"] = toJSON(tv.imageSemantic);
            obj["clearValue"] = toJSON(tv.clearValue);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Command v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Command.Tag.SetRasterContext:
          obj["tag"] = "SetRasterContext";
          {
            var tv = (data.SetRasterContext)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.SetAccumulationContext:
          obj["tag"] = "SetAccumulationContext";
          {
            var tv = (data.SetAccumulationContext)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.SetRenderTarget:
          obj["tag"] = "SetRenderTarget";
          {
            var tv = (data.SetRenderTarget)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.SetProgram:
          obj["tag"] = "SetProgram";
          {
            var tv = (data.SetProgram)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.SetSamplerUniform:
          obj["tag"] = "SetSamplerUniform";
          {
            var tv = (data.SetSamplerUniform)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case Command.Tag.SetTexture:
          obj["tag"] = "SetTexture";
          {
            var tv = (data.SetTexture)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case Command.Tag.SetSampler:
          obj["tag"] = "SetSampler";
          {
            var tv = (data.SetSampler)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case Command.Tag.RenderSlot:
          obj["tag"] = "RenderSlot";
          {
            var tv = (data.RenderSlot)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.RenderStream:
          obj["tag"] = "RenderStream";
          {
            var tv = (data.RenderStream)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.ClearRenderTarget:
          obj["tag"] = "ClearRenderTarget";
          {
            var tv = (data.ClearRenderTarget)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.GenerateMipMap:
          obj["tag"] = "GenerateMipMap";
          {
            var tv = (data.GenerateMipMap)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case Command.Tag.SaveImage:
          obj["tag"] = "SaveImage";
          {
            var tv = (data.SaveImage)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
        case Command.Tag.LoadImage:
          obj["tag"] = "LoadImage";
          {
            var tv = (data.LoadImage)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(SamplerDescriptor v) {
      var obj = new JObject();
      switch (v.tag) { 
        case SamplerDescriptor.Tag.SamplerDescriptor:
          obj["tag"] = "SamplerDescriptor";
          {
            var tv = (data.SamplerDescriptor)v;
            obj["samplerWrapS"] = toJSON(tv.samplerWrapS);
            obj["samplerWrapT"] = toJSON(tv.samplerWrapT);
            obj["samplerWrapR"] = toJSON(tv.samplerWrapR);
            obj["samplerMinFilter"] = toJSON(tv.samplerMinFilter);
            obj["samplerMagFilter"] = toJSON(tv.samplerMagFilter);
            obj["samplerBorderColor"] = toJSON(tv.samplerBorderColor);
            obj["samplerMinLod"] = toJSON(tv.samplerMinLod);
            obj["samplerMaxLod"] = toJSON(tv.samplerMaxLod);
            obj["samplerLodBias"] = toJSON(tv.samplerLodBias);
            obj["samplerCompareFunc"] = toJSON(tv.samplerCompareFunc);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(TextureDescriptor v) {
      var obj = new JObject();
      switch (v.tag) { 
        case TextureDescriptor.Tag.TextureDescriptor:
          obj["tag"] = "TextureDescriptor";
          {
            var tv = (data.TextureDescriptor)v;
            obj["textureType"] = toJSON(tv.textureType);
            obj["textureSize"] = toJSON(tv.textureSize);
            obj["textureSemantic"] = toJSON(tv.textureSemantic);
            obj["textureSampler"] = toJSON(tv.textureSampler);
            obj["textureBaseLevel"] = toJSON(tv.textureBaseLevel);
            obj["textureMaxLevel"] = toJSON(tv.textureMaxLevel);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Parameter v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Parameter.Tag.Parameter:
          obj["tag"] = "Parameter";
          {
            var tv = (data.Parameter)v;
            obj["name"] = toJSON(tv.name);
            obj["ty"] = toJSON(tv.ty);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Program v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Program.Tag.Program:
          obj["tag"] = "Program";
          {
            var tv = (data.Program)v;
            obj["programUniforms"] = toJSON(tv.programUniforms);
            obj["programStreams"] = toJSON(tv.programStreams);
            obj["programInTextures"] = toJSON(tv.programInTextures);
            obj["programOutput"] = toJSON(tv.programOutput);
            obj["vertexShader"] = toJSON(tv.vertexShader);
            obj["geometryShader"] = toJSON(tv.geometryShader);
            obj["fragmentShader"] = toJSON(tv.fragmentShader);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Slot v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Slot.Tag.Slot:
          obj["tag"] = "Slot";
          {
            var tv = (data.Slot)v;
            obj["slotName"] = toJSON(tv.slotName);
            obj["slotStreams"] = toJSON(tv.slotStreams);
            obj["slotUniforms"] = toJSON(tv.slotUniforms);
            obj["slotPrimitive"] = toJSON(tv.slotPrimitive);
            obj["slotPrograms"] = toJSON(tv.slotPrograms);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(StreamData v) {
      var obj = new JObject();
      switch (v.tag) { 
        case StreamData.Tag.StreamData:
          obj["tag"] = "StreamData";
          {
            var tv = (data.StreamData)v;
            obj["streamData"] = toJSON(tv.streamData);
            obj["streamType"] = toJSON(tv.streamType);
            obj["streamPrimitive"] = toJSON(tv.streamPrimitive);
            obj["streamPrograms"] = toJSON(tv.streamPrograms);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(TargetItem v) {
      var obj = new JObject();
      switch (v.tag) { 
        case TargetItem.Tag.TargetItem:
          obj["tag"] = "TargetItem";
          {
            var tv = (data.TargetItem)v;
            obj["targetSemantic"] = toJSON(tv.targetSemantic);
            obj["targetRef"] = toJSON(tv.targetRef);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(RenderTarget v) {
      var obj = new JObject();
      switch (v.tag) { 
        case RenderTarget.Tag.RenderTarget:
          obj["tag"] = "RenderTarget";
          {
            var tv = (data.RenderTarget)v;
            obj["renderTargets"] = toJSON(tv.renderTargets);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Backend v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Backend.Tag.WebGL1:
          obj["tag"] = "WebGL1";
          break;
        case Backend.Tag.OpenGL33:
          obj["tag"] = "OpenGL33";
          break;
      }
      return obj;
    }
    JToken toJSON(Pipeline v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Pipeline.Tag.Pipeline:
          obj["tag"] = "Pipeline";
          {
            var tv = (data.Pipeline)v;
            obj["info"] = toJSON(tv.info);
            obj["backend"] = toJSON(tv.backend);
            obj["textures"] = toJSON(tv.textures);
            obj["samplers"] = toJSON(tv.samplers);
            obj["targets"] = toJSON(tv.targets);
            obj["programs"] = toJSON(tv.programs);
            obj["slots"] = toJSON(tv.slots);
            obj["streams"] = toJSON(tv.streams);
            obj["commands"] = toJSON(tv.commands);
          }
          break;
      }
      return obj;
    }

    JToken toJSON(int v) { return new JValue(v); }
    JToken toJSON(uint v) { return new JValue(v); }
    JToken toJSON(float v) { return new JValue(v); }
    JToken toJSON(bool v) { return new JValue(v); }
    JToken toJSON(string v) { return new JValue(v); }
    JToken toJSON(V2<int> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V2<uint> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V2<float> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V2<bool> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V2<V2<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V2<V3<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V2<V4<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    JToken toJSON(V3<int> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V3<uint> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V3<float> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V3<bool> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V3<V2<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V3<V3<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V3<V4<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    JToken toJSON(V4<int> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(V4<uint> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(V4<float> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(V4<bool> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(V4<V2<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(V4<V3<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(V4<V4<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    JToken toJSON(List<int> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<uint> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<float> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<bool> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.ClearImage> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.Command> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.Parameter> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.Program> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.RenderTarget> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.SamplerDescriptor> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.Slot> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.StreamData> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.TargetItem> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.TextureDescriptor> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.IR.FragmentOperation> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(Maybe<int> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    JToken toJSON(Maybe<float> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    JToken toJSON(Maybe<string> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    JToken toJSON(Maybe<global::LambdaCube.IR.ComparisonFunction> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    JToken toJSON(Maybe<global::LambdaCube.IR.EdgeMode> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    JToken toJSON(Maybe<global::LambdaCube.IR.ImageRef> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    JToken toJSON(Dictionary<string, global::LambdaCube.IR.ArrayValue> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    JToken toJSON(Dictionary<string, global::LambdaCube.IR.InputType> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    JToken toJSON(Dictionary<string, global::LambdaCube.IR.Parameter> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
  }
}
