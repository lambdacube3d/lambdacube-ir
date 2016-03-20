// generated file, do not modify!
// 2016-03-21T11:41:52.460562000000Z

package LambdaCube.TypeInfo;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;

public class CompileResult {
  public enum Tag { 
    CompileError,
    Compiled
  }
  public Tag tag;

  public class CompileError_ extends CompileResult { 
    public ArrayList<Range> _0;
    public String _1;
    public ArrayList<TypeInfo> _2;
    public CompileError_() { tag = CompileResult.Tag.CompileError; }
  }
  public class Compiled_ extends CompileResult { 
    public String _0;
    public Pipeline _1;
    public ArrayList<TypeInfo> _2;
    public Compiled_() { tag = CompileResult.Tag.Compiled; }
  }
}

