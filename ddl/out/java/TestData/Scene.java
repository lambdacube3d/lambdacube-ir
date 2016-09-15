// generated file, do not modify!
// 2016-09-15T19:44:48.147167874Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class Scene {
  public enum Tag { 
    Scene
  }
  public Tag tag;

  public class Scene_ extends Scene { 
    public HashMap<String, ArrayList<Integer>> objectArrays;
    public Integer renderTargetWidth;
    public Integer renderTargetHeight;
    public ArrayList<Frame> frames;
    public Scene_() { tag = Scene.Tag.Scene; }
  }
}

