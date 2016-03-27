// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

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

