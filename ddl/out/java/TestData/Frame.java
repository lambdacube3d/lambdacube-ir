// generated file, do not modify!
// 2016-11-10T16:02:38.461930000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class Frame {
  public enum Tag { 
    Frame
  }
  public Tag tag;

  public class Frame_ extends Frame { 
    public Integer renderCount;
    public HashMap<String, Value> frameUniforms;
    public HashMap<String, Integer> frameTextures;
    public Frame_() { tag = Frame.Tag.Frame; }
  }
}

