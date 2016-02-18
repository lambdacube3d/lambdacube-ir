// generated file, do not modify!
// 2016-02-12T16:05:13.364534000000Z

#ifndef HEADER_LambdaCube.TypeInfo_H
#define HEADER_LambdaCube.TypeInfo_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"

namespace data { 
  class TypeInfo {
  public: 
    Int startLine;
    Int startColumn;
    Int endLine;
    Int endColumn;
    String text;
  };
}
class TypeInfo {
public:
  enum class tag { 
    TypeInfo
  } tag;
  std::shared_ptr<data::TypeInfo> TypeInfo;
};
namespace data { 
  class MyLeft {
  public: 
    std::shared_ptr<::TypeInfo> _0;
    std::vector<std::shared_ptr<::TypeInfo>> _1;
  };
  class MyRight {
  public: 
    String _0;
    std::shared_ptr<::Pipeline> _1;
    std::vector<std::shared_ptr<::TypeInfo>> _2;
  };
}
class MyEither {
public:
  enum class tag { 
    MyLeft,
    MyRight
  } tag;
  std::shared_ptr<data::MyLeft> MyLeft;
  std::shared_ptr<data::MyRight> MyRight;
};
#endif
