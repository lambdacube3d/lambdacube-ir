// generated file, do not modify!
// 2016-03-21T15:32:17.924228000000Z

#ifndef HEADER_LambdaCube.TypeInfo_H
#define HEADER_LambdaCube.TypeInfo_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"

namespace data { 
  class Range {
  public: 
    Int startLine;
    Int startColumn;
    Int endLine;
    Int endColumn;
  };
}
class Range {
public:
  enum class tag { 
    Range
  } tag;
  std::shared_ptr<data::Range> Range;
};
namespace data { 
  class TypeInfo {
  public: 
    std::shared_ptr<::Range> range;
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
    std::vector<std::shared_ptr<::Range>> _0;
    String _1;
    std::vector<std::shared_ptr<::TypeInfo>> _2;
  };
  class Compiled {
  public: 
    String _0;
    String _1;
    std::shared_ptr<::Pipeline> _2;
    std::vector<std::shared_ptr<::TypeInfo>> _3;
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
