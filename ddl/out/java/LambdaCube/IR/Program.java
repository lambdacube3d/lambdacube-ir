// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

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

