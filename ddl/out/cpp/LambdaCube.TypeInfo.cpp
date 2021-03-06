// generated file, do not modify!
// 2016-11-11T11:17:03.605012000000Z

#include "LambdaCube.TypeInfo.hpp"
template<> json toJSON<std::shared_ptr<Range>>(std::shared_ptr<Range> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Range::tag::Range:
      obj["tag"] = "Range";
      {
        std::shared_ptr<data::Range> tv = std::static_pointer_cast<data::Range>(v);
        obj["startLine"] = toJSON(tv->startLine);
        obj["startColumn"] = toJSON(tv->startColumn);
        obj["endLine"] = toJSON(tv->endLine);
        obj["endColumn"] = toJSON(tv->endColumn);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Range> fromJSON<std::shared_ptr<Range>>(W<std::shared_ptr<Range>> v, json &obj) {
  enum ::Range::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Range") {
    tagType = ::Range::tag::Range;
    std::shared_ptr<data::Range> tv(new data::Range());
    tv->startLine = fromJSON(W<Int>(), obj["startLine"]);
    tv->startColumn = fromJSON(W<Int>(), obj["startColumn"]);
    tv->endLine = fromJSON(W<Int>(), obj["endLine"]);
    tv->endColumn = fromJSON(W<Int>(), obj["endColumn"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Range> o(new ::Range());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<TypeInfo>>(std::shared_ptr<TypeInfo> &v) {
  json obj({});
  switch (v->tag) { 
    case ::TypeInfo::tag::TypeInfo:
      obj["tag"] = "TypeInfo";
      {
        std::shared_ptr<data::TypeInfo> tv = std::static_pointer_cast<data::TypeInfo>(v);
        obj["range"] = toJSON(tv->range);
        obj["text"] = toJSON(tv->text);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<TypeInfo> fromJSON<std::shared_ptr<TypeInfo>>(W<std::shared_ptr<TypeInfo>> v, json &obj) {
  enum ::TypeInfo::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "TypeInfo") {
    tagType = ::TypeInfo::tag::TypeInfo;
    std::shared_ptr<data::TypeInfo> tv(new data::TypeInfo());
    tv->range = fromJSON(W<std::shared_ptr<::Range>>(), obj["range"]);
    tv->text = fromJSON(W<String>(), obj["text"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::TypeInfo> o(new ::TypeInfo());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<WarningInfo>>(std::shared_ptr<WarningInfo> &v) {
  json obj({});
  switch (v->tag) { 
    case ::WarningInfo::tag::WarningInfo:
      obj["tag"] = "WarningInfo";
      {
        std::shared_ptr<data::WarningInfo> tv = std::static_pointer_cast<data::WarningInfo>(v);
        obj["wRange"] = toJSON(tv->wRange);
        obj["wText"] = toJSON(tv->wText);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<WarningInfo> fromJSON<std::shared_ptr<WarningInfo>>(W<std::shared_ptr<WarningInfo>> v, json &obj) {
  enum ::WarningInfo::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "WarningInfo") {
    tagType = ::WarningInfo::tag::WarningInfo;
    std::shared_ptr<data::WarningInfo> tv(new data::WarningInfo());
    tv->wRange = fromJSON(W<std::shared_ptr<::Range>>(), obj["wRange"]);
    tv->wText = fromJSON(W<String>(), obj["wText"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::WarningInfo> o(new ::WarningInfo());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<ErrorInfo>>(std::shared_ptr<ErrorInfo> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ErrorInfo::tag::ErrorInfo:
      obj["tag"] = "ErrorInfo";
      {
        std::shared_ptr<data::ErrorInfo> tv = std::static_pointer_cast<data::ErrorInfo>(v);
        obj["eRange"] = toJSON(tv->eRange);
        obj["eText"] = toJSON(tv->eText);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<ErrorInfo> fromJSON<std::shared_ptr<ErrorInfo>>(W<std::shared_ptr<ErrorInfo>> v, json &obj) {
  enum ::ErrorInfo::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "ErrorInfo") {
    tagType = ::ErrorInfo::tag::ErrorInfo;
    std::shared_ptr<data::ErrorInfo> tv(new data::ErrorInfo());
    tv->eRange = fromJSON(W<std::shared_ptr<::Range>>(), obj["eRange"]);
    tv->eText = fromJSON(W<String>(), obj["eText"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ErrorInfo> o(new ::ErrorInfo());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<CompileResult>>(std::shared_ptr<CompileResult> &v) {
  json obj({});
  switch (v->tag) { 
    case ::CompileResult::tag::CompileError:
      obj["tag"] = "CompileError";
      {
        std::shared_ptr<data::CompileError> tv = std::static_pointer_cast<data::CompileError>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
        obj["arg3"] = toJSON(tv->_3);
      }
      break;
    case ::CompileResult::tag::Compiled:
      obj["tag"] = "Compiled";
      {
        std::shared_ptr<data::Compiled> tv = std::static_pointer_cast<data::Compiled>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
        obj["arg2"] = toJSON(tv->_2);
        obj["arg3"] = toJSON(tv->_3);
        obj["arg4"] = toJSON(tv->_4);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<CompileResult> fromJSON<std::shared_ptr<CompileResult>>(W<std::shared_ptr<CompileResult>> v, json &obj) {
  enum ::CompileResult::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "CompileError") {
    tagType = ::CompileResult::tag::CompileError;
    std::shared_ptr<data::CompileError> tv(new data::CompileError());
    tv->_0 = fromJSON(W<String>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::vector<std::shared_ptr<::TypeInfo>>>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::vector<std::shared_ptr<::WarningInfo>>>(), obj["arg2"]);
    tv->_3 = fromJSON(W<std::vector<std::shared_ptr<::ErrorInfo>>>(), obj["arg3"]);
    return tv;
  }
  else if (tag == "Compiled") {
    tagType = ::CompileResult::tag::Compiled;
    std::shared_ptr<data::Compiled> tv(new data::Compiled());
    tv->_0 = fromJSON(W<String>(), obj["arg0"]);
    tv->_1 = fromJSON(W<String>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::shared_ptr<::Pipeline>>(), obj["arg2"]);
    tv->_3 = fromJSON(W<std::vector<std::shared_ptr<::TypeInfo>>>(), obj["arg3"]);
    tv->_4 = fromJSON(W<std::vector<std::shared_ptr<::WarningInfo>>>(), obj["arg4"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::CompileResult> o(new ::CompileResult());
  o->tag = tagType;
  return o;
}

