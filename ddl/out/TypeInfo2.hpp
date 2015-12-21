// generated file, do not modify!
// 2015-12-21T12:00:19.854088000000Z

#ifndef HEADER_TypeInfo_H
#define HEADER_TypeInfo_H

#include "RT.hpp"

#include "IR.hpp"

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
    std::shared_ptr<::Pipeline> _0;
    std::vector<std::shared_ptr<::TypeInfo>> _1;
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
