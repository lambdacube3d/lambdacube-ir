// generated file, do not modify!
// 2016-03-21T14:06:55.404479000000Z

package LambdaCube.Mesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.*;
import RT.*;


public class JSON {
  // JSON deserializer
  public enum Type { 
    Int32,
    Word32,
    Float,
    String,
    V2_Float,
    V2_V2_Float,
    V3_Float,
    V3_V3_Float,
    V4_Float,
    V4_V4_Float,
    Array_Int32,
    Array_Word32,
    Array_Float,
    Array_V2_Float,
    Array_V2_V2_Float,
    Array_V3_Float,
    Array_V3_V3_Float,
    Array_V4_Float,
    Array_V4_V4_Float,
    Map_String_MeshAttribute,
    Mesh,
    MeshAttribute,
    MeshPrimitive
  }

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case Int32: return (Integer)rawObj;
      case Word32: return (Integer)rawObj;
      case Float: return (Float)rawObj;
      case String: return (String)rawObj;
      case V2_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<Float>
          ( (Float)fromJSON(Type.Float,obj.get("x"))
          , (Float)fromJSON(Type.Float,obj.get("y"))
          );
      }
      case V2_V2_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V2<V2<Float>>
          ( (V2<Float>)fromJSON(Type.V2_Float,obj.get("x"))
          , (V2<Float>)fromJSON(Type.V2_Float,obj.get("y"))
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
      case V3_V3_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V3<V3<Float>>
          ( (V3<Float>)fromJSON(Type.V3_Float,obj.get("x"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("y"))
          , (V3<Float>)fromJSON(Type.V3_Float,obj.get("z"))
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
      case V4_V4_Float: {
        JSONObject obj = (JSONObject)rawObj;
        return new V4<V4<Float>>
          ( (V4<Float>)fromJSON(Type.V4_Float,obj.get("x"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("y"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("z"))
          , (V4<Float>)fromJSON(Type.V4_Float,obj.get("w"))
          );
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
      case Array_V2_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<V2<Float>> v = new ArrayList<V2<Float>> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((V2<Float>)fromJSON (Type.V2_Float, obj.get(i)));
        }
        return v;
      }
      case Array_V2_V2_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<V2<V2<Float>>> v = new ArrayList<V2<V2<Float>>> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((V2<V2<Float>>)fromJSON (Type.V2_V2_Float, obj.get(i)));
        }
        return v;
      }
      case Array_V3_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<V3<Float>> v = new ArrayList<V3<Float>> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((V3<Float>)fromJSON (Type.V3_Float, obj.get(i)));
        }
        return v;
      }
      case Array_V3_V3_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<V3<V3<Float>>> v = new ArrayList<V3<V3<Float>>> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((V3<V3<Float>>)fromJSON (Type.V3_V3_Float, obj.get(i)));
        }
        return v;
      }
      case Array_V4_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<V4<Float>> v = new ArrayList<V4<Float>> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((V4<Float>)fromJSON (Type.V4_Float, obj.get(i)));
        }
        return v;
      }
      case Array_V4_V4_Float: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<V4<V4<Float>>> v = new ArrayList<V4<V4<Float>>> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((V4<V4<Float>>)fromJSON (Type.V4_V4_Float, obj.get(i)));
        }
        return v;
      }
      case Map_String_MeshAttribute: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, MeshAttribute> map = new HashMap<String, MeshAttribute> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (MeshAttribute)fromJSON(Type.MeshAttribute,obj.get(key)));
        }
        return map;
      }

      case MeshAttribute: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "A_Float": {
            MeshAttribute.A_Float_ tv = new MeshAttribute().new A_Float_();
            tv._0 = (ArrayList<Float>)fromJSON(Type.Array_Float,obj.get("arg0"));
            return tv;
          }
          case "A_V2F": {
            MeshAttribute.A_V2F_ tv = new MeshAttribute().new A_V2F_();
            tv._0 = (ArrayList<V2<Float>>)fromJSON(Type.Array_V2_Float,obj.get("arg0"));
            return tv;
          }
          case "A_V3F": {
            MeshAttribute.A_V3F_ tv = new MeshAttribute().new A_V3F_();
            tv._0 = (ArrayList<V3<Float>>)fromJSON(Type.Array_V3_Float,obj.get("arg0"));
            return tv;
          }
          case "A_V4F": {
            MeshAttribute.A_V4F_ tv = new MeshAttribute().new A_V4F_();
            tv._0 = (ArrayList<V4<Float>>)fromJSON(Type.Array_V4_Float,obj.get("arg0"));
            return tv;
          }
          case "A_M22F": {
            MeshAttribute.A_M22F_ tv = new MeshAttribute().new A_M22F_();
            tv._0 = (ArrayList<V2<V2<Float>>>)fromJSON(Type.Array_V2_V2_Float,obj.get("arg0"));
            return tv;
          }
          case "A_M33F": {
            MeshAttribute.A_M33F_ tv = new MeshAttribute().new A_M33F_();
            tv._0 = (ArrayList<V3<V3<Float>>>)fromJSON(Type.Array_V3_V3_Float,obj.get("arg0"));
            return tv;
          }
          case "A_M44F": {
            MeshAttribute.A_M44F_ tv = new MeshAttribute().new A_M44F_();
            tv._0 = (ArrayList<V4<V4<Float>>>)fromJSON(Type.Array_V4_V4_Float,obj.get("arg0"));
            return tv;
          }
          case "A_Int": {
            MeshAttribute.A_Int_ tv = new MeshAttribute().new A_Int_();
            tv._0 = (ArrayList<Integer>)fromJSON(Type.Array_Int32,obj.get("arg0"));
            return tv;
          }
          case "A_Word": {
            MeshAttribute.A_Word_ tv = new MeshAttribute().new A_Word_();
            tv._0 = (ArrayList<Integer>)fromJSON(Type.Array_Word32,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case MeshPrimitive: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        MeshPrimitive.Tag tagType;
        switch (tag) {
          case "P_Points": tagType = MeshPrimitive.Tag.P_Points; break;
          case "P_TriangleStrip": tagType = MeshPrimitive.Tag.P_TriangleStrip; break;
          case "P_Triangles": tagType = MeshPrimitive.Tag.P_Triangles; break;
          case "P_TriangleStripI": {
            MeshPrimitive.P_TriangleStripI_ tv = new MeshPrimitive().new P_TriangleStripI_();
            tv._0 = (ArrayList<Integer>)fromJSON(Type.Array_Int32,obj.get("arg0"));
            return tv;
          }
          case "P_TrianglesI": {
            MeshPrimitive.P_TrianglesI_ tv = new MeshPrimitive().new P_TrianglesI_();
            tv._0 = (ArrayList<Integer>)fromJSON(Type.Array_Int32,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
        MeshPrimitive o = new MeshPrimitive();
        o.tag = tagType;
        return o;
      }
      case Mesh: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Mesh": {
            Mesh.Mesh_ tv = new Mesh().new Mesh_();
            tv.mAttributes = (HashMap<String, MeshAttribute>)fromJSON(Type.Map_String_MeshAttribute,obj.get("mAttributes"));
            tv.mPrimitive = (MeshPrimitive)fromJSON(Type.MeshPrimitive,obj.get("mPrimitive"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
    }
    throw new Exception("unknown type");
  }
}