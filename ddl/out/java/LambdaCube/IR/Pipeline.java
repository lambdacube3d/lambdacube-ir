// generated file, do not modify!
// 2016-03-29T11:30:12.412728000000Z

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

