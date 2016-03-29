// generated file, do not modify!
// 2016-03-29T11:30:12.412728000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
      case Array_Int: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Integer> v = new ArrayList<Integer> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Integer)fromJSON (Type.Int, obj.get(i)));
        }
        return v;
      }
      case Array_Int32: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Integer> v = new ArrayList<Integer> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Integer)fromJSON (Type.Int32, obj.get(i)));
        }
        return v;
      }
      case Array_Word32: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Integer> v = new ArrayList<Integer> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Integer)fromJSON (Type.Word32, obj.get(i)));
        }
        return v;
      }
      case Array_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Float> v = new ArrayList<Float> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Float)fromJSON (Type.Float, obj.get(i)));
        }
        return v;
      }
      case Array_Bool: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Boolean> v = new ArrayList<Boolean> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Boolean)fromJSON (Type.Bool, obj.get(i)));
        }
        return v;
      }
      case Array_ClearImage: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<ClearImage> v = new ArrayList<ClearImage> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((ClearImage)fromJSON (Type.ClearImage, obj.get(i)));
        }
        return v;
      }
      case Array_Command: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Command> v = new ArrayList<Command> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Command)fromJSON (Type.Command, obj.get(i)));
        }
        return v;
      }
      case Array_Parameter: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Parameter> v = new ArrayList<Parameter> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Parameter)fromJSON (Type.Parameter, obj.get(i)));
        }
        return v;
      }
      case Array_Program: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Program> v = new ArrayList<Program> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Program)fromJSON (Type.Program, obj.get(i)));
        }
        return v;
      }
      case Array_RenderTarget: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<RenderTarget> v = new ArrayList<RenderTarget> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((RenderTarget)fromJSON (Type.RenderTarget, obj.get(i)));
        }
        return v;
      }
      case Array_SamplerDescriptor: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<SamplerDescriptor> v = new ArrayList<SamplerDescriptor> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((SamplerDescriptor)fromJSON (Type.SamplerDescriptor, obj.get(i)));
        }
        return v;
      }
      case Array_Slot: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Slot> v = new ArrayList<Slot> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Slot)fromJSON (Type.Slot, obj.get(i)));
        }
        return v;
      }
      case Array_StreamData: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<StreamData> v = new ArrayList<StreamData> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((StreamData)fromJSON (Type.StreamData, obj.get(i)));
        }
        return v;
      }
      case Array_TargetItem: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<TargetItem> v = new ArrayList<TargetItem> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((TargetItem)fromJSON (Type.TargetItem, obj.get(i)));
        }
        return v;
      }
      case Array_TextureDescriptor: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<TextureDescriptor> v = new ArrayList<TextureDescriptor> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((TextureDescriptor)fromJSON (Type.TextureDescriptor, obj.get(i)));
        }
        return v;
      }
      case List_FragmentOperation: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<FragmentOperation> v = new ArrayList<FragmentOperation> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((FragmentOperation)fromJSON (Type.FragmentOperation, obj.get(i)));
        }
        return v;
      }
      case Maybe_Int: {
        JSONObject obj = (JSONObject)rawObj;
        Maybe<Integer> m = new Maybe<Integer> ();
        if (obj == null || obj == JSONObject.NULL) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (Integer)fromJSON (Type.Int,obj);
        }
        return m;
      }
      case Maybe_Float: {
        JSONObject obj = (JSONObject)rawObj;
        Maybe<Float> m = new Maybe<Float> ();
        if (obj == null || obj == JSONObject.NULL) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (Float)fromJSON (Type.Float,obj);
        }
        return m;
      }
      case Maybe_String: {
        JSONObject obj = (JSONObject)rawObj;
        Maybe<String> m = new Maybe<String> ();
        if (obj == null || obj == JSONObject.NULL) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (String)fromJSON (Type.String,obj);
        }
        return m;
      }
      case Maybe_ComparisonFunction: {
        JSONObject obj = (JSONObject)rawObj;
        Maybe<ComparisonFunction> m = new Maybe<ComparisonFunction> ();
        if (obj == null || obj == JSONObject.NULL) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (ComparisonFunction)fromJSON (Type.ComparisonFunction,obj);
        }
        return m;
      }
      case Maybe_EdgeMode: {
        JSONObject obj = (JSONObject)rawObj;
        Maybe<EdgeMode> m = new Maybe<EdgeMode> ();
        if (obj == null || obj == JSONObject.NULL) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (EdgeMode)fromJSON (Type.EdgeMode,obj);
        }
        return m;
      }
      case Maybe_ImageRef: {
        JSONObject obj = (JSONObject)rawObj;
        Maybe<ImageRef> m = new Maybe<ImageRef> ();
        if (obj == null || obj == JSONObject.NULL) {
          m.valid = false;
        } else {
          m.valid = true;
          m.data = (ImageRef)fromJSON (Type.ImageRef,obj);
        }
        return m;
      }
      case Map_String_ArrayValue: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, ArrayValue> map = new HashMap<String, ArrayValue> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (ArrayValue)fromJSON(Type.ArrayValue,obj.get(key)));
        }
        return map;
      }
      case Map_String_InputType: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, InputType> map = new HashMap<String, InputType> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (InputType)fromJSON(Type.InputType,obj.get(key)));
        }
        return map;
      }
      case Map_String_Parameter: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, Parameter> map = new HashMap<String, Parameter> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (Parameter)fromJSON(Type.Parameter,obj.get(key)));
        }
        return map;
      }

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
          case "DirectX11": tagType = Backend.Tag.DirectX11; break;
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

  public static Object toJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case ArrayValue: {
        ArrayValue v = (ArrayValue)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case VBoolArray:
            obj.put("tag", "VBoolArray");
            {
              ArrayValue.VBoolArray_ tv = (ArrayValue.VBoolArray_)v;
              obj.put("arg0", toJSON(Type.Array_Bool,tv._0));
            }
            break;
          case VIntArray:
            obj.put("tag", "VIntArray");
            {
              ArrayValue.VIntArray_ tv = (ArrayValue.VIntArray_)v;
              obj.put("arg0", toJSON(Type.Array_Int32,tv._0));
            }
            break;
          case VWordArray:
            obj.put("tag", "VWordArray");
            {
              ArrayValue.VWordArray_ tv = (ArrayValue.VWordArray_)v;
              obj.put("arg0", toJSON(Type.Array_Word32,tv._0));
            }
            break;
          case VFloatArray:
            obj.put("tag", "VFloatArray");
            {
              ArrayValue.VFloatArray_ tv = (ArrayValue.VFloatArray_)v;
              obj.put("arg0", toJSON(Type.Array_Float,tv._0));
            }
            break;
        }
        return obj;
      }
      case Value: {
        Value v = (Value)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case VBool:
            obj.put("tag", "VBool");
            {
              Value.VBool_ tv = (Value.VBool_)v;
              obj.put("arg0", toJSON(Type.Bool,tv._0));
            }
            break;
          case VV2B:
            obj.put("tag", "VV2B");
            {
              Value.VV2B_ tv = (Value.VV2B_)v;
              obj.put("arg0", toJSON(Type.V2_Bool,tv._0));
            }
            break;
          case VV3B:
            obj.put("tag", "VV3B");
            {
              Value.VV3B_ tv = (Value.VV3B_)v;
              obj.put("arg0", toJSON(Type.V3_Bool,tv._0));
            }
            break;
          case VV4B:
            obj.put("tag", "VV4B");
            {
              Value.VV4B_ tv = (Value.VV4B_)v;
              obj.put("arg0", toJSON(Type.V4_Bool,tv._0));
            }
            break;
          case VWord:
            obj.put("tag", "VWord");
            {
              Value.VWord_ tv = (Value.VWord_)v;
              obj.put("arg0", toJSON(Type.Word32,tv._0));
            }
            break;
          case VV2U:
            obj.put("tag", "VV2U");
            {
              Value.VV2U_ tv = (Value.VV2U_)v;
              obj.put("arg0", toJSON(Type.V2_Word,tv._0));
            }
            break;
          case VV3U:
            obj.put("tag", "VV3U");
            {
              Value.VV3U_ tv = (Value.VV3U_)v;
              obj.put("arg0", toJSON(Type.V3_Word,tv._0));
            }
            break;
          case VV4U:
            obj.put("tag", "VV4U");
            {
              Value.VV4U_ tv = (Value.VV4U_)v;
              obj.put("arg0", toJSON(Type.V4_Word,tv._0));
            }
            break;
          case VInt:
            obj.put("tag", "VInt");
            {
              Value.VInt_ tv = (Value.VInt_)v;
              obj.put("arg0", toJSON(Type.Int32,tv._0));
            }
            break;
          case VV2I:
            obj.put("tag", "VV2I");
            {
              Value.VV2I_ tv = (Value.VV2I_)v;
              obj.put("arg0", toJSON(Type.V2_Int,tv._0));
            }
            break;
          case VV3I:
            obj.put("tag", "VV3I");
            {
              Value.VV3I_ tv = (Value.VV3I_)v;
              obj.put("arg0", toJSON(Type.V3_Int,tv._0));
            }
            break;
          case VV4I:
            obj.put("tag", "VV4I");
            {
              Value.VV4I_ tv = (Value.VV4I_)v;
              obj.put("arg0", toJSON(Type.V4_Int,tv._0));
            }
            break;
          case VFloat:
            obj.put("tag", "VFloat");
            {
              Value.VFloat_ tv = (Value.VFloat_)v;
              obj.put("arg0", toJSON(Type.Float,tv._0));
            }
            break;
          case VV2F:
            obj.put("tag", "VV2F");
            {
              Value.VV2F_ tv = (Value.VV2F_)v;
              obj.put("arg0", toJSON(Type.V2_Float,tv._0));
            }
            break;
          case VV3F:
            obj.put("tag", "VV3F");
            {
              Value.VV3F_ tv = (Value.VV3F_)v;
              obj.put("arg0", toJSON(Type.V3_Float,tv._0));
            }
            break;
          case VV4F:
            obj.put("tag", "VV4F");
            {
              Value.VV4F_ tv = (Value.VV4F_)v;
              obj.put("arg0", toJSON(Type.V4_Float,tv._0));
            }
            break;
          case VM22F:
            obj.put("tag", "VM22F");
            {
              Value.VM22F_ tv = (Value.VM22F_)v;
              obj.put("arg0", toJSON(Type.V2_V2_Float,tv._0));
            }
            break;
          case VM23F:
            obj.put("tag", "VM23F");
            {
              Value.VM23F_ tv = (Value.VM23F_)v;
              obj.put("arg0", toJSON(Type.V3_V2_Float,tv._0));
            }
            break;
          case VM24F:
            obj.put("tag", "VM24F");
            {
              Value.VM24F_ tv = (Value.VM24F_)v;
              obj.put("arg0", toJSON(Type.V4_V2_Float,tv._0));
            }
            break;
          case VM32F:
            obj.put("tag", "VM32F");
            {
              Value.VM32F_ tv = (Value.VM32F_)v;
              obj.put("arg0", toJSON(Type.V2_V3_Float,tv._0));
            }
            break;
          case VM33F:
            obj.put("tag", "VM33F");
            {
              Value.VM33F_ tv = (Value.VM33F_)v;
              obj.put("arg0", toJSON(Type.V3_V3_Float,tv._0));
            }
            break;
          case VM34F:
            obj.put("tag", "VM34F");
            {
              Value.VM34F_ tv = (Value.VM34F_)v;
              obj.put("arg0", toJSON(Type.V4_V3_Float,tv._0));
            }
            break;
          case VM42F:
            obj.put("tag", "VM42F");
            {
              Value.VM42F_ tv = (Value.VM42F_)v;
              obj.put("arg0", toJSON(Type.V2_V4_Float,tv._0));
            }
            break;
          case VM43F:
            obj.put("tag", "VM43F");
            {
              Value.VM43F_ tv = (Value.VM43F_)v;
              obj.put("arg0", toJSON(Type.V3_V4_Float,tv._0));
            }
            break;
          case VM44F:
            obj.put("tag", "VM44F");
            {
              Value.VM44F_ tv = (Value.VM44F_)v;
              obj.put("arg0", toJSON(Type.V4_V4_Float,tv._0));
            }
            break;
        }
        return obj;
      }
      case InputType: {
        InputType v = (InputType)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Bool:
            obj.put("tag", "Bool");
            break;
          case V2B:
            obj.put("tag", "V2B");
            break;
          case V3B:
            obj.put("tag", "V3B");
            break;
          case V4B:
            obj.put("tag", "V4B");
            break;
          case Word:
            obj.put("tag", "Word");
            break;
          case V2U:
            obj.put("tag", "V2U");
            break;
          case V3U:
            obj.put("tag", "V3U");
            break;
          case V4U:
            obj.put("tag", "V4U");
            break;
          case Int:
            obj.put("tag", "Int");
            break;
          case V2I:
            obj.put("tag", "V2I");
            break;
          case V3I:
            obj.put("tag", "V3I");
            break;
          case V4I:
            obj.put("tag", "V4I");
            break;
          case Float:
            obj.put("tag", "Float");
            break;
          case V2F:
            obj.put("tag", "V2F");
            break;
          case V3F:
            obj.put("tag", "V3F");
            break;
          case V4F:
            obj.put("tag", "V4F");
            break;
          case M22F:
            obj.put("tag", "M22F");
            break;
          case M23F:
            obj.put("tag", "M23F");
            break;
          case M24F:
            obj.put("tag", "M24F");
            break;
          case M32F:
            obj.put("tag", "M32F");
            break;
          case M33F:
            obj.put("tag", "M33F");
            break;
          case M34F:
            obj.put("tag", "M34F");
            break;
          case M42F:
            obj.put("tag", "M42F");
            break;
          case M43F:
            obj.put("tag", "M43F");
            break;
          case M44F:
            obj.put("tag", "M44F");
            break;
          case STexture1D:
            obj.put("tag", "STexture1D");
            break;
          case STexture2D:
            obj.put("tag", "STexture2D");
            break;
          case STextureCube:
            obj.put("tag", "STextureCube");
            break;
          case STexture1DArray:
            obj.put("tag", "STexture1DArray");
            break;
          case STexture2DArray:
            obj.put("tag", "STexture2DArray");
            break;
          case STexture2DRect:
            obj.put("tag", "STexture2DRect");
            break;
          case FTexture1D:
            obj.put("tag", "FTexture1D");
            break;
          case FTexture2D:
            obj.put("tag", "FTexture2D");
            break;
          case FTexture3D:
            obj.put("tag", "FTexture3D");
            break;
          case FTextureCube:
            obj.put("tag", "FTextureCube");
            break;
          case FTexture1DArray:
            obj.put("tag", "FTexture1DArray");
            break;
          case FTexture2DArray:
            obj.put("tag", "FTexture2DArray");
            break;
          case FTexture2DMS:
            obj.put("tag", "FTexture2DMS");
            break;
          case FTexture2DMSArray:
            obj.put("tag", "FTexture2DMSArray");
            break;
          case FTextureBuffer:
            obj.put("tag", "FTextureBuffer");
            break;
          case FTexture2DRect:
            obj.put("tag", "FTexture2DRect");
            break;
          case ITexture1D:
            obj.put("tag", "ITexture1D");
            break;
          case ITexture2D:
            obj.put("tag", "ITexture2D");
            break;
          case ITexture3D:
            obj.put("tag", "ITexture3D");
            break;
          case ITextureCube:
            obj.put("tag", "ITextureCube");
            break;
          case ITexture1DArray:
            obj.put("tag", "ITexture1DArray");
            break;
          case ITexture2DArray:
            obj.put("tag", "ITexture2DArray");
            break;
          case ITexture2DMS:
            obj.put("tag", "ITexture2DMS");
            break;
          case ITexture2DMSArray:
            obj.put("tag", "ITexture2DMSArray");
            break;
          case ITextureBuffer:
            obj.put("tag", "ITextureBuffer");
            break;
          case ITexture2DRect:
            obj.put("tag", "ITexture2DRect");
            break;
          case UTexture1D:
            obj.put("tag", "UTexture1D");
            break;
          case UTexture2D:
            obj.put("tag", "UTexture2D");
            break;
          case UTexture3D:
            obj.put("tag", "UTexture3D");
            break;
          case UTextureCube:
            obj.put("tag", "UTextureCube");
            break;
          case UTexture1DArray:
            obj.put("tag", "UTexture1DArray");
            break;
          case UTexture2DArray:
            obj.put("tag", "UTexture2DArray");
            break;
          case UTexture2DMS:
            obj.put("tag", "UTexture2DMS");
            break;
          case UTexture2DMSArray:
            obj.put("tag", "UTexture2DMSArray");
            break;
          case UTextureBuffer:
            obj.put("tag", "UTextureBuffer");
            break;
          case UTexture2DRect:
            obj.put("tag", "UTexture2DRect");
            break;
        }
        return obj;
      }
      case PointSpriteCoordOrigin: {
        PointSpriteCoordOrigin v = (PointSpriteCoordOrigin)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case LowerLeft:
            obj.put("tag", "LowerLeft");
            break;
          case UpperLeft:
            obj.put("tag", "UpperLeft");
            break;
        }
        return obj;
      }
      case PointSize: {
        PointSize v = (PointSize)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case PointSize:
            obj.put("tag", "PointSize");
            {
              PointSize.PointSize_ tv = (PointSize.PointSize_)v;
              obj.put("arg0", toJSON(Type.Float,tv._0));
            }
            break;
          case ProgramPointSize:
            obj.put("tag", "ProgramPointSize");
            break;
        }
        return obj;
      }
      case PolygonOffset: {
        PolygonOffset v = (PolygonOffset)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case NoOffset:
            obj.put("tag", "NoOffset");
            break;
          case Offset:
            obj.put("tag", "Offset");
            {
              PolygonOffset.Offset_ tv = (PolygonOffset.Offset_)v;
              obj.put("arg0", toJSON(Type.Float,tv._0));
              obj.put("arg1", toJSON(Type.Float,tv._1));
            }
            break;
        }
        return obj;
      }
      case FrontFace: {
        FrontFace v = (FrontFace)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case CCW:
            obj.put("tag", "CCW");
            break;
          case CW:
            obj.put("tag", "CW");
            break;
        }
        return obj;
      }
      case PolygonMode: {
        PolygonMode v = (PolygonMode)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case PolygonPoint:
            obj.put("tag", "PolygonPoint");
            {
              PolygonMode.PolygonPoint_ tv = (PolygonMode.PolygonPoint_)v;
              obj.put("arg0", toJSON(Type.PointSize,tv._0));
            }
            break;
          case PolygonLine:
            obj.put("tag", "PolygonLine");
            {
              PolygonMode.PolygonLine_ tv = (PolygonMode.PolygonLine_)v;
              obj.put("arg0", toJSON(Type.Float,tv._0));
            }
            break;
          case PolygonFill:
            obj.put("tag", "PolygonFill");
            break;
        }
        return obj;
      }
      case ProvokingVertex: {
        ProvokingVertex v = (ProvokingVertex)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case FirstVertex:
            obj.put("tag", "FirstVertex");
            break;
          case LastVertex:
            obj.put("tag", "LastVertex");
            break;
        }
        return obj;
      }
      case CullMode: {
        CullMode v = (CullMode)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case CullNone:
            obj.put("tag", "CullNone");
            break;
          case CullFront:
            obj.put("tag", "CullFront");
            {
              CullMode.CullFront_ tv = (CullMode.CullFront_)v;
              obj.put("arg0", toJSON(Type.FrontFace,tv._0));
            }
            break;
          case CullBack:
            obj.put("tag", "CullBack");
            {
              CullMode.CullBack_ tv = (CullMode.CullBack_)v;
              obj.put("arg0", toJSON(Type.FrontFace,tv._0));
            }
            break;
        }
        return obj;
      }
      case ComparisonFunction: {
        ComparisonFunction v = (ComparisonFunction)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Never:
            obj.put("tag", "Never");
            break;
          case Less:
            obj.put("tag", "Less");
            break;
          case Equal:
            obj.put("tag", "Equal");
            break;
          case Lequal:
            obj.put("tag", "Lequal");
            break;
          case Greater:
            obj.put("tag", "Greater");
            break;
          case Notequal:
            obj.put("tag", "Notequal");
            break;
          case Gequal:
            obj.put("tag", "Gequal");
            break;
          case Always:
            obj.put("tag", "Always");
            break;
        }
        return obj;
      }
      case StencilOperation: {
        StencilOperation v = (StencilOperation)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case OpZero:
            obj.put("tag", "OpZero");
            break;
          case OpKeep:
            obj.put("tag", "OpKeep");
            break;
          case OpReplace:
            obj.put("tag", "OpReplace");
            break;
          case OpIncr:
            obj.put("tag", "OpIncr");
            break;
          case OpIncrWrap:
            obj.put("tag", "OpIncrWrap");
            break;
          case OpDecr:
            obj.put("tag", "OpDecr");
            break;
          case OpDecrWrap:
            obj.put("tag", "OpDecrWrap");
            break;
          case OpInvert:
            obj.put("tag", "OpInvert");
            break;
        }
        return obj;
      }
      case BlendEquation: {
        BlendEquation v = (BlendEquation)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case FuncAdd:
            obj.put("tag", "FuncAdd");
            break;
          case FuncSubtract:
            obj.put("tag", "FuncSubtract");
            break;
          case FuncReverseSubtract:
            obj.put("tag", "FuncReverseSubtract");
            break;
          case Min:
            obj.put("tag", "Min");
            break;
          case Max:
            obj.put("tag", "Max");
            break;
        }
        return obj;
      }
      case BlendingFactor: {
        BlendingFactor v = (BlendingFactor)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Zero:
            obj.put("tag", "Zero");
            break;
          case One:
            obj.put("tag", "One");
            break;
          case SrcColor:
            obj.put("tag", "SrcColor");
            break;
          case OneMinusSrcColor:
            obj.put("tag", "OneMinusSrcColor");
            break;
          case DstColor:
            obj.put("tag", "DstColor");
            break;
          case OneMinusDstColor:
            obj.put("tag", "OneMinusDstColor");
            break;
          case SrcAlpha:
            obj.put("tag", "SrcAlpha");
            break;
          case OneMinusSrcAlpha:
            obj.put("tag", "OneMinusSrcAlpha");
            break;
          case DstAlpha:
            obj.put("tag", "DstAlpha");
            break;
          case OneMinusDstAlpha:
            obj.put("tag", "OneMinusDstAlpha");
            break;
          case ConstantColor:
            obj.put("tag", "ConstantColor");
            break;
          case OneMinusConstantColor:
            obj.put("tag", "OneMinusConstantColor");
            break;
          case ConstantAlpha:
            obj.put("tag", "ConstantAlpha");
            break;
          case OneMinusConstantAlpha:
            obj.put("tag", "OneMinusConstantAlpha");
            break;
          case SrcAlphaSaturate:
            obj.put("tag", "SrcAlphaSaturate");
            break;
        }
        return obj;
      }
      case LogicOperation: {
        LogicOperation v = (LogicOperation)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Clear:
            obj.put("tag", "Clear");
            break;
          case And:
            obj.put("tag", "And");
            break;
          case AndReverse:
            obj.put("tag", "AndReverse");
            break;
          case Copy:
            obj.put("tag", "Copy");
            break;
          case AndInverted:
            obj.put("tag", "AndInverted");
            break;
          case Noop:
            obj.put("tag", "Noop");
            break;
          case Xor:
            obj.put("tag", "Xor");
            break;
          case Or:
            obj.put("tag", "Or");
            break;
          case Nor:
            obj.put("tag", "Nor");
            break;
          case Equiv:
            obj.put("tag", "Equiv");
            break;
          case Invert:
            obj.put("tag", "Invert");
            break;
          case OrReverse:
            obj.put("tag", "OrReverse");
            break;
          case CopyInverted:
            obj.put("tag", "CopyInverted");
            break;
          case OrInverted:
            obj.put("tag", "OrInverted");
            break;
          case Nand:
            obj.put("tag", "Nand");
            break;
          case Set:
            obj.put("tag", "Set");
            break;
        }
        return obj;
      }
      case StencilOps: {
        StencilOps v = (StencilOps)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case StencilOps:
            obj.put("tag", "StencilOps");
            {
              StencilOps.StencilOps_ tv = (StencilOps.StencilOps_)v;
              obj.put("frontStencilOp", toJSON(Type.StencilOperation,tv.frontStencilOp));
              obj.put("backStencilOp", toJSON(Type.StencilOperation,tv.backStencilOp));
            }
            break;
        }
        return obj;
      }
      case StencilTest: {
        StencilTest v = (StencilTest)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case StencilTest:
            obj.put("tag", "StencilTest");
            {
              StencilTest.StencilTest_ tv = (StencilTest.StencilTest_)v;
              obj.put("stencilComparision", toJSON(Type.ComparisonFunction,tv.stencilComparision));
              obj.put("stencilReference", toJSON(Type.Int32,tv.stencilReference));
              obj.put("stencilMask", toJSON(Type.Word32,tv.stencilMask));
            }
            break;
        }
        return obj;
      }
      case StencilTests: {
        StencilTests v = (StencilTests)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case StencilTests:
            obj.put("tag", "StencilTests");
            {
              StencilTests.StencilTests_ tv = (StencilTests.StencilTests_)v;
              obj.put("arg0", toJSON(Type.StencilTest,tv._0));
              obj.put("arg1", toJSON(Type.StencilTest,tv._1));
            }
            break;
        }
        return obj;
      }
      case FetchPrimitive: {
        FetchPrimitive v = (FetchPrimitive)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Points:
            obj.put("tag", "Points");
            break;
          case Lines:
            obj.put("tag", "Lines");
            break;
          case Triangles:
            obj.put("tag", "Triangles");
            break;
          case LinesAdjacency:
            obj.put("tag", "LinesAdjacency");
            break;
          case TrianglesAdjacency:
            obj.put("tag", "TrianglesAdjacency");
            break;
        }
        return obj;
      }
      case OutputPrimitive: {
        OutputPrimitive v = (OutputPrimitive)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case TrianglesOutput:
            obj.put("tag", "TrianglesOutput");
            break;
          case LinesOutput:
            obj.put("tag", "LinesOutput");
            break;
          case PointsOutput:
            obj.put("tag", "PointsOutput");
            break;
        }
        return obj;
      }
      case ColorArity: {
        ColorArity v = (ColorArity)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Red:
            obj.put("tag", "Red");
            break;
          case RG:
            obj.put("tag", "RG");
            break;
          case RGB:
            obj.put("tag", "RGB");
            break;
          case RGBA:
            obj.put("tag", "RGBA");
            break;
        }
        return obj;
      }
      case Blending: {
        Blending v = (Blending)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case NoBlending:
            obj.put("tag", "NoBlending");
            break;
          case BlendLogicOp:
            obj.put("tag", "BlendLogicOp");
            {
              Blending.BlendLogicOp_ tv = (Blending.BlendLogicOp_)v;
              obj.put("arg0", toJSON(Type.LogicOperation,tv._0));
            }
            break;
          case Blend:
            obj.put("tag", "Blend");
            {
              Blending.Blend_ tv = (Blending.Blend_)v;
              obj.put("colorEqSrc", toJSON(Type.BlendEquation,tv.colorEqSrc));
              obj.put("alphaEqSrc", toJSON(Type.BlendEquation,tv.alphaEqSrc));
              obj.put("colorFSrc", toJSON(Type.BlendingFactor,tv.colorFSrc));
              obj.put("colorFDst", toJSON(Type.BlendingFactor,tv.colorFDst));
              obj.put("alphaFSrc", toJSON(Type.BlendingFactor,tv.alphaFSrc));
              obj.put("alphaFDst", toJSON(Type.BlendingFactor,tv.alphaFDst));
              obj.put("color", toJSON(Type.V4_Float,tv.color));
            }
            break;
        }
        return obj;
      }
      case RasterContext: {
        RasterContext v = (RasterContext)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case PointCtx:
            obj.put("tag", "PointCtx");
            {
              RasterContext.PointCtx_ tv = (RasterContext.PointCtx_)v;
              obj.put("arg0", toJSON(Type.PointSize,tv._0));
              obj.put("arg1", toJSON(Type.Float,tv._1));
              obj.put("arg2", toJSON(Type.PointSpriteCoordOrigin,tv._2));
            }
            break;
          case LineCtx:
            obj.put("tag", "LineCtx");
            {
              RasterContext.LineCtx_ tv = (RasterContext.LineCtx_)v;
              obj.put("arg0", toJSON(Type.Float,tv._0));
              obj.put("arg1", toJSON(Type.ProvokingVertex,tv._1));
            }
            break;
          case TriangleCtx:
            obj.put("tag", "TriangleCtx");
            {
              RasterContext.TriangleCtx_ tv = (RasterContext.TriangleCtx_)v;
              obj.put("arg0", toJSON(Type.CullMode,tv._0));
              obj.put("arg1", toJSON(Type.PolygonMode,tv._1));
              obj.put("arg2", toJSON(Type.PolygonOffset,tv._2));
              obj.put("arg3", toJSON(Type.ProvokingVertex,tv._3));
            }
            break;
        }
        return obj;
      }
      case FragmentOperation: {
        FragmentOperation v = (FragmentOperation)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case DepthOp:
            obj.put("tag", "DepthOp");
            {
              FragmentOperation.DepthOp_ tv = (FragmentOperation.DepthOp_)v;
              obj.put("arg0", toJSON(Type.ComparisonFunction,tv._0));
              obj.put("arg1", toJSON(Type.Bool,tv._1));
            }
            break;
          case StencilOp:
            obj.put("tag", "StencilOp");
            {
              FragmentOperation.StencilOp_ tv = (FragmentOperation.StencilOp_)v;
              obj.put("arg0", toJSON(Type.StencilTests,tv._0));
              obj.put("arg1", toJSON(Type.StencilOps,tv._1));
              obj.put("arg2", toJSON(Type.StencilOps,tv._2));
            }
            break;
          case ColorOp:
            obj.put("tag", "ColorOp");
            {
              FragmentOperation.ColorOp_ tv = (FragmentOperation.ColorOp_)v;
              obj.put("arg0", toJSON(Type.Blending,tv._0));
              obj.put("arg1", toJSON(Type.Value,tv._1));
            }
            break;
        }
        return obj;
      }
      case AccumulationContext: {
        AccumulationContext v = (AccumulationContext)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case AccumulationContext:
            obj.put("tag", "AccumulationContext");
            {
              AccumulationContext.AccumulationContext_ tv = (AccumulationContext.AccumulationContext_)v;
              obj.put("accViewportName", toJSON(Type.Maybe_String,tv.accViewportName));
              obj.put("accOperations", toJSON(Type.List_FragmentOperation,tv.accOperations));
            }
            break;
        }
        return obj;
      }
      case TextureDataType: {
        TextureDataType v = (TextureDataType)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case FloatT:
            obj.put("tag", "FloatT");
            {
              TextureDataType.FloatT_ tv = (TextureDataType.FloatT_)v;
              obj.put("arg0", toJSON(Type.ColorArity,tv._0));
            }
            break;
          case IntT:
            obj.put("tag", "IntT");
            {
              TextureDataType.IntT_ tv = (TextureDataType.IntT_)v;
              obj.put("arg0", toJSON(Type.ColorArity,tv._0));
            }
            break;
          case WordT:
            obj.put("tag", "WordT");
            {
              TextureDataType.WordT_ tv = (TextureDataType.WordT_)v;
              obj.put("arg0", toJSON(Type.ColorArity,tv._0));
            }
            break;
          case ShadowT:
            obj.put("tag", "ShadowT");
            break;
        }
        return obj;
      }
      case TextureType: {
        TextureType v = (TextureType)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Texture1D:
            obj.put("tag", "Texture1D");
            {
              TextureType.Texture1D_ tv = (TextureType.Texture1D_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
          case Texture2D:
            obj.put("tag", "Texture2D");
            {
              TextureType.Texture2D_ tv = (TextureType.Texture2D_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
          case Texture3D:
            obj.put("tag", "Texture3D");
            {
              TextureType.Texture3D_ tv = (TextureType.Texture3D_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
            }
            break;
          case TextureCube:
            obj.put("tag", "TextureCube");
            {
              TextureType.TextureCube_ tv = (TextureType.TextureCube_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
            }
            break;
          case TextureRect:
            obj.put("tag", "TextureRect");
            {
              TextureType.TextureRect_ tv = (TextureType.TextureRect_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
            }
            break;
          case Texture2DMS:
            obj.put("tag", "Texture2DMS");
            {
              TextureType.Texture2DMS_ tv = (TextureType.Texture2DMS_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
              obj.put("arg2", toJSON(Type.Int,tv._2));
              obj.put("arg3", toJSON(Type.Bool,tv._3));
            }
            break;
          case TextureBuffer:
            obj.put("tag", "TextureBuffer");
            {
              TextureType.TextureBuffer_ tv = (TextureType.TextureBuffer_)v;
              obj.put("arg0", toJSON(Type.TextureDataType,tv._0));
            }
            break;
        }
        return obj;
      }
      case MipMap: {
        MipMap v = (MipMap)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Mip:
            obj.put("tag", "Mip");
            {
              MipMap.Mip_ tv = (MipMap.Mip_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
          case NoMip:
            obj.put("tag", "NoMip");
            break;
          case AutoMip:
            obj.put("tag", "AutoMip");
            {
              MipMap.AutoMip_ tv = (MipMap.AutoMip_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
        }
        return obj;
      }
      case Filter: {
        Filter v = (Filter)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Nearest:
            obj.put("tag", "Nearest");
            break;
          case Linear:
            obj.put("tag", "Linear");
            break;
          case NearestMipmapNearest:
            obj.put("tag", "NearestMipmapNearest");
            break;
          case NearestMipmapLinear:
            obj.put("tag", "NearestMipmapLinear");
            break;
          case LinearMipmapNearest:
            obj.put("tag", "LinearMipmapNearest");
            break;
          case LinearMipmapLinear:
            obj.put("tag", "LinearMipmapLinear");
            break;
        }
        return obj;
      }
      case EdgeMode: {
        EdgeMode v = (EdgeMode)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Repeat:
            obj.put("tag", "Repeat");
            break;
          case MirroredRepeat:
            obj.put("tag", "MirroredRepeat");
            break;
          case ClampToEdge:
            obj.put("tag", "ClampToEdge");
            break;
          case ClampToBorder:
            obj.put("tag", "ClampToBorder");
            break;
        }
        return obj;
      }
      case ImageSemantic: {
        ImageSemantic v = (ImageSemantic)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Depth:
            obj.put("tag", "Depth");
            break;
          case Stencil:
            obj.put("tag", "Stencil");
            break;
          case Color:
            obj.put("tag", "Color");
            break;
        }
        return obj;
      }
      case ImageRef: {
        ImageRef v = (ImageRef)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case TextureImage:
            obj.put("tag", "TextureImage");
            {
              ImageRef.TextureImage_ tv = (ImageRef.TextureImage_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
              obj.put("arg2", toJSON(Type.Maybe_Int,tv._2));
            }
            break;
          case Framebuffer:
            obj.put("tag", "Framebuffer");
            {
              ImageRef.Framebuffer_ tv = (ImageRef.Framebuffer_)v;
              obj.put("arg0", toJSON(Type.ImageSemantic,tv._0));
            }
            break;
        }
        return obj;
      }
      case ClearImage: {
        ClearImage v = (ClearImage)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case ClearImage:
            obj.put("tag", "ClearImage");
            {
              ClearImage.ClearImage_ tv = (ClearImage.ClearImage_)v;
              obj.put("imageSemantic", toJSON(Type.ImageSemantic,tv.imageSemantic));
              obj.put("clearValue", toJSON(Type.Value,tv.clearValue));
            }
            break;
        }
        return obj;
      }
      case Command: {
        Command v = (Command)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case SetRasterContext:
            obj.put("tag", "SetRasterContext");
            {
              Command.SetRasterContext_ tv = (Command.SetRasterContext_)v;
              obj.put("arg0", toJSON(Type.RasterContext,tv._0));
            }
            break;
          case SetAccumulationContext:
            obj.put("tag", "SetAccumulationContext");
            {
              Command.SetAccumulationContext_ tv = (Command.SetAccumulationContext_)v;
              obj.put("arg0", toJSON(Type.AccumulationContext,tv._0));
            }
            break;
          case SetRenderTarget:
            obj.put("tag", "SetRenderTarget");
            {
              Command.SetRenderTarget_ tv = (Command.SetRenderTarget_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
            }
            break;
          case SetProgram:
            obj.put("tag", "SetProgram");
            {
              Command.SetProgram_ tv = (Command.SetProgram_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
            }
            break;
          case SetSamplerUniform:
            obj.put("tag", "SetSamplerUniform");
            {
              Command.SetSamplerUniform_ tv = (Command.SetSamplerUniform_)v;
              obj.put("arg0", toJSON(Type.String,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
          case SetTexture:
            obj.put("tag", "SetTexture");
            {
              Command.SetTexture_ tv = (Command.SetTexture_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
          case SetSampler:
            obj.put("tag", "SetSampler");
            {
              Command.SetSampler_ tv = (Command.SetSampler_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
              obj.put("arg1", toJSON(Type.Maybe_Int,tv._1));
            }
            break;
          case RenderSlot:
            obj.put("tag", "RenderSlot");
            {
              Command.RenderSlot_ tv = (Command.RenderSlot_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
            }
            break;
          case RenderStream:
            obj.put("tag", "RenderStream");
            {
              Command.RenderStream_ tv = (Command.RenderStream_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
            }
            break;
          case ClearRenderTarget:
            obj.put("tag", "ClearRenderTarget");
            {
              Command.ClearRenderTarget_ tv = (Command.ClearRenderTarget_)v;
              obj.put("arg0", toJSON(Type.Array_ClearImage,tv._0));
            }
            break;
          case GenerateMipMap:
            obj.put("tag", "GenerateMipMap");
            {
              Command.GenerateMipMap_ tv = (Command.GenerateMipMap_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
            }
            break;
          case SaveImage:
            obj.put("tag", "SaveImage");
            {
              Command.SaveImage_ tv = (Command.SaveImage_)v;
              obj.put("arg0", toJSON(Type.Int,tv._0));
              obj.put("arg1", toJSON(Type.ImageRef,tv._1));
            }
            break;
          case LoadImage:
            obj.put("tag", "LoadImage");
            {
              Command.LoadImage_ tv = (Command.LoadImage_)v;
              obj.put("arg0", toJSON(Type.ImageRef,tv._0));
              obj.put("arg1", toJSON(Type.Int,tv._1));
            }
            break;
        }
        return obj;
      }
      case SamplerDescriptor: {
        SamplerDescriptor v = (SamplerDescriptor)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case SamplerDescriptor:
            obj.put("tag", "SamplerDescriptor");
            {
              SamplerDescriptor.SamplerDescriptor_ tv = (SamplerDescriptor.SamplerDescriptor_)v;
              obj.put("samplerWrapS", toJSON(Type.EdgeMode,tv.samplerWrapS));
              obj.put("samplerWrapT", toJSON(Type.Maybe_EdgeMode,tv.samplerWrapT));
              obj.put("samplerWrapR", toJSON(Type.Maybe_EdgeMode,tv.samplerWrapR));
              obj.put("samplerMinFilter", toJSON(Type.Filter,tv.samplerMinFilter));
              obj.put("samplerMagFilter", toJSON(Type.Filter,tv.samplerMagFilter));
              obj.put("samplerBorderColor", toJSON(Type.Value,tv.samplerBorderColor));
              obj.put("samplerMinLod", toJSON(Type.Maybe_Float,tv.samplerMinLod));
              obj.put("samplerMaxLod", toJSON(Type.Maybe_Float,tv.samplerMaxLod));
              obj.put("samplerLodBias", toJSON(Type.Float,tv.samplerLodBias));
              obj.put("samplerCompareFunc", toJSON(Type.Maybe_ComparisonFunction,tv.samplerCompareFunc));
            }
            break;
        }
        return obj;
      }
      case TextureDescriptor: {
        TextureDescriptor v = (TextureDescriptor)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case TextureDescriptor:
            obj.put("tag", "TextureDescriptor");
            {
              TextureDescriptor.TextureDescriptor_ tv = (TextureDescriptor.TextureDescriptor_)v;
              obj.put("textureType", toJSON(Type.TextureType,tv.textureType));
              obj.put("textureSize", toJSON(Type.Value,tv.textureSize));
              obj.put("textureSemantic", toJSON(Type.ImageSemantic,tv.textureSemantic));
              obj.put("textureSampler", toJSON(Type.SamplerDescriptor,tv.textureSampler));
              obj.put("textureBaseLevel", toJSON(Type.Int,tv.textureBaseLevel));
              obj.put("textureMaxLevel", toJSON(Type.Int,tv.textureMaxLevel));
            }
            break;
        }
        return obj;
      }
      case Parameter: {
        Parameter v = (Parameter)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Parameter:
            obj.put("tag", "Parameter");
            {
              Parameter.Parameter_ tv = (Parameter.Parameter_)v;
              obj.put("name", toJSON(Type.String,tv.name));
              obj.put("ty", toJSON(Type.InputType,tv.ty));
            }
            break;
        }
        return obj;
      }
      case Program: {
        Program v = (Program)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Program:
            obj.put("tag", "Program");
            {
              Program.Program_ tv = (Program.Program_)v;
              obj.put("programUniforms", toJSON(Type.Map_String_InputType,tv.programUniforms));
              obj.put("programStreams", toJSON(Type.Map_String_Parameter,tv.programStreams));
              obj.put("programInTextures", toJSON(Type.Map_String_InputType,tv.programInTextures));
              obj.put("programOutput", toJSON(Type.Array_Parameter,tv.programOutput));
              obj.put("vertexShader", toJSON(Type.String,tv.vertexShader));
              obj.put("geometryShader", toJSON(Type.Maybe_String,tv.geometryShader));
              obj.put("fragmentShader", toJSON(Type.String,tv.fragmentShader));
            }
            break;
        }
        return obj;
      }
      case Slot: {
        Slot v = (Slot)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Slot:
            obj.put("tag", "Slot");
            {
              Slot.Slot_ tv = (Slot.Slot_)v;
              obj.put("slotName", toJSON(Type.String,tv.slotName));
              obj.put("slotStreams", toJSON(Type.Map_String_InputType,tv.slotStreams));
              obj.put("slotUniforms", toJSON(Type.Map_String_InputType,tv.slotUniforms));
              obj.put("slotPrimitive", toJSON(Type.FetchPrimitive,tv.slotPrimitive));
              obj.put("slotPrograms", toJSON(Type.Array_Int,tv.slotPrograms));
            }
            break;
        }
        return obj;
      }
      case StreamData: {
        StreamData v = (StreamData)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case StreamData:
            obj.put("tag", "StreamData");
            {
              StreamData.StreamData_ tv = (StreamData.StreamData_)v;
              obj.put("streamData", toJSON(Type.Map_String_ArrayValue,tv.streamData));
              obj.put("streamType", toJSON(Type.Map_String_InputType,tv.streamType));
              obj.put("streamPrimitive", toJSON(Type.FetchPrimitive,tv.streamPrimitive));
              obj.put("streamPrograms", toJSON(Type.Array_Int,tv.streamPrograms));
            }
            break;
        }
        return obj;
      }
      case TargetItem: {
        TargetItem v = (TargetItem)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case TargetItem:
            obj.put("tag", "TargetItem");
            {
              TargetItem.TargetItem_ tv = (TargetItem.TargetItem_)v;
              obj.put("targetSemantic", toJSON(Type.ImageSemantic,tv.targetSemantic));
              obj.put("targetRef", toJSON(Type.Maybe_ImageRef,tv.targetRef));
            }
            break;
        }
        return obj;
      }
      case RenderTarget: {
        RenderTarget v = (RenderTarget)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case RenderTarget:
            obj.put("tag", "RenderTarget");
            {
              RenderTarget.RenderTarget_ tv = (RenderTarget.RenderTarget_)v;
              obj.put("renderTargets", toJSON(Type.Array_TargetItem,tv.renderTargets));
            }
            break;
        }
        return obj;
      }
      case Backend: {
        Backend v = (Backend)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case WebGL1:
            obj.put("tag", "WebGL1");
            break;
          case OpenGL33:
            obj.put("tag", "OpenGL33");
            break;
          case DirectX11:
            obj.put("tag", "DirectX11");
            break;
        }
        return obj;
      }
      case Pipeline: {
        Pipeline v = (Pipeline)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Pipeline:
            obj.put("tag", "Pipeline");
            {
              Pipeline.Pipeline_ tv = (Pipeline.Pipeline_)v;
              obj.put("info", toJSON(Type.String,tv.info));
              obj.put("backend", toJSON(Type.Backend,tv.backend));
              obj.put("textures", toJSON(Type.Array_TextureDescriptor,tv.textures));
              obj.put("samplers", toJSON(Type.Array_SamplerDescriptor,tv.samplers));
              obj.put("targets", toJSON(Type.Array_RenderTarget,tv.targets));
              obj.put("programs", toJSON(Type.Array_Program,tv.programs));
              obj.put("slots", toJSON(Type.Array_Slot,tv.slots));
              obj.put("streams", toJSON(Type.Array_StreamData,tv.streams));
              obj.put("commands", toJSON(Type.Array_Command,tv.commands));
            }
            break;
        }
        return obj;
      }

      case Word32: { return rawObj; }
      case Float: { return rawObj; }
      case Bool: { return rawObj; }
      case String: { return rawObj; }
      case V2_Word: {
        V2<Integer> v = (V2<Integer>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Word,v.x));
        obj.put("y", toJSON(Type.Word,v.y));
        return obj;
      }
      case V2_Float: {
        V2<Float> v = (V2<Float>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Float,v.x));
        obj.put("y", toJSON(Type.Float,v.y));
        return obj;
      }
      case V2_Bool: {
        V2<Boolean> v = (V2<Boolean>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Bool,v.x));
        obj.put("y", toJSON(Type.Bool,v.y));
        return obj;
      }
      case V2_V2_Float: {
        V2<V2<Float>> v = (V2<V2<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V2_Float,v.x));
        obj.put("y", toJSON(Type.V2_Float,v.y));
        return obj;
      }
      case V2_V3_Float: {
        V2<V3<Float>> v = (V2<V3<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V3_Float,v.x));
        obj.put("y", toJSON(Type.V3_Float,v.y));
        return obj;
      }
      case V2_V4_Float: {
        V2<V4<Float>> v = (V2<V4<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V4_Float,v.x));
        obj.put("y", toJSON(Type.V4_Float,v.y));
        return obj;
      }
      case V3_Word: {
        V3<Integer> v = (V3<Integer>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Word,v.x));
        obj.put("y", toJSON(Type.Word,v.y));
        obj.put("z", toJSON(Type.Word,v.z));
        return obj;
      }
      case V3_Float: {
        V3<Float> v = (V3<Float>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Float,v.x));
        obj.put("y", toJSON(Type.Float,v.y));
        obj.put("z", toJSON(Type.Float,v.z));
        return obj;
      }
      case V3_Bool: {
        V3<Boolean> v = (V3<Boolean>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Bool,v.x));
        obj.put("y", toJSON(Type.Bool,v.y));
        obj.put("z", toJSON(Type.Bool,v.z));
        return obj;
      }
      case V3_V2_Float: {
        V3<V2<Float>> v = (V3<V2<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V2_Float,v.x));
        obj.put("y", toJSON(Type.V2_Float,v.y));
        obj.put("z", toJSON(Type.V2_Float,v.z));
        return obj;
      }
      case V3_V3_Float: {
        V3<V3<Float>> v = (V3<V3<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V3_Float,v.x));
        obj.put("y", toJSON(Type.V3_Float,v.y));
        obj.put("z", toJSON(Type.V3_Float,v.z));
        return obj;
      }
      case V3_V4_Float: {
        V3<V4<Float>> v = (V3<V4<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V4_Float,v.x));
        obj.put("y", toJSON(Type.V4_Float,v.y));
        obj.put("z", toJSON(Type.V4_Float,v.z));
        return obj;
      }
      case V4_Word: {
        V4<Integer> v = (V4<Integer>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Word,v.x));
        obj.put("y", toJSON(Type.Word,v.y));
        obj.put("z", toJSON(Type.Word,v.z));
        obj.put("w", toJSON(Type.Word,v.w));
        return obj;
      }
      case V4_Float: {
        V4<Float> v = (V4<Float>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Float,v.x));
        obj.put("y", toJSON(Type.Float,v.y));
        obj.put("z", toJSON(Type.Float,v.z));
        obj.put("w", toJSON(Type.Float,v.w));
        return obj;
      }
      case V4_Bool: {
        V4<Boolean> v = (V4<Boolean>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Bool,v.x));
        obj.put("y", toJSON(Type.Bool,v.y));
        obj.put("z", toJSON(Type.Bool,v.z));
        obj.put("w", toJSON(Type.Bool,v.w));
        return obj;
      }
      case V4_V2_Float: {
        V4<V2<Float>> v = (V4<V2<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V2_Float,v.x));
        obj.put("y", toJSON(Type.V2_Float,v.y));
        obj.put("z", toJSON(Type.V2_Float,v.z));
        obj.put("w", toJSON(Type.V2_Float,v.w));
        return obj;
      }
      case V4_V3_Float: {
        V4<V3<Float>> v = (V4<V3<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V3_Float,v.x));
        obj.put("y", toJSON(Type.V3_Float,v.y));
        obj.put("z", toJSON(Type.V3_Float,v.z));
        obj.put("w", toJSON(Type.V3_Float,v.w));
        return obj;
      }
      case V4_V4_Float: {
        V4<V4<Float>> v = (V4<V4<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V4_Float,v.x));
        obj.put("y", toJSON(Type.V4_Float,v.y));
        obj.put("z", toJSON(Type.V4_Float,v.z));
        obj.put("w", toJSON(Type.V4_Float,v.w));
        return obj;
      }
      case Array_Word32: {
        ArrayList<Integer> v = (ArrayList<Integer>)rawObj;
        JSONArray obj = new JSONArray();
        for(Integer i : v) {
          obj.put(toJSON(Type.Word32,i));
        }
        return obj;
      }
      case Array_Float: {
        ArrayList<Float> v = (ArrayList<Float>)rawObj;
        JSONArray obj = new JSONArray();
        for(Float i : v) {
          obj.put(toJSON(Type.Float,i));
        }
        return obj;
      }
      case Array_Bool: {
        ArrayList<Boolean> v = (ArrayList<Boolean>)rawObj;
        JSONArray obj = new JSONArray();
        for(Boolean i : v) {
          obj.put(toJSON(Type.Bool,i));
        }
        return obj;
      }
      case Array_ClearImage: {
        ArrayList<ClearImage> v = (ArrayList<ClearImage>)rawObj;
        JSONArray obj = new JSONArray();
        for(ClearImage i : v) {
          obj.put(toJSON(Type.ClearImage,i));
        }
        return obj;
      }
      case Array_Command: {
        ArrayList<Command> v = (ArrayList<Command>)rawObj;
        JSONArray obj = new JSONArray();
        for(Command i : v) {
          obj.put(toJSON(Type.Command,i));
        }
        return obj;
      }
      case Array_Parameter: {
        ArrayList<Parameter> v = (ArrayList<Parameter>)rawObj;
        JSONArray obj = new JSONArray();
        for(Parameter i : v) {
          obj.put(toJSON(Type.Parameter,i));
        }
        return obj;
      }
      case Array_Program: {
        ArrayList<Program> v = (ArrayList<Program>)rawObj;
        JSONArray obj = new JSONArray();
        for(Program i : v) {
          obj.put(toJSON(Type.Program,i));
        }
        return obj;
      }
      case Array_RenderTarget: {
        ArrayList<RenderTarget> v = (ArrayList<RenderTarget>)rawObj;
        JSONArray obj = new JSONArray();
        for(RenderTarget i : v) {
          obj.put(toJSON(Type.RenderTarget,i));
        }
        return obj;
      }
      case Array_SamplerDescriptor: {
        ArrayList<SamplerDescriptor> v = (ArrayList<SamplerDescriptor>)rawObj;
        JSONArray obj = new JSONArray();
        for(SamplerDescriptor i : v) {
          obj.put(toJSON(Type.SamplerDescriptor,i));
        }
        return obj;
      }
      case Array_Slot: {
        ArrayList<Slot> v = (ArrayList<Slot>)rawObj;
        JSONArray obj = new JSONArray();
        for(Slot i : v) {
          obj.put(toJSON(Type.Slot,i));
        }
        return obj;
      }
      case Array_StreamData: {
        ArrayList<StreamData> v = (ArrayList<StreamData>)rawObj;
        JSONArray obj = new JSONArray();
        for(StreamData i : v) {
          obj.put(toJSON(Type.StreamData,i));
        }
        return obj;
      }
      case Array_TargetItem: {
        ArrayList<TargetItem> v = (ArrayList<TargetItem>)rawObj;
        JSONArray obj = new JSONArray();
        for(TargetItem i : v) {
          obj.put(toJSON(Type.TargetItem,i));
        }
        return obj;
      }
      case Array_TextureDescriptor: {
        ArrayList<TextureDescriptor> v = (ArrayList<TextureDescriptor>)rawObj;
        JSONArray obj = new JSONArray();
        for(TextureDescriptor i : v) {
          obj.put(toJSON(Type.TextureDescriptor,i));
        }
        return obj;
      }
      case List_FragmentOperation: {
        ArrayList<FragmentOperation> v = (ArrayList<FragmentOperation>)rawObj;
        JSONArray obj = new JSONArray();
        for(FragmentOperation i : v) {
          obj.put(toJSON(Type.FragmentOperation,i));
        }
        return obj;
      }
      case Maybe_Int: {
        Maybe<Integer> v = (Maybe<Integer>)rawObj;
        if (v.valid) {
          return toJSON(Type.Int,v.data);
        }
        return JSONObject.NULL;
      }
      case Maybe_Float: {
        Maybe<Float> v = (Maybe<Float>)rawObj;
        if (v.valid) {
          return toJSON(Type.Float,v.data);
        }
        return JSONObject.NULL;
      }
      case Maybe_String: {
        Maybe<String> v = (Maybe<String>)rawObj;
        if (v.valid) {
          return toJSON(Type.String,v.data);
        }
        return JSONObject.NULL;
      }
      case Maybe_ComparisonFunction: {
        Maybe<ComparisonFunction> v = (Maybe<ComparisonFunction>)rawObj;
        if (v.valid) {
          return toJSON(Type.ComparisonFunction,v.data);
        }
        return JSONObject.NULL;
      }
      case Maybe_EdgeMode: {
        Maybe<EdgeMode> v = (Maybe<EdgeMode>)rawObj;
        if (v.valid) {
          return toJSON(Type.EdgeMode,v.data);
        }
        return JSONObject.NULL;
      }
      case Maybe_ImageRef: {
        Maybe<ImageRef> v = (Maybe<ImageRef>)rawObj;
        if (v.valid) {
          return toJSON(Type.ImageRef,v.data);
        }
        return JSONObject.NULL;
      }
      case Map_String_ArrayValue: {
        HashMap<String, ArrayValue> v = (HashMap<String, ArrayValue>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,ArrayValue> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.ArrayValue,i.getValue()));
        }
        return obj;
      }
      case Map_String_InputType: {
        HashMap<String, InputType> v = (HashMap<String, InputType>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,InputType> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.InputType,i.getValue()));
        }
        return obj;
      }
      case Map_String_Parameter: {
        HashMap<String, Parameter> v = (HashMap<String, Parameter>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,Parameter> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.Parameter,i.getValue()));
        }
        return obj;
      }
    }
    throw new Exception("unknown type");
  }
}