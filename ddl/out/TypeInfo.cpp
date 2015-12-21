// generated file, do not modify!
// 2015-12-21T12:00:19.854088000000Z

#include "TypeInfo.hpp"
template<> json toJSON<std::shared_ptr<TypeInfo>>(std::shared_ptr<TypeInfo> &v) {
  json obj({});
  switch (v->tag) { 
    case ::TypeInfo::tag::TypeInfo:
      obj["tag"] = "TypeInfo";
      {
        std::shared_ptr<data::TypeInfo> tv = std::static_pointer_cast<data::TypeInfo>(v);
        obj["startLine"] = toJSON(tv->startLine);
        obj["startColumn"] = toJSON(tv->startColumn);
        obj["endLine"] = toJSON(tv->endLine);
        obj["endColumn"] = toJSON(tv->endColumn);
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
    tv->startLine = fromJSON(W<Int>(), obj["startLine"]);
    tv->startColumn = fromJSON(W<Int>(), obj["startColumn"]);
    tv->endLine = fromJSON(W<Int>(), obj["endLine"]);
    tv->endColumn = fromJSON(W<Int>(), obj["endColumn"]);
    tv->text = fromJSON(W<String>(), obj["text"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::TypeInfo> o(new ::TypeInfo());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<MyEither>>(std::shared_ptr<MyEither> &v) {
  json obj({});
  switch (v->tag) { 
    case ::MyEither::tag::MyLeft:
      obj["tag"] = "MyLeft";
      {
        std::shared_ptr<data::MyLeft> tv = std::static_pointer_cast<data::MyLeft>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
    case ::MyEither::tag::MyRight:
      obj["tag"] = "MyRight";
      {
        std::shared_ptr<data::MyRight> tv = std::static_pointer_cast<data::MyRight>(v);
        obj["arg0"] = toJSON(tv->_0);
        obj["arg1"] = toJSON(tv->_1);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<MyEither> fromJSON<std::shared_ptr<MyEither>>(W<std::shared_ptr<MyEither>> v, json &obj) {
  enum ::MyEither::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "MyLeft") {
    tagType = ::MyEither::tag::MyLeft;
    std::shared_ptr<data::MyLeft> tv(new data::MyLeft());
    tv->_0 = fromJSON(W<std::shared_ptr<::TypeInfo>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::vector<std::shared_ptr<::TypeInfo>>>(), obj["arg1"]);
    return tv;
  }
  else if (tag == "MyRight") {
    tagType = ::MyEither::tag::MyRight;
    std::shared_ptr<data::MyRight> tv(new data::MyRight());
    tv->_0 = fromJSON(W<std::shared_ptr<::Pipeline>>(), obj["arg0"]);
    tv->_1 = fromJSON(W<std::vector<std::shared_ptr<::TypeInfo>>>(), obj["arg1"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::MyEither> o(new ::MyEither());
  o->tag = tagType;
  return o;
}

