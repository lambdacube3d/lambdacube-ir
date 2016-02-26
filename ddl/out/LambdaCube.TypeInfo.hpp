// generated file, do not modify!
// 2016-02-26T10:42:57.376331000000Z

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
class CompileResult {
  public:
    enum class tag { 
      CompileError,
      Compiled
    } tag;
};
namespace data { 
  class CompileError : public ::CompileResult {
    public:
      std::vector<std::shared_ptr<::TypeInfo>> _0;
      std::vector<std::shared_ptr<::TypeInfo>> _1;
      CompileError() { tag = tag::CompileError; }
  };
  class Compiled : public ::CompileResult {
    public:
      String _0;
      std::shared_ptr<::Pipeline> _1;
      std::vector<std::shared_ptr<::TypeInfo>> _2;
      Compiled() { tag = tag::Compiled; }
  };
}
#endif
