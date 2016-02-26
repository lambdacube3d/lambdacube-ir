// generated file, do not modify!
// 2016-02-26T10:42:57.376331000000Z

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
  class CompileError {
  public: 
    std::vector<std::shared_ptr<::TypeInfo>> _0;
    std::vector<std::shared_ptr<::TypeInfo>> _1;
  };
  class Compiled {
  public: 
    String _0;
    std::shared_ptr<::Pipeline> _1;
    std::vector<std::shared_ptr<::TypeInfo>> _2;
  };
}
class CompileResult {
public:
  enum class tag { 
    CompileError,
    Compiled
  } tag;
  std::shared_ptr<data::CompileError> CompileError;
  std::shared_ptr<data::Compiled> Compiled;
};
#endif
