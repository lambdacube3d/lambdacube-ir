// generated file, do not modify!
// 2016-04-01T16:25:34.381854000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Pipeline {
  public enum Tag { 
    Pipeline
  }
  public Tag tag;

  public class Pipeline_ extends Pipeline { 
    public String info;
    public Backend backend;
    public ArrayList<TextureDescriptor> textures;
    public ArrayList<SamplerDescriptor> samplers;
    public ArrayList<RenderTarget> targets;
    public ArrayList<Program> programs;
    public ArrayList<Slot> slots;
    public ArrayList<StreamData> streams;
    public ArrayList<Command> commands;
    public Pipeline_() { tag = Pipeline.Tag.Pipeline; }
  }
}

