// generated file, do not modify!
// 2016-03-21T13:14:17.421561000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class TextureDescriptor {
  public enum Tag { 
    TextureDescriptor
  }
  public Tag tag;

  public class TextureDescriptor_ extends TextureDescriptor { 
    public TextureType textureType;
    public Value textureSize;
    public ImageSemantic textureSemantic;
    public SamplerDescriptor textureSampler;
    public Integer textureBaseLevel;
    public Integer textureMaxLevel;
    public TextureDescriptor_() { tag = TextureDescriptor.Tag.TextureDescriptor; }
  }
}

