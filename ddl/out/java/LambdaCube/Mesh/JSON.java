// generated file, do not modify!
// 2016-11-10T16:02:38.260630000000Z

package LambdaCube.Mesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
      case Int32: return ((Number)rawObj).intValue();
      case Word32: return ((Number)rawObj).intValue();
      case Float: return ((Number)rawObj).floatValue();
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

  public static Object toJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case MeshAttribute: {
        MeshAttribute v = (MeshAttribute)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case A_Float:
            obj.put("tag", "A_Float");
            {
              MeshAttribute.A_Float_ tv = (MeshAttribute.A_Float_)v;
              obj.put("arg0", toJSON(Type.Array_Float,tv._0));
            }
            break;
          case A_V2F:
            obj.put("tag", "A_V2F");
            {
              MeshAttribute.A_V2F_ tv = (MeshAttribute.A_V2F_)v;
              obj.put("arg0", toJSON(Type.Array_V2_Float,tv._0));
            }
            break;
          case A_V3F:
            obj.put("tag", "A_V3F");
            {
              MeshAttribute.A_V3F_ tv = (MeshAttribute.A_V3F_)v;
              obj.put("arg0", toJSON(Type.Array_V3_Float,tv._0));
            }
            break;
          case A_V4F:
            obj.put("tag", "A_V4F");
            {
              MeshAttribute.A_V4F_ tv = (MeshAttribute.A_V4F_)v;
              obj.put("arg0", toJSON(Type.Array_V4_Float,tv._0));
            }
            break;
          case A_M22F:
            obj.put("tag", "A_M22F");
            {
              MeshAttribute.A_M22F_ tv = (MeshAttribute.A_M22F_)v;
              obj.put("arg0", toJSON(Type.Array_V2_V2_Float,tv._0));
            }
            break;
          case A_M33F:
            obj.put("tag", "A_M33F");
            {
              MeshAttribute.A_M33F_ tv = (MeshAttribute.A_M33F_)v;
              obj.put("arg0", toJSON(Type.Array_V3_V3_Float,tv._0));
            }
            break;
          case A_M44F:
            obj.put("tag", "A_M44F");
            {
              MeshAttribute.A_M44F_ tv = (MeshAttribute.A_M44F_)v;
              obj.put("arg0", toJSON(Type.Array_V4_V4_Float,tv._0));
            }
            break;
          case A_Int:
            obj.put("tag", "A_Int");
            {
              MeshAttribute.A_Int_ tv = (MeshAttribute.A_Int_)v;
              obj.put("arg0", toJSON(Type.Array_Int32,tv._0));
            }
            break;
          case A_Word:
            obj.put("tag", "A_Word");
            {
              MeshAttribute.A_Word_ tv = (MeshAttribute.A_Word_)v;
              obj.put("arg0", toJSON(Type.Array_Word32,tv._0));
            }
            break;
        }
        return obj;
      }
      case MeshPrimitive: {
        MeshPrimitive v = (MeshPrimitive)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case P_Points:
            obj.put("tag", "P_Points");
            break;
          case P_TriangleStrip:
            obj.put("tag", "P_TriangleStrip");
            break;
          case P_Triangles:
            obj.put("tag", "P_Triangles");
            break;
          case P_TriangleStripI:
            obj.put("tag", "P_TriangleStripI");
            {
              MeshPrimitive.P_TriangleStripI_ tv = (MeshPrimitive.P_TriangleStripI_)v;
              obj.put("arg0", toJSON(Type.Array_Int32,tv._0));
            }
            break;
          case P_TrianglesI:
            obj.put("tag", "P_TrianglesI");
            {
              MeshPrimitive.P_TrianglesI_ tv = (MeshPrimitive.P_TrianglesI_)v;
              obj.put("arg0", toJSON(Type.Array_Int32,tv._0));
            }
            break;
        }
        return obj;
      }
      case Mesh: {
        Mesh v = (Mesh)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Mesh:
            obj.put("tag", "Mesh");
            {
              Mesh.Mesh_ tv = (Mesh.Mesh_)v;
              obj.put("mAttributes", toJSON(Type.Map_String_MeshAttribute,tv.mAttributes));
              obj.put("mPrimitive", toJSON(Type.MeshPrimitive,tv.mPrimitive));
            }
            break;
        }
        return obj;
      }

      case Int32: { return rawObj; }
      case Word32: { return rawObj; }
      case Float: { return rawObj; }
      case String: { return rawObj; }
      case V2_Float: {
        V2<Float> v = (V2<Float>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.Float,v.x));
        obj.put("y", toJSON(Type.Float,v.y));
        return obj;
      }
      case V2_V2_Float: {
        V2<V2<Float>> v = (V2<V2<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V2_Float,v.x));
        obj.put("y", toJSON(Type.V2_Float,v.y));
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
      case V3_V3_Float: {
        V3<V3<Float>> v = (V3<V3<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V3_Float,v.x));
        obj.put("y", toJSON(Type.V3_Float,v.y));
        obj.put("z", toJSON(Type.V3_Float,v.z));
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
      case V4_V4_Float: {
        V4<V4<Float>> v = (V4<V4<Float>>)rawObj;
        JSONObject obj = new JSONObject();
        obj.put("x", toJSON(Type.V4_Float,v.x));
        obj.put("y", toJSON(Type.V4_Float,v.y));
        obj.put("z", toJSON(Type.V4_Float,v.z));
        obj.put("w", toJSON(Type.V4_Float,v.w));
        return obj;
      }
      case Array_Int32: {
        ArrayList<Integer> v = (ArrayList<Integer>)rawObj;
        JSONArray obj = new JSONArray();
        for(Integer i : v) {
          obj.put(toJSON(Type.Int32,i));
        }
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
      case Array_V2_Float: {
        ArrayList<V2<Float>> v = (ArrayList<V2<Float>>)rawObj;
        JSONArray obj = new JSONArray();
        for(V2<Float> i : v) {
          obj.put(toJSON(Type.V2_Float,i));
        }
        return obj;
      }
      case Array_V2_V2_Float: {
        ArrayList<V2<V2<Float>>> v = (ArrayList<V2<V2<Float>>>)rawObj;
        JSONArray obj = new JSONArray();
        for(V2<V2<Float>> i : v) {
          obj.put(toJSON(Type.V2_V2_Float,i));
        }
        return obj;
      }
      case Array_V3_Float: {
        ArrayList<V3<Float>> v = (ArrayList<V3<Float>>)rawObj;
        JSONArray obj = new JSONArray();
        for(V3<Float> i : v) {
          obj.put(toJSON(Type.V3_Float,i));
        }
        return obj;
      }
      case Array_V3_V3_Float: {
        ArrayList<V3<V3<Float>>> v = (ArrayList<V3<V3<Float>>>)rawObj;
        JSONArray obj = new JSONArray();
        for(V3<V3<Float>> i : v) {
          obj.put(toJSON(Type.V3_V3_Float,i));
        }
        return obj;
      }
      case Array_V4_Float: {
        ArrayList<V4<Float>> v = (ArrayList<V4<Float>>)rawObj;
        JSONArray obj = new JSONArray();
        for(V4<Float> i : v) {
          obj.put(toJSON(Type.V4_Float,i));
        }
        return obj;
      }
      case Array_V4_V4_Float: {
        ArrayList<V4<V4<Float>>> v = (ArrayList<V4<V4<Float>>>)rawObj;
        JSONArray obj = new JSONArray();
        for(V4<V4<Float>> i : v) {
          obj.put(toJSON(Type.V4_V4_Float,i));
        }
        return obj;
      }
      case Map_String_MeshAttribute: {
        HashMap<String, MeshAttribute> v = (HashMap<String, MeshAttribute>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,MeshAttribute> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.MeshAttribute,i.getValue()));
        }
        return obj;
      }
    }
    throw new Exception("unknown type");
  }
}