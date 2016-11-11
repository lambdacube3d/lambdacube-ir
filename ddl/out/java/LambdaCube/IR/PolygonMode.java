// generated file, do not modify!
// 2016-11-11T11:17:02.701527000000Z

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

