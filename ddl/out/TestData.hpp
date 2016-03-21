// generated file, do not modify!
// 2016-03-21T13:31:10.455557000000Z

#ifndef HEADER_TestData_H
#define HEADER_TestData_H

#include "RT.hpp"

#include "LambdaCube.IR.hpp"
#include "LambdaCube.Mesh.hpp"
#include "LambdaCube.PipelineSchema.hpp"

class ClientInfo {
  public:
    enum class tag { 
      ClientInfo
    } tag;
};
namespace data { 
  class ClientInfo : public ::ClientInfo {
    public:
      String clientName;
      std::shared_ptr<::Backend> clientBackend;
      ClientInfo() { tag = tag::ClientInfo; }
  };
}
class Frame {
  public:
    enum class tag { 
      Frame
    } tag;
};
namespace data { 
  class Frame : public ::Frame {
    public:
      Int renderCount;
      std::map<String, std::shared_ptr<::Value>> frameUniforms;
      std::map<String, Int> frameTextures;
      Frame() { tag = tag::Frame; }
  };
}
class Scene {
  public:
    enum class tag { 
      Scene
    } tag;
};
namespace data { 
  class Scene : public ::Scene {
    public:
      std::map<String, std::vector<Int>> objectArrays;
      Int renderTargetWidth;
      Int renderTargetHeight;
      std::vector<std::shared_ptr<::Frame>> frames;
      Scene() { tag = tag::Scene; }
  };
}
class PipelineInfo {
  public:
    enum class tag { 
      PipelineInfo
    } tag;
};
namespace data { 
  class PipelineInfo : public ::PipelineInfo {
    public:
      String pipelineName;
      std::shared_ptr<::Pipeline> pipeline;
      PipelineInfo() { tag = tag::PipelineInfo; }
  };
}
class RenderJob {
  public:
    enum class tag { 
      RenderJob
    } tag;
};
namespace data { 
  class RenderJob : public ::RenderJob {
    public:
      std::vector<std::shared_ptr<::Mesh>> meshes;
      std::vector<String> textures;
      std::shared_ptr<::PipelineSchema> schema;
      std::vector<std::shared_ptr<::Scene>> scenes;
      std::vector<std::shared_ptr<::PipelineInfo>> pipelines;
      RenderJob() { tag = tag::RenderJob; }
  };
}
class FrameResult {
  public:
    enum class tag { 
      FrameResult
    } tag;
};
namespace data { 
  class FrameResult : public ::FrameResult {
    public:
      std::vector<Float> frRenderTimes;
      Int frImageWidth;
      Int frImageHeight;
      FrameResult() { tag = tag::FrameResult; }
  };
}
class RenderJobResult {
  public:
    enum class tag { 
      RenderJobResult,
      RenderJobError
    } tag;
};
namespace data { 
  class RenderJobResult : public ::RenderJobResult {
    public:
      std::shared_ptr<::FrameResult> _0;
      RenderJobResult() { tag = tag::RenderJobResult; }
  };
  class RenderJobError : public ::RenderJobResult {
    public:
      String _0;
      RenderJobError() { tag = tag::RenderJobError; }
  };
}
#endif
