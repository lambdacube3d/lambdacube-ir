// generated file, do not modify!
// 2016-11-10T15:07:11.866163000000Z

#include "LambdaCube.Mesh.hpp"
template<> json toJSON<std::shared_ptr<MeshAttribute>>(std::shared_ptr<MeshAttribute> &v) {
  json obj({});
  switch (v->tag) { 
    case ::MeshAttribute::tag::A_Float:
      obj["tag"] = "A_Float";
      {
        std::shared_ptr<data::A_Float> tv = std::static_pointer_cast<data::A_Float>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_V2F:
      obj["tag"] = "A_V2F";
      {
        std::shared_ptr<data::A_V2F> tv = std::static_pointer_cast<data::A_V2F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_V3F:
      obj["tag"] = "A_V3F";
      {
        std::shared_ptr<data::A_V3F> tv = std::static_pointer_cast<data::A_V3F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_V4F:
      obj["tag"] = "A_V4F";
      {
        std::shared_ptr<data::A_V4F> tv = std::static_pointer_cast<data::A_V4F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_M22F:
      obj["tag"] = "A_M22F";
      {
        std::shared_ptr<data::A_M22F> tv = std::static_pointer_cast<data::A_M22F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_M33F:
      obj["tag"] = "A_M33F";
      {
        std::shared_ptr<data::A_M33F> tv = std::static_pointer_cast<data::A_M33F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_M44F:
      obj["tag"] = "A_M44F";
      {
        std::shared_ptr<data::A_M44F> tv = std::static_pointer_cast<data::A_M44F>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_Int:
      obj["tag"] = "A_Int";
      {
        std::shared_ptr<data::A_Int> tv = std::static_pointer_cast<data::A_Int>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshAttribute::tag::A_Word:
      obj["tag"] = "A_Word";
      {
        std::shared_ptr<data::A_Word> tv = std::static_pointer_cast<data::A_Word>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<MeshAttribute> fromJSON<std::shared_ptr<MeshAttribute>>(W<std::shared_ptr<MeshAttribute>> v, json &obj) {
  enum ::MeshAttribute::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "A_Float") {
    tagType = ::MeshAttribute::tag::A_Float;
    std::shared_ptr<data::A_Float> tv(new data::A_Float());
    tv->_0 = fromJSON(W<std::vector<Float>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_V2F") {
    tagType = ::MeshAttribute::tag::A_V2F;
    std::shared_ptr<data::A_V2F> tv(new data::A_V2F());
    tv->_0 = fromJSON(W<std::vector<V2F>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_V3F") {
    tagType = ::MeshAttribute::tag::A_V3F;
    std::shared_ptr<data::A_V3F> tv(new data::A_V3F());
    tv->_0 = fromJSON(W<std::vector<V3F>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_V4F") {
    tagType = ::MeshAttribute::tag::A_V4F;
    std::shared_ptr<data::A_V4F> tv(new data::A_V4F());
    tv->_0 = fromJSON(W<std::vector<V4F>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_M22F") {
    tagType = ::MeshAttribute::tag::A_M22F;
    std::shared_ptr<data::A_M22F> tv(new data::A_M22F());
    tv->_0 = fromJSON(W<std::vector<M22F>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_M33F") {
    tagType = ::MeshAttribute::tag::A_M33F;
    std::shared_ptr<data::A_M33F> tv(new data::A_M33F());
    tv->_0 = fromJSON(W<std::vector<M33F>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_M44F") {
    tagType = ::MeshAttribute::tag::A_M44F;
    std::shared_ptr<data::A_M44F> tv(new data::A_M44F());
    tv->_0 = fromJSON(W<std::vector<M44F>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_Int") {
    tagType = ::MeshAttribute::tag::A_Int;
    std::shared_ptr<data::A_Int> tv(new data::A_Int());
    tv->_0 = fromJSON(W<std::vector<Int32>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "A_Word") {
    tagType = ::MeshAttribute::tag::A_Word;
    std::shared_ptr<data::A_Word> tv(new data::A_Word());
    tv->_0 = fromJSON(W<std::vector<Word32>>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::MeshAttribute> o(new ::MeshAttribute());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<MeshPrimitive>>(std::shared_ptr<MeshPrimitive> &v) {
  json obj({});
  switch (v->tag) { 
    case ::MeshPrimitive::tag::P_Points:
      obj["tag"] = "P_Points";
      break;
    case ::MeshPrimitive::tag::P_TriangleStrip:
      obj["tag"] = "P_TriangleStrip";
      break;
    case ::MeshPrimitive::tag::P_Triangles:
      obj["tag"] = "P_Triangles";
      break;
    case ::MeshPrimitive::tag::P_TriangleStripI:
      obj["tag"] = "P_TriangleStripI";
      {
        std::shared_ptr<data::P_TriangleStripI> tv = std::static_pointer_cast<data::P_TriangleStripI>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::MeshPrimitive::tag::P_TrianglesI:
      obj["tag"] = "P_TrianglesI";
      {
        std::shared_ptr<data::P_TrianglesI> tv = std::static_pointer_cast<data::P_TrianglesI>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<MeshPrimitive> fromJSON<std::shared_ptr<MeshPrimitive>>(W<std::shared_ptr<MeshPrimitive>> v, json &obj) {
  enum ::MeshPrimitive::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "P_Points") {
    tagType = ::MeshPrimitive::tag::P_Points;
  }
  else if (tag == "P_TriangleStrip") {
    tagType = ::MeshPrimitive::tag::P_TriangleStrip;
  }
  else if (tag == "P_Triangles") {
    tagType = ::MeshPrimitive::tag::P_Triangles;
  }
  else if (tag == "P_TriangleStripI") {
    tagType = ::MeshPrimitive::tag::P_TriangleStripI;
    std::shared_ptr<data::P_TriangleStripI> tv(new data::P_TriangleStripI());
    tv->_0 = fromJSON(W<std::vector<Int32>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "P_TrianglesI") {
    tagType = ::MeshPrimitive::tag::P_TrianglesI;
    std::shared_ptr<data::P_TrianglesI> tv(new data::P_TrianglesI());
    tv->_0 = fromJSON(W<std::vector<Int32>>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::MeshPrimitive> o(new ::MeshPrimitive());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Mesh>>(std::shared_ptr<Mesh> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Mesh::tag::Mesh:
      obj["tag"] = "Mesh";
      {
        std::shared_ptr<data::Mesh> tv = std::static_pointer_cast<data::Mesh>(v);
        obj["mAttributes"] = toJSON(tv->mAttributes);
        obj["mPrimitive"] = toJSON(tv->mPrimitive);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Mesh> fromJSON<std::shared_ptr<Mesh>>(W<std::shared_ptr<Mesh>> v, json &obj) {
  enum ::Mesh::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Mesh") {
    tagType = ::Mesh::tag::Mesh;
    std::shared_ptr<data::Mesh> tv(new data::Mesh());
    tv->mAttributes = fromJSON(W<std::map<String, std::shared_ptr<::MeshAttribute>>>(), obj["mAttributes"]);
    tv->mPrimitive = fromJSON(W<std::shared_ptr<::MeshPrimitive>>(), obj["mPrimitive"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Mesh> o(new ::Mesh());
  o->tag = tagType;
  return o;
}

