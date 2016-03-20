// generated file, do not modify!
// 2016-03-14T10:58:30.014693000000Z

import LambdaCube.IR;

public class LambdaCube.TypeInfo {
  public class Range {
    public enum Tag { 
      Range
    }
    public Tag tag;

    public class Range extends Range { 
      public Integer startLine;
      public Integer startColumn;
      public Integer endLine;
      public Integer endColumn;
    }
  }

  public class TypeInfo {
    public enum Tag { 
      TypeInfo
    }
    public Tag tag;

    public class TypeInfo extends TypeInfo { 
      public Range range;
      public String text;
    }
  }

  public class CompileResult {
    public enum Tag { 
      CompileError,
      Compiled
    }
    public Tag tag;

    public class CompileError extends CompileResult { 
      public ArrayList<Range> _0;
      public String _1;
      public ArrayList<TypeInfo> _2;
    }
    public class Compiled extends CompileResult { 
      public String _0;
      public Pipeline _1;
      public ArrayList<TypeInfo> _2;
    }
  }

}