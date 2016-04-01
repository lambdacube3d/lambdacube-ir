// generated file, do not modify!
// 2016-04-01T16:25:34.381854000000Z

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

