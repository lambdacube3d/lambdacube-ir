// generated file, do not modify!
// 2016-03-21T14:06:54.700322000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class PolygonOffset {
  public enum Tag { 
    NoOffset,
    Offset
  }
  public Tag tag;

  public class Offset_ extends PolygonOffset { 
    public Float _0;
    public Float _1;
    public Offset_() { tag = PolygonOffset.Tag.Offset; }
  }
}

