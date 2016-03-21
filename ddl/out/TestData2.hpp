// generated file, do not modify!
// 2016-03-21T15:32:18.087397000000Z

#ifndef HEADER_TestData_H
#define HEADER_TestData_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"
#include "LambdaCube.Mesh.hpp"
#include "LambdaCube.PipelineSchema.hpp"

namespace data { 
  class ClientInfo {
  public: 
    String clientName;
    std::shared_ptr<::Backend> clientBackend;
  };
}
class ClientInfo {
public:
  enum class tag { 
    ClientInfo
  } tag;
  std::shared_ptr<data::ClientInfo> ClientInfo;
};
namespace data { 
  class Frame {
  public: 
    Int renderCount;
    std::map<String, std::shared_ptr<::Value>> frameUniforms;
    std::map<String, Int> frameTextures;
  };
}
class Frame {
public:
  enum class tag { 
    Frame
  } tag;
  std::shared_ptr<data::Frame> Frame;
};
namespace data { 
  class Scene {
  public: 
    std::map<String, std::vector<Int>> objectArrays;
    Int renderTargetWidth;
    Int renderTargetHeight;
    std::vector<std::shared_ptr<::Frame>> frames;
  };
}
class Scene {
public:
  enum class tag { 
    Scene
  } tag;
  std::shared_ptr<data::Scene> Scene;
};
namespace data { 
  class PipelineInfo {
  public: 
    String pipelineName;
    std::shared_ptr<::Pipeline> pipeline;
  };
}
class PipelineInfo {
public:
  enum class tag { 
    PipelineInfo
  } tag;
  std::shared_ptr<data::PipelineInfo> PipelineInfo;
};
namespace data { 
  class RenderJob {
  public: 
    std::vector<std::shared_ptr<::Mesh>> meshes;
    std::vector<String> textures;
    std::shared_ptr<::PipelineSchema> schema;
    std::vector<std::shared_ptr<::Scene>> scenes;
    std::vector<std::shared_ptr<::PipelineInfo>> pipelines;
  };
}
class RenderJob {
public:
  enum class tag { 
    RenderJob
  } tag;
  std::shared_ptr<data::RenderJob> RenderJob;
};
namespace data { 
  class FrameResult {
  public: 
    std::vector<Float> frRenderTimes;
    Int frImageWidth;
    Int frImageHeight;
  };
}
class FrameResult {
public:
  enum class tag { 
    FrameResult
  } tag;
  std::shared_ptr<data::FrameResult> FrameResult;
};
namespace data { 
  class RenderJobResult {
  public: 
    std::shared_ptr<::FrameResult> _0;
  };
  class RenderJobError {
  public: 
    String _0;
  };
}
class RenderJobResult {
public:
  enum class tag { 
    RenderJobResult,
    RenderJobError
  } tag;
  std::shared_ptr<data::RenderJobResult> RenderJobResult;
  std::shared_ptr<data::RenderJobError> RenderJobError;
};
#endif
