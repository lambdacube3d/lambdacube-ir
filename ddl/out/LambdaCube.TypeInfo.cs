// generated file, do not modify!
// 2016-03-21T14:06:55.479415000000Z

using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json.Linq;

using LambdaCube.IR;

namespace LambdaCube.TypeInfo {
  class Range {
      public enum Tag { 
        Range
      };
      public Tag tag;
  };

  namespace data { 
    class Range : LambdaCube.TypeInfo.Range { 
      public int startLine;
      public int startColumn;
      public int endLine;
      public int endColumn;
      public Range() { tag = LambdaCube.TypeInfo.Range.Tag.Range; }
    };
  }
  class TypeInfo {
      public enum Tag { 
        TypeInfo
      };
      public Tag tag;
  };

  namespace data { 
    class TypeInfo : LambdaCube.TypeInfo.TypeInfo { 
      public global::LambdaCube.TypeInfo.Range range;
      public string text;
      public TypeInfo() { tag = LambdaCube.TypeInfo.TypeInfo.Tag.TypeInfo; }
    };
  }
  class CompileResult {
      public enum Tag { 
        CompileError,
        Compiled
      };
      public Tag tag;
  };

  namespace data { 
    class CompileError : LambdaCube.TypeInfo.CompileResult { 
      public List<global::LambdaCube.TypeInfo.Range> _0;
      public string _1;
      public List<global::LambdaCube.TypeInfo.TypeInfo> _2;
      public CompileError() { tag = LambdaCube.TypeInfo.CompileResult.Tag.CompileError; }
    };
    class Compiled : LambdaCube.TypeInfo.CompileResult { 
      public string _0;
      public string _1;
      public global::LambdaCube.TypeInfo.Pipeline _2;
      public List<global::LambdaCube.TypeInfo.TypeInfo> _3;
      public Compiled() { tag = LambdaCube.TypeInfo.CompileResult.Tag.Compiled; }
    };
  }

  // JSON deserializer
  enum Type { 
    Int,
    String,
    Array_Range,
    Array_TypeInfo,
    CompileResult,
    Pipeline,
    Range,
    TypeInfo
  }

  class Loader {
    public static object fromJSON(Type type, JToken obj) {
      switch (type) {
        case Type.Int: return (int)obj;
        case Type.String: return (string)obj;
        case Type.Array_Range: return ((JArray)obj).Select(x => fromJSON (Type.Range, x)).ToList();
        case Type.Array_TypeInfo: return ((JArray)obj).Select(x => fromJSON (Type.TypeInfo, x)).ToList();

        case Type.Range: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Range": {
              data.Range tv = new data.Range();
              tv.startLine = (int)fromJSON(Type.Int,obj["startLine"]);
              tv.startColumn = (int)fromJSON(Type.Int,obj["startColumn"]);
              tv.endLine = (int)fromJSON(Type.Int,obj["endLine"]);
              tv.endColumn = (int)fromJSON(Type.Int,obj["endColumn"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.TypeInfo: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "TypeInfo": {
              data.TypeInfo tv = new data.TypeInfo();
              tv.range = (global::LambdaCube.TypeInfo.Range)fromJSON(Type.Range,obj["range"]);
              tv.text = (string)fromJSON(Type.String,obj["text"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.CompileResult: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "CompileError": {
              data.CompileError tv = new data.CompileError();
              tv._0 = (List<global::LambdaCube.TypeInfo.Range>)fromJSON(Type.Array_Range,obj["arg0"]);
              tv._1 = (string)fromJSON(Type.String,obj["arg1"]);
              tv._2 = (List<global::LambdaCube.TypeInfo.TypeInfo>)fromJSON(Type.Array_TypeInfo,obj["arg2"]);
              return tv;
            }
            case "Compiled": {
              data.Compiled tv = new data.Compiled();
              tv._0 = (string)fromJSON(Type.String,obj["arg0"]);
              tv._1 = (string)fromJSON(Type.String,obj["arg1"]);
              tv._2 = (global::LambdaCube.TypeInfo.Pipeline)fromJSON(Type.Pipeline,obj["arg2"]);
              tv._3 = (List<global::LambdaCube.TypeInfo.TypeInfo>)fromJSON(Type.Array_TypeInfo,obj["arg3"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    JToken toJSON(Range v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Range.Tag.Range:
          obj["tag"] = "Range";
          {
            var tv = (data.Range)v;
            obj["startLine"] = toJSON(tv.startLine);
            obj["startColumn"] = toJSON(tv.startColumn);
            obj["endLine"] = toJSON(tv.endLine);
            obj["endColumn"] = toJSON(tv.endColumn);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(TypeInfo v) {
      var obj = new JObject();
      switch (v.tag) { 
        case TypeInfo.Tag.TypeInfo:
          obj["tag"] = "TypeInfo";
          {
            var tv = (data.TypeInfo)v;
            obj["range"] = toJSON(tv.range);
            obj["text"] = toJSON(tv.text);
          }
          break;
      }
      return obj;
    }
    JToken toJSON(CompileResult v) {
      var obj = new JObject();
      switch (v.tag) { 
        case CompileResult.Tag.CompileError:
          obj["tag"] = "CompileError";
          {
            var tv = (data.CompileError)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
          }
          break;
        case CompileResult.Tag.Compiled:
          obj["tag"] = "Compiled";
          {
            var tv = (data.Compiled)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
            obj["arg3"] = toJSON(tv._3);
          }
          break;
      }
      return obj;
    }

    JToken toJSON(int v) { return new JValue(v); }
    JToken toJSON(string v) { return new JValue(v); }
    JToken toJSON(List<global::LambdaCube.TypeInfo.Range> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    JToken toJSON(List<global::LambdaCube.TypeInfo.TypeInfo> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
  }
}
