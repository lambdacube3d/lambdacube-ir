// generated file, do not modify!
// 2015-12-21T12:00:19.854088000000Z

#ifndef HEADER_TypeInfo_H
#define HEADER_TypeInfo_H

#include "RT.hpp"

#include "IR.hpp"

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
      std::shared_ptr<::Pipeline> _0;
      std::vector<std::shared_ptr<::TypeInfo>> _1;
      MyRight() { tag = tag::MyRight; }
  };
}
#endif
