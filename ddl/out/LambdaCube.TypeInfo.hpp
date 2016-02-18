// generated file, do not modify!
// 2016-02-12T16:05:13.364534000000Z

#ifndef HEADER_LambdaCube.TypeInfo_H
#define HEADER_LambdaCube.TypeInfo_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"

class TypeInfo {
  public:
    enum class tag { 
      TypeInfo
    } tag;
};
namespace data { 
  class TypeInfo : public ::TypeInfo {
    public:
      Int startLine;
      Int startColumn;
      Int endLine;
      Int endColumn;
      String text;
      TypeInfo() { tag = tag::TypeInfo; }
  };
}
class MyEither {
  public:
    enum class tag { 
      MyLeft,
      MyRight
    } tag;
};
namespace data { 
  class MyLeft : public ::MyEither {
    public:
      std::shared_ptr<::TypeInfo> _0;
      std::vector<std::shared_ptr<::TypeInfo>> _1;
      MyLeft() { tag = tag::MyLeft; }
  };
  class MyRight : public ::MyEither {
    public:
      String _0;
      std::shared_ptr<::Pipeline> _1;
      std::vector<std::shared_ptr<::TypeInfo>> _2;
      MyRight() { tag = tag::MyRight; }
  };
}
#endif
