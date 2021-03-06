// generated file, do not modify!
// 2016-11-11T11:17:03.685172000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class RenderJob {
  public enum Tag { 
    RenderJob
  }
  public Tag tag;

  public class RenderJob_ extends RenderJob { 
    public ArrayList<Mesh> meshes;
    public ArrayList<String> textures;
    public PipelineSchema schema;
    public ArrayList<Scene> scenes;
    public ArrayList<PipelineInfo> pipelines;
    public RenderJob_() { tag = RenderJob.Tag.RenderJob; }
  }
}

