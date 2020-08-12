// generated file, do not modify!
// 2020-05-21T23:35:27.114328Z

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
      Type.Int -> return (rawObj as Number).intValue()
      Type.Float -> return (rawObj as Number).floatValue()
      Type.String -> return rawObj as String
      Type.Array_Int -> {
        val obj = rawObj as JSONArray
        return Array<Int>(obj.length()) { ind: Int ->
          fromJSON(Type.Int, obj.get(ind)) as Int
        }
      }
      Type.Array_Float -> {
        val obj = rawObj as JSONArray
        return Array<Float>(obj.length()) { ind: Int ->
          fromJSON(Type.Float, obj.get(ind)) as Float
        }
      }
      Type.Array_String -> {
        val obj = rawObj as JSONArray
        return Array<String>(obj.length()) { ind: Int ->
          fromJSON(Type.String, obj.get(ind)) as String
        }
      }
      Type.Array_Frame -> {
        val obj = rawObj as JSONArray
        return Array<Frame>(obj.length()) { ind: Int ->
          fromJSON(Type.Frame, obj.get(ind)) as Frame
        }
      }
      Type.Array_Mesh -> {
        val obj = rawObj as JSONArray
        return Array<Mesh>(obj.length()) { ind: Int ->
          fromJSON(Type.Mesh, obj.get(ind)) as Mesh
        }
      }
      Type.Array_PipelineInfo -> {
        val obj = rawObj as JSONArray
        return Array<PipelineInfo>(obj.length()) { ind: Int ->
          fromJSON(Type.PipelineInfo, obj.get(ind)) as PipelineInfo
        }
      }
      Type.Array_Scene -> {
        val obj = rawObj as JSONArray
        return Array<Scene>(obj.length()) { ind: Int ->
          fromJSON(Type.Scene, obj.get(ind)) as Scene
        }
      }
      Type.Map_String_Int -> {
        val obj = rawObj as JSONObject
        Map<String, Int> map = Map<String, Int>()
        val keyIt = obj.keys()
        while(keyIt.hasNext()) {
          String key = keyIt.next()
          map.put(key, fromJSON(Type.Int, obj.get(key)) as Int)
        }
        return map
      }
      Type.Map_String_Array_Int -> {
        val obj = rawObj as JSONObject
        Map<String, (Vector Int)> map = Map<String, (Vector Int)>()
        val keyIt = obj.keys()
        while(keyIt.hasNext()) {
          String key = keyIt.next()
          map.put(key, fromJSON(Type.Array_Int, obj.get(key)) as Array<Int>)
        }
        return map
      }
      Type.Map_String_Value -> {
        val obj = rawObj as JSONObject
        Map<String, Value> map = Map<String, Value>()
        val keyIt = obj.keys()
        while(keyIt.hasNext()) {
          String key = keyIt.next()
          map.put(key, fromJSON(Type.Value, obj.get(key)) as Value)
        }
        return map
      }

      Type.ClientInfo -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "ClientInfo" -> {
            return             ClientInfo(
              clientName = fromJSON(Type.String, obj.get("clientName")) as String,
              clientBackend = fromJSON(Type.Backend, obj.get("clientBackend")) as Backend,
            )
          }
        }
      }
      Type.Frame -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "Frame" -> {
            return             Frame(
              renderCount = fromJSON(Type.Int, obj.get("renderCount")) as Int,
              frameUniforms = fromJSON(Type.Map_String_Value, obj.get("frameUniforms")) as Map<String, Value>,
              frameTextures = fromJSON(Type.Map_String_Int, obj.get("frameTextures")) as Map<String, Int>,
            )
          }
        }
      }
      Type.Scene -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "Scene" -> {
            return             Scene(
              objectArrays = fromJSON(Type.Map_String_Array_Int, obj.get("objectArrays")) as Map<String, (Vector Int)>,
              renderTargetWidth = fromJSON(Type.Int, obj.get("renderTargetWidth")) as Int,
              renderTargetHeight = fromJSON(Type.Int, obj.get("renderTargetHeight")) as Int,
              frames = fromJSON(Type.Array_Frame, obj.get("frames")) as Array<Frame>,
            )
          }
        }
      }
      Type.PipelineInfo -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "PipelineInfo" -> {
            return             PipelineInfo(
              pipelineName = fromJSON(Type.String, obj.get("pipelineName")) as String,
              pipeline = fromJSON(Type.Pipeline, obj.get("pipeline")) as Pipeline,
            )
          }
        }
      }
      Type.RenderJob -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "RenderJob" -> {
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
      Type.FrameResult -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "FrameResult" -> {
            return             FrameResult(
              frRenderTimes = fromJSON(Type.Array_Float, obj.get("frRenderTimes")) as Array<Float>,
              frImageWidth = fromJSON(Type.Int, obj.get("frImageWidth")) as Int,
              frImageHeight = fromJSON(Type.Int, obj.get("frImageHeight")) as Int,
            )
          }
        }
      }
      Type.RenderJobResult -> {
        val obj = rawObj as JSONObject
        val tag = obj.getString("tag")
        when (tag) {
          "RenderJobResult" -> {
            return             _RenderJobResult(
              _0 = fromJSON(Type.FrameResult, obj.get("arg0")) as FrameResult,
            )
          }
          "RenderJobError" -> {
            return             _RenderJobError(
              _0 = fromJSON(Type.String, obj.get("arg0")) as String,
            )
          }
        }
      }
    }
  }

  @Throws(JSONException::class, Exception::class)
  fn toJSON(Type type, Object rawObj): Object {
    when (type) {
      Type.ClientInfo -> {
        val v = rawObj as ClientInfo
	val obj = JSONObject()
	when (v) {
          is ClientInfo -> {
            obj.put("tag", "ClientInfo")
          }
        }
      }
      Type.Frame -> {
        val v = rawObj as Frame
	val obj = JSONObject()
	when (v) {
          is Frame -> {
            obj.put("tag", "Frame")
          }
        }
      }
      Type.Scene -> {
        val v = rawObj as Scene
	val obj = JSONObject()
	when (v) {
          is Scene -> {
            obj.put("tag", "Scene")
          }
        }
      }
      Type.PipelineInfo -> {
        val v = rawObj as PipelineInfo
	val obj = JSONObject()
	when (v) {
          is PipelineInfo -> {
            obj.put("tag", "PipelineInfo")
          }
        }
      }
      Type.RenderJob -> {
        val v = rawObj as RenderJob
	val obj = JSONObject()
	when (v) {
          is RenderJob -> {
            obj.put("tag", "RenderJob")
          }
        }
      }
      Type.FrameResult -> {
        val v = rawObj as FrameResult
	val obj = JSONObject()
	when (v) {
          is FrameResult -> {
            obj.put("tag", "FrameResult")
          }
        }
      }
      Type.RenderJobResult -> {
        val v = rawObj as RenderJobResult
	val obj = JSONObject()
	when (v) {
          is RenderJobResult -> {
            obj.put("tag", "RenderJobResult")
          }
          is RenderJobError -> {
            obj.put("tag", "RenderJobError")
          }
        }
      }
    }
  }

}
