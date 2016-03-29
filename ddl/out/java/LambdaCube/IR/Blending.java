// generated file, do not modify!
// 2016-03-29T11:30:12.412728000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Blending {
  public enum Tag { 
    NoBlending,
    BlendLogicOp,
    Blend
  }
  public Tag tag;

  public class BlendLogicOp_ extends Blending { 
    public LogicOperation _0;
    public BlendLogicOp_() { tag = Blending.Tag.BlendLogicOp; }
  }
  public class Blend_ extends Blending { 
    public BlendEquation colorEqSrc;
    public BlendEquation alphaEqSrc;
    public BlendingFactor colorFSrc;
    public BlendingFactor colorFDst;
    public BlendingFactor alphaFSrc;
    public BlendingFactor alphaFDst;
    public V4<Float> color;
    public Blend_() { tag = Blending.Tag.Blend; }
  }
}

