// generated file, do not modify!
// 2016-03-14T10:58:29.954220000000Z

import LambdaCube.IR;

public class LambdaCube.PipelineSchema {
  public class StreamType {
    public enum Tag { 
      Attribute_Word,
      Attribute_V2U,
      Attribute_V3U,
      Attribute_V4U,
      Attribute_Int,
      Attribute_V2I,
      Attribute_V3I,
      Attribute_V4I,
      Attribute_Float,
      Attribute_V2F,
      Attribute_V3F,
      Attribute_V4F,
      Attribute_M22F,
      Attribute_M23F,
      Attribute_M24F,
      Attribute_M32F,
      Attribute_M33F,
      Attribute_M34F,
      Attribute_M42F,
      Attribute_M43F,
      Attribute_M44F
    }
    public Tag tag;

  }

  public class ObjectArraySchema {
    public enum Tag { 
      ObjectArraySchema
    }
    public Tag tag;

    public class ObjectArraySchema extends ObjectArraySchema { 
      public FetchPrimitive primitive;
      public HashMap<String, StreamType> attributes;
    }
  }

  public class PipelineSchema {
    public enum Tag { 
      PipelineSchema
    }
    public Tag tag;

    public class PipelineSchema extends PipelineSchema { 
      public HashMap<String, ObjectArraySchema> objectArrays;
      public HashMap<String, InputType> uniforms;
    }
  }

}