// generated file, do not modify!
// 2016-11-10T16:02:37.496440000000Z

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

