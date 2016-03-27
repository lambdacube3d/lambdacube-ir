// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class ArrayValue {
  public enum Tag { 
    VBoolArray,
    VIntArray,
    VWordArray,
    VFloatArray
  }
  public Tag tag;

  public class VBoolArray_ extends ArrayValue { 
    public ArrayList<Boolean> _0;
    public VBoolArray_() { tag = ArrayValue.Tag.VBoolArray; }
  }
  public class VIntArray_ extends ArrayValue { 
    public ArrayList<Integer> _0;
    public VIntArray_() { tag = ArrayValue.Tag.VIntArray; }
  }
  public class VWordArray_ extends ArrayValue { 
    public ArrayList<Integer> _0;
    public VWordArray_() { tag = ArrayValue.Tag.VWordArray; }
  }
  public class VFloatArray_ extends ArrayValue { 
    public ArrayList<Float> _0;
    public VFloatArray_() { tag = ArrayValue.Tag.VFloatArray; }
  }
}

