// generated file, do not modify!
// 2016-03-21T15:32:17.702608000000Z

package LambdaCube.PipelineSchema;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;

public class PipelineSchema {
  public enum Tag { 
    PipelineSchema
  }
  public Tag tag;

  public class PipelineSchema_ extends PipelineSchema { 
    public HashMap<String, ObjectArraySchema> objectArrays;
    public HashMap<String, InputType> uniforms;
    public PipelineSchema_() { tag = PipelineSchema.Tag.PipelineSchema; }
  }
}

