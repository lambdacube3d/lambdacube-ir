// generated file, do not modify!
// 2016-03-21T15:32:18.087397000000Z

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

