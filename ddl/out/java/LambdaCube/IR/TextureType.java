// generated file, do not modify!
// 2016-03-21T13:31:09.634879000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class TextureType {
  public enum Tag { 
    Texture1D,
    Texture2D,
    Texture3D,
    TextureCube,
    TextureRect,
    Texture2DMS,
    TextureBuffer
  }
  public Tag tag;

  public class Texture1D_ extends TextureType { 
    public TextureDataType _0;
    public Integer _1;
    public Texture1D_() { tag = TextureType.Tag.Texture1D; }
  }
  public class Texture2D_ extends TextureType { 
    public TextureDataType _0;
    public Integer _1;
    public Texture2D_() { tag = TextureType.Tag.Texture2D; }
  }
  public class Texture3D_ extends TextureType { 
    public TextureDataType _0;
    public Texture3D_() { tag = TextureType.Tag.Texture3D; }
  }
  public class TextureCube_ extends TextureType { 
    public TextureDataType _0;
    public TextureCube_() { tag = TextureType.Tag.TextureCube; }
  }
  public class TextureRect_ extends TextureType { 
    public TextureDataType _0;
    public TextureRect_() { tag = TextureType.Tag.TextureRect; }
  }
  public class Texture2DMS_ extends TextureType { 
    public TextureDataType _0;
    public Integer _1;
    public Integer _2;
    public Boolean _3;
    public Texture2DMS_() { tag = TextureType.Tag.Texture2DMS; }
  }
  public class TextureBuffer_ extends TextureType { 
    public TextureDataType _0;
    public TextureBuffer_() { tag = TextureType.Tag.TextureBuffer; }
  }
}

