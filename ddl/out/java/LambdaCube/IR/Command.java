// generated file, do not modify!
// 2016-03-21T11:41:51.714241000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Command {
  public enum Tag { 
    SetRasterContext,
    SetAccumulationContext,
    SetRenderTarget,
    SetProgram,
    SetSamplerUniform,
    SetTexture,
    SetSampler,
    RenderSlot,
    RenderStream,
    ClearRenderTarget,
    GenerateMipMap,
    SaveImage,
    LoadImage
  }
  public Tag tag;

  public class SetRasterContext_ extends Command { 
    public RasterContext _0;
    public SetRasterContext_() { tag = Command.Tag.SetRasterContext; }
  }
  public class SetAccumulationContext_ extends Command { 
    public AccumulationContext _0;
    public SetAccumulationContext_() { tag = Command.Tag.SetAccumulationContext; }
  }
  public class SetRenderTarget_ extends Command { 
    public Integer _0;
    public SetRenderTarget_() { tag = Command.Tag.SetRenderTarget; }
  }
  public class SetProgram_ extends Command { 
    public Integer _0;
    public SetProgram_() { tag = Command.Tag.SetProgram; }
  }
  public class SetSamplerUniform_ extends Command { 
    public String _0;
    public Integer _1;
    public SetSamplerUniform_() { tag = Command.Tag.SetSamplerUniform; }
  }
  public class SetTexture_ extends Command { 
    public Integer _0;
    public Integer _1;
    public SetTexture_() { tag = Command.Tag.SetTexture; }
  }
  public class SetSampler_ extends Command { 
    public Integer _0;
    public Maybe<Integer> _1;
    public SetSampler_() { tag = Command.Tag.SetSampler; }
  }
  public class RenderSlot_ extends Command { 
    public Integer _0;
    public RenderSlot_() { tag = Command.Tag.RenderSlot; }
  }
  public class RenderStream_ extends Command { 
    public Integer _0;
    public RenderStream_() { tag = Command.Tag.RenderStream; }
  }
  public class ClearRenderTarget_ extends Command { 
    public ArrayList<ClearImage> _0;
    public ClearRenderTarget_() { tag = Command.Tag.ClearRenderTarget; }
  }
  public class GenerateMipMap_ extends Command { 
    public Integer _0;
    public GenerateMipMap_() { tag = Command.Tag.GenerateMipMap; }
  }
  public class SaveImage_ extends Command { 
    public Integer _0;
    public ImageRef _1;
    public SaveImage_() { tag = Command.Tag.SaveImage; }
  }
  public class LoadImage_ extends Command { 
    public ImageRef _0;
    public Integer _1;
    public LoadImage_() { tag = Command.Tag.LoadImage; }
  }
}

