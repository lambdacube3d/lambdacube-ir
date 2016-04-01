// generated file, do not modify!
// 2016-04-01T16:25:34.381854000000Z

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

