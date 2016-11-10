// generated file, do not modify!
// 2016-11-10T15:07:11.972496000000Z

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
    public ArrayList<TypeInfo> _0;
    public ArrayList<WarningInfo> _1;
    public ArrayList<ErrorInfo> _2;
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

