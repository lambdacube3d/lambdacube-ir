// generated file, do not modify!
// 2016-11-10T16:02:37.496440000000Z

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

