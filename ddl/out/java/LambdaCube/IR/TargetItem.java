// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class TargetItem {
  public enum Tag { 
    TargetItem
  }
  public Tag tag;

  public class TargetItem_ extends TargetItem { 
    public ImageSemantic targetSemantic;
    public Maybe<ImageRef> targetRef;
    public TargetItem_() { tag = TargetItem.Tag.TargetItem; }
  }
}

