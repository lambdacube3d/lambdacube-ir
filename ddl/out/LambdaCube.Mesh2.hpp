// generated file, do not modify!
// 2016-03-21T15:32:17.804995000000Z

#ifndef HEADER_LambdaCube.Mesh_H
#define HEADER_LambdaCube.Mesh_H

#include "RT.hpp"


namespace data { 
  class A_Float {
  public: 
    std::vector<Float> _0;
  };
  class A_V2F {
  public: 
    std::vector<V2F> _0;
  };
  class A_V3F {
  public: 
    std::vector<V3F> _0;
  };
  class A_V4F {
  public: 
    std::vector<V4F> _0;
  };
  class A_M22F {
  public: 
    std::vector<M22F> _0;
  };
  class A_M33F {
  public: 
    std::vector<M33F> _0;
  };
  class A_M44F {
  public: 
    std::vector<M44F> _0;
  };
  class A_Int {
  public: 
    std::vector<Int32> _0;
  };
  class A_Word {
  public: 
    std::vector<Word32> _0;
  };
}
class MeshAttribute {
public:
  enum class tag { 
    A_Float,
    A_V2F,
    A_V3F,
    A_V4F,
    A_M22F,
    A_M33F,
    A_M44F,
    A_Int,
    A_Word
  } tag;
  std::shared_ptr<data::A_Float> A_Float;
  std::shared_ptr<data::A_V2F> A_V2F;
  std::shared_ptr<data::A_V3F> A_V3F;
  std::shared_ptr<data::A_V4F> A_V4F;
  std::shared_ptr<data::A_M22F> A_M22F;
  std::shared_ptr<data::A_M33F> A_M33F;
  std::shared_ptr<data::A_M44F> A_M44F;
  std::shared_ptr<data::A_Int> A_Int;
  std::shared_ptr<data::A_Word> A_Word;
};
namespace data { 
  class P_TriangleStripI {
  public: 
    std::vector<Int32> _0;
  };
  class P_TrianglesI {
  public: 
    std::vector<Int32> _0;
  };
}
class MeshPrimitive {
public:
  enum class tag { 
    P_Points,
    P_TriangleStrip,
    P_Triangles,
    P_TriangleStripI,
    P_TrianglesI
  } tag;
  std::shared_ptr<data::P_TriangleStripI> P_TriangleStripI;
  std::shared_ptr<data::P_TrianglesI> P_TrianglesI;
};
namespace data { 
  class Mesh {
  public: 
    std::map<String, std::shared_ptr<::MeshAttribute>> mAttributes;
    std::shared_ptr<::MeshPrimitive> mPrimitive;
  };
}
class Mesh {
public:
  enum class tag { 
    Mesh
  } tag;
  std::shared_ptr<data::Mesh> Mesh;
};
#endif
