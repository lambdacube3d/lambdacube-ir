// generated file, do not modify!
// 2016-04-01T16:25:35.172905000000Z

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

