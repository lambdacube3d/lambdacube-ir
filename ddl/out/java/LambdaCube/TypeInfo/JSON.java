// generated file, do not modify!
// 2016-11-10T16:02:38.361054000000Z

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

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case Int: return ((Number)rawObj).intValue();
      case String: return (String)rawObj;
      case Array_ErrorInfo: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<ErrorInfo> v = new ArrayList<ErrorInfo> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((ErrorInfo)fromJSON (Type.ErrorInfo, obj.get(i)));
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
      case Array_WarningInfo: {
        JSONArray obj = (JSONArray)rawObj;
        ArrayList<WarningInfo> v = new ArrayList<WarningInfo> ();
        for (int i = 0; i < obj.length(); i++) {
          v.add((WarningInfo)fromJSON (Type.WarningInfo, obj.get(i)));
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
      case WarningInfo: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "WarningInfo": {
            WarningInfo.WarningInfo_ tv = new WarningInfo().new WarningInfo_();
            tv.wRange = (Range)fromJSON(Type.Range,obj.get("wRange"));
            tv.wText = (String)fromJSON(Type.String,obj.get("wText"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case ErrorInfo: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "ErrorInfo": {
            ErrorInfo.ErrorInfo_ tv = new ErrorInfo().new ErrorInfo_();
            tv.eRange = (Range)fromJSON(Type.Range,obj.get("eRange"));
            tv.eText = (String)fromJSON(Type.String,obj.get("eText"));
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
            tv._0 = (String)fromJSON(Type.String,obj.get("arg0"));
            tv._1 = (ArrayList<TypeInfo>)fromJSON(Type.Array_TypeInfo,obj.get("arg1"));
            tv._2 = (ArrayList<WarningInfo>)fromJSON(Type.Array_WarningInfo,obj.get("arg2"));
            tv._3 = (ArrayList<ErrorInfo>)fromJSON(Type.Array_ErrorInfo,obj.get("arg3"));
            return tv;
          }
          case "Compiled": {
            CompileResult.Compiled_ tv = new CompileResult().new Compiled_();
            tv._0 = (String)fromJSON(Type.String,obj.get("arg0"));
            tv._1 = (String)fromJSON(Type.String,obj.get("arg1"));
            tv._2 = (Pipeline)fromJSON(Type.Pipeline,obj.get("arg2"));
            tv._3 = (ArrayList<TypeInfo>)fromJSON(Type.Array_TypeInfo,obj.get("arg3"));
            tv._4 = (ArrayList<WarningInfo>)fromJSON(Type.Array_WarningInfo,obj.get("arg4"));
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
      case WarningInfo: {
        WarningInfo v = (WarningInfo)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case WarningInfo:
            obj.put("tag", "WarningInfo");
            {
              WarningInfo.WarningInfo_ tv = (WarningInfo.WarningInfo_)v;
              obj.put("wRange", toJSON(Type.Range,tv.wRange));
              obj.put("wText", toJSON(Type.String,tv.wText));
            }
            break;
        }
        return obj;
      }
      case ErrorInfo: {
        ErrorInfo v = (ErrorInfo)rawObj;
        JSONObject obj = new JSONObject();
        switch (v.tag) { 
          case ErrorInfo:
            obj.put("tag", "ErrorInfo");
            {
              ErrorInfo.ErrorInfo_ tv = (ErrorInfo.ErrorInfo_)v;
              obj.put("eRange", toJSON(Type.Range,tv.eRange));
              obj.put("eText", toJSON(Type.String,tv.eText));
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
              obj.put("arg0", toJSON(Type.String,tv._0));
              obj.put("arg1", toJSON(Type.Array_TypeInfo,tv._1));
              obj.put("arg2", toJSON(Type.Array_WarningInfo,tv._2));
              obj.put("arg3", toJSON(Type.Array_ErrorInfo,tv._3));
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
              obj.put("arg4", toJSON(Type.Array_WarningInfo,tv._4));
            }
            break;
        }
        return obj;
      }

      case Int: { return rawObj; }
      case String: { return rawObj; }
      case Array_ErrorInfo: {
        ArrayList<ErrorInfo> v = (ArrayList<ErrorInfo>)rawObj;
        JSONArray obj = new JSONArray();
        for(ErrorInfo i : v) {
          obj.put(toJSON(Type.ErrorInfo,i));
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
      case Array_WarningInfo: {
        ArrayList<WarningInfo> v = (ArrayList<WarningInfo>)rawObj;
        JSONArray obj = new JSONArray();
        for(WarningInfo i : v) {
          obj.put(toJSON(Type.WarningInfo,i));
        }
        return obj;
      }
    }
    throw new Exception("unknown type");
  }
}