// generated file, do not modify!
// 2020-05-21T19:10:15.739651Z

package TestData

import org.json.*
import RT.*

import LambdaCube.IR.*
import LambdaCube.Mesh.*
import LambdaCube.PipelineSchema.*

object JSON {

  enum class Type { 
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
    Value,
  }

  @Throws(JSONException::class, Exception::class)
  fun fromJSON(Type type, Object rawObj): Object {
    when (type) {
      is Int -> return (rawObj as Number).intValue()
      is Float -> return (rawObj as Number).floatValue()
      is String -> return rawObj as String
      is Array_Int -> {
        val obj = rawObj as JSONArray
        return Array<Int>(obj.length()) { ind: Int ->
          fromJSON(Type.Int, obj.get(ind)) as Int
        }
      }
      is Array_Float -> {
        val obj = rawObj as JSONArray
        return Array<Float>(obj.length()) { ind: Int ->
          fromJSON(Type.Float, obj.get(ind)) as Float
        }
      }
      is Array_String -> {
        val obj = rawObj as JSONArray
        return Array<String>(obj.length()) { ind: Int ->
          fromJSON(Type.String, obj.get(ind)) as String
        }
      }
      is Array_Frame -> {
        val obj = rawObj as JSONArray
        return Array<Frame>(obj.length()) { ind: Int ->
          fromJSON(Type.Frame, obj.get(ind)) as Frame
        }
      }
      is Array_Mesh -> {
        val obj = rawObj as JSONArray
        return Array<Mesh>(obj.length()) { ind: Int ->
          fromJSON(Type.Mesh, obj.get(ind)) as Mesh
        }
      }
      is Array_PipelineInfo -> {
        val obj = rawObj as JSONArray
        return Array<PipelineInfo>(obj.length()) { ind: Int ->
          fromJSON(Type.PipelineInfo, obj.get(ind)) as PipelineInfo
        }
      }
      is Array_Scene -> {
        val obj = rawObj as JSONArray
        return Array<Scene>(obj.length()) { ind: Int ->
          fromJSON(Type.Scene, obj.get(ind)) as Scene
        }
      }
      is Map_String_Int -> {
        val obj = rawObj as JSONObject
        Map<String, Int> map = Map<String, Int>()
        val keyIt = obj.keys()
        while(keyIt.hasNext()) {
          String key = keyIt.next()
          map.put(key, fromJSON(Type.Int, obj.get(key)) as Int)
        }
        return map
      }
      is Map_String_Array_Int -> {
        val obj = rawObj as JSONObject
        Map<String, (Vector Int)> map = Map<String, (Vector Int)>()
        val keyIt = obj.keys()
        while(keyIt.hasNext()) {
          String key = keyIt.next()
          map.put(key, fromJSON(Type.Array_Int, obj.get(key)) as Array<Int>)
        }
        return map
      }
      is Map_String_Value -> {
        val obj = rawObj as JSONObject
        Map<String, Value> map = Map<String, Value>()
        val keyIt = obj.keys()
        while(keyIt.hasNext()) {
          String key = keyIt.next()
          map.put(key, fromJSON(Type.Value, obj.get(key)) as Value)
        }
        return map
      }

      is ClientInfo -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "ClientInfo" -> {
            return             ClientInfo(
              clientName = fromJSON(Type.String, obj.get("clientName")) as String,
              clientBackend = fromJSON(Type.Backend, obj.get("clientBackend")) as Backend,
            )
          }
        }
      }
      is Frame -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "Frame" -> {
            return             Frame(
              renderCount = fromJSON(Type.Int, obj.get("renderCount")) as Int,
              frameUniforms = fromJSON(Type.Map_String_Value, obj.get("frameUniforms")) as Map<String, Value>,
              frameTextures = fromJSON(Type.Map_String_Int, obj.get("frameTextures")) as Map<String, Int>,
            )
          }
        }
      }
      is Scene -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "Scene" -> {
            return             Scene(
              objectArrays = fromJSON(Type.Map_String_Array_Int, obj.get("objectArrays")) as Map<String, (Vector Int)>,
              renderTargetWidth = fromJSON(Type.Int, obj.get("renderTargetWidth")) as Int,
              renderTargetHeight = fromJSON(Type.Int, obj.get("renderTargetHeight")) as Int,
              frames = fromJSON(Type.Array_Frame, obj.get("frames")) as Array<Frame>,
            )
          }
        }
      }
      is PipelineInfo -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "PipelineInfo" -> {
            return             PipelineInfo(
              pipelineName = fromJSON(Type.String, obj.get("pipelineName")) as String,
              pipeline = fromJSON(Type.Pipeline, obj.get("pipeline")) as Pipeline,
            )
          }
        }
      }
      is RenderJob -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "RenderJob" -> {
            return             RenderJob(
              meshes = fromJSON(Type.Array_Mesh, obj.get("meshes")) as Array<Mesh>,
              textures = fromJSON(Type.Array_String, obj.get("textures")) as Array<String>,
              schema = fromJSON(Type.PipelineSchema, obj.get("schema")) as PipelineSchema,
              scenes = fromJSON(Type.Array_Scene, obj.get("scenes")) as Array<Scene>,
              pipelines = fromJSON(Type.Array_PipelineInfo, obj.get("pipelines")) as Array<PipelineInfo>,
            )
          }
        }
      }
      is FrameResult -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "FrameResult" -> {
            return             FrameResult(
              frRenderTimes = fromJSON(Type.Array_Float, obj.get("frRenderTimes")) as Array<Float>,
              frImageWidth = fromJSON(Type.Int, obj.get("frImageWidth")) as Int,
              frImageHeight = fromJSON(Type.Int, obj.get("frImageHeight")) as Int,
            )
          }
        }
      }
      is RenderJobResult -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          is "RenderJobResult" -> {
            return             RenderJobResult(
              _0 = fromJSON(Type.FrameResult, obj.get("arg0")) as FrameResult,
            )
          }
          is "RenderJobError" -> {
            return             RenderJobError(
              _0 = fromJSON(Type.String, obj.get("arg0")) as String,
            )
          }
        }
      }
    }
  }

}
