// generated file, do not modify!
// 2016-11-10T16:02:37.496440000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class ImageRef {
  public enum Tag { 
    TextureImage,
    Framebuffer
  }
  public Tag tag;

  public class TextureImage_ extends ImageRef { 
    public Integer _0;
    public Integer _1;
    public Maybe<Integer> _2;
    public TextureImage_() { tag = ImageRef.Tag.TextureImage; }
  }
  public class Framebuffer_ extends ImageRef { 
    public ImageSemantic _0;
    public Framebuffer_() { tag = ImageRef.Tag.Framebuffer; }
  }
}

