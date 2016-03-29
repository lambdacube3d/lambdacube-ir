// generated file, do not modify!
// 2016-03-29T11:30:13.180467000000Z

using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json.Linq;

using LambdaCube.IR;

namespace LambdaCube.PipelineSchema {
  public class StreamType {
      public enum Tag { 
        Attribute_Word,
        Attribute_V2U,
        Attribute_V3U,
        Attribute_V4U,
        Attribute_Int,
        Attribute_V2I,
        Attribute_V3I,
        Attribute_V4I,
        Attribute_Float,
        Attribute_V2F,
        Attribute_V3F,
        Attribute_V4F,
        Attribute_M22F,
        Attribute_M23F,
        Attribute_M24F,
        Attribute_M32F,
        Attribute_M33F,
        Attribute_M34F,
        Attribute_M42F,
        Attribute_M43F,
        Attribute_M44F
      };
      public Tag tag;
  };

  namespace data { 
  }
  public class ObjectArraySchema {
      public enum Tag { 
        ObjectArraySchema
      };
      public Tag tag;
  };

  namespace data { 
    public class ObjectArraySchema : LambdaCube.PipelineSchema.ObjectArraySchema { 
      public global::LambdaCube.PipelineSchema.FetchPrimitive primitive;
      public Dictionary<string, global::LambdaCube.PipelineSchema.StreamType> attributes;
      public ObjectArraySchema() { tag = LambdaCube.PipelineSchema.ObjectArraySchema.Tag.ObjectArraySchema; }
    };
  }
  public class PipelineSchema {
      public enum Tag { 
        PipelineSchema
      };
      public Tag tag;
  };

  namespace data { 
    public class PipelineSchema : LambdaCube.PipelineSchema.PipelineSchema { 
      public Dictionary<string, global::LambdaCube.PipelineSchema.ObjectArraySchema> objectArrays;
      public Dictionary<string, global::LambdaCube.PipelineSchema.InputType> uniforms;
      public PipelineSchema() { tag = LambdaCube.PipelineSchema.PipelineSchema.Tag.PipelineSchema; }
    };
  }

  // JSON deserializer
  public enum Type { 
    String,
    Map_String_InputType,
    Map_String_ObjectArraySchema,
    Map_String_StreamType,
    FetchPrimitive,
    InputType,
    ObjectArraySchema,
    PipelineSchema,
    StreamType
  }

  public class Loader {
    public static object fromJSON(Type type, JToken obj) {
      switch (type) {
        case Type.String: return (string)obj;
        case Type.Map_String_InputType: {
          var map = new Dictionary<string, global::LambdaCube.PipelineSchema.InputType> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.PipelineSchema.InputType)fromJSON(Type.InputType,i.Value));
          }
          return map;
        }
        case Type.Map_String_ObjectArraySchema: {
          var map = new Dictionary<string, global::LambdaCube.PipelineSchema.ObjectArraySchema> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.PipelineSchema.ObjectArraySchema)fromJSON(Type.ObjectArraySchema,i.Value));
          }
          return map;
        }
        case Type.Map_String_StreamType: {
          var map = new Dictionary<string, global::LambdaCube.PipelineSchema.StreamType> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::LambdaCube.PipelineSchema.StreamType)fromJSON(Type.StreamType,i.Value));
          }
          return map;
        }

        case Type.StreamType: {
          string tag = (string)obj["tag"];
          StreamType.Tag tagType;
          switch (tag) {
            case "Attribute_Word": tagType = StreamType.Tag.Attribute_Word; break;
            case "Attribute_V2U": tagType = StreamType.Tag.Attribute_V2U; break;
            case "Attribute_V3U": tagType = StreamType.Tag.Attribute_V3U; break;
            case "Attribute_V4U": tagType = StreamType.Tag.Attribute_V4U; break;
            case "Attribute_Int": tagType = StreamType.Tag.Attribute_Int; break;
            case "Attribute_V2I": tagType = StreamType.Tag.Attribute_V2I; break;
            case "Attribute_V3I": tagType = StreamType.Tag.Attribute_V3I; break;
            case "Attribute_V4I": tagType = StreamType.Tag.Attribute_V4I; break;
            case "Attribute_Float": tagType = StreamType.Tag.Attribute_Float; break;
            case "Attribute_V2F": tagType = StreamType.Tag.Attribute_V2F; break;
            case "Attribute_V3F": tagType = StreamType.Tag.Attribute_V3F; break;
            case "Attribute_V4F": tagType = StreamType.Tag.Attribute_V4F; break;
            case "Attribute_M22F": tagType = StreamType.Tag.Attribute_M22F; break;
            case "Attribute_M23F": tagType = StreamType.Tag.Attribute_M23F; break;
            case "Attribute_M24F": tagType = StreamType.Tag.Attribute_M24F; break;
            case "Attribute_M32F": tagType = StreamType.Tag.Attribute_M32F; break;
            case "Attribute_M33F": tagType = StreamType.Tag.Attribute_M33F; break;
            case "Attribute_M34F": tagType = StreamType.Tag.Attribute_M34F; break;
            case "Attribute_M42F": tagType = StreamType.Tag.Attribute_M42F; break;
            case "Attribute_M43F": tagType = StreamType.Tag.Attribute_M43F; break;
            case "Attribute_M44F": tagType = StreamType.Tag.Attribute_M44F; break;
            default: throw new Exception("unknown constructor: " + tag);
          }
          StreamType o = new StreamType();
          o.tag = tagType;
          return o;
        }
        case Type.ObjectArraySchema: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "ObjectArraySchema": {
              data.ObjectArraySchema tv = new data.ObjectArraySchema();
              tv.primitive = (global::LambdaCube.PipelineSchema.FetchPrimitive)fromJSON(Type.FetchPrimitive,obj["primitive"]);
              tv.attributes = (Dictionary<string, global::LambdaCube.PipelineSchema.StreamType>)fromJSON(Type.Map_String_StreamType,obj["attributes"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.PipelineSchema: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "PipelineSchema": {
              data.PipelineSchema tv = new data.PipelineSchema();
              tv.objectArrays = (Dictionary<string, global::LambdaCube.PipelineSchema.ObjectArraySchema>)fromJSON(Type.Map_String_ObjectArraySchema,obj["objectArrays"]);
              tv.uniforms = (Dictionary<string, global::LambdaCube.PipelineSchema.InputType>)fromJSON(Type.Map_String_InputType,obj["uniforms"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    public static JToken toJSON(StreamType v) {
      var obj = new JObject();
      switch (v.tag) { 
        case StreamType.Tag.Attribute_Word:
          obj["tag"] = "Attribute_Word";
          break;
        case StreamType.Tag.Attribute_V2U:
          obj["tag"] = "Attribute_V2U";
          break;
        case StreamType.Tag.Attribute_V3U:
          obj["tag"] = "Attribute_V3U";
          break;
        case StreamType.Tag.Attribute_V4U:
          obj["tag"] = "Attribute_V4U";
          break;
        case StreamType.Tag.Attribute_Int:
          obj["tag"] = "Attribute_Int";
          break;
        case StreamType.Tag.Attribute_V2I:
          obj["tag"] = "Attribute_V2I";
          break;
        case StreamType.Tag.Attribute_V3I:
          obj["tag"] = "Attribute_V3I";
          break;
        case StreamType.Tag.Attribute_V4I:
          obj["tag"] = "Attribute_V4I";
          break;
        case StreamType.Tag.Attribute_Float:
          obj["tag"] = "Attribute_Float";
          break;
        case StreamType.Tag.Attribute_V2F:
          obj["tag"] = "Attribute_V2F";
          break;
        case StreamType.Tag.Attribute_V3F:
          obj["tag"] = "Attribute_V3F";
          break;
        case StreamType.Tag.Attribute_V4F:
          obj["tag"] = "Attribute_V4F";
          break;
        case StreamType.Tag.Attribute_M22F:
          obj["tag"] = "Attribute_M22F";
          break;
        case StreamType.Tag.Attribute_M23F:
          obj["tag"] = "Attribute_M23F";
          break;
        case StreamType.Tag.Attribute_M24F:
          obj["tag"] = "Attribute_M24F";
          break;
        case StreamType.Tag.Attribute_M32F:
          obj["tag"] = "Attribute_M32F";
          break;
        case StreamType.Tag.Attribute_M33F:
          obj["tag"] = "Attribute_M33F";
          break;
        case StreamType.Tag.Attribute_M34F:
          obj["tag"] = "Attribute_M34F";
          break;
        case StreamType.Tag.Attribute_M42F:
          obj["tag"] = "Attribute_M42F";
          break;
        case StreamType.Tag.Attribute_M43F:
          obj["tag"] = "Attribute_M43F";
          break;
        case StreamType.Tag.Attribute_M44F:
          obj["tag"] = "Attribute_M44F";
          break;
      }
      return obj;
    }
    public static JToken toJSON(ObjectArraySchema v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ObjectArraySchema.Tag.ObjectArraySchema:
          obj["tag"] = "ObjectArraySchema";
          {
            var tv = (data.ObjectArraySchema)v;
            obj["primitive"] = toJSON(tv.primitive);
            obj["attributes"] = toJSON(tv.attributes);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(PipelineSchema v) {
      var obj = new JObject();
      switch (v.tag) { 
        case PipelineSchema.Tag.PipelineSchema:
          obj["tag"] = "PipelineSchema";
          {
            var tv = (data.PipelineSchema)v;
            obj["objectArrays"] = toJSON(tv.objectArrays);
            obj["uniforms"] = toJSON(tv.uniforms);
          }
          break;
      }
      return obj;
    }

    public static JToken toJSON(string v) { return new JValue(v); }
    public static JToken toJSON(Dictionary<string, global::LambdaCube.PipelineSchema.InputType> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, global::LambdaCube.PipelineSchema.ObjectArraySchema> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, global::LambdaCube.PipelineSchema.StreamType> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
  }
}
