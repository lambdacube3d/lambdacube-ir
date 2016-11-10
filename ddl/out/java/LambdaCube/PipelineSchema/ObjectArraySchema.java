// generated file, do not modify!
// 2016-11-10T15:07:11.805936000000Z

package LambdaCube.PipelineSchema;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;

public class ObjectArraySchema {
  public enum Tag { 
    ObjectArraySchema
  }
  public Tag tag;

  public class ObjectArraySchema_ extends ObjectArraySchema { 
    public FetchPrimitive primitive;
    public HashMap<String, StreamType> attributes;
    public ObjectArraySchema_() { tag = ObjectArraySchema.Tag.ObjectArraySchema; }
  }
}

