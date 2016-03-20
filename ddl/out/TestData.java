// generated file, do not modify!
// 2016-03-14T10:58:30.042864000000Z

import LambdaCube.IR;
import LambdaCube.Mesh;
import LambdaCube.PipelineSchema;

public class TestData {
  public class ClientInfo {
    public enum Tag { 
      ClientInfo
    }
    public Tag tag;

    public class ClientInfo extends ClientInfo { 
      public String clientName;
      public Backend clientBackend;
    }
  }

  public class Frame {
    public enum Tag { 
      Frame
    }
    public Tag tag;

    public class Frame extends Frame { 
      public Integer renderCount;
      public HashMap<String, Value> frameUniforms;
      public HashMap<String, Integer> frameTextures;
    }
  }

  public class Scene {
    public enum Tag { 
      Scene
    }
    public Tag tag;

    public class Scene extends Scene { 
      public HashMap<String, ArrayList<Integer>> objectArrays;
      public Integer renderTargetWidth;
      public Integer renderTargetHeight;
      public ArrayList<Frame> frames;
    }
  }

  public class PipelineInfo {
    public enum Tag { 
      PipelineInfo
    }
    public Tag tag;

    public class PipelineInfo extends PipelineInfo { 
      public String pipelineName;
      public Pipeline pipeline;
    }
  }

  public class RenderJob {
    public enum Tag { 
      RenderJob
    }
    public Tag tag;

    public class RenderJob extends RenderJob { 
      public ArrayList<Mesh> meshes;
      public ArrayList<String> textures;
      public PipelineSchema schema;
      public ArrayList<Scene> scenes;
      public ArrayList<PipelineInfo> pipelines;
    }
  }

  public class FrameResult {
    public enum Tag { 
      FrameResult
    }
    public Tag tag;

    public class FrameResult extends FrameResult { 
      public ArrayList<Float> frRenderTimes;
      public Integer frImageWidth;
      public Integer frImageHeight;
    }
  }

  public class RenderJobResult {
    public enum Tag { 
      RenderJobResult,
      RenderJobError
    }
    public Tag tag;

    public class RenderJobResult extends RenderJobResult { 
      public FrameResult _0;
    }
    public class RenderJobError extends RenderJobResult { 
      public String _0;
    }
  }

}