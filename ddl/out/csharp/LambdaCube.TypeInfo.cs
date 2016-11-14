// generated file, do not modify!
// 2016-11-11T11:17:03.605012000000Z

using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json.Linq;

using LambdaCube.IR;

namespace LambdaCube.TypeInfo {
  public class Range {
      public enum Tag { 
        Range
      };
      public Tag tag;
  };

  namespace data { 
    public class Range : LambdaCube.TypeInfo.Range { 
      public int startLine;
      public int startColumn;
      public int endLine;
      public int endColumn;
      public Range() { tag = LambdaCube.TypeInfo.Range.Tag.Range; }
    };
  }
  public class TypeInfo {
      public enum Tag { 
        TypeInfo
      };
      public Tag tag;
  };

  namespace data { 
    public class TypeInfo : LambdaCube.TypeInfo.TypeInfo { 
      public global::LambdaCube.TypeInfo.Range range;
      public string text;
      public TypeInfo() { tag = LambdaCube.TypeInfo.TypeInfo.Tag.TypeInfo; }
    };
  }
  public class WarningInfo {
      public enum Tag { 
        WarningInfo
      };
      public Tag tag;
  };

  namespace data { 
    public class WarningInfo : LambdaCube.TypeInfo.WarningInfo { 
      public global::LambdaCube.TypeInfo.Range wRange;
      public string wText;
      public WarningInfo() { tag = LambdaCube.TypeInfo.WarningInfo.Tag.WarningInfo; }
    };
  }
  public class ErrorInfo {
      public enum Tag { 
        ErrorInfo
      };
      public Tag tag;
  };

  namespace data { 
    public class ErrorInfo : LambdaCube.TypeInfo.ErrorInfo { 
      public global::LambdaCube.TypeInfo.Range eRange;
      public string eText;
      public ErrorInfo() { tag = LambdaCube.TypeInfo.ErrorInfo.Tag.ErrorInfo; }
    };
  }
  public class CompileResult {
      public enum Tag { 
        CompileError,
        Compiled
      };
      public Tag tag;
  };

  namespace data { 
    public class CompileError : LambdaCube.TypeInfo.CompileResult { 
      public string _0;
      public List<global::LambdaCube.TypeInfo.TypeInfo> _1;
      public List<global::LambdaCube.TypeInfo.WarningInfo> _2;
      public List<global::LambdaCube.TypeInfo.ErrorInfo> _3;
      public CompileError() { tag = LambdaCube.TypeInfo.CompileResult.Tag.CompileError; }
    };
    public class Compiled : LambdaCube.TypeInfo.CompileResult { 
      public string _0;
      public string _1;
      public global::LambdaCube.TypeInfo.Pipeline _2;
      public List<global::LambdaCube.TypeInfo.TypeInfo> _3;
      public List<global::LambdaCube.TypeInfo.WarningInfo> _4;
      public Compiled() { tag = LambdaCube.TypeInfo.CompileResult.Tag.Compiled; }
    };
  }

  // JSON deserializer
  public enum Type { 
    Int,
    String,
    Array_ErrorInfo,
    Array_TypeInfo,
    Array_WarningInfo,
    CompileResult,
    ErrorInfo,
    Pipeline,
    Range,
    TypeInfo,
    WarningInfo
  }

  public class Loader {
    public static object fromJSON(Type type, JToken obj) {
      switch (type) {
        case Type.Int: return (int)obj;
        case Type.String: return (string)obj;
        case Type.Array_ErrorInfo: return ((JArray)obj).Select(x => (global::LambdaCube.TypeInfo.ErrorInfo)fromJSON (Type.ErrorInfo, x)).ToList();
        case Type.Array_TypeInfo: return ((JArray)obj).Select(x => (global::LambdaCube.TypeInfo.TypeInfo)fromJSON (Type.TypeInfo, x)).ToList();
        case Type.Array_WarningInfo: return ((JArray)obj).Select(x => (global::LambdaCube.TypeInfo.WarningInfo)fromJSON (Type.WarningInfo, x)).ToList();

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
        case Type.WarningInfo: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "WarningInfo": {
              data.WarningInfo tv = new data.WarningInfo();
              tv.wRange = (global::LambdaCube.TypeInfo.Range)fromJSON(Type.Range,obj["wRange"]);
              tv.wText = (string)fromJSON(Type.String,obj["wText"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.ErrorInfo: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "ErrorInfo": {
              data.ErrorInfo tv = new data.ErrorInfo();
              tv.eRange = (global::LambdaCube.TypeInfo.Range)fromJSON(Type.Range,obj["eRange"]);
              tv.eText = (string)fromJSON(Type.String,obj["eText"]);
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
              tv._0 = (string)fromJSON(Type.String,obj["arg0"]);
              tv._1 = (List<global::LambdaCube.TypeInfo.TypeInfo>)fromJSON(Type.Array_TypeInfo,obj["arg1"]);
              tv._2 = (List<global::LambdaCube.TypeInfo.WarningInfo>)fromJSON(Type.Array_WarningInfo,obj["arg2"]);
              tv._3 = (List<global::LambdaCube.TypeInfo.ErrorInfo>)fromJSON(Type.Array_ErrorInfo,obj["arg3"]);
              return tv;
            }
            case "Compiled": {
              data.Compiled tv = new data.Compiled();
              tv._0 = (string)fromJSON(Type.String,obj["arg0"]);
              tv._1 = (string)fromJSON(Type.String,obj["arg1"]);
              tv._2 = (global::LambdaCube.TypeInfo.Pipeline)fromJSON(Type.Pipeline,obj["arg2"]);
              tv._3 = (List<global::LambdaCube.TypeInfo.TypeInfo>)fromJSON(Type.Array_TypeInfo,obj["arg3"]);
              tv._4 = (List<global::LambdaCube.TypeInfo.WarningInfo>)fromJSON(Type.Array_WarningInfo,obj["arg4"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    public static JToken toJSON(Range v) {
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
    public static JToken toJSON(TypeInfo v) {
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
    public static JToken toJSON(WarningInfo v) {
      var obj = new JObject();
      switch (v.tag) { 
        case WarningInfo.Tag.WarningInfo:
          obj["tag"] = "WarningInfo";
          {
            var tv = (data.WarningInfo)v;
            obj["wRange"] = toJSON(tv.wRange);
            obj["wText"] = toJSON(tv.wText);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(ErrorInfo v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ErrorInfo.Tag.ErrorInfo:
          obj["tag"] = "ErrorInfo";
          {
            var tv = (data.ErrorInfo)v;
            obj["eRange"] = toJSON(tv.eRange);
            obj["eText"] = toJSON(tv.eText);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(CompileResult v) {
      var obj = new JObject();
      switch (v.tag) { 
        case CompileResult.Tag.CompileError:
          obj["tag"] = "CompileError";
          {
            var tv = (data.CompileError)v;
            obj["arg0"] = toJSON(tv._0);
            obj["arg1"] = toJSON(tv._1);
            obj["arg2"] = toJSON(tv._2);
            obj["arg3"] = toJSON(tv._3);
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
            obj["arg4"] = toJSON(tv._4);
          }
          break;
      }
      return obj;
    }

    public static JToken toJSON(int v) { return new JValue(v); }
    public static JToken toJSON(string v) { return new JValue(v); }
    public static JToken toJSON(List<global::LambdaCube.TypeInfo.ErrorInfo> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.TypeInfo.TypeInfo> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::LambdaCube.TypeInfo.WarningInfo> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
  }
}
