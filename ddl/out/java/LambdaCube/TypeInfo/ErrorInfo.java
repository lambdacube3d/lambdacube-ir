// generated file, do not modify!
// 2016-11-11T11:17:03.605012000000Z

package LambdaCube.TypeInfo;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;

public class ErrorInfo {
  public enum Tag { 
    ErrorInfo
  }
  public Tag tag;

  public class ErrorInfo_ extends ErrorInfo { 
    public Range eRange;
    public String eText;
    public ErrorInfo_() { tag = ErrorInfo.Tag.ErrorInfo; }
  }
}

