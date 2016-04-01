// generated file, do not modify!
// 2016-04-01T16:25:34.381854000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class MipMap {
  public enum Tag { 
    Mip,
    NoMip,
    AutoMip
  }
  public Tag tag;

  public class Mip_ extends MipMap { 
    public Integer _0;
    public Integer _1;
    public Mip_() { tag = MipMap.Tag.Mip; }
  }
  public class AutoMip_ extends MipMap { 
    public Integer _0;
    public Integer _1;
    public AutoMip_() { tag = MipMap.Tag.AutoMip; }
  }
}

