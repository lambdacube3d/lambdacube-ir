// generated file, do not modify!
// 2016-03-21T11:41:51.714241000000Z

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

