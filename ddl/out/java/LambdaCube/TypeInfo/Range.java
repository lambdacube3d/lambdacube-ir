// generated file, do not modify!
// 2016-04-01T16:25:35.327304000000Z

package LambdaCube.TypeInfo;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;

public class Range {
  public enum Tag { 
    Range
  }
  public Tag tag;

  public class Range_ extends Range { 
    public Integer startLine;
    public Integer startColumn;
    public Integer endLine;
    public Integer endColumn;
    public Range_() { tag = Range.Tag.Range; }
  }
}

