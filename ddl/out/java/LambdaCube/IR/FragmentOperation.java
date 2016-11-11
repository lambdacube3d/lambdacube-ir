// generated file, do not modify!
// 2016-11-11T11:17:02.701527000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class FragmentOperation {
  public enum Tag { 
    DepthOp,
    StencilOp,
    ColorOp
  }
  public Tag tag;

  public class DepthOp_ extends FragmentOperation { 
    public ComparisonFunction _0;
    public Boolean _1;
    public DepthOp_() { tag = FragmentOperation.Tag.DepthOp; }
  }
  public class StencilOp_ extends FragmentOperation { 
    public StencilTests _0;
    public StencilOps _1;
    public StencilOps _2;
    public StencilOp_() { tag = FragmentOperation.Tag.StencilOp; }
  }
  public class ColorOp_ extends FragmentOperation { 
    public Blending _0;
    public Value _1;
    public ColorOp_() { tag = FragmentOperation.Tag.ColorOp; }
  }
}

