// generated file, do not modify!
// 2016-04-01T16:25:35.172905000000Z

#include "LambdaCube.PipelineSchema.hpp"
template<> json toJSON<std::shared_ptr<StreamType>>(std::shared_ptr<StreamType> &v) {
  json obj({});
  switch (v->tag) { 
    case ::StreamType::tag::Attribute_Word:
      obj["tag"] = "Attribute_Word";
      break;
    case ::StreamType::tag::Attribute_V2U:
      obj["tag"] = "Attribute_V2U";
      break;
    case ::StreamType::tag::Attribute_V3U:
      obj["tag"] = "Attribute_V3U";
      break;
    case ::StreamType::tag::Attribute_V4U:
      obj["tag"] = "Attribute_V4U";
      break;
    case ::StreamType::tag::Attribute_Int:
      obj["tag"] = "Attribute_Int";
      break;
    case ::StreamType::tag::Attribute_V2I:
      obj["tag"] = "Attribute_V2I";
      break;
    case ::StreamType::tag::Attribute_V3I:
      obj["tag"] = "Attribute_V3I";
      break;
    case ::StreamType::tag::Attribute_V4I:
      obj["tag"] = "Attribute_V4I";
      break;
    case ::StreamType::tag::Attribute_Float:
      obj["tag"] = "Attribute_Float";
      break;
    case ::StreamType::tag::Attribute_V2F:
      obj["tag"] = "Attribute_V2F";
      break;
    case ::StreamType::tag::Attribute_V3F:
      obj["tag"] = "Attribute_V3F";
      break;
    case ::StreamType::tag::Attribute_V4F:
      obj["tag"] = "Attribute_V4F";
      break;
    case ::StreamType::tag::Attribute_M22F:
      obj["tag"] = "Attribute_M22F";
      break;
    case ::StreamType::tag::Attribute_M23F:
      obj["tag"] = "Attribute_M23F";
      break;
    case ::StreamType::tag::Attribute_M24F:
      obj["tag"] = "Attribute_M24F";
      break;
    case ::StreamType::tag::Attribute_M32F:
      obj["tag"] = "Attribute_M32F";
      break;
    case ::StreamType::tag::Attribute_M33F:
      obj["tag"] = "Attribute_M33F";
      break;
    case ::StreamType::tag::Attribute_M34F:
      obj["tag"] = "Attribute_M34F";
      break;
    case ::StreamType::tag::Attribute_M42F:
      obj["tag"] = "Attribute_M42F";
      break;
    case ::StreamType::tag::Attribute_M43F:
      obj["tag"] = "Attribute_M43F";
      break;
    case ::StreamType::tag::Attribute_M44F:
      obj["tag"] = "Attribute_M44F";
      break;
  }
  return obj;
}

template<> std::shared_ptr<StreamType> fromJSON<std::shared_ptr<StreamType>>(W<std::shared_ptr<StreamType>> v, json &obj) {
  enum ::StreamType::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Attribute_Word") {
    tagType = ::StreamType::tag::Attribute_Word;
  }
  else if (tag == "Attribute_V2U") {
    tagType = ::StreamType::tag::Attribute_V2U;
  }
  else if (tag == "Attribute_V3U") {
    tagType = ::StreamType::tag::Attribute_V3U;
  }
  else if (tag == "Attribute_V4U") {
    tagType = ::StreamType::tag::Attribute_V4U;
  }
  else if (tag == "Attribute_Int") {
    tagType = ::StreamType::tag::Attribute_Int;
  }
  else if (tag == "Attribute_V2I") {
    tagType = ::StreamType::tag::Attribute_V2I;
  }
  else if (tag == "Attribute_V3I") {
    tagType = ::StreamType::tag::Attribute_V3I;
  }
  else if (tag == "Attribute_V4I") {
    tagType = ::StreamType::tag::Attribute_V4I;
  }
  else if (tag == "Attribute_Float") {
    tagType = ::StreamType::tag::Attribute_Float;
  }
  else if (tag == "Attribute_V2F") {
    tagType = ::StreamType::tag::Attribute_V2F;
  }
  else if (tag == "Attribute_V3F") {
    tagType = ::StreamType::tag::Attribute_V3F;
  }
  else if (tag == "Attribute_V4F") {
    tagType = ::StreamType::tag::Attribute_V4F;
  }
  else if (tag == "Attribute_M22F") {
    tagType = ::StreamType::tag::Attribute_M22F;
  }
  else if (tag == "Attribute_M23F") {
    tagType = ::StreamType::tag::Attribute_M23F;
  }
  else if (tag == "Attribute_M24F") {
    tagType = ::StreamType::tag::Attribute_M24F;
  }
  else if (tag == "Attribute_M32F") {
    tagType = ::StreamType::tag::Attribute_M32F;
  }
  else if (tag == "Attribute_M33F") {
    tagType = ::StreamType::tag::Attribute_M33F;
  }
  else if (tag == "Attribute_M34F") {
    tagType = ::StreamType::tag::Attribute_M34F;
  }
  else if (tag == "Attribute_M42F") {
    tagType = ::StreamType::tag::Attribute_M42F;
  }
  else if (tag == "Attribute_M43F") {
    tagType = ::StreamType::tag::Attribute_M43F;
  }
  else if (tag == "Attribute_M44F") {
    tagType = ::StreamType::tag::Attribute_M44F;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::StreamType> o(new ::StreamType());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ObjectArraySchema>>(std::shared_ptr<ObjectArraySchema> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ObjectArraySchema::tag::ObjectArraySchema:
      obj["tag"] = "ObjectArraySchema";
      {
        std::shared_ptr<data::ObjectArraySchema> tv = std::static_pointer_cast<data::ObjectArraySchema>(v);
        obj["primitive"] = toJSON(tv->primitive);
        obj["attributes"] = toJSON(tv->attributes);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<ObjectArraySchema> fromJSON<std::shared_ptr<ObjectArraySchema>>(W<std::shared_ptr<ObjectArraySchema>> v, json &obj) {
  enum ::ObjectArraySchema::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "ObjectArraySchema") {
    tagType = ::ObjectArraySchema::tag::ObjectArraySchema;
    std::shared_ptr<data::ObjectArraySchema> tv(new data::ObjectArraySchema());
    tv->primitive = fromJSON(W<std::shared_ptr<::FetchPrimitive>>(), obj["primitive"]);
    tv->attributes = fromJSON(W<std::map<String, std::shared_ptr<::StreamType>>>(), obj["attributes"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ObjectArraySchema> o(new ::ObjectArraySchema());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<PipelineSchema>>(std::shared_ptr<PipelineSchema> &v) {
  json obj({});
  switch (v->tag) { 
    case ::PipelineSchema::tag::PipelineSchema:
      obj["tag"] = "PipelineSchema";
      {
        std::shared_ptr<data::PipelineSchema> tv = std::static_pointer_cast<data::PipelineSchema>(v);
        obj["objectArrays"] = toJSON(tv->objectArrays);
        obj["uniforms"] = toJSON(tv->uniforms);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<PipelineSchema> fromJSON<std::shared_ptr<PipelineSchema>>(W<std::shared_ptr<PipelineSchema>> v, json &obj) {
  enum ::PipelineSchema::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "PipelineSchema") {
    tagType = ::PipelineSchema::tag::PipelineSchema;
    std::shared_ptr<data::PipelineSchema> tv(new data::PipelineSchema());
    tv->objectArrays = fromJSON(W<std::map<String, std::shared_ptr<::ObjectArraySchema>>>(), obj["objectArrays"]);
    tv->uniforms = fromJSON(W<std::map<String, std::shared_ptr<::InputType>>>(), obj["uniforms"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::PipelineSchema> o(new ::PipelineSchema());
  o->tag = tagType;
  return o;
}

