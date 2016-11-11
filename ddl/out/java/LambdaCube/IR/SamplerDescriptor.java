// generated file, do not modify!
// 2016-11-11T11:17:02.701527000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class SamplerDescriptor {
  public enum Tag { 
    SamplerDescriptor
  }
  public Tag tag;

  public class SamplerDescriptor_ extends SamplerDescriptor { 
    public EdgeMode samplerWrapS;
    public Maybe<EdgeMode> samplerWrapT;
    public Maybe<EdgeMode> samplerWrapR;
    public Filter samplerMinFilter;
    public Filter samplerMagFilter;
    public Value samplerBorderColor;
    public Maybe<Float> samplerMinLod;
    public Maybe<Float> samplerMaxLod;
    public Float samplerLodBias;
    public Maybe<ComparisonFunction> samplerCompareFunc;
    public SamplerDescriptor_() { tag = SamplerDescriptor.Tag.SamplerDescriptor; }
  }
}

