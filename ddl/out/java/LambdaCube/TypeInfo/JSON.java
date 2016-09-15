// generated file, do not modify!
// 2016-09-15T19:44:48.120020034Z

package LambdaCube.TypeInfo;

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
    Int,
    String,
    Array_Range,
    Array_TypeInfo,
    CompileResult,
    Pipeline,
    Range,
    TypeInfo
  }

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case Int: return ((Number)rawObj).intValue();
      case String: return (String)rawObj;
      case Array_Range: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<Range> v = new ArrayList<Range> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((Range)fromJSON (Type.Range, obj.get(i)));
        }
        return v;
      }
      case Array_TypeInfo: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<TypeInfo> v = new ArrayList<TypeInfo> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((TypeInfo)fromJSON (Type.TypeInfo, obj.get(i)));
        }
        return v;
      }

      case Range: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Range": {
            Range.Range_ tv = new Range().new Range_();
            tv.startLine = (Integer)fromJSON(Type.Int,obj.get("startLine"));
            tv.startColumn = (Integer)fromJSON(Type.Int,obj.get("startColumn"));
            tv.endLine = (Integer)fromJSON(Type.Int,obj.get("endLine"));
            tv.endColumn = (Integer)fromJSON(Type.Int,obj.get("endColumn"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case TypeInfo: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "TypeInfo": {
            TypeInfo.TypeInfo_ tv = new TypeInfo().new TypeInfo_();
            tv.range = (Range)fromJSON(Type.Range,obj.get("range"));
            tv.text = (String)fromJSON(Type.String,obj.get("text"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case CompileResult: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "CompileError": {
            CompileResult.CompileError_ tv = new CompileResult().new CompileError_();
            tv._0 = (ArrayList<Range>)fromJSON(Type.Array_Range,obj.get("arg0"));
            tv._1 = (String)fromJSON(Type.String,obj.get("arg1"));
            tv._2 = (ArrayList<TypeInfo>)fromJSON(Type.Array_TypeInfo,obj.get("arg2"));
            return tv;
          }
          case "Compiled": {
            CompileResult.Compiled_ tv = new CompileResult().new Compiled_();
            tv._0 = (String)fromJSON(Type.String,obj.get("arg0"));
            tv._1 = (String)fromJSON(Type.String,obj.get("arg1"));
            tv._2 = (Pipeline)fromJSON(Type.Pipeline,obj.get("arg2"));
            tv._3 = (ArrayList<TypeInfo>)fromJSON(Type.Array_TypeInfo,obj.get("arg3"));
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
      case Range: {
        Range v = (Range)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case Range:
            obj.put("tag", "Range");
            {
              Range.Range_ tv = (Range.Range_)v;
              obj.put("startLine", toJSON(Type.Int,tv.startLine));
              obj.put("startColumn", toJSON(Type.Int,tv.startColumn));
              obj.put("endLine", toJSON(Type.Int,tv.endLine));
              obj.put("endColumn", toJSON(Type.Int,tv.endColumn));
            }
            break;
        }
        return obj;
      }
      case TypeInfo: {
        TypeInfo v = (TypeInfo)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case TypeInfo:
            obj.put("tag", "TypeInfo");
            {
              TypeInfo.TypeInfo_ tv = (TypeInfo.TypeInfo_)v;
              obj.put("range", toJSON(Type.Range,tv.range));
              obj.put("text", toJSON(Type.String,tv.text));
            }
            break;
        }
        return obj;
      }
      case CompileResult: {
        CompileResult v = (CompileResult)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case CompileError:
            obj.put("tag", "CompileError");
            {
              CompileResult.CompileError_ tv = (CompileResult.CompileError_)v;
              obj.put("arg0", toJSON(Type.Array_Range,tv._0));
              obj.put("arg1", toJSON(Type.String,tv._1));
              obj.put("arg2", toJSON(Type.Array_TypeInfo,tv._2));
            }
            break;
          case Compiled:
            obj.put("tag", "Compiled");
            {
              CompileResult.Compiled_ tv = (CompileResult.Compiled_)v;
              obj.put("arg0", toJSON(Type.String,tv._0));
              obj.put("arg1", toJSON(Type.String,tv._1));
              obj.put("arg2", toJSON(Type.Pipeline,tv._2));
              obj.put("arg3", toJSON(Type.Array_TypeInfo,tv._3));
            }
            break;
        }
        return obj;
      }

      case Int: { return rawObj; }
      case String: { return rawObj; }
      case Array_Range: {
        ArrayList<Range> v = (ArrayList<Range>)rawObj;
        JSONArray obj = new JSONArray();
        for(Range i : v) {
          obj.put(toJSON(Type.Range,i));
        }
        return obj;
      }
      case Array_TypeInfo: {
        ArrayList<TypeInfo> v = (ArrayList<TypeInfo>)rawObj;
        JSONArray obj = new JSONArray();
        for(TypeInfo i : v) {
          obj.put(toJSON(Type.TypeInfo,i));
        }
        return obj;
      }
    }
    throw new Exception("unknown type");
  }
}