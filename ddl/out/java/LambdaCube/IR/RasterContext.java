// generated file, do not modify!
// 2016-11-10T15:07:10.798971000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class RasterContext {
  public enum Tag { 
    PointCtx,
    LineCtx,
    TriangleCtx
  }
  public Tag tag;

  public class PointCtx_ extends RasterContext { 
    public PointSize _0;
    public Float _1;
    public PointSpriteCoordOrigin _2;
    public PointCtx_() { tag = RasterContext.Tag.PointCtx; }
  }
  public class LineCtx_ extends RasterContext { 
    public Float _0;
    public ProvokingVertex _1;
    public LineCtx_() { tag = RasterContext.Tag.LineCtx; }
  }
  public class TriangleCtx_ extends RasterContext { 
    public CullMode _0;
    public PolygonMode _1;
    public PolygonOffset _2;
    public ProvokingVertex _3;
    public TriangleCtx_() { tag = RasterContext.Tag.TriangleCtx; }
  }
}

