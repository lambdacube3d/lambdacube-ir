// generated file, do not modify!
// 2016-03-21T13:31:10.335329000000Z

using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json.Linq;


namespace LambdaCube.Mesh {
  class MeshAttribute {
      public enum Tag { 
        A_Float,
        A_V2F,
        A_V3F,
        A_V4F,
        A_M22F,
        A_M33F,
        A_M44F,
        A_Int,
        A_Word
      };
      public Tag tag;
  };

  namespace data { 
    class A_Float : LambdaCube.Mesh.MeshAttribute { 
      public List<float> _0;
      public A_Float() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_Float; }
    };
    class A_V2F : LambdaCube.Mesh.MeshAttribute { 
      public List<V2<float>> _0;
      public A_V2F() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_V2F; }
    };
    class A_V3F : LambdaCube.Mesh.MeshAttribute { 
      public List<V3<float>> _0;
      public A_V3F() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_V3F; }
    };
    class A_V4F : LambdaCube.Mesh.MeshAttribute { 
      public List<V4<float>> _0;
      public A_V4F() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_V4F; }
    };
    class A_M22F : LambdaCube.Mesh.MeshAttribute { 
      public List<V2<V2<float>>> _0;
      public A_M22F() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_M22F; }
    };
    class A_M33F : LambdaCube.Mesh.MeshAttribute { 
      public List<V3<V3<float>>> _0;
      public A_M33F() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_M33F; }
    };
    class A_M44F : LambdaCube.Mesh.MeshAttribute { 
      public List<V4<V4<float>>> _0;
      public A_M44F() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_M44F; }
    };
    class A_Int : LambdaCube.Mesh.MeshAttribute { 
      public List<int> _0;
      public A_Int() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_Int; }
    };
    class A_Word : LambdaCube.Mesh.MeshAttribute { 
      public List<uint> _0;
      public A_Word() { tag = LambdaCube.Mesh.MeshAttribute.Tag.A_Word; }
    };
  }
  class MeshPrimitive {
      public enum Tag { 
        P_Points,
        P_TriangleStrip,
        P_Triangles,
        P_TriangleStripI,
        P_TrianglesI
      };
      public Tag tag;
  };

  namespace data { 
    class P_TriangleStripI : LambdaCube.Mesh.MeshPrimitive { 
      public List<int> _0;
      public P_TriangleStripI() { tag = LambdaCube.Mesh.MeshPrimitive.Tag.P_TriangleStripI; }
    };
    class P_TrianglesI : LambdaCube.Mesh.MeshPrimitive { 
      public List<int> _0;
      public P_TrianglesI() { tag = LambdaCube.Mesh.MeshPrimitive.Tag.P_TrianglesI; }
    };
  }
  class Mesh {
      public enum Tag { 
        Mesh
      };
      public Tag tag;
  };

  namespace data { 
    class Mesh : LambdaCube.Mesh.Mesh { 
      public Dictionary<string, global::LambdaCube.Mesh.MeshAttribute> mAttributes;
      public global::LambdaCube.Mesh.MeshPrimitive mPrimitive;
      public Mesh() { tag = LambdaCube.Mesh.Mesh.Tag.Mesh; }
    };
  }

  // JSON deserializer
  enum Type { 
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

  class Loader {
    public static object fromJSON(Type type, JToken obj) {
      switch (type) {
        case Type.Int32: return (int)obj;
        case Type.Word32: return (uint)obj;
        case Type.Float: return (float)obj;
        case Type.String: return (string)obj;
        case Type.V2_Float:
          return new V2<float>
            { x = (float)fromJSON(Type.Float,obj["x"])
            , y = (float)fromJSON(Type.Float,obj["y"])
            };
        case Type.V2_V2_Float:
          return new V2<V2<float>>
            { x = (V2<float>)fromJSON(Type.V2_Float,obj["x"])
            , y = (V2<float>)fromJSON(Type.V2_Float,obj["y"])
            };
        case Type.V3_Float:
          return new V3<float>
            { x = (float)fromJSON(Type.Float,obj["x"])
            , y = (float)fromJSON(Type.Float,obj["y"])
            , z = (float)fromJSON(Type.Float,obj["z"])
            };
        case Type.V3_V3_Float:
          return new V3<V3<float>>
            { x = (V3<float>)fromJSON(Type.V3_Float,obj["x"])
            , y = (V3<float>)fromJSON(Type.V3_Float,obj["y"])
            , z = (V3<float>)fromJSON(Type.V3_Float,obj["z"])
            };
        case Type.V4_Float:
          return new V4<float>
            { x = (float)fromJSON(Type.Float,obj["x"])
            , y = (float)fromJSON(Type.Float,obj["y"])
            , z = (float)fromJSON(Type.Float,obj["z"])
            , w = (float)fromJSON(Type.Float,obj["w"])
            };
        case Type.V4_V4_Float:
          return new V4<V4<float>>
            { x = (V4<float>)fromJSON(Type.V4_Float,obj["x"])
            , y = (V4<float>)fromJSON(Type.V4_Float,obj["y"])
            , z = (V4<float>)fromJSON(Type.V4_Float,obj["z"])
            , w = (V4<float>)fromJSON(Type.V4_Float,obj["w"])
            };
        case Type.Array_Int32: return ((JArray)obj).Select(x => fromJSON (Type.Int32, x)).ToList();
        case Type.Array_Word32: return ((JArray)obj).Select(x => fromJSON (Type.Word32, x)).ToList();
        case Type.Array_Float: return ((JArray)obj).Select(x => fromJSON (Type.Float, x)).ToList();
        case Type.Array_V2_Float: return ((JArray)obj).Select(x => fromJSON (Type.V2_Float, x)).ToList();
        case Type.Array_V2_V2_Float: return ((JArray)obj).Select(x => fromJSON (Type.V2_V2_Float, x)).ToList();
        case Type.Array_V3_Float: return ((JArray)obj).Select(x => fromJSON (Type.V3_Float, x)).ToList();
        case Type.Array_V3_V3_Float: return ((JArray)obj).Select(x => fromJSON (Type.V3_V3_Float, x)).ToList();
        case Type.Array_V4_Float: return ((JArray)obj).Select(x => fromJSON (Type.V4_Float, x)).ToList();
        case Type.Array_V4_V4_Float: return ((JArray)obj).Select(x => fromJSON (Type.V4_V4_Float, x)).ToList();
        case Type.Map_String_MeshAttribute: {
          var map = new Dictionary<string, global::LambdaCube.Mesh.MeshAttribute> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.Mesh.MeshAttribute)fromJSON(Type.MeshAttribute,i.Value));
          }
          return map;
        }

        case Type.MeshAttribute: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "A_Float": {
              data.A_Float tv = new data.A_Float();
              tv._0 = (List<float>)fromJSON(Type.Array_Float,obj["arg0"]);
              return tv;
            }
            case "A_V2F": {
              data.A_V2F tv = new data.A_V2F();
              tv._0 = (List<V2<float>>)fromJSON(Type.Array_V2_Float,obj["arg0"]);
              return tv;
            }
            case "A_V3F": {
              data.A_V3F tv = new data.A_V3F();
              tv._0 = (List<V3<float>>)fromJSON(Type.Array_V3_Float,obj["arg0"]);
              return tv;
            }
            case "A_V4F": {
              data.A_V4F tv = new data.A_V4F();
              tv._0 = (List<V4<float>>)fromJSON(Type.Array_V4_Float,obj["arg0"]);
              return tv;
            }
            case "A_M22F": {
              data.A_M22F tv = new data.A_M22F();
              tv._0 = (List<V2<V2<float>>>)fromJSON(Type.Array_V2_V2_Float,obj["arg0"]);
              return tv;
            }
            case "A_M33F": {
              data.A_M33F tv = new data.A_M33F();
              tv._0 = (List<V3<V3<float>>>)fromJSON(Type.Array_V3_V3_Float,obj["arg0"]);
              return tv;
            }
            case "A_M44F": {
              data.A_M44F tv = new data.A_M44F();
              tv._0 = (List<V4<V4<float>>>)fromJSON(Type.Array_V4_V4_Float,obj["arg0"]);
              return tv;
            }
            case "A_Int": {
              data.A_Int tv = new data.A_Int();
              tv._0 = (List<int>)fromJSON(Type.Array_Int32,obj["arg0"]);
              return tv;
            }
            case "A_Word": {
              data.A_Word tv = new data.A_Word();
              tv._0 = (List<uint>)fromJSON(Type.Array_Word32,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.MeshPrimitive: {
          string tag = (string)obj["tag"];
          MeshPrimitive.Tag tagType;
          switch (tag) {
            case "P_Points": tagType = MeshPrimitive.Tag.P_Points; break;
            case "P_TriangleStrip": tagType = MeshPrimitive.Tag.P_TriangleStrip; break;
            case "P_Triangles": tagType = MeshPrimitive.Tag.P_Triangles; break;
            case "P_TriangleStripI": {
              data.P_TriangleStripI tv = new data.P_TriangleStripI();
              tv._0 = (List<int>)fromJSON(Type.Array_Int32,obj["arg0"]);
              return tv;
            }
            case "P_TrianglesI": {
              data.P_TrianglesI tv = new data.P_TrianglesI();
              tv._0 = (List<int>)fromJSON(Type.Array_Int32,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
          MeshPrimitive o = new MeshPrimitive();
          o.tag = tagType;
          return o;
        }
        case Type.Mesh: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Mesh": {
              data.Mesh tv = new data.Mesh();
              tv.mAttributes = (Dictionary<string, global::LambdaCube.Mesh.MeshAttribute>)fromJSON(Type.Map_String_MeshAttribute,obj["mAttributes"]);
              tv.mPrimitive = (global::LambdaCube.Mesh.MeshPrimitive)fromJSON(Type.MeshPrimitive,obj["mPrimitive"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    JToken toJSON(MeshAttribute v) {
      var obj = new JObject();
      switch (v.tag) { 
        case MeshAttribute.Tag.A_Float:
          obj["tag"] = "A_Float";
          {
            var tv = (data.A_Float)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_V2F:
          obj["tag"] = "A_V2F";
          {
            var tv = (data.A_V2F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_V3F:
          obj["tag"] = "A_V3F";
          {
            var tv = (data.A_V3F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_V4F:
          obj["tag"] = "A_V4F";
          {
            var tv = (data.A_V4F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_M22F:
          obj["tag"] = "A_M22F";
          {
            var tv = (data.A_M22F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_M33F:
          obj["tag"] = "A_M33F";
          {
            var tv = (data.A_M33F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_M44F:
          obj["tag"] = "A_M44F";
          {
            var tv = (data.A_M44F)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_Int:
          obj["tag"] = "A_Int";
          {
            var tv = (data.A_Int)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshAttribute.Tag.A_Word:
          obj["tag"] = "A_Word";
          {
            var tv = (data.A_Word)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(MeshPrimitive v) {
      var obj = new JObject();
      switch (v.tag) { 
        case MeshPrimitive.Tag.P_Points:
          obj["tag"] = "P_Points";
          break;
        case MeshPrimitive.Tag.P_TriangleStrip:
          obj["tag"] = "P_TriangleStrip";
          break;
        case MeshPrimitive.Tag.P_Triangles:
          obj["tag"] = "P_Triangles";
          break;
        case MeshPrimitive.Tag.P_TriangleStripI:
          obj["tag"] = "P_TriangleStripI";
          {
            var tv = (data.P_TriangleStripI)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case MeshPrimitive.Tag.P_TrianglesI:
          obj["tag"] = "P_TrianglesI";
          {
            var tv = (data.P_TrianglesI)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(Mesh v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Mesh.Tag.Mesh:
          obj["tag"] = "Mesh";
          {
            var tv = (data.Mesh)v;
            obj["mAttributes"] = toJSON(tv.mAttributes);
            obj["mPrimitive"] = toJSON(tv.mPrimitive);
          }
          break;
      }
      return obj;
    }

    JToken toJSON(int v) { return new JValue(v); }
    JToken toJSON(uint v) { return new JValue(v); }
    JToken toJSON(float v) { return new JValue(v); }
    JToken toJSON(string v) { return new JValue(v); }
    JToken toJSON(V2<float> v) {
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
    JToken toJSON(V3<float> v) {
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
    JToken toJSON(V4<float> v) {
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
    JToken toJSON(List<V2<float>> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<V2<V2<float>>> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<V3<float>> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<V3<V3<float>>> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<V4<float>> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<V4<V4<float>>> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(Dictionary<string, global::LambdaCube.Mesh.MeshAttribute> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
  }
}
