// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

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
        OpenGL33,
        DirectX11
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
        case Type.Array_Int: return ((JArray)obj).Select(x => (int)fromJSON (Type.Int, x)).ToList();
        case Type.Array_Int32: return ((JArray)obj).Select(x => (int)fromJSON (Type.Int32, x)).ToList();
        case Type.Array_Word32: return ((JArray)obj).Select(x => (uint)fromJSON (Type.Word32, x)).ToList();
        case Type.Array_Float: return ((JArray)obj).Select(x => (float)fromJSON (Type.Float, x)).ToList();
        case Type.Array_Bool: return ((JArray)obj).Select(x => (bool)fromJSON (Type.Bool, x)).ToList();
        case Type.Array_ClearImage: return ((JArray)obj).Select(x => (global::LambdaCube.IR.ClearImage)fromJSON (Type.ClearImage, x)).ToList();
        case Type.Array_Command: return ((JArray)obj).Select(x => (global::LambdaCube.IR.Command)fromJSON (Type.Command, x)).ToList();
        case Type.Array_Parameter: return ((JArray)obj).Select(x => (global::LambdaCube.IR.Parameter)fromJSON (Type.Parameter, x)).ToList();
        case Type.Array_Program: return ((JArray)obj).Select(x => (global::LambdaCube.IR.Program)fromJSON (Type.Program, x)).ToList();
        case Type.Array_RenderTarget: return ((JArray)obj).Select(x => (global::LambdaCube.IR.RenderTarget)fromJSON (Type.RenderTarget, x)).ToList();
        case Type.Array_SamplerDescriptor: return ((JArray)obj).Select(x => (global::LambdaCube.IR.SamplerDescriptor)fromJSON (Type.SamplerDescriptor, x)).ToList();
        case Type.Array_Slot: return ((JArray)obj).Select(x => (global::LambdaCube.IR.Slot)fromJSON (Type.Slot, x)).ToList();
        case Type.Array_StreamData: return ((JArray)obj).Select(x => (global::LambdaCube.IR.StreamData)fromJSON (Type.StreamData, x)).ToList();
        case Type.Array_TargetItem: return ((JArray)obj).Select(x => (global::LambdaCube.IR.TargetItem)fromJSON (Type.TargetItem, x)).ToList();
        case Type.Array_TextureDescriptor: return ((JArray)obj).Select(x => (global::LambdaCube.IR.TextureDescriptor)fromJSON (Type.TextureDescriptor, x)).ToList();
        case Type.List_FragmentOperation: return ((JArray)obj).Select(x => (global::LambdaCube.IR.FragmentOperation)fromJSON (Type.FragmentOperation, x)).ToList();
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
          switch (tag) {
            case "VBoolArray": {
              data.VBoolArray tv = new data.VBoolArray();
              tv._0 = (List<bool>)fromJSON(Type.Array_Bool,obj["arg0"]);
              return tv;
            }
            case "VIntArray": {
              data.VIntArray tv = new data.VIntArray();
              tv._0 = (List<int>)fromJSON(Type.Array_Int32,obj["arg0"]);
              return tv;
            }
            case "VWordArray": {
              data.VWordArray tv = new data.VWordArray();
              tv._0 = (List<uint>)fromJSON(Type.Array_Word32,obj["arg0"]);
              return tv;
            }
            case "VFloatArray": {
              data.VFloatArray tv = new data.VFloatArray();
              tv._0 = (List<float>)fromJSON(Type.Array_Float,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Value: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "VBool": {
              data.VBool tv = new data.VBool();
              tv._0 = (bool)fromJSON(Type.Bool,obj["arg0"]);
              return tv;
            }
            case "VV2B": {
              data.VV2B tv = new data.VV2B();
              tv._0 = (V2<bool>)fromJSON(Type.V2_Bool,obj["arg0"]);
              return tv;
            }
            case "VV3B": {
              data.VV3B tv = new data.VV3B();
              tv._0 = (V3<bool>)fromJSON(Type.V3_Bool,obj["arg0"]);
              return tv;
            }
            case "VV4B": {
              data.VV4B tv = new data.VV4B();
              tv._0 = (V4<bool>)fromJSON(Type.V4_Bool,obj["arg0"]);
              return tv;
            }
            case "VWord": {
              data.VWord tv = new data.VWord();
              tv._0 = (uint)fromJSON(Type.Word32,obj["arg0"]);
              return tv;
            }
            case "VV2U": {
              data.VV2U tv = new data.VV2U();
              tv._0 = (V2<uint>)fromJSON(Type.V2_Word,obj["arg0"]);
              return tv;
            }
            case "VV3U": {
              data.VV3U tv = new data.VV3U();
              tv._0 = (V3<uint>)fromJSON(Type.V3_Word,obj["arg0"]);
              return tv;
            }
            case "VV4U": {
              data.VV4U tv = new data.VV4U();
              tv._0 = (V4<uint>)fromJSON(Type.V4_Word,obj["arg0"]);
              return tv;
            }
            case "VInt": {
              data.VInt tv = new data.VInt();
              tv._0 = (int)fromJSON(Type.Int32,obj["arg0"]);
              return tv;
            }
            case "VV2I": {
              data.VV2I tv = new data.VV2I();
              tv._0 = (V2<int>)fromJSON(Type.V2_Int,obj["arg0"]);
              return tv;
            }
            case "VV3I": {
              data.VV3I tv = new data.VV3I();
              tv._0 = (V3<int>)fromJSON(Type.V3_Int,obj["arg0"]);
              return tv;
            }
            case "VV4I": {
              data.VV4I tv = new data.VV4I();
              tv._0 = (V4<int>)fromJSON(Type.V4_Int,obj["arg0"]);
              return tv;
            }
            case "VFloat": {
              data.VFloat tv = new data.VFloat();
              tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
              return tv;
            }
            case "VV2F": {
              data.VV2F tv = new data.VV2F();
              tv._0 = (V2<float>)fromJSON(Type.V2_Float,obj["arg0"]);
              return tv;
            }
            case "VV3F": {
              data.VV3F tv = new data.VV3F();
              tv._0 = (V3<float>)fromJSON(Type.V3_Float,obj["arg0"]);
              return tv;
            }
            case "VV4F": {
              data.VV4F tv = new data.VV4F();
              tv._0 = (V4<float>)fromJSON(Type.V4_Float,obj["arg0"]);
              return tv;
            }
            case "VM22F": {
              data.VM22F tv = new data.VM22F();
              tv._0 = (V2<V2<float>>)fromJSON(Type.V2_V2_Float,obj["arg0"]);
              return tv;
            }
            case "VM23F": {
              data.VM23F tv = new data.VM23F();
              tv._0 = (V3<V2<float>>)fromJSON(Type.V3_V2_Float,obj["arg0"]);
              return tv;
            }
            case "VM24F": {
              data.VM24F tv = new data.VM24F();
              tv._0 = (V4<V2<float>>)fromJSON(Type.V4_V2_Float,obj["arg0"]);
              return tv;
            }
            case "VM32F": {
              data.VM32F tv = new data.VM32F();
              tv._0 = (V2<V3<float>>)fromJSON(Type.V2_V3_Float,obj["arg0"]);
              return tv;
            }
            case "VM33F": {
              data.VM33F tv = new data.VM33F();
              tv._0 = (V3<V3<float>>)fromJSON(Type.V3_V3_Float,obj["arg0"]);
              return tv;
            }
            case "VM34F": {
              data.VM34F tv = new data.VM34F();
              tv._0 = (V4<V3<float>>)fromJSON(Type.V4_V3_Float,obj["arg0"]);
              return tv;
            }
            case "VM42F": {
              data.VM42F tv = new data.VM42F();
              tv._0 = (V2<V4<float>>)fromJSON(Type.V2_V4_Float,obj["arg0"]);
              return tv;
            }
            case "VM43F": {
              data.VM43F tv = new data.VM43F();
              tv._0 = (V3<V4<float>>)fromJSON(Type.V3_V4_Float,obj["arg0"]);
              return tv;
            }
            case "VM44F": {
              data.VM44F tv = new data.VM44F();
              tv._0 = (V4<V4<float>>)fromJSON(Type.V4_V4_Float,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.InputType: {
          string tag = (string)obj["tag"];
          InputType.Tag tagType;
          switch (tag) {
            case "Bool": tagType = InputType.Tag.Bool; break;
            case "V2B": tagType = InputType.Tag.V2B; break;
            case "V3B": tagType = InputType.Tag.V3B; break;
            case "V4B": tagType = InputType.Tag.V4B; break;
            case "Word": tagType = InputType.Tag.Word; break;
            case "V2U": tagType = InputType.Tag.V2U; break;
            case "V3U": tagType = InputType.Tag.V3U; break;
            case "V4U": tagType = InputType.Tag.V4U; break;
            case "Int": tagType = InputType.Tag.Int; break;
            case "V2I": tagType = InputType.Tag.V2I; break;
            case "V3I": tagType = InputType.Tag.V3I; break;
            case "V4I": tagType = InputType.Tag.V4I; break;
            case "Float": tagType = InputType.Tag.Float; break;
            case "V2F": tagType = InputType.Tag.V2F; break;
            case "V3F": tagType = InputType.Tag.V3F; break;
            case "V4F": tagType = InputType.Tag.V4F; break;
            case "M22F": tagType = InputType.Tag.M22F; break;
            case "M23F": tagType = InputType.Tag.M23F; break;
            case "M24F": tagType = InputType.Tag.M24F; break;
            case "M32F": tagType = InputType.Tag.M32F; break;
            case "M33F": tagType = InputType.Tag.M33F; break;
            case "M34F": tagType = InputType.Tag.M34F; break;
            case "M42F": tagType = InputType.Tag.M42F; break;
            case "M43F": tagType = InputType.Tag.M43F; break;
            case "M44F": tagType = InputType.Tag.M44F; break;
            case "STexture1D": tagType = InputType.Tag.STexture1D; break;
            case "STexture2D": tagType = InputType.Tag.STexture2D; break;
            case "STextureCube": tagType = InputType.Tag.STextureCube; break;
            case "STexture1DArray": tagType = InputType.Tag.STexture1DArray; break;
            case "STexture2DArray": tagType = InputType.Tag.STexture2DArray; break;
            case "STexture2DRect": tagType = InputType.Tag.STexture2DRect; break;
            case "FTexture1D": tagType = InputType.Tag.FTexture1D; break;
            case "FTexture2D": tagType = InputType.Tag.FTexture2D; break;
            case "FTexture3D": tagType = InputType.Tag.FTexture3D; break;
            case "FTextureCube": tagType = InputType.Tag.FTextureCube; break;
            case "FTexture1DArray": tagType = InputType.Tag.FTexture1DArray; break;
            case "FTexture2DArray": tagType = InputType.Tag.FTexture2DArray; break;
            case "FTexture2DMS": tagType = InputType.Tag.FTexture2DMS; break;
            case "FTexture2DMSArray": tagType = InputType.Tag.FTexture2DMSArray; break;
            case "FTextureBuffer": tagType = InputType.Tag.FTextureBuffer; break;
            case "FTexture2DRect": tagType = InputType.Tag.FTexture2DRect; break;
            case "ITexture1D": tagType = InputType.Tag.ITexture1D; break;
            case "ITexture2D": tagType = InputType.Tag.ITexture2D; break;
            case "ITexture3D": tagType = InputType.Tag.ITexture3D; break;
            case "ITextureCube": tagType = InputType.Tag.ITextureCube; break;
            case "ITexture1DArray": tagType = InputType.Tag.ITexture1DArray; break;
            case "ITexture2DArray": tagType = InputType.Tag.ITexture2DArray; break;
            case "ITexture2DMS": tagType = InputType.Tag.ITexture2DMS; break;
            case "ITexture2DMSArray": tagType = InputType.Tag.ITexture2DMSArray; break;
            case "ITextureBuffer": tagType = InputType.Tag.ITextureBuffer; break;
            case "ITexture2DRect": tagType = InputType.Tag.ITexture2DRect; break;
            case "UTexture1D": tagType = InputType.Tag.UTexture1D; break;
            case "UTexture2D": tagType = InputType.Tag.UTexture2D; break;
            case "UTexture3D": tagType = InputType.Tag.UTexture3D; break;
            case "UTextureCube": tagType = InputType.Tag.UTextureCube; break;
            case "UTexture1DArray": tagType = InputType.Tag.UTexture1DArray; break;
            case "UTexture2DArray": tagType = InputType.Tag.UTexture2DArray; break;
            case "UTexture2DMS": tagType = InputType.Tag.UTexture2DMS; break;
            case "UTexture2DMSArray": tagType = InputType.Tag.UTexture2DMSArray; break;
            case "UTextureBuffer": tagType = InputType.Tag.UTextureBuffer; break;
            case "UTexture2DRect": tagType = InputType.Tag.UTexture2DRect; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          InputType o = new InputType();
          o.tag = tagType;
          return o;
        }
        case Type.PointSpriteCoordOrigin: {
          string tag = (string)obj["tag"];
          PointSpriteCoordOrigin.Tag tagType;
          switch (tag) {
            case "LowerLeft": tagType = PointSpriteCoordOrigin.Tag.LowerLeft; break;
            case "UpperLeft": tagType = PointSpriteCoordOrigin.Tag.UpperLeft; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          PointSpriteCoordOrigin o = new PointSpriteCoordOrigin();
          o.tag = tagType;
          return o;
        }
        case Type.PointSize: {
          string tag = (string)obj["tag"];
          PointSize.Tag tagType;
          switch (tag) {
            case "PointSize": {
              data.PointSize tv = new data.PointSize();
              tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
              return tv;
            }
            case "ProgramPointSize": tagType = PointSize.Tag.ProgramPointSize; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          PointSize o = new PointSize();
          o.tag = tagType;
          return o;
        }
        case Type.PolygonOffset: {
          string tag = (string)obj["tag"];
          PolygonOffset.Tag tagType;
          switch (tag) {
            case "NoOffset": tagType = PolygonOffset.Tag.NoOffset; break;
            case "Offset": {
              data.Offset tv = new data.Offset();
              tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
              tv._1 = (float)fromJSON(Type.Float,obj["arg1"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
          PolygonOffset o = new PolygonOffset();
          o.tag = tagType;
          return o;
        }
        case Type.FrontFace: {
          string tag = (string)obj["tag"];
          FrontFace.Tag tagType;
          switch (tag) {
            case "CCW": tagType = FrontFace.Tag.CCW; break;
            case "CW": tagType = FrontFace.Tag.CW; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          FrontFace o = new FrontFace();
          o.tag = tagType;
          return o;
        }
        case Type.PolygonMode: {
          string tag = (string)obj["tag"];
          PolygonMode.Tag tagType;
          switch (tag) {
            case "PolygonPoint": {
              data.PolygonPoint tv = new data.PolygonPoint();
              tv._0 = (global::LambdaCube.IR.PointSize)fromJSON(Type.PointSize,obj["arg0"]);
              return tv;
            }
            case "PolygonLine": {
              data.PolygonLine tv = new data.PolygonLine();
              tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
              return tv;
            }
            case "PolygonFill": tagType = PolygonMode.Tag.PolygonFill; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          PolygonMode o = new PolygonMode();
          o.tag = tagType;
          return o;
        }
        case Type.ProvokingVertex: {
          string tag = (string)obj["tag"];
          ProvokingVertex.Tag tagType;
          switch (tag) {
            case "FirstVertex": tagType = ProvokingVertex.Tag.FirstVertex; break;
            case "LastVertex": tagType = ProvokingVertex.Tag.LastVertex; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          ProvokingVertex o = new ProvokingVertex();
          o.tag = tagType;
          return o;
        }
        case Type.CullMode: {
          string tag = (string)obj["tag"];
          CullMode.Tag tagType;
          switch (tag) {
            case "CullNone": tagType = CullMode.Tag.CullNone; break;
            case "CullFront": {
              data.CullFront tv = new data.CullFront();
              tv._0 = (global::LambdaCube.IR.FrontFace)fromJSON(Type.FrontFace,obj["arg0"]);
              return tv;
            }
            case "CullBack": {
              data.CullBack tv = new data.CullBack();
              tv._0 = (global::LambdaCube.IR.FrontFace)fromJSON(Type.FrontFace,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
          CullMode o = new CullMode();
          o.tag = tagType;
          return o;
        }
        case Type.ComparisonFunction: {
          string tag = (string)obj["tag"];
          ComparisonFunction.Tag tagType;
          switch (tag) {
            case "Never": tagType = ComparisonFunction.Tag.Never; break;
            case "Less": tagType = ComparisonFunction.Tag.Less; break;
            case "Equal": tagType = ComparisonFunction.Tag.Equal; break;
            case "Lequal": tagType = ComparisonFunction.Tag.Lequal; break;
            case "Greater": tagType = ComparisonFunction.Tag.Greater; break;
            case "Notequal": tagType = ComparisonFunction.Tag.Notequal; break;
            case "Gequal": tagType = ComparisonFunction.Tag.Gequal; break;
            case "Always": tagType = ComparisonFunction.Tag.Always; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          ComparisonFunction o = new ComparisonFunction();
          o.tag = tagType;
          return o;
        }
        case Type.StencilOperation: {
          string tag = (string)obj["tag"];
          StencilOperation.Tag tagType;
          switch (tag) {
            case "OpZero": tagType = StencilOperation.Tag.OpZero; break;
            case "OpKeep": tagType = StencilOperation.Tag.OpKeep; break;
            case "OpReplace": tagType = StencilOperation.Tag.OpReplace; break;
            case "OpIncr": tagType = StencilOperation.Tag.OpIncr; break;
            case "OpIncrWrap": tagType = StencilOperation.Tag.OpIncrWrap; break;
            case "OpDecr": tagType = StencilOperation.Tag.OpDecr; break;
            case "OpDecrWrap": tagType = StencilOperation.Tag.OpDecrWrap; break;
            case "OpInvert": tagType = StencilOperation.Tag.OpInvert; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          StencilOperation o = new StencilOperation();
          o.tag = tagType;
          return o;
        }
        case Type.BlendEquation: {
          string tag = (string)obj["tag"];
          BlendEquation.Tag tagType;
          switch (tag) {
            case "FuncAdd": tagType = BlendEquation.Tag.FuncAdd; break;
            case "FuncSubtract": tagType = BlendEquation.Tag.FuncSubtract; break;
            case "FuncReverseSubtract": tagType = BlendEquation.Tag.FuncReverseSubtract; break;
            case "Min": tagType = BlendEquation.Tag.Min; break;
            case "Max": tagType = BlendEquation.Tag.Max; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          BlendEquation o = new BlendEquation();
          o.tag = tagType;
          return o;
        }
        case Type.BlendingFactor: {
          string tag = (string)obj["tag"];
          BlendingFactor.Tag tagType;
          switch (tag) {
            case "Zero": tagType = BlendingFactor.Tag.Zero; break;
            case "One": tagType = BlendingFactor.Tag.One; break;
            case "SrcColor": tagType = BlendingFactor.Tag.SrcColor; break;
            case "OneMinusSrcColor": tagType = BlendingFactor.Tag.OneMinusSrcColor; break;
            case "DstColor": tagType = BlendingFactor.Tag.DstColor; break;
            case "OneMinusDstColor": tagType = BlendingFactor.Tag.OneMinusDstColor; break;
            case "SrcAlpha": tagType = BlendingFactor.Tag.SrcAlpha; break;
            case "OneMinusSrcAlpha": tagType = BlendingFactor.Tag.OneMinusSrcAlpha; break;
            case "DstAlpha": tagType = BlendingFactor.Tag.DstAlpha; break;
            case "OneMinusDstAlpha": tagType = BlendingFactor.Tag.OneMinusDstAlpha; break;
            case "ConstantColor": tagType = BlendingFactor.Tag.ConstantColor; break;
            case "OneMinusConstantColor": tagType = BlendingFactor.Tag.OneMinusConstantColor; break;
            case "ConstantAlpha": tagType = BlendingFactor.Tag.ConstantAlpha; break;
            case "OneMinusConstantAlpha": tagType = BlendingFactor.Tag.OneMinusConstantAlpha; break;
            case "SrcAlphaSaturate": tagType = BlendingFactor.Tag.SrcAlphaSaturate; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          BlendingFactor o = new BlendingFactor();
          o.tag = tagType;
          return o;
        }
        case Type.LogicOperation: {
          string tag = (string)obj["tag"];
          LogicOperation.Tag tagType;
          switch (tag) {
            case "Clear": tagType = LogicOperation.Tag.Clear; break;
            case "And": tagType = LogicOperation.Tag.And; break;
            case "AndReverse": tagType = LogicOperation.Tag.AndReverse; break;
            case "Copy": tagType = LogicOperation.Tag.Copy; break;
            case "AndInverted": tagType = LogicOperation.Tag.AndInverted; break;
            case "Noop": tagType = LogicOperation.Tag.Noop; break;
            case "Xor": tagType = LogicOperation.Tag.Xor; break;
            case "Or": tagType = LogicOperation.Tag.Or; break;
            case "Nor": tagType = LogicOperation.Tag.Nor; break;
            case "Equiv": tagType = LogicOperation.Tag.Equiv; break;
            case "Invert": tagType = LogicOperation.Tag.Invert; break;
            case "OrReverse": tagType = LogicOperation.Tag.OrReverse; break;
            case "CopyInverted": tagType = LogicOperation.Tag.CopyInverted; break;
            case "OrInverted": tagType = LogicOperation.Tag.OrInverted; break;
            case "Nand": tagType = LogicOperation.Tag.Nand; break;
            case "Set": tagType = LogicOperation.Tag.Set; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          LogicOperation o = new LogicOperation();
          o.tag = tagType;
          return o;
        }
        case Type.StencilOps: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "StencilOps": {
              data.StencilOps tv = new data.StencilOps();
              tv.frontStencilOp = (global::LambdaCube.IR.StencilOperation)fromJSON(Type.StencilOperation,obj["frontStencilOp"]);
              tv.backStencilOp = (global::LambdaCube.IR.StencilOperation)fromJSON(Type.StencilOperation,obj["backStencilOp"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.StencilTest: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "StencilTest": {
              data.StencilTest tv = new data.StencilTest();
              tv.stencilComparision = (global::LambdaCube.IR.ComparisonFunction)fromJSON(Type.ComparisonFunction,obj["stencilComparision"]);
              tv.stencilReference = (int)fromJSON(Type.Int32,obj["stencilReference"]);
              tv.stencilMask = (uint)fromJSON(Type.Word32,obj["stencilMask"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.StencilTests: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "StencilTests": {
              data.StencilTests tv = new data.StencilTests();
              tv._0 = (global::LambdaCube.IR.StencilTest)fromJSON(Type.StencilTest,obj["arg0"]);
              tv._1 = (global::LambdaCube.IR.StencilTest)fromJSON(Type.StencilTest,obj["arg1"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.FetchPrimitive: {
          string tag = (string)obj["tag"];
          FetchPrimitive.Tag tagType;
          switch (tag) {
            case "Points": tagType = FetchPrimitive.Tag.Points; break;
            case "Lines": tagType = FetchPrimitive.Tag.Lines; break;
            case "Triangles": tagType = FetchPrimitive.Tag.Triangles; break;
            case "LinesAdjacency": tagType = FetchPrimitive.Tag.LinesAdjacency; break;
            case "TrianglesAdjacency": tagType = FetchPrimitive.Tag.TrianglesAdjacency; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          FetchPrimitive o = new FetchPrimitive();
          o.tag = tagType;
          return o;
        }
        case Type.OutputPrimitive: {
          string tag = (string)obj["tag"];
          OutputPrimitive.Tag tagType;
          switch (tag) {
            case "TrianglesOutput": tagType = OutputPrimitive.Tag.TrianglesOutput; break;
            case "LinesOutput": tagType = OutputPrimitive.Tag.LinesOutput; break;
            case "PointsOutput": tagType = OutputPrimitive.Tag.PointsOutput; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          OutputPrimitive o = new OutputPrimitive();
          o.tag = tagType;
          return o;
        }
        case Type.ColorArity: {
          string tag = (string)obj["tag"];
          ColorArity.Tag tagType;
          switch (tag) {
            case "Red": tagType = ColorArity.Tag.Red; break;
            case "RG": tagType = ColorArity.Tag.RG; break;
            case "RGB": tagType = ColorArity.Tag.RGB; break;
            case "RGBA": tagType = ColorArity.Tag.RGBA; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          ColorArity o = new ColorArity();
          o.tag = tagType;
          return o;
        }
        case Type.Blending: {
          string tag = (string)obj["tag"];
          Blending.Tag tagType;
          switch (tag) {
            case "NoBlending": tagType = Blending.Tag.NoBlending; break;
            case "BlendLogicOp": {
              data.BlendLogicOp tv = new data.BlendLogicOp();
              tv._0 = (global::LambdaCube.IR.LogicOperation)fromJSON(Type.LogicOperation,obj["arg0"]);
              return tv;
            }
            case "Blend": {
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
            default: throw new Exception("unknown constructor: " + tag);
          }
          Blending o = new Blending();
          o.tag = tagType;
          return o;
        }
        case Type.RasterContext: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "PointCtx": {
              data.PointCtx tv = new data.PointCtx();
              tv._0 = (global::LambdaCube.IR.PointSize)fromJSON(Type.PointSize,obj["arg0"]);
              tv._1 = (float)fromJSON(Type.Float,obj["arg1"]);
              tv._2 = (global::LambdaCube.IR.PointSpriteCoordOrigin)fromJSON(Type.PointSpriteCoordOrigin,obj["arg2"]);
              return tv;
            }
            case "LineCtx": {
              data.LineCtx tv = new data.LineCtx();
              tv._0 = (float)fromJSON(Type.Float,obj["arg0"]);
              tv._1 = (global::LambdaCube.IR.ProvokingVertex)fromJSON(Type.ProvokingVertex,obj["arg1"]);
              return tv;
            }
            case "TriangleCtx": {
              data.TriangleCtx tv = new data.TriangleCtx();
              tv._0 = (global::LambdaCube.IR.CullMode)fromJSON(Type.CullMode,obj["arg0"]);
              tv._1 = (global::LambdaCube.IR.PolygonMode)fromJSON(Type.PolygonMode,obj["arg1"]);
              tv._2 = (global::LambdaCube.IR.PolygonOffset)fromJSON(Type.PolygonOffset,obj["arg2"]);
              tv._3 = (global::LambdaCube.IR.ProvokingVertex)fromJSON(Type.ProvokingVertex,obj["arg3"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.FragmentOperation: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "DepthOp": {
              data.DepthOp tv = new data.DepthOp();
              tv._0 = (global::LambdaCube.IR.ComparisonFunction)fromJSON(Type.ComparisonFunction,obj["arg0"]);
              tv._1 = (bool)fromJSON(Type.Bool,obj["arg1"]);
              return tv;
            }
            case "StencilOp": {
              data.StencilOp tv = new data.StencilOp();
              tv._0 = (global::LambdaCube.IR.StencilTests)fromJSON(Type.StencilTests,obj["arg0"]);
              tv._1 = (global::LambdaCube.IR.StencilOps)fromJSON(Type.StencilOps,obj["arg1"]);
              tv._2 = (global::LambdaCube.IR.StencilOps)fromJSON(Type.StencilOps,obj["arg2"]);
              return tv;
            }
            case "ColorOp": {
              data.ColorOp tv = new data.ColorOp();
              tv._0 = (global::LambdaCube.IR.Blending)fromJSON(Type.Blending,obj["arg0"]);
              tv._1 = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["arg1"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.AccumulationContext: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "AccumulationContext": {
              data.AccumulationContext tv = new data.AccumulationContext();
              tv.accViewportName = (Maybe<string>)fromJSON(Type.Maybe_String,obj["accViewportName"]);
              tv.accOperations = (List<global::LambdaCube.IR.FragmentOperation>)fromJSON(Type.List_FragmentOperation,obj["accOperations"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.TextureDataType: {
          string tag = (string)obj["tag"];
          TextureDataType.Tag tagType;
          switch (tag) {
            case "FloatT": {
              data.FloatT tv = new data.FloatT();
              tv._0 = (global::LambdaCube.IR.ColorArity)fromJSON(Type.ColorArity,obj["arg0"]);
              return tv;
            }
            case "IntT": {
              data.IntT tv = new data.IntT();
              tv._0 = (global::LambdaCube.IR.ColorArity)fromJSON(Type.ColorArity,obj["arg0"]);
              return tv;
            }
            case "WordT": {
              data.WordT tv = new data.WordT();
              tv._0 = (global::LambdaCube.IR.ColorArity)fromJSON(Type.ColorArity,obj["arg0"]);
              return tv;
            }
            case "ShadowT": tagType = TextureDataType.Tag.ShadowT; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          TextureDataType o = new TextureDataType();
          o.tag = tagType;
          return o;
        }
        case Type.TextureType: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Texture1D": {
              data.Texture1D tv = new data.Texture1D();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            case "Texture2D": {
              data.Texture2D tv = new data.Texture2D();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            case "Texture3D": {
              data.Texture3D tv = new data.Texture3D();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              return tv;
            }
            case "TextureCube": {
              data.TextureCube tv = new data.TextureCube();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              return tv;
            }
            case "TextureRect": {
              data.TextureRect tv = new data.TextureRect();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              return tv;
            }
            case "Texture2DMS": {
              data.Texture2DMS tv = new data.Texture2DMS();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              tv._2 = (int)fromJSON(Type.Int,obj["arg2"]);
              tv._3 = (bool)fromJSON(Type.Bool,obj["arg3"]);
              return tv;
            }
            case "TextureBuffer": {
              data.TextureBuffer tv = new data.TextureBuffer();
              tv._0 = (global::LambdaCube.IR.TextureDataType)fromJSON(Type.TextureDataType,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.MipMap: {
          string tag = (string)obj["tag"];
          MipMap.Tag tagType;
          switch (tag) {
            case "Mip": {
              data.Mip tv = new data.Mip();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            case "NoMip": tagType = MipMap.Tag.NoMip; break;
            case "AutoMip": {
              data.AutoMip tv = new data.AutoMip();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
          MipMap o = new MipMap();
          o.tag = tagType;
          return o;
        }
        case Type.Filter: {
          string tag = (string)obj["tag"];
          Filter.Tag tagType;
          switch (tag) {
            case "Nearest": tagType = Filter.Tag.Nearest; break;
            case "Linear": tagType = Filter.Tag.Linear; break;
            case "NearestMipmapNearest": tagType = Filter.Tag.NearestMipmapNearest; break;
            case "NearestMipmapLinear": tagType = Filter.Tag.NearestMipmapLinear; break;
            case "LinearMipmapNearest": tagType = Filter.Tag.LinearMipmapNearest; break;
            case "LinearMipmapLinear": tagType = Filter.Tag.LinearMipmapLinear; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          Filter o = new Filter();
          o.tag = tagType;
          return o;
        }
        case Type.EdgeMode: {
          string tag = (string)obj["tag"];
          EdgeMode.Tag tagType;
          switch (tag) {
            case "Repeat": tagType = EdgeMode.Tag.Repeat; break;
            case "MirroredRepeat": tagType = EdgeMode.Tag.MirroredRepeat; break;
            case "ClampToEdge": tagType = EdgeMode.Tag.ClampToEdge; break;
            case "ClampToBorder": tagType = EdgeMode.Tag.ClampToBorder; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          EdgeMode o = new EdgeMode();
          o.tag = tagType;
          return o;
        }
        case Type.ImageSemantic: {
          string tag = (string)obj["tag"];
          ImageSemantic.Tag tagType;
          switch (tag) {
            case "Depth": tagType = ImageSemantic.Tag.Depth; break;
            case "Stencil": tagType = ImageSemantic.Tag.Stencil; break;
            case "Color": tagType = ImageSemantic.Tag.Color; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          ImageSemantic o = new ImageSemantic();
          o.tag = tagType;
          return o;
        }
        case Type.ImageRef: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "TextureImage": {
              data.TextureImage tv = new data.TextureImage();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              tv._2 = (Maybe<int>)fromJSON(Type.Maybe_Int,obj["arg2"]);
              return tv;
            }
            case "Framebuffer": {
              data.Framebuffer tv = new data.Framebuffer();
              tv._0 = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.ClearImage: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "ClearImage": {
              data.ClearImage tv = new data.ClearImage();
              tv.imageSemantic = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["imageSemantic"]);
              tv.clearValue = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["clearValue"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Command: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "SetRasterContext": {
              data.SetRasterContext tv = new data.SetRasterContext();
              tv._0 = (global::LambdaCube.IR.RasterContext)fromJSON(Type.RasterContext,obj["arg0"]);
              return tv;
            }
            case "SetAccumulationContext": {
              data.SetAccumulationContext tv = new data.SetAccumulationContext();
              tv._0 = (global::LambdaCube.IR.AccumulationContext)fromJSON(Type.AccumulationContext,obj["arg0"]);
              return tv;
            }
            case "SetRenderTarget": {
              data.SetRenderTarget tv = new data.SetRenderTarget();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              return tv;
            }
            case "SetProgram": {
              data.SetProgram tv = new data.SetProgram();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              return tv;
            }
            case "SetSamplerUniform": {
              data.SetSamplerUniform tv = new data.SetSamplerUniform();
              tv._0 = (string)fromJSON(Type.String,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            case "SetTexture": {
              data.SetTexture tv = new data.SetTexture();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            case "SetSampler": {
              data.SetSampler tv = new data.SetSampler();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              tv._1 = (Maybe<int>)fromJSON(Type.Maybe_Int,obj["arg1"]);
              return tv;
            }
            case "RenderSlot": {
              data.RenderSlot tv = new data.RenderSlot();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              return tv;
            }
            case "RenderStream": {
              data.RenderStream tv = new data.RenderStream();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              return tv;
            }
            case "ClearRenderTarget": {
              data.ClearRenderTarget tv = new data.ClearRenderTarget();
              tv._0 = (List<global::LambdaCube.IR.ClearImage>)fromJSON(Type.Array_ClearImage,obj["arg0"]);
              return tv;
            }
            case "GenerateMipMap": {
              data.GenerateMipMap tv = new data.GenerateMipMap();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              return tv;
            }
            case "SaveImage": {
              data.SaveImage tv = new data.SaveImage();
              tv._0 = (int)fromJSON(Type.Int,obj["arg0"]);
              tv._1 = (global::LambdaCube.IR.ImageRef)fromJSON(Type.ImageRef,obj["arg1"]);
              return tv;
            }
            case "LoadImage": {
              data.LoadImage tv = new data.LoadImage();
              tv._0 = (global::LambdaCube.IR.ImageRef)fromJSON(Type.ImageRef,obj["arg0"]);
              tv._1 = (int)fromJSON(Type.Int,obj["arg1"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.SamplerDescriptor: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "SamplerDescriptor": {
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
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.TextureDescriptor: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "TextureDescriptor": {
              data.TextureDescriptor tv = new data.TextureDescriptor();
              tv.textureType = (global::LambdaCube.IR.TextureType)fromJSON(Type.TextureType,obj["textureType"]);
              tv.textureSize = (global::LambdaCube.IR.Value)fromJSON(Type.Value,obj["textureSize"]);
              tv.textureSemantic = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["textureSemantic"]);
              tv.textureSampler = (global::LambdaCube.IR.SamplerDescriptor)fromJSON(Type.SamplerDescriptor,obj["textureSampler"]);
              tv.textureBaseLevel = (int)fromJSON(Type.Int,obj["textureBaseLevel"]);
              tv.textureMaxLevel = (int)fromJSON(Type.Int,obj["textureMaxLevel"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Parameter: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Parameter": {
              data.Parameter tv = new data.Parameter();
              tv.name = (string)fromJSON(Type.String,obj["name"]);
              tv.ty = (global::LambdaCube.IR.InputType)fromJSON(Type.InputType,obj["ty"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Program: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Program": {
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
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Slot: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Slot": {
              data.Slot tv = new data.Slot();
              tv.slotName = (string)fromJSON(Type.String,obj["slotName"]);
              tv.slotStreams = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["slotStreams"]);
              tv.slotUniforms = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["slotUniforms"]);
              tv.slotPrimitive = (global::LambdaCube.IR.FetchPrimitive)fromJSON(Type.FetchPrimitive,obj["slotPrimitive"]);
              tv.slotPrograms = (List<int>)fromJSON(Type.Array_Int,obj["slotPrograms"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.StreamData: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "StreamData": {
              data.StreamData tv = new data.StreamData();
              tv.streamData = (Dictionary<string, global::LambdaCube.IR.ArrayValue>)fromJSON(Type.Map_String_ArrayValue,obj["streamData"]);
              tv.streamType = (Dictionary<string, global::LambdaCube.IR.InputType>)fromJSON(Type.Map_String_InputType,obj["streamType"]);
              tv.streamPrimitive = (global::LambdaCube.IR.FetchPrimitive)fromJSON(Type.FetchPrimitive,obj["streamPrimitive"]);
              tv.streamPrograms = (List<int>)fromJSON(Type.Array_Int,obj["streamPrograms"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.TargetItem: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "TargetItem": {
              data.TargetItem tv = new data.TargetItem();
              tv.targetSemantic = (global::LambdaCube.IR.ImageSemantic)fromJSON(Type.ImageSemantic,obj["targetSemantic"]);
              tv.targetRef = (Maybe<global::LambdaCube.IR.ImageRef>)fromJSON(Type.Maybe_ImageRef,obj["targetRef"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.RenderTarget: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "RenderTarget": {
              data.RenderTarget tv = new data.RenderTarget();
              tv.renderTargets = (List<global::LambdaCube.IR.TargetItem>)fromJSON(Type.Array_TargetItem,obj["renderTargets"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Backend: {
          string tag = (string)obj["tag"];
          Backend.Tag tagType;
          switch (tag) {
            case "WebGL1": tagType = Backend.Tag.WebGL1; break;
            case "OpenGL33": tagType = Backend.Tag.OpenGL33; break;
            case "DirectX11": tagType = Backend.Tag.DirectX11; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          Backend o = new Backend();
          o.tag = tagType;
          return o;
        }
        case Type.Pipeline: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Pipeline": {
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
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    public static JToken toJSON(ArrayValue v) {
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
    public static JToken toJSON(Value v) {
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
    public static JToken toJSON(InputType v) {
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
    public static JToken toJSON(PointSpriteCoordOrigin v) {
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
    public static JToken toJSON(PointSize v) {
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
    public static JToken toJSON(PolygonOffset v) {
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
    public static JToken toJSON(FrontFace v) {
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
    public static JToken toJSON(PolygonMode v) {
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
    public static JToken toJSON(ProvokingVertex v) {
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
    public static JToken toJSON(CullMode v) {
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
    public static JToken toJSON(ComparisonFunction v) {
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
    public static JToken toJSON(StencilOperation v) {
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
    public static JToken toJSON(BlendEquation v) {
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
    public static JToken toJSON(BlendingFactor v) {
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
    public static JToken toJSON(LogicOperation v) {
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
    public static JToken toJSON(StencilOps v) {
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
    public static JToken toJSON(StencilTest v) {
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
    public static JToken toJSON(StencilTests v) {
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
    public static JToken toJSON(FetchPrimitive v) {
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
    public static JToken toJSON(OutputPrimitive v) {
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
    public static JToken toJSON(ColorArity v) {
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
    public static JToken toJSON(Blending v) {
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
    public static JToken toJSON(RasterContext v) {
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
    public static JToken toJSON(FragmentOperation v) {
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
    public static JToken toJSON(AccumulationContext v) {
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
    public static JToken toJSON(TextureDataType v) {
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
    public static JToken toJSON(TextureType v) {
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
    public static JToken toJSON(MipMap v) {
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
    public static JToken toJSON(Filter v) {
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
    public static JToken toJSON(EdgeMode v) {
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
    public static JToken toJSON(ImageSemantic v) {
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
    public static JToken toJSON(ImageRef v) {
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
    public static JToken toJSON(ClearImage v) {
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
    public static JToken toJSON(Command v) {
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
    public static JToken toJSON(SamplerDescriptor v) {
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
    public static JToken toJSON(TextureDescriptor v) {
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
    public static JToken toJSON(Parameter v) {
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
    public static JToken toJSON(Program v) {
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
    public static JToken toJSON(Slot v) {
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
    public static JToken toJSON(StreamData v) {
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
    public static JToken toJSON(TargetItem v) {
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
    public static JToken toJSON(RenderTarget v) {
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
    public static JToken toJSON(Backend v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Backend.Tag.WebGL1:
          obj["tag"] = "WebGL1";
          break;
        case Backend.Tag.OpenGL33:
          obj["tag"] = "OpenGL33";
          break;
        case Backend.Tag.DirectX11:
          obj["tag"] = "DirectX11";
          break;
      }
      return obj;
    }
    public static JToken toJSON(Pipeline v) {
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

    public static JToken toJSON(int v) { return new JValue(v); }
    public static JToken toJSON(uint v) { return new JValue(v); }
    public static JToken toJSON(float v) { return new JValue(v); }
    public static JToken toJSON(bool v) { return new JValue(v); }
    public static JToken toJSON(string v) { return new JValue(v); }
    public static JToken toJSON(V2<int> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V2<uint> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V2<float> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V2<bool> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V2<V2<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V2<V3<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V2<V4<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      return obj;
    }
    public static JToken toJSON(V3<int> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V3<uint> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V3<float> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V3<bool> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V3<V2<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V3<V3<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V3<V4<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      return obj;
    }
    public static JToken toJSON(V4<int> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(V4<uint> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(V4<float> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(V4<bool> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(V4<V2<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(V4<V3<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(V4<V4<float>> v) {
      var obj = new JObject();
      obj["x"] = toJSON(v.x);
      obj["y"] = toJSON(v.y);
      obj["z"] = toJSON(v.z);
      obj["w"] = toJSON(v.w);
      return obj;
    }
    public static JToken toJSON(List<int> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<uint> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<float> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<bool> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.ClearImage> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.Command> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.Parameter> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.Program> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.RenderTarget> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.SamplerDescriptor> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.Slot> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.StreamData> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.TargetItem> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.TextureDescriptor> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.IR.FragmentOperation> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(Maybe<int> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    public static JToken toJSON(Maybe<float> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    public static JToken toJSON(Maybe<string> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    public static JToken toJSON(Maybe<global::LambdaCube.IR.ComparisonFunction> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    public static JToken toJSON(Maybe<global::LambdaCube.IR.EdgeMode> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    public static JToken toJSON(Maybe<global::LambdaCube.IR.ImageRef> v) {
      if (v.valid) {
        return toJSON(v.data);
      }
      return new JValue((string)null);
    }
    public static JToken toJSON(Dictionary<string, global::LambdaCube.IR.ArrayValue> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, global::LambdaCube.IR.InputType> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, global::LambdaCube.IR.Parameter> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
  }
}
