// generated file, do not modify!
// 2016-11-10T15:07:11.972496000000Z

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
  class WarningInfo {
  public: 
    std::shared_ptr<::Range> wRange;
    String wText;
  };
}
class WarningInfo {
public:
  enum class tag { 
    WarningInfo
  } tag;
  std::shared_ptr<data::WarningInfo> WarningInfo;
};
namespace data { 
  class ErrorInfo {
  public: 
    std::shared_ptr<::Range> eRange;
    String eText;
  };
}
class ErrorInfo {
public:
  enum class tag { 
    ErrorInfo
  } tag;
  std::shared_ptr<data::ErrorInfo> ErrorInfo;
};
namespace data { 
  class CompileError {
  public: 
    std::vector<std::shared_ptr<::TypeInfo>> _0;
    std::vector<std::shared_ptr<::WarningInfo>> _1;
    std::vector<std::shared_ptr<::ErrorInfo>> _2;
  };
  class Compiled {
  public: 
    String _0;
    String _1;
    std::shared_ptr<::Pipeline> _2;
    std::vector<std::shared_ptr<::TypeInfo>> _3;
    std::vector<std::shared_ptr<::WarningInfo>> _4;
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
