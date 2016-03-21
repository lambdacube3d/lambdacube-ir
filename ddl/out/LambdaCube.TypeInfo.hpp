// generated file, do not modify!
<<<<<<< 4d40c4ee5ed15544d2ac7fb1ea7b61e89766d277
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.810157000000Z
=======
// 2016-03-20T21:42:12.996366000000Z
>>>>>>> working c# backend
=======
// 2016-03-20T22:19:43.646837000000Z
>>>>>>> fix c#
=======
// 2016-03-21T11:36:01.199696000000Z
>>>>>>> work on java json loader

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
      std::vector<std::shared_ptr<::Range>> _0;
      String _1;
      std::vector<std::shared_ptr<::TypeInfo>> _2;
      CompileError() { tag = tag::CompileError; }
  };
  class Compiled : public ::CompileResult {
    public:
      String _0;
      String _1;
      std::shared_ptr<::Pipeline> _2;
      std::vector<std::shared_ptr<::TypeInfo>> _3;
      Compiled() { tag = tag::Compiled; }
  };
}
#endif
