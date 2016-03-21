// generated file, do not modify!
// 2016-03-21T14:06:55.528630000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
      case Array_Int: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Integer> v = new ArrayList<Integer> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Integer)fromJSON (Type.Int, obj.get(i)));
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
      case Array_String: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<String> v = new ArrayList<String> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((String)fromJSON (Type.String, obj.get(i)));
        }
        return v;
      }
      case Array_Frame: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Frame> v = new ArrayList<Frame> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Frame)fromJSON (Type.Frame, obj.get(i)));
        }
        return v;
      }
      case Array_Mesh: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Mesh> v = new ArrayList<Mesh> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Mesh)fromJSON (Type.Mesh, obj.get(i)));
        }
        return v;
      }
      case Array_PipelineInfo: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<PipelineInfo> v = new ArrayList<PipelineInfo> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((PipelineInfo)fromJSON (Type.PipelineInfo, obj.get(i)));
        }
        return v;
      }
      case Array_Scene: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Scene> v = new ArrayList<Scene> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Scene)fromJSON (Type.Scene, obj.get(i)));
        }
        return v;
      }
      case Map_String_Int: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, Integer> map = new HashMap<String, Integer> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (Integer)fromJSON(Type.Int,obj.get(key)));
        }
        return map;
      }
      case Map_String_Array_Int: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (ArrayList<Integer>)fromJSON(Type.Array_Int,obj.get(key)));
        }
        return map;
      }
      case Map_String_Value: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, Value> map = new HashMap<String, Value> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (Value)fromJSON(Type.Value,obj.get(key)));
        }
        return map;
      }

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