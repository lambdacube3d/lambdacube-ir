// generated file, do not modify!
<<<<<<< d022971b99be214c71429d58f97f85b13e33a426
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
=======
// 2016-03-21T11:41:52.460562000000Z
>>>>>>> improve java json

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
