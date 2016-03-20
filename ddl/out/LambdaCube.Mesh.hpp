// generated file, do not modify!
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.781208000000Z
=======
// 2016-03-20T21:42:12.936741000000Z
>>>>>>> working c# backend
=======
// 2016-03-20T22:19:43.568791000000Z
>>>>>>> fix c#

#ifndef HEADER_LambdaCube.Mesh_H
#define HEADER_LambdaCube.Mesh_H

#include "RT.hpp"


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
};
namespace data { 
  class A_Float : public ::MeshAttribute {
    public:
      std::vector<Float> _0;
      A_Float() { tag = tag::A_Float; }
  };
  class A_V2F : public ::MeshAttribute {
    public:
      std::vector<V2F> _0;
      A_V2F() { tag = tag::A_V2F; }
  };
  class A_V3F : public ::MeshAttribute {
    public:
      std::vector<V3F> _0;
      A_V3F() { tag = tag::A_V3F; }
  };
  class A_V4F : public ::MeshAttribute {
    public:
      std::vector<V4F> _0;
      A_V4F() { tag = tag::A_V4F; }
  };
  class A_M22F : public ::MeshAttribute {
    public:
      std::vector<M22F> _0;
      A_M22F() { tag = tag::A_M22F; }
  };
  class A_M33F : public ::MeshAttribute {
    public:
      std::vector<M33F> _0;
      A_M33F() { tag = tag::A_M33F; }
  };
  class A_M44F : public ::MeshAttribute {
    public:
      std::vector<M44F> _0;
      A_M44F() { tag = tag::A_M44F; }
  };
  class A_Int : public ::MeshAttribute {
    public:
      std::vector<Int32> _0;
      A_Int() { tag = tag::A_Int; }
  };
  class A_Word : public ::MeshAttribute {
    public:
      std::vector<Word32> _0;
      A_Word() { tag = tag::A_Word; }
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
};
namespace data { 
  class P_TriangleStripI : public ::MeshPrimitive {
    public:
      std::vector<Int32> _0;
      P_TriangleStripI() { tag = tag::P_TriangleStripI; }
  };
  class P_TrianglesI : public ::MeshPrimitive {
    public:
      std::vector<Int32> _0;
      P_TrianglesI() { tag = tag::P_TrianglesI; }
  };
}
class Mesh {
  public:
    enum class tag { 
      Mesh
    } tag;
};
namespace data { 
  class Mesh : public ::Mesh {
    public:
      std::map<String, std::shared_ptr<::MeshAttribute>> mAttributes;
      std::shared_ptr<::MeshPrimitive> mPrimitive;
      Mesh() { tag = tag::Mesh; }
  };
}
#endif
