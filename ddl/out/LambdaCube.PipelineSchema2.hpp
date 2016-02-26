// generated file, do not modify!
// 2016-02-26T10:42:57.323154000000Z

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
