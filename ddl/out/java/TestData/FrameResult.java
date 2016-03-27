// generated file, do not modify!
// 2016-03-27T21:14:12.566976000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class FrameResult {
  public enum Tag { 
    FrameResult
  }
  public Tag tag;

  public class FrameResult_ extends FrameResult { 
    public ArrayList<Float> frRenderTimes;
    public Integer frImageWidth;
    public Integer frImageHeight;
    public FrameResult_() { tag = FrameResult.Tag.FrameResult; }
  }
}

