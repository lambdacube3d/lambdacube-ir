// generated file, do not modify!
<<<<<<< d022971b99be214c71429d58f97f85b13e33a426
<<<<<<< 4d40c4ee5ed15544d2ac7fb1ea7b61e89766d277
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.761274000000Z
=======
// 2016-03-20T21:42:12.892571000000Z
>>>>>>> working c# backend
=======
// 2016-03-20T22:19:43.498688000000Z
>>>>>>> fix c#
=======
// 2016-03-21T11:36:01.075399000000Z
>>>>>>> work on java json loader
=======
// 2016-03-21T11:41:52.343859000000Z
>>>>>>> improve java json

#ifndef HEADER_LambdaCube.PipelineSchema_H
#define HEADER_LambdaCube.PipelineSchema_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"

namespace data { 
}
class StreamType {
public:
  enum class tag { 
    Attribute_Word,
    Attribute_V2U,
    Attribute_V3U,
    Attribute_V4U,
    Attribute_Int,
    Attribute_V2I,
    Attribute_V3I,
    Attribute_V4I,
    Attribute_Float,
    Attribute_V2F,
    Attribute_V3F,
    Attribute_V4F,
    Attribute_M22F,
    Attribute_M23F,
    Attribute_M24F,
    Attribute_M32F,
    Attribute_M33F,
    Attribute_M34F,
    Attribute_M42F,
    Attribute_M43F,
    Attribute_M44F
  } tag;
};
namespace data { 
  class ObjectArraySchema {
  public: 
    std::shared_ptr<::FetchPrimitive> primitive;
    std::map<String, std::shared_ptr<::StreamType>> attributes;
  };
}
class ObjectArraySchema {
public:
  enum class tag { 
    ObjectArraySchema
  } tag;
  std::shared_ptr<data::ObjectArraySchema> ObjectArraySchema;
};
namespace data { 
  class PipelineSchema {
  public: 
    std::map<String, std::shared_ptr<::ObjectArraySchema>> objectArrays;
    std::map<String, std::shared_ptr<::InputType>> uniforms;
  };
}
class PipelineSchema {
public:
  enum class tag { 
    PipelineSchema
  } tag;
  std::shared_ptr<data::PipelineSchema> PipelineSchema;
};
#endif
