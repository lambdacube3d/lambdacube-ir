// generated file, do not modify!
// 2016-02-26T11:29:11.839781000000Z

#include "TestData.hpp"
template<> json toJSON<std::shared_ptr<ClientInfo>>(std::shared_ptr<ClientInfo> &v) {
  json obj({});
  switch (v->tag) { 
    case ::ClientInfo::tag::ClientInfo:
      obj["tag"] = "ClientInfo";
      {
        std::shared_ptr<data::ClientInfo> tv = std::static_pointer_cast<data::ClientInfo>(v);
        obj["clientName"] = toJSON(tv->clientName);
        obj["clientBackend"] = toJSON(tv->clientBackend);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<ClientInfo> fromJSON<std::shared_ptr<ClientInfo>>(W<std::shared_ptr<ClientInfo>> v, json &obj) {
  enum ::ClientInfo::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "ClientInfo") {
    tagType = ::ClientInfo::tag::ClientInfo;
    std::shared_ptr<data::ClientInfo> tv(new data::ClientInfo());
    tv->clientName = fromJSON(W<String>(), obj["clientName"]);
    tv->clientBackend = fromJSON(W<std::shared_ptr<::Backend>>(), obj["clientBackend"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::ClientInfo> o(new ::ClientInfo());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Frame>>(std::shared_ptr<Frame> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Frame::tag::Frame:
      obj["tag"] = "Frame";
      {
        std::shared_ptr<data::Frame> tv = std::static_pointer_cast<data::Frame>(v);
        obj["renderCount"] = toJSON(tv->renderCount);
        obj["frameUniforms"] = toJSON(tv->frameUniforms);
        obj["frameTextures"] = toJSON(tv->frameTextures);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Frame> fromJSON<std::shared_ptr<Frame>>(W<std::shared_ptr<Frame>> v, json &obj) {
  enum ::Frame::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Frame") {
    tagType = ::Frame::tag::Frame;
    std::shared_ptr<data::Frame> tv(new data::Frame());
    tv->renderCount = fromJSON(W<Int>(), obj["renderCount"]);
    tv->frameUniforms = fromJSON(W<std::map<String, std::shared_ptr<::Value>>>(), obj["frameUniforms"]);
    tv->frameTextures = fromJSON(W<std::map<String, Int>>(), obj["frameTextures"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Frame> o(new ::Frame());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<Scene>>(std::shared_ptr<Scene> &v) {
  json obj({});
  switch (v->tag) { 
    case ::Scene::tag::Scene:
      obj["tag"] = "Scene";
      {
        std::shared_ptr<data::Scene> tv = std::static_pointer_cast<data::Scene>(v);
        obj["objectArrays"] = toJSON(tv->objectArrays);
        obj["renderTargetWidth"] = toJSON(tv->renderTargetWidth);
        obj["renderTargetHeight"] = toJSON(tv->renderTargetHeight);
        obj["frames"] = toJSON(tv->frames);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<Scene> fromJSON<std::shared_ptr<Scene>>(W<std::shared_ptr<Scene>> v, json &obj) {
  enum ::Scene::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "Scene") {
    tagType = ::Scene::tag::Scene;
    std::shared_ptr<data::Scene> tv(new data::Scene());
    tv->objectArrays = fromJSON(W<std::map<String, std::vector<Int>>>(), obj["objectArrays"]);
    tv->renderTargetWidth = fromJSON(W<Int>(), obj["renderTargetWidth"]);
    tv->renderTargetHeight = fromJSON(W<Int>(), obj["renderTargetHeight"]);
    tv->frames = fromJSON(W<std::vector<std::shared_ptr<::Frame>>>(), obj["frames"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::Scene> o(new ::Scene());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<PipelineInfo>>(std::shared_ptr<PipelineInfo> &v) {
  json obj({});
  switch (v->tag) { 
    case ::PipelineInfo::tag::PipelineInfo:
      obj["tag"] = "PipelineInfo";
      {
        std::shared_ptr<data::PipelineInfo> tv = std::static_pointer_cast<data::PipelineInfo>(v);
        obj["pipelineName"] = toJSON(tv->pipelineName);
        obj["pipeline"] = toJSON(tv->pipeline);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<PipelineInfo> fromJSON<std::shared_ptr<PipelineInfo>>(W<std::shared_ptr<PipelineInfo>> v, json &obj) {
  enum ::PipelineInfo::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "PipelineInfo") {
    tagType = ::PipelineInfo::tag::PipelineInfo;
    std::shared_ptr<data::PipelineInfo> tv(new data::PipelineInfo());
    tv->pipelineName = fromJSON(W<String>(), obj["pipelineName"]);
    tv->pipeline = fromJSON(W<std::shared_ptr<::Pipeline>>(), obj["pipeline"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::PipelineInfo> o(new ::PipelineInfo());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<RenderJob>>(std::shared_ptr<RenderJob> &v) {
  json obj({});
  switch (v->tag) { 
    case ::RenderJob::tag::RenderJob:
      obj["tag"] = "RenderJob";
      {
        std::shared_ptr<data::RenderJob> tv = std::static_pointer_cast<data::RenderJob>(v);
        obj["meshes"] = toJSON(tv->meshes);
        obj["textures"] = toJSON(tv->textures);
        obj["schema"] = toJSON(tv->schema);
        obj["scenes"] = toJSON(tv->scenes);
        obj["pipelines"] = toJSON(tv->pipelines);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<RenderJob> fromJSON<std::shared_ptr<RenderJob>>(W<std::shared_ptr<RenderJob>> v, json &obj) {
  enum ::RenderJob::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "RenderJob") {
    tagType = ::RenderJob::tag::RenderJob;
    std::shared_ptr<data::RenderJob> tv(new data::RenderJob());
    tv->meshes = fromJSON(W<std::vector<std::shared_ptr<::Mesh>>>(), obj["meshes"]);
    tv->textures = fromJSON(W<std::vector<String>>(), obj["textures"]);
    tv->schema = fromJSON(W<std::shared_ptr<::PipelineSchema>>(), obj["schema"]);
    tv->scenes = fromJSON(W<std::vector<std::shared_ptr<::Scene>>>(), obj["scenes"]);
    tv->pipelines = fromJSON(W<std::vector<std::shared_ptr<::PipelineInfo>>>(), obj["pipelines"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::RenderJob> o(new ::RenderJob());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<FrameResult>>(std::shared_ptr<FrameResult> &v) {
  json obj({});
  switch (v->tag) { 
    case ::FrameResult::tag::FrameResult:
      obj["tag"] = "FrameResult";
      {
        std::shared_ptr<data::FrameResult> tv = std::static_pointer_cast<data::FrameResult>(v);
        obj["frRenderTimes"] = toJSON(tv->frRenderTimes);
        obj["frImageWidth"] = toJSON(tv->frImageWidth);
        obj["frImageHeight"] = toJSON(tv->frImageHeight);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<FrameResult> fromJSON<std::shared_ptr<FrameResult>>(W<std::shared_ptr<FrameResult>> v, json &obj) {
  enum ::FrameResult::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "FrameResult") {
    tagType = ::FrameResult::tag::FrameResult;
    std::shared_ptr<data::FrameResult> tv(new data::FrameResult());
    tv->frRenderTimes = fromJSON(W<std::vector<Float>>(), obj["frRenderTimes"]);
    tv->frImageWidth = fromJSON(W<Int>(), obj["frImageWidth"]);
    tv->frImageHeight = fromJSON(W<Int>(), obj["frImageHeight"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::FrameResult> o(new ::FrameResult());
  o->tag = tagType;
  return o;
}

template<> json toJSON<std::shared_ptr<RenderJobResult>>(std::shared_ptr<RenderJobResult> &v) {
  json obj({});
  switch (v->tag) { 
    case ::RenderJobResult::tag::RenderJobResult:
      obj["tag"] = "RenderJobResult";
      {
        std::shared_ptr<data::RenderJobResult> tv = std::static_pointer_cast<data::RenderJobResult>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
    case ::RenderJobResult::tag::RenderJobError:
      obj["tag"] = "RenderJobError";
      {
        std::shared_ptr<data::RenderJobError> tv = std::static_pointer_cast<data::RenderJobError>(v);
        obj["arg0"] = toJSON(tv->_0);
      }
      break;
  }
  return obj;
}

template<> std::shared_ptr<RenderJobResult> fromJSON<std::shared_ptr<RenderJobResult>>(W<std::shared_ptr<RenderJobResult>> v, json &obj) {
  enum ::RenderJobResult::tag tagType;
  std::string tag = obj["tag"];
  if (tag == "RenderJobResult") {
    tagType = ::RenderJobResult::tag::RenderJobResult;
    std::shared_ptr<data::RenderJobResult> tv(new data::RenderJobResult());
    tv->_0 = fromJSON(W<std::shared_ptr<::FrameResult>>(), obj["arg0"]);
    return tv;
  }
  else if (tag == "RenderJobError") {
    tagType = ::RenderJobResult::tag::RenderJobError;
    std::shared_ptr<data::RenderJobError> tv(new data::RenderJobError());
    tv->_0 = fromJSON(W<String>(), obj["arg0"]);
    return tv;
  }
  else throw "unknown constructor: " + tag;
  std::shared_ptr<::RenderJobResult> o(new ::RenderJobResult());
  o->tag = tagType;
  return o;
}

