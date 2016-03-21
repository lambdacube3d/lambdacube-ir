// generated file, do not modify!
// 2016-03-21T13:31:09.634879000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.*;
import RT.*;


public class JSON {
  // JSON deserializer
  public enum Type { 
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

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case Int: return (Integer)rawObj;
      case Int32: return (Integer)rawObj;
      case Word: return (Integer)rawObj;
      case Word32: return (Integer)rawObj;
      case Float: return (Float)rawObj;
      case Bool: return (Boolean)rawObj;
      case String: return (String)rawObj;
      case V2_Int: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<Integer>
          ( (Integer)fromJSON(Type.Int,obj.get("x"))
          , (Integer)fromJSON(Type.Int,obj.get("y"))
          );
      }
      case V2_Word: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<Integer>
          ( (Integer)fromJSON(Type.Word,obj.get("x"))
          , (Integer)fromJSON(Type.Word,obj.get("y"))
          );
      }
      case V2_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<Float>
          ( (Float)fromJSON(Type.Float,obj.get("x"))
          , (Float)fromJSON(Type.Float,obj.get("y"))
          );
      }
      case V2_Bool: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<Boolean>
          ( (Boolean)fromJSON(Type.Bool,obj.get("x"))
          , (Boolean)fromJSON(Type.Bool,obj.get("y"))
          );
      }
      case V2_V2_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<V2<Float>>
          ( (V2<Float>)fromJSON(Type.V2_Float,obj.get("x"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("y"))
          );
      }
      case V2_V3_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<V3<Float>>
          ( (V3<Float>)fromJSON(Type.V3_Float,obj.get("x"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("y"))
          );
      }
      case V2_V4_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<V4<Float>>
          ( (V4<Float>)fromJSON(Type.V4_Float,obj.get("x"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("y"))
          );
      }
      case V3_Int: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<Integer>
          ( (Integer)fromJSON(Type.Int,obj.get("x"))
          , (Integer)fromJSON(Type.Int,obj.get("y"))
          , (Integer)fromJSON(Type.Int,obj.get("z"))
          );
      }
      case V3_Word: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<Integer>
          ( (Integer)fromJSON(Type.Word,obj.get("x"))
          , (Integer)fromJSON(Type.Word,obj.get("y"))
          , (Integer)fromJSON(Type.Word,obj.get("z"))
          );
      }
      case V3_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<Float>
          ( (Float)fromJSON(Type.Float,obj.get("x"))
          , (Float)fromJSON(Type.Float,obj.get("y"))
          , (Float)fromJSON(Type.Float,obj.get("z"))
          );
      }
      case V3_Bool: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<Boolean>
          ( (Boolean)fromJSON(Type.Bool,obj.get("x"))
          , (Boolean)fromJSON(Type.Bool,obj.get("y"))
          , (Boolean)fromJSON(Type.Bool,obj.get("z"))
          );
      }
      case V3_V2_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<V2<Float>>
          ( (V2<Float>)fromJSON(Type.V2_Float,obj.get("x"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("y"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("z"))
          );
      }
      case V3_V3_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<V3<Float>>
          ( (V3<Float>)fromJSON(Type.V3_Float,obj.get("x"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("y"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("z"))
          );
      }
      case V3_V4_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<V4<Float>>
          ( (V4<Float>)fromJSON(Type.V4_Float,obj.get("x"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("y"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("z"))
          );
      }
      case V4_Int: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<Integer>
          ( (Integer)fromJSON(Type.Int,obj.get("x"))
          , (Integer)fromJSON(Type.Int,obj.get("y"))
          , (Integer)fromJSON(Type.Int,obj.get("z"))
          , (Integer)fromJSON(Type.Int,obj.get("w"))
          );
      }
      case V4_Word: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<Integer>
          ( (Integer)fromJSON(Type.Word,obj.get("x"))
          , (Integer)fromJSON(Type.Word,obj.get("y"))
          , (Integer)fromJSON(Type.Word,obj.get("z"))
          , (Integer)fromJSON(Type.Word,obj.get("w"))
          );
      }
      case V4_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<Float>
          ( (Float)fromJSON(Type.Float,obj.get("x"))
          , (Float)fromJSON(Type.Float,obj.get("y"))
          , (Float)fromJSON(Type.Float,obj.get("z"))
          , (Float)fromJSON(Type.Float,obj.get("w"))
          );
      }
      case V4_Bool: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<Boolean>
          ( (Boolean)fromJSON(Type.Bool,obj.get("x"))
          , (Boolean)fromJSON(Type.Bool,obj.get("y"))
          , (Boolean)fromJSON(Type.Bool,obj.get("z"))
          , (Boolean)fromJSON(Type.Bool,obj.get("w"))
          );
      }
      case V4_V2_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<V2<Float>>
          ( (V2<Float>)fromJSON(Type.V2_Float,obj.get("x"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("y"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("z"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("w"))
          );
      }
      case V4_V3_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<V3<Float>>
          ( (V3<Float>)fromJSON(Type.V3_Float,obj.get("x"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("y"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("z"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("w"))
          );
      }
      case V4_V4_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<V4<Float>>
          ( (V4<Float>)fromJSON(Type.V4_Float,obj.get("x"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("y"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("z"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("w"))
          );
      }
//      case Array_Int: return ((JArray)obj).Select(x => fromJSON (Type.Int, x)).ToList();
//      case Array_Int32: return ((JArray)obj).Select(x => fromJSON (Type.Int32, x)).ToList();
//      case Array_Word32: return ((JArray)obj).Select(x => fromJSON (Type.Word32, x)).ToList();
//      case Array_Float: return ((JArray)obj).Select(x => fromJSON (Type.Float, x)).ToList();
//      case Array_Bool: return ((JArray)obj).Select(x => fromJSON (Type.Bool, x)).ToList();
//      case Array_ClearImage: return ((JArray)obj).Select(x => fromJSON (Type.ClearImage, x)).ToList();
//      case Array_Command: return ((JArray)obj).Select(x => fromJSON (Type.Command, x)).ToList();
//      case Array_Parameter: return ((JArray)obj).Select(x => fromJSON (Type.Parameter, x)).ToList();
//      case Array_Program: return ((JArray)obj).Select(x => fromJSON (Type.Program, x)).ToList();
//      case Array_RenderTarget: return ((JArray)obj).Select(x => fromJSON (Type.RenderTarget, x)).ToList();
//      case Array_SamplerDescriptor: return ((JArray)obj).Select(x => fromJSON (Type.SamplerDescriptor, x)).ToList();
//      case Array_Slot: return ((JArray)obj).Select(x => fromJSON (Type.Slot, x)).ToList();
//      case Array_StreamData: return ((JArray)obj).Select(x => fromJSON (Type.StreamData, x)).ToList();
//      case Array_TargetItem: return ((JArray)obj).Select(x => fromJSON (Type.TargetItem, x)).ToList();
//      case Array_TextureDescriptor: return ((JArray)obj).Select(x => fromJSON (Type.TextureDescriptor, x)).ToList();
//      case List_FragmentOperation: return ((JArray)obj).Select(x => fromJSON (Type.FragmentOperation, x)).ToList();
/*
      case Maybe_Int: {
        var m = new Maybe<Integer> ();
        if (obj == null || obj.Type == JTokenType.Null) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (Integer)fromJSON (Type.Int,obj);
        }
        return m;
      }
*/
/*
      case Maybe_Float: {
        var m = new Maybe<Float> ();
        if (obj == null || obj.Type == JTokenType.Null) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (Float)fromJSON (Type.Float,obj);
        }
        return m;
      }
*/
/*
      case Maybe_String: {
        var m = new Maybe<String> ();
        if (obj == null || obj.Type == JTokenType.Null) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (String)fromJSON (Type.String,obj);
        }
        return m;
      }
*/
/*
      case Maybe_ComparisonFunction: {
        var m = new Maybe<ComparisonFunction> ();
        if (obj == null || obj.Type == JTokenType.Null) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (ComparisonFunction)fromJSON (Type.ComparisonFunction,obj);
        }
        return m;
      }
*/
/*
      case Maybe_EdgeMode: {
        var m = new Maybe<EdgeMode> ();
        if (obj == null || obj.Type == JTokenType.Null) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (EdgeMode)fromJSON (Type.EdgeMode,obj);
        }
        return m;
      }
*/
/*
      case Maybe_ImageRef: {
        var m = new Maybe<ImageRef> ();
        if (obj == null || obj.Type == JTokenType.Null) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (ImageRef)fromJSON (Type.ImageRef,obj);
        }
        return m;
      }
*/
/*
      case Map_String_ArrayValue: {
        var map = new HashMap<String, ArrayValue> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (ArrayValue)fromJSON(Type.ArrayValue,i.Value));
        }
        return map;
      }
*/
/*
      case Map_String_InputType: {
        var map = new HashMap<String, InputType> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (InputType)fromJSON(Type.InputType,i.Value));
        }
        return map;
      }
*/
/*
      case Map_String_Parameter: {
        var map = new HashMap<String, Parameter> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (Parameter)fromJSON(Type.Parameter,i.Value));
        }
        return map;
      }
*/

      case ArrayValue: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "VBoolArray": {
            ArrayValue.VBoolArray_ tv = new ArrayValue().new VBoolArray_();
            tv._0 = (ArrayList<Boolean>)fromJSON(Type.Array_Bool,obj.get("arg0"));
            return tv;
          }
          case "VIntArray": {
            ArrayValue.VIntArray_ tv = new ArrayValue().new VIntArray_();
            tv._0 = (ArrayList<Integer>)fromJSON(Type.Array_Int32,obj.get("arg0"));
            return tv;
          }
          case "VWordArray": {
            ArrayValue.VWordArray_ tv = new ArrayValue().new VWordArray_();
            tv._0 = (ArrayList<Integer>)fromJSON(Type.Array_Word32,obj.get("arg0"));
            return tv;
          }
          case "VFloatArray": {
            ArrayValue.VFloatArray_ tv = new ArrayValue().new VFloatArray_();
            tv._0 = (ArrayList<Float>)fromJSON(Type.Array_Float,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Value: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "VBool": {
            Value.VBool_ tv = new Value().new VBool_();
            tv._0 = (Boolean)fromJSON(Type.Bool,obj.get("arg0"));
            return tv;
          }
          case "VV2B": {
            Value.VV2B_ tv = new Value().new VV2B_();
            tv._0 = (V2<Boolean>)fromJSON(Type.V2_Bool,obj.get("arg0"));
            return tv;
          }
          case "VV3B": {
            Value.VV3B_ tv = new Value().new VV3B_();
            tv._0 = (V3<Boolean>)fromJSON(Type.V3_Bool,obj.get("arg0"));
            return tv;
          }
          case "VV4B": {
            Value.VV4B_ tv = new Value().new VV4B_();
            tv._0 = (V4<Boolean>)fromJSON(Type.V4_Bool,obj.get("arg0"));
            return tv;
          }
          case "VWord": {
            Value.VWord_ tv = new Value().new VWord_();
            tv._0 = (Integer)fromJSON(Type.Word32,obj.get("arg0"));
            return tv;
          }
          case "VV2U": {
            Value.VV2U_ tv = new Value().new VV2U_();
            tv._0 = (V2<Integer>)fromJSON(Type.V2_Word,obj.get("arg0"));
            return tv;
          }
          case "VV3U": {
            Value.VV3U_ tv = new Value().new VV3U_();
            tv._0 = (V3<Integer>)fromJSON(Type.V3_Word,obj.get("arg0"));
            return tv;
          }
          case "VV4U": {
            Value.VV4U_ tv = new Value().new VV4U_();
            tv._0 = (V4<Integer>)fromJSON(Type.V4_Word,obj.get("arg0"));
            return tv;
          }
          case "VInt": {
            Value.VInt_ tv = new Value().new VInt_();
            tv._0 = (Integer)fromJSON(Type.Int32,obj.get("arg0"));
            return tv;
          }
          case "VV2I": {
            Value.VV2I_ tv = new Value().new VV2I_();
            tv._0 = (V2<Integer>)fromJSON(Type.V2_Int,obj.get("arg0"));
            return tv;
          }
          case "VV3I": {
            Value.VV3I_ tv = new Value().new VV3I_();
            tv._0 = (V3<Integer>)fromJSON(Type.V3_Int,obj.get("arg0"));
            return tv;
          }
          case "VV4I": {
            Value.VV4I_ tv = new Value().new VV4I_();
            tv._0 = (V4<Integer>)fromJSON(Type.V4_Int,obj.get("arg0"));
            return tv;
          }
          case "VFloat": {
            Value.VFloat_ tv = new Value().new VFloat_();
            tv._0 = (Float)fromJSON(Type.Float,obj.get("arg0"));
            return tv;
          }
          case "VV2F": {
            Value.VV2F_ tv = new Value().new VV2F_();
            tv._0 = (V2<Float>)fromJSON(Type.V2_Float,obj.get("arg0"));
            return tv;
          }
          case "VV3F": {
            Value.VV3F_ tv = new Value().new VV3F_();
            tv._0 = (V3<Float>)fromJSON(Type.V3_Float,obj.get("arg0"));
            return tv;
          }
          case "VV4F": {
            Value.VV4F_ tv = new Value().new VV4F_();
            tv._0 = (V4<Float>)fromJSON(Type.V4_Float,obj.get("arg0"));
            return tv;
          }
          case "VM22F": {
            Value.VM22F_ tv = new Value().new VM22F_();
            tv._0 = (V2<V2<Float>>)fromJSON(Type.V2_V2_Float,obj.get("arg0"));
            return tv;
          }
          case "VM23F": {
            Value.VM23F_ tv = new Value().new VM23F_();
            tv._0 = (V3<V2<Float>>)fromJSON(Type.V3_V2_Float,obj.get("arg0"));
            return tv;
          }
          case "VM24F": {
            Value.VM24F_ tv = new Value().new VM24F_();
            tv._0 = (V4<V2<Float>>)fromJSON(Type.V4_V2_Float,obj.get("arg0"));
            return tv;
          }
          case "VM32F": {
            Value.VM32F_ tv = new Value().new VM32F_();
            tv._0 = (V2<V3<Float>>)fromJSON(Type.V2_V3_Float,obj.get("arg0"));
            return tv;
          }
          case "VM33F": {
            Value.VM33F_ tv = new Value().new VM33F_();
            tv._0 = (V3<V3<Float>>)fromJSON(Type.V3_V3_Float,obj.get("arg0"));
            return tv;
          }
          case "VM34F": {
            Value.VM34F_ tv = new Value().new VM34F_();
            tv._0 = (V4<V3<Float>>)fromJSON(Type.V4_V3_Float,obj.get("arg0"));
            return tv;
          }
          case "VM42F": {
            Value.VM42F_ tv = new Value().new VM42F_();
            tv._0 = (V2<V4<Float>>)fromJSON(Type.V2_V4_Float,obj.get("arg0"));
            return tv;
          }
          case "VM43F": {
            Value.VM43F_ tv = new Value().new VM43F_();
            tv._0 = (V3<V4<Float>>)fromJSON(Type.V3_V4_Float,obj.get("arg0"));
            return tv;
          }
          case "VM44F": {
            Value.VM44F_ tv = new Value().new VM44F_();
            tv._0 = (V4<V4<Float>>)fromJSON(Type.V4_V4_Float,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case InputType: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case PointSpriteCoordOrigin: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case PointSize: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        PointSize.Tag tagType;
        switch (tag) {
          case "PointSize": {
            PointSize.PointSize_ tv = new PointSize().new PointSize_();
            tv._0 = (Float)fromJSON(Type.Float,obj.get("arg0"));
            return tv;
          }
          case "ProgramPointSize": tagType = PointSize.Tag.ProgramPointSize; break;
          default: throw new Exception("unknown constructor: " + tag);
        }
        PointSize o = new PointSize();
        o.tag = tagType;
        return o;
      }
      case PolygonOffset: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        PolygonOffset.Tag tagType;
        switch (tag) {
          case "NoOffset": tagType = PolygonOffset.Tag.NoOffset; break;
          case "Offset": {
            PolygonOffset.Offset_ tv = new PolygonOffset().new Offset_();
            tv._0 = (Float)fromJSON(Type.Float,obj.get("arg0"));
            tv._1 = (Float)fromJSON(Type.Float,obj.get("arg1"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
        PolygonOffset o = new PolygonOffset();
        o.tag = tagType;
        return o;
      }
      case FrontFace: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case PolygonMode: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        PolygonMode.Tag tagType;
        switch (tag) {
          case "PolygonPoint": {
            PolygonMode.PolygonPoint_ tv = new PolygonMode().new PolygonPoint_();
            tv._0 = (PointSize)fromJSON(Type.PointSize,obj.get("arg0"));
            return tv;
          }
          case "PolygonLine": {
            PolygonMode.PolygonLine_ tv = new PolygonMode().new PolygonLine_();
            tv._0 = (Float)fromJSON(Type.Float,obj.get("arg0"));
            return tv;
          }
          case "PolygonFill": tagType = PolygonMode.Tag.PolygonFill; break;
          default: throw new Exception("unknown constructor: " + tag);
        }
        PolygonMode o = new PolygonMode();
        o.tag = tagType;
        return o;
      }
      case ProvokingVertex: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case CullMode: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        CullMode.Tag tagType;
        switch (tag) {
          case "CullNone": tagType = CullMode.Tag.CullNone; break;
          case "CullFront": {
            CullMode.CullFront_ tv = new CullMode().new CullFront_();
            tv._0 = (FrontFace)fromJSON(Type.FrontFace,obj.get("arg0"));
            return tv;
          }
          case "CullBack": {
            CullMode.CullBack_ tv = new CullMode().new CullBack_();
            tv._0 = (FrontFace)fromJSON(Type.FrontFace,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
        CullMode o = new CullMode();
        o.tag = tagType;
        return o;
      }
      case ComparisonFunction: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case StencilOperation: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case BlendEquation: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case BlendingFactor: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case LogicOperation: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case StencilOps: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "StencilOps": {
            StencilOps.StencilOps_ tv = new StencilOps().new StencilOps_();
            tv.frontStencilOp = (StencilOperation)fromJSON(Type.StencilOperation,obj.get("frontStencilOp"));
            tv.backStencilOp = (StencilOperation)fromJSON(Type.StencilOperation,obj.get("backStencilOp"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case StencilTest: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "StencilTest": {
            StencilTest.StencilTest_ tv = new StencilTest().new StencilTest_();
            tv.stencilComparision = (ComparisonFunction)fromJSON(Type.ComparisonFunction,obj.get("stencilComparision"));
            tv.stencilReference = (Integer)fromJSON(Type.Int32,obj.get("stencilReference"));
            tv.stencilMask = (Integer)fromJSON(Type.Word32,obj.get("stencilMask"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case StencilTests: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "StencilTests": {
            StencilTests.StencilTests_ tv = new StencilTests().new StencilTests_();
            tv._0 = (StencilTest)fromJSON(Type.StencilTest,obj.get("arg0"));
            tv._1 = (StencilTest)fromJSON(Type.StencilTest,obj.get("arg1"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case FetchPrimitive: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case OutputPrimitive: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case ColorArity: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case Blending: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        Blending.Tag tagType;
        switch (tag) {
          case "NoBlending": tagType = Blending.Tag.NoBlending; break;
          case "BlendLogicOp": {
            Blending.BlendLogicOp_ tv = new Blending().new BlendLogicOp_();
            tv._0 = (LogicOperation)fromJSON(Type.LogicOperation,obj.get("arg0"));
            return tv;
          }
          case "Blend": {
            Blending.Blend_ tv = new Blending().new Blend_();
            tv.colorEqSrc = (BlendEquation)fromJSON(Type.BlendEquation,obj.get("colorEqSrc"));
            tv.alphaEqSrc = (BlendEquation)fromJSON(Type.BlendEquation,obj.get("alphaEqSrc"));
            tv.colorFSrc = (BlendingFactor)fromJSON(Type.BlendingFactor,obj.get("colorFSrc"));
            tv.colorFDst = (BlendingFactor)fromJSON(Type.BlendingFactor,obj.get("colorFDst"));
            tv.alphaFSrc = (BlendingFactor)fromJSON(Type.BlendingFactor,obj.get("alphaFSrc"));
            tv.alphaFDst = (BlendingFactor)fromJSON(Type.BlendingFactor,obj.get("alphaFDst"));
            tv.color = (V4<Float>)fromJSON(Type.V4_Float,obj.get("color"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
        Blending o = new Blending();
        o.tag = tagType;
        return o;
      }
      case RasterContext: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "PointCtx": {
            RasterContext.PointCtx_ tv = new RasterContext().new PointCtx_();
            tv._0 = (PointSize)fromJSON(Type.PointSize,obj.get("arg0"));
            tv._1 = (Float)fromJSON(Type.Float,obj.get("arg1"));
            tv._2 = (PointSpriteCoordOrigin)fromJSON(Type.PointSpriteCoordOrigin,obj.get("arg2"));
            return tv;
          }
          case "LineCtx": {
            RasterContext.LineCtx_ tv = new RasterContext().new LineCtx_();
            tv._0 = (Float)fromJSON(Type.Float,obj.get("arg0"));
            tv._1 = (ProvokingVertex)fromJSON(Type.ProvokingVertex,obj.get("arg1"));
            return tv;
          }
          case "TriangleCtx": {
            RasterContext.TriangleCtx_ tv = new RasterContext().new TriangleCtx_();
            tv._0 = (CullMode)fromJSON(Type.CullMode,obj.get("arg0"));
            tv._1 = (PolygonMode)fromJSON(Type.PolygonMode,obj.get("arg1"));
            tv._2 = (PolygonOffset)fromJSON(Type.PolygonOffset,obj.get("arg2"));
            tv._3 = (ProvokingVertex)fromJSON(Type.ProvokingVertex,obj.get("arg3"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case FragmentOperation: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "DepthOp": {
            FragmentOperation.DepthOp_ tv = new FragmentOperation().new DepthOp_();
            tv._0 = (ComparisonFunction)fromJSON(Type.ComparisonFunction,obj.get("arg0"));
            tv._1 = (Boolean)fromJSON(Type.Bool,obj.get("arg1"));
            return tv;
          }
          case "StencilOp": {
            FragmentOperation.StencilOp_ tv = new FragmentOperation().new StencilOp_();
            tv._0 = (StencilTests)fromJSON(Type.StencilTests,obj.get("arg0"));
            tv._1 = (StencilOps)fromJSON(Type.StencilOps,obj.get("arg1"));
            tv._2 = (StencilOps)fromJSON(Type.StencilOps,obj.get("arg2"));
            return tv;
          }
          case "ColorOp": {
            FragmentOperation.ColorOp_ tv = new FragmentOperation().new ColorOp_();
            tv._0 = (Blending)fromJSON(Type.Blending,obj.get("arg0"));
            tv._1 = (Value)fromJSON(Type.Value,obj.get("arg1"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case AccumulationContext: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "AccumulationContext": {
            AccumulationContext.AccumulationContext_ tv = new AccumulationContext().new AccumulationContext_();
            tv.accViewportName = (Maybe<String>)fromJSON(Type.Maybe_String,obj.get("accViewportName"));
            tv.accOperations = (ArrayList<FragmentOperation>)fromJSON(Type.List_FragmentOperation,obj.get("accOperations"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case TextureDataType: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        TextureDataType.Tag tagType;
        switch (tag) {
          case "FloatT": {
            TextureDataType.FloatT_ tv = new TextureDataType().new FloatT_();
            tv._0 = (ColorArity)fromJSON(Type.ColorArity,obj.get("arg0"));
            return tv;
          }
          case "IntT": {
            TextureDataType.IntT_ tv = new TextureDataType().new IntT_();
            tv._0 = (ColorArity)fromJSON(Type.ColorArity,obj.get("arg0"));
            return tv;
          }
          case "WordT": {
            TextureDataType.WordT_ tv = new TextureDataType().new WordT_();
            tv._0 = (ColorArity)fromJSON(Type.ColorArity,obj.get("arg0"));
            return tv;
          }
          case "ShadowT": tagType = TextureDataType.Tag.ShadowT; break;
          default: throw new Exception("unknown constructor: " + tag);
        }
        TextureDataType o = new TextureDataType();
        o.tag = tagType;
        return o;
      }
      case TextureType: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Texture1D": {
            TextureType.Texture1D_ tv = new TextureType().new Texture1D_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          case "Texture2D": {
            TextureType.Texture2D_ tv = new TextureType().new Texture2D_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          case "Texture3D": {
            TextureType.Texture3D_ tv = new TextureType().new Texture3D_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            return tv;
          }
          case "TextureCube": {
            TextureType.TextureCube_ tv = new TextureType().new TextureCube_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            return tv;
          }
          case "TextureRect": {
            TextureType.TextureRect_ tv = new TextureType().new TextureRect_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            return tv;
          }
          case "Texture2DMS": {
            TextureType.Texture2DMS_ tv = new TextureType().new Texture2DMS_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            tv._2 = (Integer)fromJSON(Type.Int,obj.get("arg2"));
            tv._3 = (Boolean)fromJSON(Type.Bool,obj.get("arg3"));
            return tv;
          }
          case "TextureBuffer": {
            TextureType.TextureBuffer_ tv = new TextureType().new TextureBuffer_();
            tv._0 = (TextureDataType)fromJSON(Type.TextureDataType,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case MipMap: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        MipMap.Tag tagType;
        switch (tag) {
          case "Mip": {
            MipMap.Mip_ tv = new MipMap().new Mip_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          case "NoMip": tagType = MipMap.Tag.NoMip; break;
          case "AutoMip": {
            MipMap.AutoMip_ tv = new MipMap().new AutoMip_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
        MipMap o = new MipMap();
        o.tag = tagType;
        return o;
      }
      case Filter: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case EdgeMode: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case ImageSemantic: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case ImageRef: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "TextureImage": {
            ImageRef.TextureImage_ tv = new ImageRef().new TextureImage_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            tv._2 = (Maybe<Integer>)fromJSON(Type.Maybe_Int,obj.get("arg2"));
            return tv;
          }
          case "Framebuffer": {
            ImageRef.Framebuffer_ tv = new ImageRef().new Framebuffer_();
            tv._0 = (ImageSemantic)fromJSON(Type.ImageSemantic,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case ClearImage: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "ClearImage": {
            ClearImage.ClearImage_ tv = new ClearImage().new ClearImage_();
            tv.imageSemantic = (ImageSemantic)fromJSON(Type.ImageSemantic,obj.get("imageSemantic"));
            tv.clearValue = (Value)fromJSON(Type.Value,obj.get("clearValue"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Command: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "SetRasterContext": {
            Command.SetRasterContext_ tv = new Command().new SetRasterContext_();
            tv._0 = (RasterContext)fromJSON(Type.RasterContext,obj.get("arg0"));
            return tv;
          }
          case "SetAccumulationContext": {
            Command.SetAccumulationContext_ tv = new Command().new SetAccumulationContext_();
            tv._0 = (AccumulationContext)fromJSON(Type.AccumulationContext,obj.get("arg0"));
            return tv;
          }
          case "SetRenderTarget": {
            Command.SetRenderTarget_ tv = new Command().new SetRenderTarget_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            return tv;
          }
          case "SetProgram": {
            Command.SetProgram_ tv = new Command().new SetProgram_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            return tv;
          }
          case "SetSamplerUniform": {
            Command.SetSamplerUniform_ tv = new Command().new SetSamplerUniform_();
            tv._0 = (String)fromJSON(Type.String,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          case "SetTexture": {
            Command.SetTexture_ tv = new Command().new SetTexture_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          case "SetSampler": {
            Command.SetSampler_ tv = new Command().new SetSampler_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            tv._1 = (Maybe<Integer>)fromJSON(Type.Maybe_Int,obj.get("arg1"));
            return tv;
          }
          case "RenderSlot": {
            Command.RenderSlot_ tv = new Command().new RenderSlot_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            return tv;
          }
          case "RenderStream": {
            Command.RenderStream_ tv = new Command().new RenderStream_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            return tv;
          }
          case "ClearRenderTarget": {
            Command.ClearRenderTarget_ tv = new Command().new ClearRenderTarget_();
            tv._0 = (ArrayList<ClearImage>)fromJSON(Type.Array_ClearImage,obj.get("arg0"));
            return tv;
          }
          case "GenerateMipMap": {
            Command.GenerateMipMap_ tv = new Command().new GenerateMipMap_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            return tv;
          }
          case "SaveImage": {
            Command.SaveImage_ tv = new Command().new SaveImage_();
            tv._0 = (Integer)fromJSON(Type.Int,obj.get("arg0"));
            tv._1 = (ImageRef)fromJSON(Type.ImageRef,obj.get("arg1"));
            return tv;
          }
          case "LoadImage": {
            Command.LoadImage_ tv = new Command().new LoadImage_();
            tv._0 = (ImageRef)fromJSON(Type.ImageRef,obj.get("arg0"));
            tv._1 = (Integer)fromJSON(Type.Int,obj.get("arg1"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case SamplerDescriptor: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "SamplerDescriptor": {
            SamplerDescriptor.SamplerDescriptor_ tv = new SamplerDescriptor().new SamplerDescriptor_();
            tv.samplerWrapS = (EdgeMode)fromJSON(Type.EdgeMode,obj.get("samplerWrapS"));
            tv.samplerWrapT = (Maybe<EdgeMode>)fromJSON(Type.Maybe_EdgeMode,obj.get("samplerWrapT"));
            tv.samplerWrapR = (Maybe<EdgeMode>)fromJSON(Type.Maybe_EdgeMode,obj.get("samplerWrapR"));
            tv.samplerMinFilter = (Filter)fromJSON(Type.Filter,obj.get("samplerMinFilter"));
            tv.samplerMagFilter = (Filter)fromJSON(Type.Filter,obj.get("samplerMagFilter"));
            tv.samplerBorderColor = (Value)fromJSON(Type.Value,obj.get("samplerBorderColor"));
            tv.samplerMinLod = (Maybe<Float>)fromJSON(Type.Maybe_Float,obj.get("samplerMinLod"));
            tv.samplerMaxLod = (Maybe<Float>)fromJSON(Type.Maybe_Float,obj.get("samplerMaxLod"));
            tv.samplerLodBias = (Float)fromJSON(Type.Float,obj.get("samplerLodBias"));
            tv.samplerCompareFunc = (Maybe<ComparisonFunction>)fromJSON(Type.Maybe_ComparisonFunction,obj.get("samplerCompareFunc"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case TextureDescriptor: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "TextureDescriptor": {
            TextureDescriptor.TextureDescriptor_ tv = new TextureDescriptor().new TextureDescriptor_();
            tv.textureType = (TextureType)fromJSON(Type.TextureType,obj.get("textureType"));
            tv.textureSize = (Value)fromJSON(Type.Value,obj.get("textureSize"));
            tv.textureSemantic = (ImageSemantic)fromJSON(Type.ImageSemantic,obj.get("textureSemantic"));
            tv.textureSampler = (SamplerDescriptor)fromJSON(Type.SamplerDescriptor,obj.get("textureSampler"));
            tv.textureBaseLevel = (Integer)fromJSON(Type.Int,obj.get("textureBaseLevel"));
            tv.textureMaxLevel = (Integer)fromJSON(Type.Int,obj.get("textureMaxLevel"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Parameter: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Parameter": {
            Parameter.Parameter_ tv = new Parameter().new Parameter_();
            tv.name = (String)fromJSON(Type.String,obj.get("name"));
            tv.ty = (InputType)fromJSON(Type.InputType,obj.get("ty"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Program: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Program": {
            Program.Program_ tv = new Program().new Program_();
            tv.programUniforms = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("programUniforms"));
            tv.programStreams = (HashMap<String, Parameter>)fromJSON(Type.Map_String_Parameter,obj.get("programStreams"));
            tv.programInTextures = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("programInTextures"));
            tv.programOutput = (ArrayList<Parameter>)fromJSON(Type.Array_Parameter,obj.get("programOutput"));
            tv.vertexShader = (String)fromJSON(Type.String,obj.get("vertexShader"));
            tv.geometryShader = (Maybe<String>)fromJSON(Type.Maybe_String,obj.get("geometryShader"));
            tv.fragmentShader = (String)fromJSON(Type.String,obj.get("fragmentShader"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Slot: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Slot": {
            Slot.Slot_ tv = new Slot().new Slot_();
            tv.slotName = (String)fromJSON(Type.String,obj.get("slotName"));
            tv.slotStreams = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("slotStreams"));
            tv.slotUniforms = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("slotUniforms"));
            tv.slotPrimitive = (FetchPrimitive)fromJSON(Type.FetchPrimitive,obj.get("slotPrimitive"));
            tv.slotPrograms = (ArrayList<Integer>)fromJSON(Type.Array_Int,obj.get("slotPrograms"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case StreamData: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "StreamData": {
            StreamData.StreamData_ tv = new StreamData().new StreamData_();
            tv.streamData = (HashMap<String, ArrayValue>)fromJSON(Type.Map_String_ArrayValue,obj.get("streamData"));
            tv.streamType = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("streamType"));
            tv.streamPrimitive = (FetchPrimitive)fromJSON(Type.FetchPrimitive,obj.get("streamPrimitive"));
            tv.streamPrograms = (ArrayList<Integer>)fromJSON(Type.Array_Int,obj.get("streamPrograms"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case TargetItem: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "TargetItem": {
            TargetItem.TargetItem_ tv = new TargetItem().new TargetItem_();
            tv.targetSemantic = (ImageSemantic)fromJSON(Type.ImageSemantic,obj.get("targetSemantic"));
            tv.targetRef = (Maybe<ImageRef>)fromJSON(Type.Maybe_ImageRef,obj.get("targetRef"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case RenderTarget: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "RenderTarget": {
            RenderTarget.RenderTarget_ tv = new RenderTarget().new RenderTarget_();
            tv.renderTargets = (ArrayList<TargetItem>)fromJSON(Type.Array_TargetItem,obj.get("renderTargets"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Backend: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        Backend.Tag tagType;
        switch (tag) {
          case "WebGL1": tagType = Backend.Tag.WebGL1; break;
          case "OpenGL33": tagType = Backend.Tag.OpenGL33; break;
          default: throw new Exception("unknown constructor: " + tag);
        }
        Backend o = new Backend();
        o.tag = tagType;
        return o;
      }
      case Pipeline: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Pipeline": {
            Pipeline.Pipeline_ tv = new Pipeline().new Pipeline_();
            tv.info = (String)fromJSON(Type.String,obj.get("info"));
            tv.backend = (Backend)fromJSON(Type.Backend,obj.get("backend"));
            tv.textures = (ArrayList<TextureDescriptor>)fromJSON(Type.Array_TextureDescriptor,obj.get("textures"));
            tv.samplers = (ArrayList<SamplerDescriptor>)fromJSON(Type.Array_SamplerDescriptor,obj.get("samplers"));
            tv.targets = (ArrayList<RenderTarget>)fromJSON(Type.Array_RenderTarget,obj.get("targets"));
            tv.programs = (ArrayList<Program>)fromJSON(Type.Array_Program,obj.get("programs"));
            tv.slots = (ArrayList<Slot>)fromJSON(Type.Array_Slot,obj.get("slots"));
            tv.streams = (ArrayList<StreamData>)fromJSON(Type.Array_StreamData,obj.get("streams"));
            tv.commands = (ArrayList<Command>)fromJSON(Type.Array_Command,obj.get("commands"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
    }
    throw new Exception("unknown type");
  }
}