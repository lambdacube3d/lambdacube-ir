// generated file, do not modify!
// 2016-11-11T11:17:02.701527000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class StreamData {
  public enum Tag { 
    StreamData
  }
  public Tag tag;

  public class StreamData_ extends StreamData { 
    public HashMap<String, ArrayValue> streamData;
    public HashMap<String, InputType> streamType;
    public FetchPrimitive streamPrimitive;
    public ArrayList<Integer> streamPrograms;
    public StreamData_() { tag = StreamData.Tag.StreamData; }
  }
}

