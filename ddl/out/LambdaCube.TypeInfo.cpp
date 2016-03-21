// generated file, do not modify!
<<<<<<< d022971b99be214c71429d58f97f85b13e33a426
<<<<<<< 4d40c4ee5ed15544d2ac7fb1ea7b61e89766d277
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.810157000000Z
=======
// 2016-03-20T21:42:12.996366000000Z
>>>>>>> working c# backend
=======
// 2016-03-20T22:19:43.646837000000Z
>>>>>>> fix c#
=======
// 2016-03-21T11:36:01.199696000000Z
>>>>>>> work on java json loader
=======
// 2016-03-21T11:41:52.460562000000Z
>>>>>>> improve java json

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
    tv->_0 = fromJSON(W<std::vector<std::shared_ptr<::Range>>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<String>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::vector<std::shared_ptr<::TypeInfo>>>(), obj["arg2"]);
    return tv;
  }
  else if (tag == "Compiled") {
    tagType = ::CompileResult::tag::Compiled;
    std::shared_ptr<data::Compiled> tv(new data::Compiled());
    tv->_0 = fromJSON(W<String>(), obj["arg0"]);
    tv->_1 = fromJSON(W<String>(), obj["arg1"]);
    tv->_2 = fromJSON(W<std::shared_ptr<::Pipeline>>(), obj["arg2"]);
    tv->_3 = fromJSON(W<std::vector<std::shared_ptr<::TypeInfo>>>(), obj["arg3"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::CompileResult> o(new ::CompileResult());
  o->tag = tagType;
  return o;
}

