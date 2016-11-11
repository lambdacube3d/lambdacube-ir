// generated file, do not modify!
// 2016-11-11T11:17:03.605012000000Z

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
    public String _0;
    public ArrayList<TypeInfo> _1;
    public ArrayList<WarningInfo> _2;
    public ArrayList<ErrorInfo> _3;
    public CompileError_() { tag = CompileResult.Tag.CompileError; }
  }
  public class Compiled_ extends CompileResult { 
    public String _0;
    public String _1;
    public Pipeline _2;
    public ArrayList<TypeInfo> _3;
    public ArrayList<WarningInfo> _4;
    public Compiled_() { tag = CompileResult.Tag.Compiled; }
  }
}

