// generated file, do not modify!
// 2016-03-27T21:14:12.566976000000Z

using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json.Linq;

using LambdaCube.IR;
using LambdaCube.Mesh;
using LambdaCube.PipelineSchema;

namespace TestData {
  class ClientInfo {
      public enum Tag { 
        ClientInfo
      };
      public Tag tag;
  };

  namespace data { 
    class ClientInfo : TestData.ClientInfo { 
      public string clientName;
      public global::TestData.Backend clientBackend;
      public ClientInfo() { tag = TestData.ClientInfo.Tag.ClientInfo; }
    };
  }
  class Frame {
      public enum Tag { 
        Frame
      };
      public Tag tag;
  };

  namespace data { 
    class Frame : TestData.Frame { 
      public int renderCount;
      public Dictionary<string, global::TestData.Value> frameUniforms;
      public Dictionary<string, int> frameTextures;
      public Frame() { tag = TestData.Frame.Tag.Frame; }
    };
  }
  class Scene {
      public enum Tag { 
        Scene
      };
      public Tag tag;
  };

  namespace data { 
    class Scene : TestData.Scene { 
      public Dictionary<string, List<int>> objectArrays;
      public int renderTargetWidth;
      public int renderTargetHeight;
      public List<global::TestData.Frame> frames;
      public Scene() { tag = TestData.Scene.Tag.Scene; }
    };
  }
  class PipelineInfo {
      public enum Tag { 
        PipelineInfo
      };
      public Tag tag;
  };

  namespace data { 
    class PipelineInfo : TestData.PipelineInfo { 
      public string pipelineName;
      public global::TestData.Pipeline pipeline;
      public PipelineInfo() { tag = TestData.PipelineInfo.Tag.PipelineInfo; }
    };
  }
  class RenderJob {
      public enum Tag { 
        RenderJob
      };
      public Tag tag;
  };

  namespace data { 
    class RenderJob : TestData.RenderJob { 
      public List<global::TestData.Mesh> meshes;
      public List<string> textures;
      public global::TestData.PipelineSchema schema;
      public List<global::TestData.Scene> scenes;
      public List<global::TestData.PipelineInfo> pipelines;
      public RenderJob() { tag = TestData.RenderJob.Tag.RenderJob; }
    };
  }
  class FrameResult {
      public enum Tag { 
        FrameResult
      };
      public Tag tag;
  };

  namespace data { 
    class FrameResult : TestData.FrameResult { 
      public List<float> frRenderTimes;
      public int frImageWidth;
      public int frImageHeight;
      public FrameResult() { tag = TestData.FrameResult.Tag.FrameResult; }
    };
  }
  class RenderJobResult {
      public enum Tag { 
        RenderJobResult,
        RenderJobError
      };
      public Tag tag;
  };

  namespace data { 
    class RenderJobResult : TestData.RenderJobResult { 
      public global::TestData.FrameResult _0;
      public RenderJobResult() { tag = TestData.RenderJobResult.Tag.RenderJobResult; }
    };
    class RenderJobError : TestData.RenderJobResult { 
      public string _0;
      public RenderJobError() { tag = TestData.RenderJobResult.Tag.RenderJobError; }
    };
  }

  // JSON deserializer
  enum Type { 
    Int,
    Float,
    String,
    Array_Int,
    Array_Float,
    Array_String,
    Array_Frame,
    Array_Mesh,
    Array_PipelineInfo,
    Array_Scene,
    Map_String_Int,
    Map_String_Array_Int,
    Map_String_Value,
    Backend,
    ClientInfo,
    Frame,
    FrameResult,
    Mesh,
    Pipeline,
    PipelineInfo,
    PipelineSchema,
    RenderJob,
    RenderJobResult,
    Scene,
    Value
  }

  class Loader {
    public static object fromJSON(Type type, JToken obj) {
      switch (type) {
        case Type.Int: return (int)obj;
        case Type.Float: return (float)obj;
        case Type.String: return (string)obj;
        case Type.Array_Int: return ((JArray)obj).Select(x => (int)fromJSON (Type.Int, x)).ToList();
        case Type.Array_Float: return ((JArray)obj).Select(x => (float)fromJSON (Type.Float, x)).ToList();
        case Type.Array_String: return ((JArray)obj).Select(x => (string)fromJSON (Type.String, x)).ToList();
        case Type.Array_Frame: return ((JArray)obj).Select(x => (global::TestData.Frame)fromJSON (Type.Frame, x)).ToList();
        case Type.Array_Mesh: return ((JArray)obj).Select(x => (global::TestData.Mesh)fromJSON (Type.Mesh, x)).ToList();
        case Type.Array_PipelineInfo: return ((JArray)obj).Select(x => (global::TestData.PipelineInfo)fromJSON (Type.PipelineInfo, x)).ToList();
        case Type.Array_Scene: return ((JArray)obj).Select(x => (global::TestData.Scene)fromJSON (Type.Scene, x)).ToList();
        case Type.Map_String_Int: {
          var map = new Dictionary<string, int> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (int)fromJSON(Type.Int,i.Value));
          }
          return map;
        }
        case Type.Map_String_Array_Int: {
          var map = new Dictionary<string, List<int>> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (List<int>)fromJSON(Type.Array_Int,i.Value));
          }
          return map;
        }
        case Type.Map_String_Value: {
          var map = new Dictionary<string, global::TestData.Value> ();
          foreach(var i in (JObject)obj) {
            map.Add( (string)fromJSON(Type.String,i.Key)
                   , (global::TestData.Value)fromJSON(Type.Value,i.Value));
          }
          return map;
        }

        case Type.ClientInfo: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "ClientInfo": {
              data.ClientInfo tv = new data.ClientInfo();
              tv.clientName = (string)fromJSON(Type.String,obj["clientName"]);
              tv.clientBackend = (global::TestData.Backend)fromJSON(Type.Backend,obj["clientBackend"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Frame: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Frame": {
              data.Frame tv = new data.Frame();
              tv.renderCount = (int)fromJSON(Type.Int,obj["renderCount"]);
              tv.frameUniforms = (Dictionary<string, global::TestData.Value>)fromJSON(Type.Map_String_Value,obj["frameUniforms"]);
              tv.frameTextures = (Dictionary<string, int>)fromJSON(Type.Map_String_Int,obj["frameTextures"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.Scene: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "Scene": {
              data.Scene tv = new data.Scene();
              tv.objectArrays = (Dictionary<string, List<int>>)fromJSON(Type.Map_String_Array_Int,obj["objectArrays"]);
              tv.renderTargetWidth = (int)fromJSON(Type.Int,obj["renderTargetWidth"]);
              tv.renderTargetHeight = (int)fromJSON(Type.Int,obj["renderTargetHeight"]);
              tv.frames = (List<global::TestData.Frame>)fromJSON(Type.Array_Frame,obj["frames"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.PipelineInfo: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "PipelineInfo": {
              data.PipelineInfo tv = new data.PipelineInfo();
              tv.pipelineName = (string)fromJSON(Type.String,obj["pipelineName"]);
              tv.pipeline = (global::TestData.Pipeline)fromJSON(Type.Pipeline,obj["pipeline"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.RenderJob: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "RenderJob": {
              data.RenderJob tv = new data.RenderJob();
              tv.meshes = (List<global::TestData.Mesh>)fromJSON(Type.Array_Mesh,obj["meshes"]);
              tv.textures = (List<string>)fromJSON(Type.Array_String,obj["textures"]);
              tv.schema = (global::TestData.PipelineSchema)fromJSON(Type.PipelineSchema,obj["schema"]);
              tv.scenes = (List<global::TestData.Scene>)fromJSON(Type.Array_Scene,obj["scenes"]);
              tv.pipelines = (List<global::TestData.PipelineInfo>)fromJSON(Type.Array_PipelineInfo,obj["pipelines"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.FrameResult: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "FrameResult": {
              data.FrameResult tv = new data.FrameResult();
              tv.frRenderTimes = (List<float>)fromJSON(Type.Array_Float,obj["frRenderTimes"]);
              tv.frImageWidth = (int)fromJSON(Type.Int,obj["frImageWidth"]);
              tv.frImageHeight = (int)fromJSON(Type.Int,obj["frImageHeight"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
        case Type.RenderJobResult: {
          string tag = (string)obj["tag"];
          switch (tag) {
            case "RenderJobResult": {
              data.RenderJobResult tv = new data.RenderJobResult();
              tv._0 = (global::TestData.FrameResult)fromJSON(Type.FrameResult,obj["arg0"]);
              return tv;
            }
            case "RenderJobError": {
              data.RenderJobError tv = new data.RenderJobError();
              tv._0 = (string)fromJSON(Type.String,obj["arg0"]);
              return tv;
            }
            default: throw new Exception("unknown constructor: " + tag);
          }
        }
      }
      throw new Exception("unknown type");
      return null;
    }

    public static JToken toJSON(ClientInfo v) {
      var obj = new JObject();
      switch (v.tag) { 
        case ClientInfo.Tag.ClientInfo:
          obj["tag"] = "ClientInfo";
          {
            var tv = (data.ClientInfo)v;
            obj["clientName"] = toJSON(tv.clientName);
            obj["clientBackend"] = toJSON(tv.clientBackend);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(Frame v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Frame.Tag.Frame:
          obj["tag"] = "Frame";
          {
            var tv = (data.Frame)v;
            obj["renderCount"] = toJSON(tv.renderCount);
            obj["frameUniforms"] = toJSON(tv.frameUniforms);
            obj["frameTextures"] = toJSON(tv.frameTextures);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(Scene v) {
      var obj = new JObject();
      switch (v.tag) { 
        case Scene.Tag.Scene:
          obj["tag"] = "Scene";
          {
            var tv = (data.Scene)v;
            obj["objectArrays"] = toJSON(tv.objectArrays);
            obj["renderTargetWidth"] = toJSON(tv.renderTargetWidth);
            obj["renderTargetHeight"] = toJSON(tv.renderTargetHeight);
            obj["frames"] = toJSON(tv.frames);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(PipelineInfo v) {
      var obj = new JObject();
      switch (v.tag) { 
        case PipelineInfo.Tag.PipelineInfo:
          obj["tag"] = "PipelineInfo";
          {
            var tv = (data.PipelineInfo)v;
            obj["pipelineName"] = toJSON(tv.pipelineName);
            obj["pipeline"] = toJSON(tv.pipeline);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(RenderJob v) {
      var obj = new JObject();
      switch (v.tag) { 
        case RenderJob.Tag.RenderJob:
          obj["tag"] = "RenderJob";
          {
            var tv = (data.RenderJob)v;
            obj["meshes"] = toJSON(tv.meshes);
            obj["textures"] = toJSON(tv.textures);
            obj["schema"] = toJSON(tv.schema);
            obj["scenes"] = toJSON(tv.scenes);
            obj["pipelines"] = toJSON(tv.pipelines);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(FrameResult v) {
      var obj = new JObject();
      switch (v.tag) { 
        case FrameResult.Tag.FrameResult:
          obj["tag"] = "FrameResult";
          {
            var tv = (data.FrameResult)v;
            obj["frRenderTimes"] = toJSON(tv.frRenderTimes);
            obj["frImageWidth"] = toJSON(tv.frImageWidth);
            obj["frImageHeight"] = toJSON(tv.frImageHeight);
          }
          break;
      }
      return obj;
    }
    public static JToken toJSON(RenderJobResult v) {
      var obj = new JObject();
      switch (v.tag) { 
        case RenderJobResult.Tag.RenderJobResult:
          obj["tag"] = "RenderJobResult";
          {
            var tv = (data.RenderJobResult)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
        case RenderJobResult.Tag.RenderJobError:
          obj["tag"] = "RenderJobError";
          {
            var tv = (data.RenderJobError)v;
            obj["arg0"] = toJSON(tv._0);
          }
          break;
      }
      return obj;
    }

    public static JToken toJSON(int v) { return new JValue(v); }
    public static JToken toJSON(float v) { return new JValue(v); }
    public static JToken toJSON(string v) { return new JValue(v); }
    public static JToken toJSON(List<int> v) {
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
    public static JToken toJSON(List<string> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::TestData.Frame> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::TestData.Mesh> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::TestData.PipelineInfo> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(List<global::TestData.Scene> v) {
      var obj = new JArray();
      foreach (var i in v) {
        obj.Add(toJSON(i));
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, int> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, List<int>> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
    public static JToken toJSON(Dictionary<string, global::TestData.Value> v) {
      var obj = new JObject();
      foreach (var i in v) {
        obj[i.Key] = toJSON(i.Value);
      }
      return obj;
    }
  }
}
