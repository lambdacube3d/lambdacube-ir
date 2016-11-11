// generated file, do not modify!
// 2016-11-11T11:17:03.470118000000Z

package LambdaCube.PipelineSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.*;
import RT.*;

import LambdaCube.IR.*;

public class JSON {
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

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case String: return (String)rawObj;
      case Map_String_InputType: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, InputType> map = new HashMap<String, InputType> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (InputType)fromJSON(Type.InputType,obj.get(key)));
        }
        return map;
      }
      case Map_String_ObjectArraySchema: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, ObjectArraySchema> map = new HashMap<String, ObjectArraySchema> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (ObjectArraySchema)fromJSON(Type.ObjectArraySchema,obj.get(key)));
        }
        return map;
      }
      case Map_String_StreamType: {
        JSONObject obj = (JSONObject)rawObj;
        HashMap<String, StreamType> map = new HashMap<String, StreamType> ();
        Iterator<String> keyIt = obj.keys();
        while(keyIt.hasNext()) {
          String key = keyIt.next();
          map.put(key, (StreamType)fromJSON(Type.StreamType,obj.get(key)));
        }
        return map;
      }

      case StreamType: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
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
      case ObjectArraySchema: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "ObjectArraySchema": {
            ObjectArraySchema.ObjectArraySchema_ tv = new ObjectArraySchema().new ObjectArraySchema_();
            tv.primitive = (FetchPrimitive)fromJSON(Type.FetchPrimitive,obj.get("primitive"));
            tv.attributes = (HashMap<String, StreamType>)fromJSON(Type.Map_String_StreamType,obj.get("attributes"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case PipelineSchema: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "PipelineSchema": {
            PipelineSchema.PipelineSchema_ tv = new PipelineSchema().new PipelineSchema_();
            tv.objectArrays = (HashMap<String, ObjectArraySchema>)fromJSON(Type.Map_String_ObjectArraySchema,obj.get("objectArrays"));
            tv.uniforms = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("uniforms"));
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
      case StreamType: {
        StreamType v = (StreamType)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Attribute_Word:
            obj.put("tag", "Attribute_Word");
            break;
          case Attribute_V2U:
            obj.put("tag", "Attribute_V2U");
            break;
          case Attribute_V3U:
            obj.put("tag", "Attribute_V3U");
            break;
          case Attribute_V4U:
            obj.put("tag", "Attribute_V4U");
            break;
          case Attribute_Int:
            obj.put("tag", "Attribute_Int");
            break;
          case Attribute_V2I:
            obj.put("tag", "Attribute_V2I");
            break;
          case Attribute_V3I:
            obj.put("tag", "Attribute_V3I");
            break;
          case Attribute_V4I:
            obj.put("tag", "Attribute_V4I");
            break;
          case Attribute_Float:
            obj.put("tag", "Attribute_Float");
            break;
          case Attribute_V2F:
            obj.put("tag", "Attribute_V2F");
            break;
          case Attribute_V3F:
            obj.put("tag", "Attribute_V3F");
            break;
          case Attribute_V4F:
            obj.put("tag", "Attribute_V4F");
            break;
          case Attribute_M22F:
            obj.put("tag", "Attribute_M22F");
            break;
          case Attribute_M23F:
            obj.put("tag", "Attribute_M23F");
            break;
          case Attribute_M24F:
            obj.put("tag", "Attribute_M24F");
            break;
          case Attribute_M32F:
            obj.put("tag", "Attribute_M32F");
            break;
          case Attribute_M33F:
            obj.put("tag", "Attribute_M33F");
            break;
          case Attribute_M34F:
            obj.put("tag", "Attribute_M34F");
            break;
          case Attribute_M42F:
            obj.put("tag", "Attribute_M42F");
            break;
          case Attribute_M43F:
            obj.put("tag", "Attribute_M43F");
            break;
          case Attribute_M44F:
            obj.put("tag", "Attribute_M44F");
            break;
        }
        return obj;
      }
      case ObjectArraySchema: {
        ObjectArraySchema v = (ObjectArraySchema)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case ObjectArraySchema:
            obj.put("tag", "ObjectArraySchema");
            {
              ObjectArraySchema.ObjectArraySchema_ tv = (ObjectArraySchema.ObjectArraySchema_)v;
              obj.put("primitive", toJSON(Type.FetchPrimitive,tv.primitive));
              obj.put("attributes", toJSON(Type.Map_String_StreamType,tv.attributes));
            }
            break;
        }
        return obj;
      }
      case PipelineSchema: {
        PipelineSchema v = (PipelineSchema)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case PipelineSchema:
            obj.put("tag", "PipelineSchema");
            {
              PipelineSchema.PipelineSchema_ tv = (PipelineSchema.PipelineSchema_)v;
              obj.put("objectArrays", toJSON(Type.Map_String_ObjectArraySchema,tv.objectArrays));
              obj.put("uniforms", toJSON(Type.Map_String_InputType,tv.uniforms));
            }
            break;
        }
        return obj;
      }

      case String: { return rawObj; }
      case Map_String_InputType: {
        HashMap<String, InputType> v = (HashMap<String, InputType>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,InputType> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.InputType,i.getValue()));
        }
        return obj;
      }
      case Map_String_ObjectArraySchema: {
        HashMap<String, ObjectArraySchema> v = (HashMap<String, ObjectArraySchema>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,ObjectArraySchema> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.ObjectArraySchema,i.getValue()));
        }
        return obj;
      }
      case Map_String_StreamType: {
        HashMap<String, StreamType> v = (HashMap<String, StreamType>)rawObj;
        JSONObject obj = new JSONObject();
        for (Map.Entry<String,StreamType> i : v.entrySet()) {
          obj.put(i.getKey(), toJSON(Type.StreamType,i.getValue()));
        }
        return obj;
      }
    }
    throw new Exception("unknown type");
  }
}