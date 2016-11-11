// generated file, do not modify!
// 2016-11-11T11:17:03.685172000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
      case Int: return ((Number)rawObj).intValue();
      case Float: return ((Number)rawObj).floatValue();
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

  public static Object toJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case ClientInfo: {
        ClientInfo v = (ClientInfo)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case ClientInfo:
            obj.put("tag", "ClientInfo");
            {
              ClientInfo.ClientInfo_ tv = (ClientInfo.ClientInfo_)v;
              obj.put("clientName", toJSON(Type.String,tv.clientName));
              obj.put("clientBackend", toJSON(Type.Backend,tv.clientBackend));
            }
            break;
        }
        return obj;
      }
      case Frame: {
        Frame v = (Frame)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Frame:
            obj.put("tag", "Frame");
            {
              Frame.Frame_ tv = (Frame.Frame_)v;
              obj.put("renderCount", toJSON(Type.Int,tv.renderCount));
              obj.put("frameUniforms", toJSON(Type.Map_String_Value,tv.frameUniforms));
              obj.put("frameTextures", toJSON(Type.Map_String_Int,tv.frameTextures));
            }
            break;
        }
        return obj;
      }
      case Scene: {
        Scene v = (Scene)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Scene:
            obj.put("tag", "Scene");
            {
              Scene.Scene_ tv = (Scene.Scene_)v;
              obj.put("objectArrays", toJSON(Type.Map_String_Array_Int,tv.objectArrays));
              obj.put("renderTargetWidth", toJSON(Type.Int,tv.renderTargetWidth));
              obj.put("renderTargetHeight", toJSON(Type.Int,tv.renderTargetHeight));
              obj.put("frames", toJSON(Type.Array_Frame,tv.frames));
            }
            break;
        }
        return obj;
      }
      case PipelineInfo: {
        PipelineInfo v = (PipelineInfo)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case PipelineInfo:
            obj.put("tag", "PipelineInfo");
            {
              PipelineInfo.PipelineInfo_ tv = (PipelineInfo.PipelineInfo_)v;
              obj.put("pipelineName", toJSON(Type.String,tv.pipelineName));
              obj.put("pipeline", toJSON(Type.Pipeline,tv.pipeline));
            }
            break;
        }
        return obj;
      }
      case RenderJob: {
        RenderJob v = (RenderJob)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case RenderJob:
            obj.put("tag", "RenderJob");
            {
              RenderJob.RenderJob_ tv = (RenderJob.RenderJob_)v;
              obj.put("meshes", toJSON(Type.Array_Mesh,tv.meshes));
              obj.put("textures", toJSON(Type.Array_String,tv.textures));
              obj.put("schema", toJSON(Type.PipelineSchema,tv.schema));
              obj.put("scenes", toJSON(Type.Array_Scene,tv.scenes));
              obj.put("pipelines", toJSON(Type.Array_PipelineInfo,tv.pipelines));
            }
            break;
        }
        return obj;
      }
      case FrameResult: {
        FrameResult v = (FrameResult)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case FrameResult:
            obj.put("tag", "FrameResult");
            {
              FrameResult.FrameResult_ tv = (FrameResult.FrameResult_)v;
              obj.put("frRenderTimes", toJSON(Type.Array_Float,tv.frRenderTimes));
              obj.put("frImageWidth", toJSON(Type.Int,tv.frImageWidth));
              obj.put("frImageHeight", toJSON(Type.Int,tv.frImageHeight));
            }
            break;
        }
        return obj;
      }
      case RenderJobResult: {
        RenderJobResult v = (RenderJobResult)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case RenderJobResult:
            obj.put("tag", "RenderJobResult");
            {
              RenderJobResult.RenderJobResult_ tv = (RenderJobResult.RenderJobResult_)v;
              obj.put("arg0", toJSON(Type.FrameResult,tv._0));
            }
            break;
          case RenderJobError:
            obj.put("tag", "RenderJobError");
            {
              RenderJobResult.RenderJobError_ tv = (RenderJobResult.RenderJobError_)v;
              obj.put("arg0", toJSON(Type.String,tv._0));
            }
            break;
        }
        return obj;
      }

      case Int: { return rawObj; }
      case Float: { return rawObj; }
      case String: { return rawObj; }
      case Array_Int: {
        ArrayList<Integer> v = (ArrayList<Integer>)rawObj;
        JSONArray obj = new JSONArray();
        for(Integer i : v) {
          obj.put(toJSON(Type.Int,i));
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
      case Array_String: {
        ArrayList<String> v = (ArrayList<String>)rawObj;
        JSONArray obj = new JSONArray();
        for(String i : v) {
          obj.put(toJSON(Type.String,i));
        }
        return obj;
      }
      case Array_Frame: {
        ArrayList<Frame> v = (ArrayList<Frame>)rawObj;
        JSONArray obj = new JSONArray();
        for(Frame i : v) {
          obj.put(toJSON(Type.Frame,i));
        }
        return obj;
      }
      case Array_Mesh: {
        ArrayList<Mesh> v = (ArrayList<Mesh>)rawObj;
        JSONArray obj = new JSONArray();
        for(Mesh i : v) {
          obj.put(toJSON(Type.Mesh,i));
        }
        return obj;
      }
      case Array_PipelineInfo: {
        ArrayList<PipelineInfo> v = (ArrayList<PipelineInfo>)rawObj;
        JSONArray obj = new JSONArray();
        for(PipelineInfo i : v) {
          obj.put(toJSON(Type.PipelineInfo,i));
        }
        return obj;
      }
      case Array_Scene: {
        ArrayList<Scene> v = (ArrayList<Scene>)rawObj;
        JSONArray obj = new JSONArray();
        for(Scene i : v) {
          obj.put(toJSON(Type.Scene,i));
        }
        return obj;
      }
      case Map_String_Int: {
        HashMap<String, Integer> v = (HashMap<String, Integer>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,Integer> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.Int,i.getValue()));
        }
        return obj;
      }
      case Map_String_Array_Int: {
        HashMap<String, ArrayList<Integer>> v = (HashMap<String, ArrayList<Integer>>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,ArrayList<Integer>> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.Array_Int,i.getValue()));
        }
        return obj;
      }
      case Map_String_Value: {
        HashMap<String, Value> v = (HashMap<String, Value>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,Value> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.Value,i.getValue()));
        }
        return obj;
      }
    }
    throw new Exception("unknown type");
  }
}