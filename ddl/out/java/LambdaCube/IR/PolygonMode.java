// generated file, do not modify!
// 2016-09-15T19:44:47.624123918Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class PolygonMode {
  public enum Tag { 
    PolygonPoint,
    PolygonLine,
    PolygonFill
  }
  public Tag tag;

  public class PolygonPoint_ extends PolygonMode { 
    public PointSize _0;
    public PolygonPoint_() { tag = PolygonMode.Tag.PolygonPoint; }
  }
  public class PolygonLine_ extends PolygonMode { 
    public Float _0;
    public PolygonLine_() { tag = PolygonMode.Tag.PolygonLine; }
  }
}

