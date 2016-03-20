// generated file, do not modify!
// 2016-03-21T11:41:52.508392000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.*;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class JSON {
  // JSON deserializer
  public enum Type { 
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

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case Int: return (Integer)rawObj;
      case Float: return (Float)rawObj;
      case String: return (String)rawObj;
//      case Array_Int: return ((JArray)obj).Select(x => fromJSON (Type.Int, x)).ToList();
//      case Array_Float: return ((JArray)obj).Select(x => fromJSON (Type.Float, x)).ToList();
//      case Array_String: return ((JArray)obj).Select(x => fromJSON (Type.String, x)).ToList();
//      case Array_Frame: return ((JArray)obj).Select(x => fromJSON (Type.Frame, x)).ToList();
//      case Array_Mesh: return ((JArray)obj).Select(x => fromJSON (Type.Mesh, x)).ToList();
//      case Array_PipelineInfo: return ((JArray)obj).Select(x => fromJSON (Type.PipelineInfo, x)).ToList();
//      case Array_Scene: return ((JArray)obj).Select(x => fromJSON (Type.Scene, x)).ToList();
/*
      case Map_String_Int: {
        var map = new HashMap<String, Integer> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (Integer)fromJSON(Type.Int,i.Value));
        }
        return map;
      }
*/
/*
      case Map_String_Array_Int: {
        var map = new HashMap<String, ArrayList<Integer>> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (ArrayList<Integer>)fromJSON(Type.Array_Int,i.Value));
        }
        return map;
      }
*/
/*
      case Map_String_Value: {
        var map = new HashMap<String, Value> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (Value)fromJSON(Type.Value,i.Value));
        }
        return map;
      }
*/

      case ClientInfo: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "ClientInfo": {
            ClientInfo.ClientInfo_ tv = new ClientInfo().new ClientInfo_();
            tv.clientName = (String)fromJSON(Type.String,obj.get("clientName"));
            tv.clientBackend = (Backend)fromJSON(Type.Backend,obj.get("clientBackend"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Frame: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Frame": {
            Frame.Frame_ tv = new Frame().new Frame_();
            tv.renderCount = (Integer)fromJSON(Type.Int,obj.get("renderCount"));
            tv.frameUniforms = (HashMap<String, Value>)fromJSON(Type.Map_String_Value,obj.get("frameUniforms"));
            tv.frameTextures = (HashMap<String, Integer>)fromJSON(Type.Map_String_Int,obj.get("frameTextures"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case Scene: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Scene": {
            Scene.Scene_ tv = new Scene().new Scene_();
            tv.objectArrays = (HashMap<String, ArrayList<Integer>>)fromJSON(Type.Map_String_Array_Int,obj.get("objectArrays"));
            tv.renderTargetWidth = (Integer)fromJSON(Type.Int,obj.get("renderTargetWidth"));
            tv.renderTargetHeight = (Integer)fromJSON(Type.Int,obj.get("renderTargetHeight"));
            tv.frames = (ArrayList<Frame>)fromJSON(Type.Array_Frame,obj.get("frames"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case PipelineInfo: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "PipelineInfo": {
            PipelineInfo.PipelineInfo_ tv = new PipelineInfo().new PipelineInfo_();
            tv.pipelineName = (String)fromJSON(Type.String,obj.get("pipelineName"));
            tv.pipeline = (Pipeline)fromJSON(Type.Pipeline,obj.get("pipeline"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case RenderJob: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "RenderJob": {
            RenderJob.RenderJob_ tv = new RenderJob().new RenderJob_();
            tv.meshes = (ArrayList<Mesh>)fromJSON(Type.Array_Mesh,obj.get("meshes"));
            tv.textures = (ArrayList<String>)fromJSON(Type.Array_String,obj.get("textures"));
            tv.schema = (PipelineSchema)fromJSON(Type.PipelineSchema,obj.get("schema"));
            tv.scenes = (ArrayList<Scene>)fromJSON(Type.Array_Scene,obj.get("scenes"));
            tv.pipelines = (ArrayList<PipelineInfo>)fromJSON(Type.Array_PipelineInfo,obj.get("pipelines"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case FrameResult: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "FrameResult": {
            FrameResult.FrameResult_ tv = new FrameResult().new FrameResult_();
            tv.frRenderTimes = (ArrayList<Float>)fromJSON(Type.Array_Float,obj.get("frRenderTimes"));
            tv.frImageWidth = (Integer)fromJSON(Type.Int,obj.get("frImageWidth"));
            tv.frImageHeight = (Integer)fromJSON(Type.Int,obj.get("frImageHeight"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case RenderJobResult: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "RenderJobResult": {
            RenderJobResult.RenderJobResult_ tv = new RenderJobResult().new RenderJobResult_();
            tv._0 = (FrameResult)fromJSON(Type.FrameResult,obj.get("arg0"));
            return tv;
          }
          case "RenderJobError": {
            RenderJobResult.RenderJobError_ tv = new RenderJobResult().new RenderJobError_();
            tv._0 = (String)fromJSON(Type.String,obj.get("arg0"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
    }
    throw new Exception("unknown type");
  }
}