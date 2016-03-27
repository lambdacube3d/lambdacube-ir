// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

#include "LambdaCube.IR.hpp"
template<> json toJSON<std::shared_ptr<ArrayValue>>(std::shared_ptr<ArrayValue> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ArrayValue::tag::VBoolArray:
      obj["tag"] = "VBoolArray";
      {
        std::shared_ptr<data::VBoolArray> tv = std::static_pointer_cast<data::VBoolArray>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::ArrayValue::tag::VIntArray:
      obj["tag"] = "VIntArray";
      {
        std::shared_ptr<data::VIntArray> tv = std::static_pointer_cast<data::VIntArray>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::ArrayValue::tag::VWordArray:
      obj["tag"] = "VWordArray";
      {
        std::shared_ptr<data::VWordArray> tv = std::static_pointer_cast<data::VWordArray>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::ArrayValue::tag::VFloatArray:
      obj["tag"] = "VFloatArray";
      {
        std::shared_ptr<data::VFloatArray> tv = std::static_pointer_cast<data::VFloatArray>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<ArrayValue> fromJSON<std::shared_ptr<ArrayValue>>(W<std::shared_ptr<ArrayValue>> v, json &obj) {
  enum ::ArrayValue::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "VBoolArray") {
    tagType = ::ArrayValue::tag::VBoolArray;
    std::shared_ptr<data::VBoolArray> tv(new data::VBoolArray());
    tv->_0 = fromJSON(W<std::vector<Bool>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VIntArray") {
    tagType = ::ArrayValue::tag::VIntArray;
    std::shared_ptr<data::VIntArray> tv(new data::VIntArray());
    tv->_0 = fromJSON(W<std::vector<Int32>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VWordArray") {
    tagType = ::ArrayValue::tag::VWordArray;
    std::shared_ptr<data::VWordArray> tv(new data::VWordArray());
    tv->_0 = fromJSON(W<std::vector<Word32>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VFloatArray") {
    tagType = ::ArrayValue::tag::VFloatArray;
    std::shared_ptr<data::VFloatArray> tv(new data::VFloatArray());
    tv->_0 = fromJSON(W<std::vector<Float>>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ArrayValue> o(new ::ArrayValue());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Value>>(std::shared_ptr<Value> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Value::tag::VBool:
      obj["tag"] = "VBool";
      {
        std::shared_ptr<data::VBool> tv = std::static_pointer_cast<data::VBool>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV2B:
      obj["tag"] = "VV2B";
      {
        std::shared_ptr<data::VV2B> tv = std::static_pointer_cast<data::VV2B>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV3B:
      obj["tag"] = "VV3B";
      {
        std::shared_ptr<data::VV3B> tv = std::static_pointer_cast<data::VV3B>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV4B:
      obj["tag"] = "VV4B";
      {
        std::shared_ptr<data::VV4B> tv = std::static_pointer_cast<data::VV4B>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VWord:
      obj["tag"] = "VWord";
      {
        std::shared_ptr<data::VWord> tv = std::static_pointer_cast<data::VWord>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV2U:
      obj["tag"] = "VV2U";
      {
        std::shared_ptr<data::VV2U> tv = std::static_pointer_cast<data::VV2U>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV3U:
      obj["tag"] = "VV3U";
      {
        std::shared_ptr<data::VV3U> tv = std::static_pointer_cast<data::VV3U>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV4U:
      obj["tag"] = "VV4U";
      {
        std::shared_ptr<data::VV4U> tv = std::static_pointer_cast<data::VV4U>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VInt:
      obj["tag"] = "VInt";
      {
        std::shared_ptr<data::VInt> tv = std::static_pointer_cast<data::VInt>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV2I:
      obj["tag"] = "VV2I";
      {
        std::shared_ptr<data::VV2I> tv = std::static_pointer_cast<data::VV2I>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV3I:
      obj["tag"] = "VV3I";
      {
        std::shared_ptr<data::VV3I> tv = std::static_pointer_cast<data::VV3I>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV4I:
      obj["tag"] = "VV4I";
      {
        std::shared_ptr<data::VV4I> tv = std::static_pointer_cast<data::VV4I>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VFloat:
      obj["tag"] = "VFloat";
      {
        std::shared_ptr<data::VFloat> tv = std::static_pointer_cast<data::VFloat>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV2F:
      obj["tag"] = "VV2F";
      {
        std::shared_ptr<data::VV2F> tv = std::static_pointer_cast<data::VV2F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV3F:
      obj["tag"] = "VV3F";
      {
        std::shared_ptr<data::VV3F> tv = std::static_pointer_cast<data::VV3F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VV4F:
      obj["tag"] = "VV4F";
      {
        std::shared_ptr<data::VV4F> tv = std::static_pointer_cast<data::VV4F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM22F:
      obj["tag"] = "VM22F";
      {
        std::shared_ptr<data::VM22F> tv = std::static_pointer_cast<data::VM22F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM23F:
      obj["tag"] = "VM23F";
      {
        std::shared_ptr<data::VM23F> tv = std::static_pointer_cast<data::VM23F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM24F:
      obj["tag"] = "VM24F";
      {
        std::shared_ptr<data::VM24F> tv = std::static_pointer_cast<data::VM24F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM32F:
      obj["tag"] = "VM32F";
      {
        std::shared_ptr<data::VM32F> tv = std::static_pointer_cast<data::VM32F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM33F:
      obj["tag"] = "VM33F";
      {
        std::shared_ptr<data::VM33F> tv = std::static_pointer_cast<data::VM33F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM34F:
      obj["tag"] = "VM34F";
      {
        std::shared_ptr<data::VM34F> tv = std::static_pointer_cast<data::VM34F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM42F:
      obj["tag"] = "VM42F";
      {
        std::shared_ptr<data::VM42F> tv = std::static_pointer_cast<data::VM42F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM43F:
      obj["tag"] = "VM43F";
      {
        std::shared_ptr<data::VM43F> tv = std::static_pointer_cast<data::VM43F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Value::tag::VM44F:
      obj["tag"] = "VM44F";
      {
        std::shared_ptr<data::VM44F> tv = std::static_pointer_cast<data::VM44F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Value> fromJSON<std::shared_ptr<Value>>(W<std::shared_ptr<Value>> v, json &obj) {
  enum ::Value::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "VBool") {
    tagType = ::Value::tag::VBool;
    std::shared_ptr<data::VBool> tv(new data::VBool());
    tv->_0 = fromJSON(W<Bool>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV2B") {
    tagType = ::Value::tag::VV2B;
    std::shared_ptr<data::VV2B> tv(new data::VV2B());
    tv->_0 = fromJSON(W<V2B>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV3B") {
    tagType = ::Value::tag::VV3B;
    std::shared_ptr<data::VV3B> tv(new data::VV3B());
    tv->_0 = fromJSON(W<V3B>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV4B") {
    tagType = ::Value::tag::VV4B;
    std::shared_ptr<data::VV4B> tv(new data::VV4B());
    tv->_0 = fromJSON(W<V4B>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VWord") {
    tagType = ::Value::tag::VWord;
    std::shared_ptr<data::VWord> tv(new data::VWord());
    tv->_0 = fromJSON(W<Word32>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV2U") {
    tagType = ::Value::tag::VV2U;
    std::shared_ptr<data::VV2U> tv(new data::VV2U());
    tv->_0 = fromJSON(W<V2U>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV3U") {
    tagType = ::Value::tag::VV3U;
    std::shared_ptr<data::VV3U> tv(new data::VV3U());
    tv->_0 = fromJSON(W<V3U>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV4U") {
    tagType = ::Value::tag::VV4U;
    std::shared_ptr<data::VV4U> tv(new data::VV4U());
    tv->_0 = fromJSON(W<V4U>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VInt") {
    tagType = ::Value::tag::VInt;
    std::shared_ptr<data::VInt> tv(new data::VInt());
    tv->_0 = fromJSON(W<Int32>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV2I") {
    tagType = ::Value::tag::VV2I;
    std::shared_ptr<data::VV2I> tv(new data::VV2I());
    tv->_0 = fromJSON(W<V2I>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV3I") {
    tagType = ::Value::tag::VV3I;
    std::shared_ptr<data::VV3I> tv(new data::VV3I());
    tv->_0 = fromJSON(W<V3I>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV4I") {
    tagType = ::Value::tag::VV4I;
    std::shared_ptr<data::VV4I> tv(new data::VV4I());
    tv->_0 = fromJSON(W<V4I>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VFloat") {
    tagType = ::Value::tag::VFloat;
    std::shared_ptr<data::VFloat> tv(new data::VFloat());
    tv->_0 = fromJSON(W<Float>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV2F") {
    tagType = ::Value::tag::VV2F;
    std::shared_ptr<data::VV2F> tv(new data::VV2F());
    tv->_0 = fromJSON(W<V2F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV3F") {
    tagType = ::Value::tag::VV3F;
    std::shared_ptr<data::VV3F> tv(new data::VV3F());
    tv->_0 = fromJSON(W<V3F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VV4F") {
    tagType = ::Value::tag::VV4F;
    std::shared_ptr<data::VV4F> tv(new data::VV4F());
    tv->_0 = fromJSON(W<V4F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM22F") {
    tagType = ::Value::tag::VM22F;
    std::shared_ptr<data::VM22F> tv(new data::VM22F());
    tv->_0 = fromJSON(W<M22F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM23F") {
    tagType = ::Value::tag::VM23F;
    std::shared_ptr<data::VM23F> tv(new data::VM23F());
    tv->_0 = fromJSON(W<M23F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM24F") {
    tagType = ::Value::tag::VM24F;
    std::shared_ptr<data::VM24F> tv(new data::VM24F());
    tv->_0 = fromJSON(W<M24F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM32F") {
    tagType = ::Value::tag::VM32F;
    std::shared_ptr<data::VM32F> tv(new data::VM32F());
    tv->_0 = fromJSON(W<M32F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM33F") {
    tagType = ::Value::tag::VM33F;
    std::shared_ptr<data::VM33F> tv(new data::VM33F());
    tv->_0 = fromJSON(W<M33F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM34F") {
    tagType = ::Value::tag::VM34F;
    std::shared_ptr<data::VM34F> tv(new data::VM34F());
    tv->_0 = fromJSON(W<M34F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM42F") {
    tagType = ::Value::tag::VM42F;
    std::shared_ptr<data::VM42F> tv(new data::VM42F());
    tv->_0 = fromJSON(W<M42F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM43F") {
    tagType = ::Value::tag::VM43F;
    std::shared_ptr<data::VM43F> tv(new data::VM43F());
    tv->_0 = fromJSON(W<M43F>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "VM44F") {
    tagType = ::Value::tag::VM44F;
    std::shared_ptr<data::VM44F> tv(new data::VM44F());
    tv->_0 = fromJSON(W<M44F>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Value> o(new ::Value());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<InputType>>(std::shared_ptr<InputType> &v) {
  json obj({});
  switch (v->tag) { 
    case ::InputType::tag::Bool:
      obj["tag"] = "Bool";
      break;
    case ::InputType::tag::V2B:
      obj["tag"] = "V2B";
      break;
    case ::InputType::tag::V3B:
      obj["tag"] = "V3B";
      break;
    case ::InputType::tag::V4B:
      obj["tag"] = "V4B";
      break;
    case ::InputType::tag::Word:
      obj["tag"] = "Word";
      break;
    case ::InputType::tag::V2U:
      obj["tag"] = "V2U";
      break;
    case ::InputType::tag::V3U:
      obj["tag"] = "V3U";
      break;
    case ::InputType::tag::V4U:
      obj["tag"] = "V4U";
      break;
    case ::InputType::tag::Int:
      obj["tag"] = "Int";
      break;
    case ::InputType::tag::V2I:
      obj["tag"] = "V2I";
      break;
    case ::InputType::tag::V3I:
      obj["tag"] = "V3I";
      break;
    case ::InputType::tag::V4I:
      obj["tag"] = "V4I";
      break;
    case ::InputType::tag::Float:
      obj["tag"] = "Float";
      break;
    case ::InputType::tag::V2F:
      obj["tag"] = "V2F";
      break;
    case ::InputType::tag::V3F:
      obj["tag"] = "V3F";
      break;
    case ::InputType::tag::V4F:
      obj["tag"] = "V4F";
      break;
    case ::InputType::tag::M22F:
      obj["tag"] = "M22F";
      break;
    case ::InputType::tag::M23F:
      obj["tag"] = "M23F";
      break;
    case ::InputType::tag::M24F:
      obj["tag"] = "M24F";
      break;
    case ::InputType::tag::M32F:
      obj["tag"] = "M32F";
      break;
    case ::InputType::tag::M33F:
      obj["tag"] = "M33F";
      break;
    case ::InputType::tag::M34F:
      obj["tag"] = "M34F";
      break;
    case ::InputType::tag::M42F:
      obj["tag"] = "M42F";
      break;
    case ::InputType::tag::M43F:
      obj["tag"] = "M43F";
      break;
    case ::InputType::tag::M44F:
      obj["tag"] = "M44F";
      break;
    case ::InputType::tag::STexture1D:
      obj["tag"] = "STexture1D";
      break;
    case ::InputType::tag::STexture2D:
      obj["tag"] = "STexture2D";
      break;
    case ::InputType::tag::STextureCube:
      obj["tag"] = "STextureCube";
      break;
    case ::InputType::tag::STexture1DArray:
      obj["tag"] = "STexture1DArray";
      break;
    case ::InputType::tag::STexture2DArray:
      obj["tag"] = "STexture2DArray";
      break;
    case ::InputType::tag::STexture2DRect:
      obj["tag"] = "STexture2DRect";
      break;
    case ::InputType::tag::FTexture1D:
      obj["tag"] = "FTexture1D";
      break;
    case ::InputType::tag::FTexture2D:
      obj["tag"] = "FTexture2D";
      break;
    case ::InputType::tag::FTexture3D:
      obj["tag"] = "FTexture3D";
      break;
    case ::InputType::tag::FTextureCube:
      obj["tag"] = "FTextureCube";
      break;
    case ::InputType::tag::FTexture1DArray:
      obj["tag"] = "FTexture1DArray";
      break;
    case ::InputType::tag::FTexture2DArray:
      obj["tag"] = "FTexture2DArray";
      break;
    case ::InputType::tag::FTexture2DMS:
      obj["tag"] = "FTexture2DMS";
      break;
    case ::InputType::tag::FTexture2DMSArray:
      obj["tag"] = "FTexture2DMSArray";
      break;
    case ::InputType::tag::FTextureBuffer:
      obj["tag"] = "FTextureBuffer";
      break;
    case ::InputType::tag::FTexture2DRect:
      obj["tag"] = "FTexture2DRect";
      break;
    case ::InputType::tag::ITexture1D:
      obj["tag"] = "ITexture1D";
      break;
    case ::InputType::tag::ITexture2D:
      obj["tag"] = "ITexture2D";
      break;
    case ::InputType::tag::ITexture3D:
      obj["tag"] = "ITexture3D";
      break;
    case ::InputType::tag::ITextureCube:
      obj["tag"] = "ITextureCube";
      break;
    case ::InputType::tag::ITexture1DArray:
      obj["tag"] = "ITexture1DArray";
      break;
    case ::InputType::tag::ITexture2DArray:
      obj["tag"] = "ITexture2DArray";
      break;
    case ::InputType::tag::ITexture2DMS:
      obj["tag"] = "ITexture2DMS";
      break;
    case ::InputType::tag::ITexture2DMSArray:
      obj["tag"] = "ITexture2DMSArray";
      break;
    case ::InputType::tag::ITextureBuffer:
      obj["tag"] = "ITextureBuffer";
      break;
    case ::InputType::tag::ITexture2DRect:
      obj["tag"] = "ITexture2DRect";
      break;
    case ::InputType::tag::UTexture1D:
      obj["tag"] = "UTexture1D";
      break;
    case ::InputType::tag::UTexture2D:
      obj["tag"] = "UTexture2D";
      break;
    case ::InputType::tag::UTexture3D:
      obj["tag"] = "UTexture3D";
      break;
    case ::InputType::tag::UTextureCube:
      obj["tag"] = "UTextureCube";
      break;
    case ::InputType::tag::UTexture1DArray:
      obj["tag"] = "UTexture1DArray";
      break;
    case ::InputType::tag::UTexture2DArray:
      obj["tag"] = "UTexture2DArray";
      break;
    case ::InputType::tag::UTexture2DMS:
      obj["tag"] = "UTexture2DMS";
      break;
    case ::InputType::tag::UTexture2DMSArray:
      obj["tag"] = "UTexture2DMSArray";
      break;
    case ::InputType::tag::UTextureBuffer:
      obj["tag"] = "UTextureBuffer";
      break;
    case ::InputType::tag::UTexture2DRect:
      obj["tag"] = "UTexture2DRect";
      break;
  }
  return obj;
}

template<> std::shared_ptr<InputType> fromJSON<std::shared_ptr<InputType>>(W<std::shared_ptr<InputType>> v, json &obj) {
  enum ::InputType::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Bool") {
    tagType = ::InputType::tag::Bool;
  }
  else if (tag == "V2B") {
    tagType = ::InputType::tag::V2B;
  }
  else if (tag == "V3B") {
    tagType = ::InputType::tag::V3B;
  }
  else if (tag == "V4B") {
    tagType = ::InputType::tag::V4B;
  }
  else if (tag == "Word") {
    tagType = ::InputType::tag::Word;
  }
  else if (tag == "V2U") {
    tagType = ::InputType::tag::V2U;
  }
  else if (tag == "V3U") {
    tagType = ::InputType::tag::V3U;
  }
  else if (tag == "V4U") {
    tagType = ::InputType::tag::V4U;
  }
  else if (tag == "Int") {
    tagType = ::InputType::tag::Int;
  }
  else if (tag == "V2I") {
    tagType = ::InputType::tag::V2I;
  }
  else if (tag == "V3I") {
    tagType = ::InputType::tag::V3I;
  }
  else if (tag == "V4I") {
    tagType = ::InputType::tag::V4I;
  }
  else if (tag == "Float") {
    tagType = ::InputType::tag::Float;
  }
  else if (tag == "V2F") {
    tagType = ::InputType::tag::V2F;
  }
  else if (tag == "V3F") {
    tagType = ::InputType::tag::V3F;
  }
  else if (tag == "V4F") {
    tagType = ::InputType::tag::V4F;
  }
  else if (tag == "M22F") {
    tagType = ::InputType::tag::M22F;
  }
  else if (tag == "M23F") {
    tagType = ::InputType::tag::M23F;
  }
  else if (tag == "M24F") {
    tagType = ::InputType::tag::M24F;
  }
  else if (tag == "M32F") {
    tagType = ::InputType::tag::M32F;
  }
  else if (tag == "M33F") {
    tagType = ::InputType::tag::M33F;
  }
  else if (tag == "M34F") {
    tagType = ::InputType::tag::M34F;
  }
  else if (tag == "M42F") {
    tagType = ::InputType::tag::M42F;
  }
  else if (tag == "M43F") {
    tagType = ::InputType::tag::M43F;
  }
  else if (tag == "M44F") {
    tagType = ::InputType::tag::M44F;
  }
  else if (tag == "STexture1D") {
    tagType = ::InputType::tag::STexture1D;
  }
  else if (tag == "STexture2D") {
    tagType = ::InputType::tag::STexture2D;
  }
  else if (tag == "STextureCube") {
    tagType = ::InputType::tag::STextureCube;
  }
  else if (tag == "STexture1DArray") {
    tagType = ::InputType::tag::STexture1DArray;
  }
  else if (tag == "STexture2DArray") {
    tagType = ::InputType::tag::STexture2DArray;
  }
  else if (tag == "STexture2DRect") {
    tagType = ::InputType::tag::STexture2DRect;
  }
  else if (tag == "FTexture1D") {
    tagType = ::InputType::tag::FTexture1D;
  }
  else if (tag == "FTexture2D") {
    tagType = ::InputType::tag::FTexture2D;
  }
  else if (tag == "FTexture3D") {
    tagType = ::InputType::tag::FTexture3D;
  }
  else if (tag == "FTextureCube") {
    tagType = ::InputType::tag::FTextureCube;
  }
  else if (tag == "FTexture1DArray") {
    tagType = ::InputType::tag::FTexture1DArray;
  }
  else if (tag == "FTexture2DArray") {
    tagType = ::InputType::tag::FTexture2DArray;
  }
  else if (tag == "FTexture2DMS") {
    tagType = ::InputType::tag::FTexture2DMS;
  }
  else if (tag == "FTexture2DMSArray") {
    tagType = ::InputType::tag::FTexture2DMSArray;
  }
  else if (tag == "FTextureBuffer") {
    tagType = ::InputType::tag::FTextureBuffer;
  }
  else if (tag == "FTexture2DRect") {
    tagType = ::InputType::tag::FTexture2DRect;
  }
  else if (tag == "ITexture1D") {
    tagType = ::InputType::tag::ITexture1D;
  }
  else if (tag == "ITexture2D") {
    tagType = ::InputType::tag::ITexture2D;
  }
  else if (tag == "ITexture3D") {
    tagType = ::InputType::tag::ITexture3D;
  }
  else if (tag == "ITextureCube") {
    tagType = ::InputType::tag::ITextureCube;
  }
  else if (tag == "ITexture1DArray") {
    tagType = ::InputType::tag::ITexture1DArray;
  }
  else if (tag == "ITexture2DArray") {
    tagType = ::InputType::tag::ITexture2DArray;
  }
  else if (tag == "ITexture2DMS") {
    tagType = ::InputType::tag::ITexture2DMS;
  }
  else if (tag == "ITexture2DMSArray") {
    tagType = ::InputType::tag::ITexture2DMSArray;
  }
  else if (tag == "ITextureBuffer") {
    tagType = ::InputType::tag::ITextureBuffer;
  }
  else if (tag == "ITexture2DRect") {
    tagType = ::InputType::tag::ITexture2DRect;
  }
  else if (tag == "UTexture1D") {
    tagType = ::InputType::tag::UTexture1D;
  }
  else if (tag == "UTexture2D") {
    tagType = ::InputType::tag::UTexture2D;
  }
  else if (tag == "UTexture3D") {
    tagType = ::InputType::tag::UTexture3D;
  }
  else if (tag == "UTextureCube") {
    tagType = ::InputType::tag::UTextureCube;
  }
  else if (tag == "UTexture1DArray") {
    tagType = ::InputType::tag::UTexture1DArray;
  }
  else if (tag == "UTexture2DArray") {
    tagType = ::InputType::tag::UTexture2DArray;
  }
  else if (tag == "UTexture2DMS") {
    tagType = ::InputType::tag::UTexture2DMS;
  }
  else if (tag == "UTexture2DMSArray") {
    tagType = ::InputType::tag::UTexture2DMSArray;
  }
  else if (tag == "UTextureBuffer") {
    tagType = ::InputType::tag::UTextureBuffer;
  }
  else if (tag == "UTexture2DRect") {
    tagType = ::InputType::tag::UTexture2DRect;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::InputType> o(new ::InputType());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<PointSpriteCoordOrigin>>(std::shared_ptr<PointSpriteCoordOrigin> &v) {
  json obj({});
  switch (v->tag) { 
    case ::PointSpriteCoordOrigin::tag::LowerLeft:
      obj["tag"] = "LowerLeft";
      break;
    case ::PointSpriteCoordOrigin::tag::UpperLeft:
      obj["tag"] = "UpperLeft";
      break;
  }
  return obj;
}

template<> std::shared_ptr<PointSpriteCoordOrigin> fromJSON<std::shared_ptr<PointSpriteCoordOrigin>>(W<std::shared_ptr<PointSpriteCoordOrigin>> v, json &obj) {
  enum ::PointSpriteCoordOrigin::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "LowerLeft") {
    tagType = ::PointSpriteCoordOrigin::tag::LowerLeft;
  }
  else if (tag == "UpperLeft") {
    tagType = ::PointSpriteCoordOrigin::tag::UpperLeft;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::PointSpriteCoordOrigin> o(new ::PointSpriteCoordOrigin());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<PointSize>>(std::shared_ptr<PointSize> &v) {
  json obj({});
  switch (v->tag) { 
    case ::PointSize::tag::PointSize:
      obj["tag"] = "PointSize";
      {
        std::shared_ptr<data::PointSize> tv = std::static_pointer_cast<data::PointSize>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::PointSize::tag::ProgramPointSize:
      obj["tag"] = "ProgramPointSize";
      break;
  }
  return obj;
}

template<> std::shared_ptr<PointSize> fromJSON<std::shared_ptr<PointSize>>(W<std::shared_ptr<PointSize>> v, json &obj) {
  enum ::PointSize::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "PointSize") {
    tagType = ::PointSize::tag::PointSize;
    std::shared_ptr<data::PointSize> tv(new data::PointSize());
    tv->_0 = fromJSON(W<Float>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "ProgramPointSize") {
    tagType = ::PointSize::tag::ProgramPointSize;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::PointSize> o(new ::PointSize());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<PolygonOffset>>(std::shared_ptr<PolygonOffset> &v) {
  json obj({});
  switch (v->tag) { 
    case ::PolygonOffset::tag::NoOffset:
      obj["tag"] = "NoOffset";
      break;
    case ::PolygonOffset::tag::Offset:
      obj["tag"] = "Offset";
      {
        std::shared_ptr<data::Offset> tv = std::static_pointer_cast<data::Offset>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<PolygonOffset> fromJSON<std::shared_ptr<PolygonOffset>>(W<std::shared_ptr<PolygonOffset>> v, json &obj) {
  enum ::PolygonOffset::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "NoOffset") {
    tagType = ::PolygonOffset::tag::NoOffset;
  }
  else if (tag == "Offset") {
    tagType = ::PolygonOffset::tag::Offset;
    std::shared_ptr<data::Offset> tv(new data::Offset());
    tv->_0 = fromJSON(W<Float>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Float>(), obj["arg1"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::PolygonOffset> o(new ::PolygonOffset());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<FrontFace>>(std::shared_ptr<FrontFace> &v) {
  json obj({});
  switch (v->tag) { 
    case ::FrontFace::tag::CCW:
      obj["tag"] = "CCW";
      break;
    case ::FrontFace::tag::CW:
      obj["tag"] = "CW";
      break;
  }
  return obj;
}

template<> std::shared_ptr<FrontFace> fromJSON<std::shared_ptr<FrontFace>>(W<std::shared_ptr<FrontFace>> v, json &obj) {
  enum ::FrontFace::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "CCW") {
    tagType = ::FrontFace::tag::CCW;
  }
  else if (tag == "CW") {
    tagType = ::FrontFace::tag::CW;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::FrontFace> o(new ::FrontFace());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<PolygonMode>>(std::shared_ptr<PolygonMode> &v) {
  json obj({});
  switch (v->tag) { 
    case ::PolygonMode::tag::PolygonPoint:
      obj["tag"] = "PolygonPoint";
      {
        std::shared_ptr<data::PolygonPoint> tv = std::static_pointer_cast<data::PolygonPoint>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::PolygonMode::tag::PolygonLine:
      obj["tag"] = "PolygonLine";
      {
        std::shared_ptr<data::PolygonLine> tv = std::static_pointer_cast<data::PolygonLine>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::PolygonMode::tag::PolygonFill:
      obj["tag"] = "PolygonFill";
      break;
  }
  return obj;
}

template<> std::shared_ptr<PolygonMode> fromJSON<std::shared_ptr<PolygonMode>>(W<std::shared_ptr<PolygonMode>> v, json &obj) {
  enum ::PolygonMode::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "PolygonPoint") {
    tagType = ::PolygonMode::tag::PolygonPoint;
    std::shared_ptr<data::PolygonPoint> tv(new data::PolygonPoint());
    tv->_0 = fromJSON(W<std::shared_ptr<::PointSize>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "PolygonLine") {
    tagType = ::PolygonMode::tag::PolygonLine;
    std::shared_ptr<data::PolygonLine> tv(new data::PolygonLine());
    tv->_0 = fromJSON(W<Float>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "PolygonFill") {
    tagType = ::PolygonMode::tag::PolygonFill;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::PolygonMode> o(new ::PolygonMode());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ProvokingVertex>>(std::shared_ptr<ProvokingVertex> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ProvokingVertex::tag::FirstVertex:
      obj["tag"] = "FirstVertex";
      break;
    case ::ProvokingVertex::tag::LastVertex:
      obj["tag"] = "LastVertex";
      break;
  }
  return obj;
}

template<> std::shared_ptr<ProvokingVertex> fromJSON<std::shared_ptr<ProvokingVertex>>(W<std::shared_ptr<ProvokingVertex>> v, json &obj) {
  enum ::ProvokingVertex::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "FirstVertex") {
    tagType = ::ProvokingVertex::tag::FirstVertex;
  }
  else if (tag == "LastVertex") {
    tagType = ::ProvokingVertex::tag::LastVertex;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ProvokingVertex> o(new ::ProvokingVertex());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<CullMode>>(std::shared_ptr<CullMode> &v) {
  json obj({});
  switch (v->tag) { 
    case ::CullMode::tag::CullNone:
      obj["tag"] = "CullNone";
      break;
    case ::CullMode::tag::CullFront:
      obj["tag"] = "CullFront";
      {
        std::shared_ptr<data::CullFront> tv = std::static_pointer_cast<data::CullFront>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::CullMode::tag::CullBack:
      obj["tag"] = "CullBack";
      {
        std::shared_ptr<data::CullBack> tv = std::static_pointer_cast<data::CullBack>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<CullMode> fromJSON<std::shared_ptr<CullMode>>(W<std::shared_ptr<CullMode>> v, json &obj) {
  enum ::CullMode::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "CullNone") {
    tagType = ::CullMode::tag::CullNone;
  }
  else if (tag == "CullFront") {
    tagType = ::CullMode::tag::CullFront;
    std::shared_ptr<data::CullFront> tv(new data::CullFront());
    tv->_0 = fromJSON(W<std::shared_ptr<::FrontFace>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "CullBack") {
    tagType = ::CullMode::tag::CullBack;
    std::shared_ptr<data::CullBack> tv(new data::CullBack());
    tv->_0 = fromJSON(W<std::shared_ptr<::FrontFace>>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::CullMode> o(new ::CullMode());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ComparisonFunction>>(std::shared_ptr<ComparisonFunction> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ComparisonFunction::tag::Never:
      obj["tag"] = "Never";
      break;
    case ::ComparisonFunction::tag::Less:
      obj["tag"] = "Less";
      break;
    case ::ComparisonFunction::tag::Equal:
      obj["tag"] = "Equal";
      break;
    case ::ComparisonFunction::tag::Lequal:
      obj["tag"] = "Lequal";
      break;
    case ::ComparisonFunction::tag::Greater:
      obj["tag"] = "Greater";
      break;
    case ::ComparisonFunction::tag::Notequal:
      obj["tag"] = "Notequal";
      break;
    case ::ComparisonFunction::tag::Gequal:
      obj["tag"] = "Gequal";
      break;
    case ::ComparisonFunction::tag::Always:
      obj["tag"] = "Always";
      break;
  }
  return obj;
}

template<> std::shared_ptr<ComparisonFunction> fromJSON<std::shared_ptr<ComparisonFunction>>(W<std::shared_ptr<ComparisonFunction>> v, json &obj) {
  enum ::ComparisonFunction::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Never") {
    tagType = ::ComparisonFunction::tag::Never;
  }
  else if (tag == "Less") {
    tagType = ::ComparisonFunction::tag::Less;
  }
  else if (tag == "Equal") {
    tagType = ::ComparisonFunction::tag::Equal;
  }
  else if (tag == "Lequal") {
    tagType = ::ComparisonFunction::tag::Lequal;
  }
  else if (tag == "Greater") {
    tagType = ::ComparisonFunction::tag::Greater;
  }
  else if (tag == "Notequal") {
    tagType = ::ComparisonFunction::tag::Notequal;
  }
  else if (tag == "Gequal") {
    tagType = ::ComparisonFunction::tag::Gequal;
  }
  else if (tag == "Always") {
    tagType = ::ComparisonFunction::tag::Always;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ComparisonFunction> o(new ::ComparisonFunction());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<StencilOperation>>(std::shared_ptr<StencilOperation> &v) {
  json obj({});
  switch (v->tag) { 
    case ::StencilOperation::tag::OpZero:
      obj["tag"] = "OpZero";
      break;
    case ::StencilOperation::tag::OpKeep:
      obj["tag"] = "OpKeep";
      break;
    case ::StencilOperation::tag::OpReplace:
      obj["tag"] = "OpReplace";
      break;
    case ::StencilOperation::tag::OpIncr:
      obj["tag"] = "OpIncr";
      break;
    case ::StencilOperation::tag::OpIncrWrap:
      obj["tag"] = "OpIncrWrap";
      break;
    case ::StencilOperation::tag::OpDecr:
      obj["tag"] = "OpDecr";
      break;
    case ::StencilOperation::tag::OpDecrWrap:
      obj["tag"] = "OpDecrWrap";
      break;
    case ::StencilOperation::tag::OpInvert:
      obj["tag"] = "OpInvert";
      break;
  }
  return obj;
}

template<> std::shared_ptr<StencilOperation> fromJSON<std::shared_ptr<StencilOperation>>(W<std::shared_ptr<StencilOperation>> v, json &obj) {
  enum ::StencilOperation::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "OpZero") {
    tagType = ::StencilOperation::tag::OpZero;
  }
  else if (tag == "OpKeep") {
    tagType = ::StencilOperation::tag::OpKeep;
  }
  else if (tag == "OpReplace") {
    tagType = ::StencilOperation::tag::OpReplace;
  }
  else if (tag == "OpIncr") {
    tagType = ::StencilOperation::tag::OpIncr;
  }
  else if (tag == "OpIncrWrap") {
    tagType = ::StencilOperation::tag::OpIncrWrap;
  }
  else if (tag == "OpDecr") {
    tagType = ::StencilOperation::tag::OpDecr;
  }
  else if (tag == "OpDecrWrap") {
    tagType = ::StencilOperation::tag::OpDecrWrap;
  }
  else if (tag == "OpInvert") {
    tagType = ::StencilOperation::tag::OpInvert;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::StencilOperation> o(new ::StencilOperation());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<BlendEquation>>(std::shared_ptr<BlendEquation> &v) {
  json obj({});
  switch (v->tag) { 
    case ::BlendEquation::tag::FuncAdd:
      obj["tag"] = "FuncAdd";
      break;
    case ::BlendEquation::tag::FuncSubtract:
      obj["tag"] = "FuncSubtract";
      break;
    case ::BlendEquation::tag::FuncReverseSubtract:
      obj["tag"] = "FuncReverseSubtract";
      break;
    case ::BlendEquation::tag::Min:
      obj["tag"] = "Min";
      break;
    case ::BlendEquation::tag::Max:
      obj["tag"] = "Max";
      break;
  }
  return obj;
}

template<> std::shared_ptr<BlendEquation> fromJSON<std::shared_ptr<BlendEquation>>(W<std::shared_ptr<BlendEquation>> v, json &obj) {
  enum ::BlendEquation::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "FuncAdd") {
    tagType = ::BlendEquation::tag::FuncAdd;
  }
  else if (tag == "FuncSubtract") {
    tagType = ::BlendEquation::tag::FuncSubtract;
  }
  else if (tag == "FuncReverseSubtract") {
    tagType = ::BlendEquation::tag::FuncReverseSubtract;
  }
  else if (tag == "Min") {
    tagType = ::BlendEquation::tag::Min;
  }
  else if (tag == "Max") {
    tagType = ::BlendEquation::tag::Max;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::BlendEquation> o(new ::BlendEquation());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<BlendingFactor>>(std::shared_ptr<BlendingFactor> &v) {
  json obj({});
  switch (v->tag) { 
    case ::BlendingFactor::tag::Zero:
      obj["tag"] = "Zero";
      break;
    case ::BlendingFactor::tag::One:
      obj["tag"] = "One";
      break;
    case ::BlendingFactor::tag::SrcColor:
      obj["tag"] = "SrcColor";
      break;
    case ::BlendingFactor::tag::OneMinusSrcColor:
      obj["tag"] = "OneMinusSrcColor";
      break;
    case ::BlendingFactor::tag::DstColor:
      obj["tag"] = "DstColor";
      break;
    case ::BlendingFactor::tag::OneMinusDstColor:
      obj["tag"] = "OneMinusDstColor";
      break;
    case ::BlendingFactor::tag::SrcAlpha:
      obj["tag"] = "SrcAlpha";
      break;
    case ::BlendingFactor::tag::OneMinusSrcAlpha:
      obj["tag"] = "OneMinusSrcAlpha";
      break;
    case ::BlendingFactor::tag::DstAlpha:
      obj["tag"] = "DstAlpha";
      break;
    case ::BlendingFactor::tag::OneMinusDstAlpha:
      obj["tag"] = "OneMinusDstAlpha";
      break;
    case ::BlendingFactor::tag::ConstantColor:
      obj["tag"] = "ConstantColor";
      break;
    case ::BlendingFactor::tag::OneMinusConstantColor:
      obj["tag"] = "OneMinusConstantColor";
      break;
    case ::BlendingFactor::tag::ConstantAlpha:
      obj["tag"] = "ConstantAlpha";
      break;
    case ::BlendingFactor::tag::OneMinusConstantAlpha:
      obj["tag"] = "OneMinusConstantAlpha";
      break;
    case ::BlendingFactor::tag::SrcAlphaSaturate:
      obj["tag"] = "SrcAlphaSaturate";
      break;
  }
  return obj;
}

template<> std::shared_ptr<BlendingFactor> fromJSON<std::shared_ptr<BlendingFactor>>(W<std::shared_ptr<BlendingFactor>> v, json &obj) {
  enum ::BlendingFactor::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Zero") {
    tagType = ::BlendingFactor::tag::Zero;
  }
  else if (tag == "One") {
    tagType = ::BlendingFactor::tag::One;
  }
  else if (tag == "SrcColor") {
    tagType = ::BlendingFactor::tag::SrcColor;
  }
  else if (tag == "OneMinusSrcColor") {
    tagType = ::BlendingFactor::tag::OneMinusSrcColor;
  }
  else if (tag == "DstColor") {
    tagType = ::BlendingFactor::tag::DstColor;
  }
  else if (tag == "OneMinusDstColor") {
    tagType = ::BlendingFactor::tag::OneMinusDstColor;
  }
  else if (tag == "SrcAlpha") {
    tagType = ::BlendingFactor::tag::SrcAlpha;
  }
  else if (tag == "OneMinusSrcAlpha") {
    tagType = ::BlendingFactor::tag::OneMinusSrcAlpha;
  }
  else if (tag == "DstAlpha") {
    tagType = ::BlendingFactor::tag::DstAlpha;
  }
  else if (tag == "OneMinusDstAlpha") {
    tagType = ::BlendingFactor::tag::OneMinusDstAlpha;
  }
  else if (tag == "ConstantColor") {
    tagType = ::BlendingFactor::tag::ConstantColor;
  }
  else if (tag == "OneMinusConstantColor") {
    tagType = ::BlendingFactor::tag::OneMinusConstantColor;
  }
  else if (tag == "ConstantAlpha") {
    tagType = ::BlendingFactor::tag::ConstantAlpha;
  }
  else if (tag == "OneMinusConstantAlpha") {
    tagType = ::BlendingFactor::tag::OneMinusConstantAlpha;
  }
  else if (tag == "SrcAlphaSaturate") {
    tagType = ::BlendingFactor::tag::SrcAlphaSaturate;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::BlendingFactor> o(new ::BlendingFactor());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<LogicOperation>>(std::shared_ptr<LogicOperation> &v) {
  json obj({});
  switch (v->tag) { 
    case ::LogicOperation::tag::Clear:
      obj["tag"] = "Clear";
      break;
    case ::LogicOperation::tag::And:
      obj["tag"] = "And";
      break;
    case ::LogicOperation::tag::AndReverse:
      obj["tag"] = "AndReverse";
      break;
    case ::LogicOperation::tag::Copy:
      obj["tag"] = "Copy";
      break;
    case ::LogicOperation::tag::AndInverted:
      obj["tag"] = "AndInverted";
      break;
    case ::LogicOperation::tag::Noop:
      obj["tag"] = "Noop";
      break;
    case ::LogicOperation::tag::Xor:
      obj["tag"] = "Xor";
      break;
    case ::LogicOperation::tag::Or:
      obj["tag"] = "Or";
      break;
    case ::LogicOperation::tag::Nor:
      obj["tag"] = "Nor";
      break;
    case ::LogicOperation::tag::Equiv:
      obj["tag"] = "Equiv";
      break;
    case ::LogicOperation::tag::Invert:
      obj["tag"] = "Invert";
      break;
    case ::LogicOperation::tag::OrReverse:
      obj["tag"] = "OrReverse";
      break;
    case ::LogicOperation::tag::CopyInverted:
      obj["tag"] = "CopyInverted";
      break;
    case ::LogicOperation::tag::OrInverted:
      obj["tag"] = "OrInverted";
      break;
    case ::LogicOperation::tag::Nand:
      obj["tag"] = "Nand";
      break;
    case ::LogicOperation::tag::Set:
      obj["tag"] = "Set";
      break;
  }
  return obj;
}

template<> std::shared_ptr<LogicOperation> fromJSON<std::shared_ptr<LogicOperation>>(W<std::shared_ptr<LogicOperation>> v, json &obj) {
  enum ::LogicOperation::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Clear") {
    tagType = ::LogicOperation::tag::Clear;
  }
  else if (tag == "And") {
    tagType = ::LogicOperation::tag::And;
  }
  else if (tag == "AndReverse") {
    tagType = ::LogicOperation::tag::AndReverse;
  }
  else if (tag == "Copy") {
    tagType = ::LogicOperation::tag::Copy;
  }
  else if (tag == "AndInverted") {
    tagType = ::LogicOperation::tag::AndInverted;
  }
  else if (tag == "Noop") {
    tagType = ::LogicOperation::tag::Noop;
  }
  else if (tag == "Xor") {
    tagType = ::LogicOperation::tag::Xor;
  }
  else if (tag == "Or") {
    tagType = ::LogicOperation::tag::Or;
  }
  else if (tag == "Nor") {
    tagType = ::LogicOperation::tag::Nor;
  }
  else if (tag == "Equiv") {
    tagType = ::LogicOperation::tag::Equiv;
  }
  else if (tag == "Invert") {
    tagType = ::LogicOperation::tag::Invert;
  }
  else if (tag == "OrReverse") {
    tagType = ::LogicOperation::tag::OrReverse;
  }
  else if (tag == "CopyInverted") {
    tagType = ::LogicOperation::tag::CopyInverted;
  }
  else if (tag == "OrInverted") {
    tagType = ::LogicOperation::tag::OrInverted;
  }
  else if (tag == "Nand") {
    tagType = ::LogicOperation::tag::Nand;
  }
  else if (tag == "Set") {
    tagType = ::LogicOperation::tag::Set;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::LogicOperation> o(new ::LogicOperation());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<StencilOps>>(std::shared_ptr<StencilOps> &v) {
  json obj({});
  switch (v->tag) { 
    case ::StencilOps::tag::StencilOps:
      obj["tag"] = "StencilOps";
      {
        std::shared_ptr<data::StencilOps> tv = std::static_pointer_cast<data::StencilOps>(v);
        obj["frontStencilOp"] = toJSON(tv->frontStencilOp);
        obj["backStencilOp"] = toJSON(tv->backStencilOp);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<StencilOps> fromJSON<std::shared_ptr<StencilOps>>(W<std::shared_ptr<StencilOps>> v, json &obj) {
  enum ::StencilOps::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "StencilOps") {
    tagType = ::StencilOps::tag::StencilOps;
    std::shared_ptr<data::StencilOps> tv(new data::StencilOps());
    tv->frontStencilOp = fromJSON(W<std::shared_ptr<::StencilOperation>>(), obj["frontStencilOp"]);
    tv->backStencilOp = fromJSON(W<std::shared_ptr<::StencilOperation>>(), obj["backStencilOp"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::StencilOps> o(new ::StencilOps());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<StencilTest>>(std::shared_ptr<StencilTest> &v) {
  json obj({});
  switch (v->tag) { 
    case ::StencilTest::tag::StencilTest:
      obj["tag"] = "StencilTest";
      {
        std::shared_ptr<data::StencilTest> tv = std::static_pointer_cast<data::StencilTest>(v);
        obj["stencilComparision"] = toJSON(tv->stencilComparision);
        obj["stencilReference"] = toJSON(tv->stencilReference);
        obj["stencilMask"] = toJSON(tv->stencilMask);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<StencilTest> fromJSON<std::shared_ptr<StencilTest>>(W<std::shared_ptr<StencilTest>> v, json &obj) {
  enum ::StencilTest::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "StencilTest") {
    tagType = ::StencilTest::tag::StencilTest;
    std::shared_ptr<data::StencilTest> tv(new data::StencilTest());
    tv->stencilComparision = fromJSON(W<std::shared_ptr<::ComparisonFunction>>(), obj["stencilComparision"]);
    tv->stencilReference = fromJSON(W<Int32>(), obj["stencilReference"]);
    tv->stencilMask = fromJSON(W<Word32>(), obj["stencilMask"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::StencilTest> o(new ::StencilTest());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<StencilTests>>(std::shared_ptr<StencilTests> &v) {
  json obj({});
  switch (v->tag) { 
    case ::StencilTests::tag::StencilTests:
      obj["tag"] = "StencilTests";
      {
        std::shared_ptr<data::StencilTests> tv = std::static_pointer_cast<data::StencilTests>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<StencilTests> fromJSON<std::shared_ptr<StencilTests>>(W<std::shared_ptr<StencilTests>> v, json &obj) {
  enum ::StencilTests::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "StencilTests") {
    tagType = ::StencilTests::tag::StencilTests;
    std::shared_ptr<data::StencilTests> tv(new data::StencilTests());
    tv->_0 = fromJSON(W<std::shared_ptr<::StencilTest>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::shared_ptr<::StencilTest>>(), obj["arg1"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::StencilTests> o(new ::StencilTests());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<FetchPrimitive>>(std::shared_ptr<FetchPrimitive> &v) {
  json obj({});
  switch (v->tag) { 
    case ::FetchPrimitive::tag::Points:
      obj["tag"] = "Points";
      break;
    case ::FetchPrimitive::tag::Lines:
      obj["tag"] = "Lines";
      break;
    case ::FetchPrimitive::tag::Triangles:
      obj["tag"] = "Triangles";
      break;
    case ::FetchPrimitive::tag::LinesAdjacency:
      obj["tag"] = "LinesAdjacency";
      break;
    case ::FetchPrimitive::tag::TrianglesAdjacency:
      obj["tag"] = "TrianglesAdjacency";
      break;
  }
  return obj;
}

template<> std::shared_ptr<FetchPrimitive> fromJSON<std::shared_ptr<FetchPrimitive>>(W<std::shared_ptr<FetchPrimitive>> v, json &obj) {
  enum ::FetchPrimitive::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Points") {
    tagType = ::FetchPrimitive::tag::Points;
  }
  else if (tag == "Lines") {
    tagType = ::FetchPrimitive::tag::Lines;
  }
  else if (tag == "Triangles") {
    tagType = ::FetchPrimitive::tag::Triangles;
  }
  else if (tag == "LinesAdjacency") {
    tagType = ::FetchPrimitive::tag::LinesAdjacency;
  }
  else if (tag == "TrianglesAdjacency") {
    tagType = ::FetchPrimitive::tag::TrianglesAdjacency;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::FetchPrimitive> o(new ::FetchPrimitive());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<OutputPrimitive>>(std::shared_ptr<OutputPrimitive> &v) {
  json obj({});
  switch (v->tag) { 
    case ::OutputPrimitive::tag::TrianglesOutput:
      obj["tag"] = "TrianglesOutput";
      break;
    case ::OutputPrimitive::tag::LinesOutput:
      obj["tag"] = "LinesOutput";
      break;
    case ::OutputPrimitive::tag::PointsOutput:
      obj["tag"] = "PointsOutput";
      break;
  }
  return obj;
}

template<> std::shared_ptr<OutputPrimitive> fromJSON<std::shared_ptr<OutputPrimitive>>(W<std::shared_ptr<OutputPrimitive>> v, json &obj) {
  enum ::OutputPrimitive::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "TrianglesOutput") {
    tagType = ::OutputPrimitive::tag::TrianglesOutput;
  }
  else if (tag == "LinesOutput") {
    tagType = ::OutputPrimitive::tag::LinesOutput;
  }
  else if (tag == "PointsOutput") {
    tagType = ::OutputPrimitive::tag::PointsOutput;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::OutputPrimitive> o(new ::OutputPrimitive());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ColorArity>>(std::shared_ptr<ColorArity> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ColorArity::tag::Red:
      obj["tag"] = "Red";
      break;
    case ::ColorArity::tag::RG:
      obj["tag"] = "RG";
      break;
    case ::ColorArity::tag::RGB:
      obj["tag"] = "RGB";
      break;
    case ::ColorArity::tag::RGBA:
      obj["tag"] = "RGBA";
      break;
  }
  return obj;
}

template<> std::shared_ptr<ColorArity> fromJSON<std::shared_ptr<ColorArity>>(W<std::shared_ptr<ColorArity>> v, json &obj) {
  enum ::ColorArity::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Red") {
    tagType = ::ColorArity::tag::Red;
  }
  else if (tag == "RG") {
    tagType = ::ColorArity::tag::RG;
  }
  else if (tag == "RGB") {
    tagType = ::ColorArity::tag::RGB;
  }
  else if (tag == "RGBA") {
    tagType = ::ColorArity::tag::RGBA;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ColorArity> o(new ::ColorArity());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Blending>>(std::shared_ptr<Blending> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Blending::tag::NoBlending:
      obj["tag"] = "NoBlending";
      break;
    case ::Blending::tag::BlendLogicOp:
      obj["tag"] = "BlendLogicOp";
      {
        std::shared_ptr<data::BlendLogicOp> tv = std::static_pointer_cast<data::BlendLogicOp>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Blending::tag::Blend:
      obj["tag"] = "Blend";
      {
        std::shared_ptr<data::Blend> tv = std::static_pointer_cast<data::Blend>(v);
        obj["colorEqSrc"] = toJSON(tv->colorEqSrc);
        obj["alphaEqSrc"] = toJSON(tv->alphaEqSrc);
        obj["colorFSrc"] = toJSON(tv->colorFSrc);
        obj["colorFDst"] = toJSON(tv->colorFDst);
        obj["alphaFSrc"] = toJSON(tv->alphaFSrc);
        obj["alphaFDst"] = toJSON(tv->alphaFDst);
        obj["color"] = toJSON(tv->color);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Blending> fromJSON<std::shared_ptr<Blending>>(W<std::shared_ptr<Blending>> v, json &obj) {
  enum ::Blending::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "NoBlending") {
    tagType = ::Blending::tag::NoBlending;
  }
  else if (tag == "BlendLogicOp") {
    tagType = ::Blending::tag::BlendLogicOp;
    std::shared_ptr<data::BlendLogicOp> tv(new data::BlendLogicOp());
    tv->_0 = fromJSON(W<std::shared_ptr<::LogicOperation>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "Blend") {
    tagType = ::Blending::tag::Blend;
    std::shared_ptr<data::Blend> tv(new data::Blend());
    tv->colorEqSrc = fromJSON(W<std::shared_ptr<::BlendEquation>>(), obj["colorEqSrc"]);
    tv->alphaEqSrc = fromJSON(W<std::shared_ptr<::BlendEquation>>(), obj["alphaEqSrc"]);
    tv->colorFSrc = fromJSON(W<std::shared_ptr<::BlendingFactor>>(), obj["colorFSrc"]);
    tv->colorFDst = fromJSON(W<std::shared_ptr<::BlendingFactor>>(), obj["colorFDst"]);
    tv->alphaFSrc = fromJSON(W<std::shared_ptr<::BlendingFactor>>(), obj["alphaFSrc"]);
    tv->alphaFDst = fromJSON(W<std::shared_ptr<::BlendingFactor>>(), obj["alphaFDst"]);
    tv->color = fromJSON(W<V4F>(), obj["color"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Blending> o(new ::Blending());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<RasterContext>>(std::shared_ptr<RasterContext> &v) {
  json obj({});
  switch (v->tag) { 
    case ::RasterContext::tag::PointCtx:
      obj["tag"] = "PointCtx";
      {
        std::shared_ptr<data::PointCtx> tv = std::static_pointer_cast<data::PointCtx>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
      }
      break;
    case ::RasterContext::tag::LineCtx:
      obj["tag"] = "LineCtx";
      {
        std::shared_ptr<data::LineCtx> tv = std::static_pointer_cast<data::LineCtx>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::RasterContext::tag::TriangleCtx:
      obj["tag"] = "TriangleCtx";
      {
        std::shared_ptr<data::TriangleCtx> tv = std::static_pointer_cast<data::TriangleCtx>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
        obj["arg3"] = toJSON(tv->_3);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<RasterContext> fromJSON<std::shared_ptr<RasterContext>>(W<std::shared_ptr<RasterContext>> v, json &obj) {
  enum ::RasterContext::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "PointCtx") {
    tagType = ::RasterContext::tag::PointCtx;
    std::shared_ptr<data::PointCtx> tv(new data::PointCtx());
    tv->_0 = fromJSON(W<std::shared_ptr<::PointSize>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Float>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::shared_ptr<::PointSpriteCoordOrigin>>(), obj["arg2"]);
    return tv;
  }
  else if (tag == "LineCtx") {
    tagType = ::RasterContext::tag::LineCtx;
    std::shared_ptr<data::LineCtx> tv(new data::LineCtx());
    tv->_0 = fromJSON(W<Float>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::shared_ptr<::ProvokingVertex>>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "TriangleCtx") {
    tagType = ::RasterContext::tag::TriangleCtx;
    std::shared_ptr<data::TriangleCtx> tv(new data::TriangleCtx());
    tv->_0 = fromJSON(W<std::shared_ptr<::CullMode>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::shared_ptr<::PolygonMode>>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::shared_ptr<::PolygonOffset>>(), obj["arg2"]);
    tv->_3 = fromJSON(W<std::shared_ptr<::ProvokingVertex>>(), obj["arg3"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::RasterContext> o(new ::RasterContext());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<FragmentOperation>>(std::shared_ptr<FragmentOperation> &v) {
  json obj({});
  switch (v->tag) { 
    case ::FragmentOperation::tag::DepthOp:
      obj["tag"] = "DepthOp";
      {
        std::shared_ptr<data::DepthOp> tv = std::static_pointer_cast<data::DepthOp>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::FragmentOperation::tag::StencilOp:
      obj["tag"] = "StencilOp";
      {
        std::shared_ptr<data::StencilOp> tv = std::static_pointer_cast<data::StencilOp>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
      }
      break;
    case ::FragmentOperation::tag::ColorOp:
      obj["tag"] = "ColorOp";
      {
        std::shared_ptr<data::ColorOp> tv = std::static_pointer_cast<data::ColorOp>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<FragmentOperation> fromJSON<std::shared_ptr<FragmentOperation>>(W<std::shared_ptr<FragmentOperation>> v, json &obj) {
  enum ::FragmentOperation::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "DepthOp") {
    tagType = ::FragmentOperation::tag::DepthOp;
    std::shared_ptr<data::DepthOp> tv(new data::DepthOp());
    tv->_0 = fromJSON(W<std::shared_ptr<::DepthFunction>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Bool>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "StencilOp") {
    tagType = ::FragmentOperation::tag::StencilOp;
    std::shared_ptr<data::StencilOp> tv(new data::StencilOp());
    tv->_0 = fromJSON(W<std::shared_ptr<::StencilTests>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::shared_ptr<::StencilOps>>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::shared_ptr<::StencilOps>>(), obj["arg2"]);
    return tv;
  }
  else if (tag == "ColorOp") {
    tagType = ::FragmentOperation::tag::ColorOp;
    std::shared_ptr<data::ColorOp> tv(new data::ColorOp());
    tv->_0 = fromJSON(W<std::shared_ptr<::Blending>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::shared_ptr<::Value>>(), obj["arg1"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::FragmentOperation> o(new ::FragmentOperation());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<AccumulationContext>>(std::shared_ptr<AccumulationContext> &v) {
  json obj({});
  switch (v->tag) { 
    case ::AccumulationContext::tag::AccumulationContext:
      obj["tag"] = "AccumulationContext";
      {
        std::shared_ptr<data::AccumulationContext> tv = std::static_pointer_cast<data::AccumulationContext>(v);
        obj["accViewportName"] = toJSON(tv->accViewportName);
        obj["accOperations"] = toJSON(tv->accOperations);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<AccumulationContext> fromJSON<std::shared_ptr<AccumulationContext>>(W<std::shared_ptr<AccumulationContext>> v, json &obj) {
  enum ::AccumulationContext::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "AccumulationContext") {
    tagType = ::AccumulationContext::tag::AccumulationContext;
    std::shared_ptr<data::AccumulationContext> tv(new data::AccumulationContext());
    tv->accViewportName = fromJSON(W<Maybe<String>>(), obj["accViewportName"]);
    tv->accOperations = fromJSON(W<std::vector<std::shared_ptr<::FragmentOperation>>>(), obj["accOperations"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::AccumulationContext> o(new ::AccumulationContext());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<TextureDataType>>(std::shared_ptr<TextureDataType> &v) {
  json obj({});
  switch (v->tag) { 
    case ::TextureDataType::tag::FloatT:
      obj["tag"] = "FloatT";
      {
        std::shared_ptr<data::FloatT> tv = std::static_pointer_cast<data::FloatT>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::TextureDataType::tag::IntT:
      obj["tag"] = "IntT";
      {
        std::shared_ptr<data::IntT> tv = std::static_pointer_cast<data::IntT>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::TextureDataType::tag::WordT:
      obj["tag"] = "WordT";
      {
        std::shared_ptr<data::WordT> tv = std::static_pointer_cast<data::WordT>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::TextureDataType::tag::ShadowT:
      obj["tag"] = "ShadowT";
      break;
  }
  return obj;
}

template<> std::shared_ptr<TextureDataType> fromJSON<std::shared_ptr<TextureDataType>>(W<std::shared_ptr<TextureDataType>> v, json &obj) {
  enum ::TextureDataType::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "FloatT") {
    tagType = ::TextureDataType::tag::FloatT;
    std::shared_ptr<data::FloatT> tv(new data::FloatT());
    tv->_0 = fromJSON(W<std::shared_ptr<::ColorArity>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "IntT") {
    tagType = ::TextureDataType::tag::IntT;
    std::shared_ptr<data::IntT> tv(new data::IntT());
    tv->_0 = fromJSON(W<std::shared_ptr<::ColorArity>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "WordT") {
    tagType = ::TextureDataType::tag::WordT;
    std::shared_ptr<data::WordT> tv(new data::WordT());
    tv->_0 = fromJSON(W<std::shared_ptr<::ColorArity>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "ShadowT") {
    tagType = ::TextureDataType::tag::ShadowT;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::TextureDataType> o(new ::TextureDataType());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<TextureType>>(std::shared_ptr<TextureType> &v) {
  json obj({});
  switch (v->tag) { 
    case ::TextureType::tag::Texture1D:
      obj["tag"] = "Texture1D";
      {
        std::shared_ptr<data::Texture1D> tv = std::static_pointer_cast<data::Texture1D>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::TextureType::tag::Texture2D:
      obj["tag"] = "Texture2D";
      {
        std::shared_ptr<data::Texture2D> tv = std::static_pointer_cast<data::Texture2D>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::TextureType::tag::Texture3D:
      obj["tag"] = "Texture3D";
      {
        std::shared_ptr<data::Texture3D> tv = std::static_pointer_cast<data::Texture3D>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::TextureType::tag::TextureCube:
      obj["tag"] = "TextureCube";
      {
        std::shared_ptr<data::TextureCube> tv = std::static_pointer_cast<data::TextureCube>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::TextureType::tag::TextureRect:
      obj["tag"] = "TextureRect";
      {
        std::shared_ptr<data::TextureRect> tv = std::static_pointer_cast<data::TextureRect>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::TextureType::tag::Texture2DMS:
      obj["tag"] = "Texture2DMS";
      {
        std::shared_ptr<data::Texture2DMS> tv = std::static_pointer_cast<data::Texture2DMS>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
        obj["arg3"] = toJSON(tv->_3);
      }
      break;
    case ::TextureType::tag::TextureBuffer:
      obj["tag"] = "TextureBuffer";
      {
        std::shared_ptr<data::TextureBuffer> tv = std::static_pointer_cast<data::TextureBuffer>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<TextureType> fromJSON<std::shared_ptr<TextureType>>(W<std::shared_ptr<TextureType>> v, json &obj) {
  enum ::TextureType::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Texture1D") {
    tagType = ::TextureType::tag::Texture1D;
    std::shared_ptr<data::Texture1D> tv(new data::Texture1D());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Int>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "Texture2D") {
    tagType = ::TextureType::tag::Texture2D;
    std::shared_ptr<data::Texture2D> tv(new data::Texture2D());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Int>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "Texture3D") {
    tagType = ::TextureType::tag::Texture3D;
    std::shared_ptr<data::Texture3D> tv(new data::Texture3D());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "TextureCube") {
    tagType = ::TextureType::tag::TextureCube;
    std::shared_ptr<data::TextureCube> tv(new data::TextureCube());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "TextureRect") {
    tagType = ::TextureType::tag::TextureRect;
    std::shared_ptr<data::TextureRect> tv(new data::TextureRect());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "Texture2DMS") {
    tagType = ::TextureType::tag::Texture2DMS;
    std::shared_ptr<data::Texture2DMS> tv(new data::Texture2DMS());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Int>(), obj["arg1"]);
    tv->_2 = fromJSON(W<Int>(), obj["arg2"]);
    tv->_3 = fromJSON(W<Bool>(), obj["arg3"]);
    return tv;
  }
  else if (tag == "TextureBuffer") {
    tagType = ::TextureType::tag::TextureBuffer;
    std::shared_ptr<data::TextureBuffer> tv(new data::TextureBuffer());
    tv->_0 = fromJSON(W<std::shared_ptr<::TextureDataType>>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::TextureType> o(new ::TextureType());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<MipMap>>(std::shared_ptr<MipMap> &v) {
  json obj({});
  switch (v->tag) { 
    case ::MipMap::tag::Mip:
      obj["tag"] = "Mip";
      {
        std::shared_ptr<data::Mip> tv = std::static_pointer_cast<data::Mip>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::MipMap::tag::NoMip:
      obj["tag"] = "NoMip";
      break;
    case ::MipMap::tag::AutoMip:
      obj["tag"] = "AutoMip";
      {
        std::shared_ptr<data::AutoMip> tv = std::static_pointer_cast<data::AutoMip>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<MipMap> fromJSON<std::shared_ptr<MipMap>>(W<std::shared_ptr<MipMap>> v, json &obj) {
  enum ::MipMap::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Mip") {
    tagType = ::MipMap::tag::Mip;
    std::shared_ptr<data::Mip> tv(new data::Mip());
    tv->_0 = fromJSON(W<Int>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Int>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "NoMip") {
    tagType = ::MipMap::tag::NoMip;
  }
  else if (tag == "AutoMip") {
    tagType = ::MipMap::tag::AutoMip;
    std::shared_ptr<data::AutoMip> tv(new data::AutoMip());
    tv->_0 = fromJSON(W<Int>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Int>(), obj["arg1"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::MipMap> o(new ::MipMap());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Filter>>(std::shared_ptr<Filter> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Filter::tag::Nearest:
      obj["tag"] = "Nearest";
      break;
    case ::Filter::tag::Linear:
      obj["tag"] = "Linear";
      break;
    case ::Filter::tag::NearestMipmapNearest:
      obj["tag"] = "NearestMipmapNearest";
      break;
    case ::Filter::tag::NearestMipmapLinear:
      obj["tag"] = "NearestMipmapLinear";
      break;
    case ::Filter::tag::LinearMipmapNearest:
      obj["tag"] = "LinearMipmapNearest";
      break;
    case ::Filter::tag::LinearMipmapLinear:
      obj["tag"] = "LinearMipmapLinear";
      break;
  }
  return obj;
}

template<> std::shared_ptr<Filter> fromJSON<std::shared_ptr<Filter>>(W<std::shared_ptr<Filter>> v, json &obj) {
  enum ::Filter::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Nearest") {
    tagType = ::Filter::tag::Nearest;
  }
  else if (tag == "Linear") {
    tagType = ::Filter::tag::Linear;
  }
  else if (tag == "NearestMipmapNearest") {
    tagType = ::Filter::tag::NearestMipmapNearest;
  }
  else if (tag == "NearestMipmapLinear") {
    tagType = ::Filter::tag::NearestMipmapLinear;
  }
  else if (tag == "LinearMipmapNearest") {
    tagType = ::Filter::tag::LinearMipmapNearest;
  }
  else if (tag == "LinearMipmapLinear") {
    tagType = ::Filter::tag::LinearMipmapLinear;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Filter> o(new ::Filter());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<EdgeMode>>(std::shared_ptr<EdgeMode> &v) {
  json obj({});
  switch (v->tag) { 
    case ::EdgeMode::tag::Repeat:
      obj["tag"] = "Repeat";
      break;
    case ::EdgeMode::tag::MirroredRepeat:
      obj["tag"] = "MirroredRepeat";
      break;
    case ::EdgeMode::tag::ClampToEdge:
      obj["tag"] = "ClampToEdge";
      break;
    case ::EdgeMode::tag::ClampToBorder:
      obj["tag"] = "ClampToBorder";
      break;
  }
  return obj;
}

template<> std::shared_ptr<EdgeMode> fromJSON<std::shared_ptr<EdgeMode>>(W<std::shared_ptr<EdgeMode>> v, json &obj) {
  enum ::EdgeMode::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Repeat") {
    tagType = ::EdgeMode::tag::Repeat;
  }
  else if (tag == "MirroredRepeat") {
    tagType = ::EdgeMode::tag::MirroredRepeat;
  }
  else if (tag == "ClampToEdge") {
    tagType = ::EdgeMode::tag::ClampToEdge;
  }
  else if (tag == "ClampToBorder") {
    tagType = ::EdgeMode::tag::ClampToBorder;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::EdgeMode> o(new ::EdgeMode());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ImageSemantic>>(std::shared_ptr<ImageSemantic> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ImageSemantic::tag::Depth:
      obj["tag"] = "Depth";
      break;
    case ::ImageSemantic::tag::Stencil:
      obj["tag"] = "Stencil";
      break;
    case ::ImageSemantic::tag::Color:
      obj["tag"] = "Color";
      break;
  }
  return obj;
}

template<> std::shared_ptr<ImageSemantic> fromJSON<std::shared_ptr<ImageSemantic>>(W<std::shared_ptr<ImageSemantic>> v, json &obj) {
  enum ::ImageSemantic::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Depth") {
    tagType = ::ImageSemantic::tag::Depth;
  }
  else if (tag == "Stencil") {
    tagType = ::ImageSemantic::tag::Stencil;
  }
  else if (tag == "Color") {
    tagType = ::ImageSemantic::tag::Color;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ImageSemantic> o(new ::ImageSemantic());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ImageRef>>(std::shared_ptr<ImageRef> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ImageRef::tag::TextureImage:
      obj["tag"] = "TextureImage";
      {
        std::shared_ptr<data::TextureImage> tv = std::static_pointer_cast<data::TextureImage>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
      }
      break;
    case ::ImageRef::tag::Framebuffer:
      obj["tag"] = "Framebuffer";
      {
        std::shared_ptr<data::Framebuffer> tv = std::static_pointer_cast<data::Framebuffer>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<ImageRef> fromJSON<std::shared_ptr<ImageRef>>(W<std::shared_ptr<ImageRef>> v, json &obj) {
  enum ::ImageRef::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "TextureImage") {
    tagType = ::ImageRef::tag::TextureImage;
    std::shared_ptr<data::TextureImage> tv(new data::TextureImage());
    tv->_0 = fromJSON(W<::TextureName>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Int>(), obj["arg1"]);
    tv->_2 = fromJSON(W<Maybe<Int>>(), obj["arg2"]);
    return tv;
  }
  else if (tag == "Framebuffer") {
    tagType = ::ImageRef::tag::Framebuffer;
    std::shared_ptr<data::Framebuffer> tv(new data::Framebuffer());
    tv->_0 = fromJSON(W<std::shared_ptr<::ImageSemantic>>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ImageRef> o(new ::ImageRef());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ClearImage>>(std::shared_ptr<ClearImage> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ClearImage::tag::ClearImage:
      obj["tag"] = "ClearImage";
      {
        std::shared_ptr<data::ClearImage> tv = std::static_pointer_cast<data::ClearImage>(v);
        obj["imageSemantic"] = toJSON(tv->imageSemantic);
        obj["clearValue"] = toJSON(tv->clearValue);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<ClearImage> fromJSON<std::shared_ptr<ClearImage>>(W<std::shared_ptr<ClearImage>> v, json &obj) {
  enum ::ClearImage::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "ClearImage") {
    tagType = ::ClearImage::tag::ClearImage;
    std::shared_ptr<data::ClearImage> tv(new data::ClearImage());
    tv->imageSemantic = fromJSON(W<std::shared_ptr<::ImageSemantic>>(), obj["imageSemantic"]);
    tv->clearValue = fromJSON(W<std::shared_ptr<::Value>>(), obj["clearValue"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ClearImage> o(new ::ClearImage());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Command>>(std::shared_ptr<Command> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Command::tag::SetRasterContext:
      obj["tag"] = "SetRasterContext";
      {
        std::shared_ptr<data::SetRasterContext> tv = std::static_pointer_cast<data::SetRasterContext>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::SetAccumulationContext:
      obj["tag"] = "SetAccumulationContext";
      {
        std::shared_ptr<data::SetAccumulationContext> tv = std::static_pointer_cast<data::SetAccumulationContext>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::SetRenderTarget:
      obj["tag"] = "SetRenderTarget";
      {
        std::shared_ptr<data::SetRenderTarget> tv = std::static_pointer_cast<data::SetRenderTarget>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::SetProgram:
      obj["tag"] = "SetProgram";
      {
        std::shared_ptr<data::SetProgram> tv = std::static_pointer_cast<data::SetProgram>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::SetSamplerUniform:
      obj["tag"] = "SetSamplerUniform";
      {
        std::shared_ptr<data::SetSamplerUniform> tv = std::static_pointer_cast<data::SetSamplerUniform>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::Command::tag::SetTexture:
      obj["tag"] = "SetTexture";
      {
        std::shared_ptr<data::SetTexture> tv = std::static_pointer_cast<data::SetTexture>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::Command::tag::SetSampler:
      obj["tag"] = "SetSampler";
      {
        std::shared_ptr<data::SetSampler> tv = std::static_pointer_cast<data::SetSampler>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::Command::tag::RenderSlot:
      obj["tag"] = "RenderSlot";
      {
        std::shared_ptr<data::RenderSlot> tv = std::static_pointer_cast<data::RenderSlot>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::RenderStream:
      obj["tag"] = "RenderStream";
      {
        std::shared_ptr<data::RenderStream> tv = std::static_pointer_cast<data::RenderStream>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::ClearRenderTarget:
      obj["tag"] = "ClearRenderTarget";
      {
        std::shared_ptr<data::ClearRenderTarget> tv = std::static_pointer_cast<data::ClearRenderTarget>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::GenerateMipMap:
      obj["tag"] = "GenerateMipMap";
      {
        std::shared_ptr<data::GenerateMipMap> tv = std::static_pointer_cast<data::GenerateMipMap>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::Command::tag::SaveImage:
      obj["tag"] = "SaveImage";
      {
        std::shared_ptr<data::SaveImage> tv = std::static_pointer_cast<data::SaveImage>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::Command::tag::LoadImage:
      obj["tag"] = "LoadImage";
      {
        std::shared_ptr<data::LoadImage> tv = std::static_pointer_cast<data::LoadImage>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Command> fromJSON<std::shared_ptr<Command>>(W<std::shared_ptr<Command>> v, json &obj) {
  enum ::Command::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "SetRasterContext") {
    tagType = ::Command::tag::SetRasterContext;
    std::shared_ptr<data::SetRasterContext> tv(new data::SetRasterContext());
    tv->_0 = fromJSON(W<std::shared_ptr<::RasterContext>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "SetAccumulationContext") {
    tagType = ::Command::tag::SetAccumulationContext;
    std::shared_ptr<data::SetAccumulationContext> tv(new data::SetAccumulationContext());
    tv->_0 = fromJSON(W<std::shared_ptr<::AccumulationContext>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "SetRenderTarget") {
    tagType = ::Command::tag::SetRenderTarget;
    std::shared_ptr<data::SetRenderTarget> tv(new data::SetRenderTarget());
    tv->_0 = fromJSON(W<::RenderTargetName>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "SetProgram") {
    tagType = ::Command::tag::SetProgram;
    std::shared_ptr<data::SetProgram> tv(new data::SetProgram());
    tv->_0 = fromJSON(W<::ProgramName>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "SetSamplerUniform") {
    tagType = ::Command::tag::SetSamplerUniform;
    std::shared_ptr<data::SetSamplerUniform> tv(new data::SetSamplerUniform());
    tv->_0 = fromJSON(W<::UniformName>(), obj["arg0"]);
    tv->_1 = fromJSON(W<::TextureUnit>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "SetTexture") {
    tagType = ::Command::tag::SetTexture;
    std::shared_ptr<data::SetTexture> tv(new data::SetTexture());
    tv->_0 = fromJSON(W<::TextureUnit>(), obj["arg0"]);
    tv->_1 = fromJSON(W<::TextureName>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "SetSampler") {
    tagType = ::Command::tag::SetSampler;
    std::shared_ptr<data::SetSampler> tv(new data::SetSampler());
    tv->_0 = fromJSON(W<::TextureUnit>(), obj["arg0"]);
    tv->_1 = fromJSON(W<Maybe<::SamplerName>>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "RenderSlot") {
    tagType = ::Command::tag::RenderSlot;
    std::shared_ptr<data::RenderSlot> tv(new data::RenderSlot());
    tv->_0 = fromJSON(W<::SlotName>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "RenderStream") {
    tagType = ::Command::tag::RenderStream;
    std::shared_ptr<data::RenderStream> tv(new data::RenderStream());
    tv->_0 = fromJSON(W<::StreamName>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "ClearRenderTarget") {
    tagType = ::Command::tag::ClearRenderTarget;
    std::shared_ptr<data::ClearRenderTarget> tv(new data::ClearRenderTarget());
    tv->_0 = fromJSON(W<std::vector<std::shared_ptr<::ClearImage>>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "GenerateMipMap") {
    tagType = ::Command::tag::GenerateMipMap;
    std::shared_ptr<data::GenerateMipMap> tv(new data::GenerateMipMap());
    tv->_0 = fromJSON(W<::TextureUnit>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "SaveImage") {
    tagType = ::Command::tag::SaveImage;
    std::shared_ptr<data::SaveImage> tv(new data::SaveImage());
    tv->_0 = fromJSON(W<::FrameBufferComponent>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::shared_ptr<::ImageRef>>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "LoadImage") {
    tagType = ::Command::tag::LoadImage;
    std::shared_ptr<data::LoadImage> tv(new data::LoadImage());
    tv->_0 = fromJSON(W<std::shared_ptr<::ImageRef>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<::FrameBufferComponent>(), obj["arg1"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Command> o(new ::Command());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<SamplerDescriptor>>(std::shared_ptr<SamplerDescriptor> &v) {
  json obj({});
  switch (v->tag) { 
    case ::SamplerDescriptor::tag::SamplerDescriptor:
      obj["tag"] = "SamplerDescriptor";
      {
        std::shared_ptr<data::SamplerDescriptor> tv = std::static_pointer_cast<data::SamplerDescriptor>(v);
        obj["samplerWrapS"] = toJSON(tv->samplerWrapS);
        obj["samplerWrapT"] = toJSON(tv->samplerWrapT);
        obj["samplerWrapR"] = toJSON(tv->samplerWrapR);
        obj["samplerMinFilter"] = toJSON(tv->samplerMinFilter);
        obj["samplerMagFilter"] = toJSON(tv->samplerMagFilter);
        obj["samplerBorderColor"] = toJSON(tv->samplerBorderColor);
        obj["samplerMinLod"] = toJSON(tv->samplerMinLod);
        obj["samplerMaxLod"] = toJSON(tv->samplerMaxLod);
        obj["samplerLodBias"] = toJSON(tv->samplerLodBias);
        obj["samplerCompareFunc"] = toJSON(tv->samplerCompareFunc);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<SamplerDescriptor> fromJSON<std::shared_ptr<SamplerDescriptor>>(W<std::shared_ptr<SamplerDescriptor>> v, json &obj) {
  enum ::SamplerDescriptor::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "SamplerDescriptor") {
    tagType = ::SamplerDescriptor::tag::SamplerDescriptor;
    std::shared_ptr<data::SamplerDescriptor> tv(new data::SamplerDescriptor());
    tv->samplerWrapS = fromJSON(W<std::shared_ptr<::EdgeMode>>(), obj["samplerWrapS"]);
    tv->samplerWrapT = fromJSON(W<Maybe<std::shared_ptr<::EdgeMode>>>(), obj["samplerWrapT"]);
    tv->samplerWrapR = fromJSON(W<Maybe<std::shared_ptr<::EdgeMode>>>(), obj["samplerWrapR"]);
    tv->samplerMinFilter = fromJSON(W<std::shared_ptr<::Filter>>(), obj["samplerMinFilter"]);
    tv->samplerMagFilter = fromJSON(W<std::shared_ptr<::Filter>>(), obj["samplerMagFilter"]);
    tv->samplerBorderColor = fromJSON(W<std::shared_ptr<::Value>>(), obj["samplerBorderColor"]);
    tv->samplerMinLod = fromJSON(W<Maybe<Float>>(), obj["samplerMinLod"]);
    tv->samplerMaxLod = fromJSON(W<Maybe<Float>>(), obj["samplerMaxLod"]);
    tv->samplerLodBias = fromJSON(W<Float>(), obj["samplerLodBias"]);
    tv->samplerCompareFunc = fromJSON(W<Maybe<std::shared_ptr<::ComparisonFunction>>>(), obj["samplerCompareFunc"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::SamplerDescriptor> o(new ::SamplerDescriptor());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<TextureDescriptor>>(std::shared_ptr<TextureDescriptor> &v) {
  json obj({});
  switch (v->tag) { 
    case ::TextureDescriptor::tag::TextureDescriptor:
      obj["tag"] = "TextureDescriptor";
      {
        std::shared_ptr<data::TextureDescriptor> tv = std::static_pointer_cast<data::TextureDescriptor>(v);
        obj["textureType"] = toJSON(tv->textureType);
        obj["textureSize"] = toJSON(tv->textureSize);
        obj["textureSemantic"] = toJSON(tv->textureSemantic);
        obj["textureSampler"] = toJSON(tv->textureSampler);
        obj["textureBaseLevel"] = toJSON(tv->textureBaseLevel);
        obj["textureMaxLevel"] = toJSON(tv->textureMaxLevel);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<TextureDescriptor> fromJSON<std::shared_ptr<TextureDescriptor>>(W<std::shared_ptr<TextureDescriptor>> v, json &obj) {
  enum ::TextureDescriptor::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "TextureDescriptor") {
    tagType = ::TextureDescriptor::tag::TextureDescriptor;
    std::shared_ptr<data::TextureDescriptor> tv(new data::TextureDescriptor());
    tv->textureType = fromJSON(W<std::shared_ptr<::TextureType>>(), obj["textureType"]);
    tv->textureSize = fromJSON(W<std::shared_ptr<::Value>>(), obj["textureSize"]);
    tv->textureSemantic = fromJSON(W<std::shared_ptr<::ImageSemantic>>(), obj["textureSemantic"]);
    tv->textureSampler = fromJSON(W<std::shared_ptr<::SamplerDescriptor>>(), obj["textureSampler"]);
    tv->textureBaseLevel = fromJSON(W<Int>(), obj["textureBaseLevel"]);
    tv->textureMaxLevel = fromJSON(W<Int>(), obj["textureMaxLevel"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::TextureDescriptor> o(new ::TextureDescriptor());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Parameter>>(std::shared_ptr<Parameter> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Parameter::tag::Parameter:
      obj["tag"] = "Parameter";
      {
        std::shared_ptr<data::Parameter> tv = std::static_pointer_cast<data::Parameter>(v);
        obj["name"] = toJSON(tv->name);
        obj["ty"] = toJSON(tv->ty);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Parameter> fromJSON<std::shared_ptr<Parameter>>(W<std::shared_ptr<Parameter>> v, json &obj) {
  enum ::Parameter::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Parameter") {
    tagType = ::Parameter::tag::Parameter;
    std::shared_ptr<data::Parameter> tv(new data::Parameter());
    tv->name = fromJSON(W<String>(), obj["name"]);
    tv->ty = fromJSON(W<std::shared_ptr<::InputType>>(), obj["ty"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Parameter> o(new ::Parameter());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Program>>(std::shared_ptr<Program> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Program::tag::Program:
      obj["tag"] = "Program";
      {
        std::shared_ptr<data::Program> tv = std::static_pointer_cast<data::Program>(v);
        obj["programUniforms"] = toJSON(tv->programUniforms);
        obj["programStreams"] = toJSON(tv->programStreams);
        obj["programInTextures"] = toJSON(tv->programInTextures);
        obj["programOutput"] = toJSON(tv->programOutput);
        obj["vertexShader"] = toJSON(tv->vertexShader);
        obj["geometryShader"] = toJSON(tv->geometryShader);
        obj["fragmentShader"] = toJSON(tv->fragmentShader);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Program> fromJSON<std::shared_ptr<Program>>(W<std::shared_ptr<Program>> v, json &obj) {
  enum ::Program::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Program") {
    tagType = ::Program::tag::Program;
    std::shared_ptr<data::Program> tv(new data::Program());
    tv->programUniforms = fromJSON(W<std::map<::UniformName, std::shared_ptr<::InputType>>>(), obj["programUniforms"]);
    tv->programStreams = fromJSON(W<std::map<::UniformName, std::shared_ptr<::Parameter>>>(), obj["programStreams"]);
    tv->programInTextures = fromJSON(W<std::map<::UniformName, std::shared_ptr<::InputType>>>(), obj["programInTextures"]);
    tv->programOutput = fromJSON(W<std::vector<std::shared_ptr<::Parameter>>>(), obj["programOutput"]);
    tv->vertexShader = fromJSON(W<String>(), obj["vertexShader"]);
    tv->geometryShader = fromJSON(W<Maybe<String>>(), obj["geometryShader"]);
    tv->fragmentShader = fromJSON(W<String>(), obj["fragmentShader"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Program> o(new ::Program());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Slot>>(std::shared_ptr<Slot> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Slot::tag::Slot:
      obj["tag"] = "Slot";
      {
        std::shared_ptr<data::Slot> tv = std::static_pointer_cast<data::Slot>(v);
        obj["slotName"] = toJSON(tv->slotName);
        obj["slotStreams"] = toJSON(tv->slotStreams);
        obj["slotUniforms"] = toJSON(tv->slotUniforms);
        obj["slotPrimitive"] = toJSON(tv->slotPrimitive);
        obj["slotPrograms"] = toJSON(tv->slotPrograms);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Slot> fromJSON<std::shared_ptr<Slot>>(W<std::shared_ptr<Slot>> v, json &obj) {
  enum ::Slot::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Slot") {
    tagType = ::Slot::tag::Slot;
    std::shared_ptr<data::Slot> tv(new data::Slot());
    tv->slotName = fromJSON(W<String>(), obj["slotName"]);
    tv->slotStreams = fromJSON(W<std::map<String, std::shared_ptr<::InputType>>>(), obj["slotStreams"]);
    tv->slotUniforms = fromJSON(W<std::map<::UniformName, std::shared_ptr<::InputType>>>(), obj["slotUniforms"]);
    tv->slotPrimitive = fromJSON(W<std::shared_ptr<::FetchPrimitive>>(), obj["slotPrimitive"]);
    tv->slotPrograms = fromJSON(W<std::vector<::ProgramName>>(), obj["slotPrograms"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Slot> o(new ::Slot());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<StreamData>>(std::shared_ptr<StreamData> &v) {
  json obj({});
  switch (v->tag) { 
    case ::StreamData::tag::StreamData:
      obj["tag"] = "StreamData";
      {
        std::shared_ptr<data::StreamData> tv = std::static_pointer_cast<data::StreamData>(v);
        obj["streamData"] = toJSON(tv->streamData);
        obj["streamType"] = toJSON(tv->streamType);
        obj["streamPrimitive"] = toJSON(tv->streamPrimitive);
        obj["streamPrograms"] = toJSON(tv->streamPrograms);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<StreamData> fromJSON<std::shared_ptr<StreamData>>(W<std::shared_ptr<StreamData>> v, json &obj) {
  enum ::StreamData::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "StreamData") {
    tagType = ::StreamData::tag::StreamData;
    std::shared_ptr<data::StreamData> tv(new data::StreamData());
    tv->streamData = fromJSON(W<std::map<String, std::shared_ptr<::ArrayValue>>>(), obj["streamData"]);
    tv->streamType = fromJSON(W<std::map<String, std::shared_ptr<::InputType>>>(), obj["streamType"]);
    tv->streamPrimitive = fromJSON(W<std::shared_ptr<::FetchPrimitive>>(), obj["streamPrimitive"]);
    tv->streamPrograms = fromJSON(W<std::vector<::ProgramName>>(), obj["streamPrograms"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::StreamData> o(new ::StreamData());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<TargetItem>>(std::shared_ptr<TargetItem> &v) {
  json obj({});
  switch (v->tag) { 
    case ::TargetItem::tag::TargetItem:
      obj["tag"] = "TargetItem";
      {
        std::shared_ptr<data::TargetItem> tv = std::static_pointer_cast<data::TargetItem>(v);
        obj["targetSemantic"] = toJSON(tv->targetSemantic);
        obj["targetRef"] = toJSON(tv->targetRef);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<TargetItem> fromJSON<std::shared_ptr<TargetItem>>(W<std::shared_ptr<TargetItem>> v, json &obj) {
  enum ::TargetItem::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "TargetItem") {
    tagType = ::TargetItem::tag::TargetItem;
    std::shared_ptr<data::TargetItem> tv(new data::TargetItem());
    tv->targetSemantic = fromJSON(W<std::shared_ptr<::ImageSemantic>>(), obj["targetSemantic"]);
    tv->targetRef = fromJSON(W<Maybe<std::shared_ptr<::ImageRef>>>(), obj["targetRef"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::TargetItem> o(new ::TargetItem());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<RenderTarget>>(std::shared_ptr<RenderTarget> &v) {
  json obj({});
  switch (v->tag) { 
    case ::RenderTarget::tag::RenderTarget:
      obj["tag"] = "RenderTarget";
      {
        std::shared_ptr<data::RenderTarget> tv = std::static_pointer_cast<data::RenderTarget>(v);
        obj["renderTargets"] = toJSON(tv->renderTargets);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<RenderTarget> fromJSON<std::shared_ptr<RenderTarget>>(W<std::shared_ptr<RenderTarget>> v, json &obj) {
  enum ::RenderTarget::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "RenderTarget") {
    tagType = ::RenderTarget::tag::RenderTarget;
    std::shared_ptr<data::RenderTarget> tv(new data::RenderTarget());
    tv->renderTargets = fromJSON(W<std::vector<std::shared_ptr<::TargetItem>>>(), obj["renderTargets"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::RenderTarget> o(new ::RenderTarget());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Backend>>(std::shared_ptr<Backend> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Backend::tag::WebGL1:
      obj["tag"] = "WebGL1";
      break;
    case ::Backend::tag::OpenGL33:
      obj["tag"] = "OpenGL33";
      break;
    case ::Backend::tag::DirectX11:
      obj["tag"] = "DirectX11";
      break;
  }
  return obj;
}

template<> std::shared_ptr<Backend> fromJSON<std::shared_ptr<Backend>>(W<std::shared_ptr<Backend>> v, json &obj) {
  enum ::Backend::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "WebGL1") {
    tagType = ::Backend::tag::WebGL1;
  }
  else if (tag == "OpenGL33") {
    tagType = ::Backend::tag::OpenGL33;
  }
  else if (tag == "DirectX11") {
    tagType = ::Backend::tag::DirectX11;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Backend> o(new ::Backend());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Pipeline>>(std::shared_ptr<Pipeline> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Pipeline::tag::Pipeline:
      obj["tag"] = "Pipeline";
      {
        std::shared_ptr<data::Pipeline> tv = std::static_pointer_cast<data::Pipeline>(v);
        obj["info"] = toJSON(tv->info);
        obj["backend"] = toJSON(tv->backend);
        obj["textures"] = toJSON(tv->textures);
        obj["samplers"] = toJSON(tv->samplers);
        obj["targets"] = toJSON(tv->targets);
        obj["programs"] = toJSON(tv->programs);
        obj["slots"] = toJSON(tv->slots);
        obj["streams"] = toJSON(tv->streams);
        obj["commands"] = toJSON(tv->commands);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Pipeline> fromJSON<std::shared_ptr<Pipeline>>(W<std::shared_ptr<Pipeline>> v, json &obj) {
  enum ::Pipeline::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Pipeline") {
    tagType = ::Pipeline::tag::Pipeline;
    std::shared_ptr<data::Pipeline> tv(new data::Pipeline());
    tv->info = fromJSON(W<String>(), obj["info"]);
    tv->backend = fromJSON(W<std::shared_ptr<::Backend>>(), obj["backend"]);
    tv->textures = fromJSON(W<std::vector<std::shared_ptr<::TextureDescriptor>>>(), obj["textures"]);
    tv->samplers = fromJSON(W<std::vector<std::shared_ptr<::SamplerDescriptor>>>(), obj["samplers"]);
    tv->targets = fromJSON(W<std::vector<std::shared_ptr<::RenderTarget>>>(), obj["targets"]);
    tv->programs = fromJSON(W<std::vector<std::shared_ptr<::Program>>>(), obj["programs"]);
    tv->slots = fromJSON(W<std::vector<std::shared_ptr<::Slot>>>(), obj["slots"]);
    tv->streams = fromJSON(W<std::vector<std::shared_ptr<::StreamData>>>(), obj["streams"]);
    tv->commands = fromJSON(W<std::vector<std::shared_ptr<::Command>>>(), obj["commands"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Pipeline> o(new ::Pipeline());
  o->tag = tagType;
  return o;
}

