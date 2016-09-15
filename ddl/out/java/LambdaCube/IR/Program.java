// generated file, do not modify!
// 2016-09-15T19:44:47.624123918Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Program {
  public enum Tag { 
    Program
  }
  public Tag tag;

  public class Program_ extends Program { 
    public HashMap<String, InputType> programUniforms;
    public HashMap<String, Parameter> programStreams;
    public HashMap<String, InputType> programInTextures;
    public ArrayList<Parameter> programOutput;
    public String vertexShader;
    public Maybe<String> geometryShader;
    public String fragmentShader;
    public Program_() { tag = Program.Tag.Program; }
  }
}

