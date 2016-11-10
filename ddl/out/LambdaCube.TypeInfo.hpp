// generated file, do not modify!
// 2016-11-10T15:07:11.972496000000Z

#ifndef HEADER_LambdaCube.TypeInfo_H
#define HEADER_LambdaCube.TypeInfo_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"

class Range {
  public:
    enum class tag { 
      Range
    } tag;
};
namespace data { 
  class Range : public ::Range {
    public:
      Int startLine;
      Int startColumn;
      Int endLine;
      Int endColumn;
      Range() { tag = tag::Range; }
  };
}
class TypeInfo {
  public:
    enum class tag { 
      TypeInfo
    } tag;
};
namespace data { 
  class TypeInfo : public ::TypeInfo {
    public:
      std::shared_ptr<::Range> range;
      String text;
      TypeInfo() { tag = tag::TypeInfo; }
  };
}
class WarningInfo {
  public:
    enum class tag { 
      WarningInfo
    } tag;
};
namespace data { 
  class WarningInfo : public ::WarningInfo {
    public:
      std::shared_ptr<::Range> wRange;
      String wText;
      WarningInfo() { tag = tag::WarningInfo; }
  };
}
class ErrorInfo {
  public:
    enum class tag { 
      ErrorInfo
    } tag;
};
namespace data { 
  class ErrorInfo : public ::ErrorInfo {
    public:
      std::shared_ptr<::Range> eRange;
      String eText;
      ErrorInfo() { tag = tag::ErrorInfo; }
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
      std::vector<std::shared_ptr<::WarningInfo>> _1;
      std::vector<std::shared_ptr<::ErrorInfo>> _2;
      CompileError() { tag = tag::CompileError; }
  };
  class Compiled : public ::CompileResult {
    public:
      String _0;
      String _1;
      std::shared_ptr<::Pipeline> _2;
      std::vector<std::shared_ptr<::TypeInfo>> _3;
      std::vector<std::shared_ptr<::WarningInfo>> _4;
      Compiled() { tag = tag::Compiled; }
  };
}
#endif
