// generated file, do not modify!
// 2016-03-27T21:14:11.531713000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Value {
  public enum Tag { 
    VBool,
    VV2B,
    VV3B,
    VV4B,
    VWord,
    VV2U,
    VV3U,
    VV4U,
    VInt,
    VV2I,
    VV3I,
    VV4I,
    VFloat,
    VV2F,
    VV3F,
    VV4F,
    VM22F,
    VM23F,
    VM24F,
    VM32F,
    VM33F,
    VM34F,
    VM42F,
    VM43F,
    VM44F
  }
  public Tag tag;

  public class VBool_ extends Value { 
    public Boolean _0;
    public VBool_() { tag = Value.Tag.VBool; }
  }
  public class VV2B_ extends Value { 
    public V2<Boolean> _0;
    public VV2B_() { tag = Value.Tag.VV2B; }
  }
  public class VV3B_ extends Value { 
    public V3<Boolean> _0;
    public VV3B_() { tag = Value.Tag.VV3B; }
  }
  public class VV4B_ extends Value { 
    public V4<Boolean> _0;
    public VV4B_() { tag = Value.Tag.VV4B; }
  }
  public class VWord_ extends Value { 
    public Integer _0;
    public VWord_() { tag = Value.Tag.VWord; }
  }
  public class VV2U_ extends Value { 
    public V2<Integer> _0;
    public VV2U_() { tag = Value.Tag.VV2U; }
  }
  public class VV3U_ extends Value { 
    public V3<Integer> _0;
    public VV3U_() { tag = Value.Tag.VV3U; }
  }
  public class VV4U_ extends Value { 
    public V4<Integer> _0;
    public VV4U_() { tag = Value.Tag.VV4U; }
  }
  public class VInt_ extends Value { 
    public Integer _0;
    public VInt_() { tag = Value.Tag.VInt; }
  }
  public class VV2I_ extends Value { 
    public V2<Integer> _0;
    public VV2I_() { tag = Value.Tag.VV2I; }
  }
  public class VV3I_ extends Value { 
    public V3<Integer> _0;
    public VV3I_() { tag = Value.Tag.VV3I; }
  }
  public class VV4I_ extends Value { 
    public V4<Integer> _0;
    public VV4I_() { tag = Value.Tag.VV4I; }
  }
  public class VFloat_ extends Value { 
    public Float _0;
    public VFloat_() { tag = Value.Tag.VFloat; }
  }
  public class VV2F_ extends Value { 
    public V2<Float> _0;
    public VV2F_() { tag = Value.Tag.VV2F; }
  }
  public class VV3F_ extends Value { 
    public V3<Float> _0;
    public VV3F_() { tag = Value.Tag.VV3F; }
  }
  public class VV4F_ extends Value { 
    public V4<Float> _0;
    public VV4F_() { tag = Value.Tag.VV4F; }
  }
  public class VM22F_ extends Value { 
    public V2<V2<Float>> _0;
    public VM22F_() { tag = Value.Tag.VM22F; }
  }
  public class VM23F_ extends Value { 
    public V3<V2<Float>> _0;
    public VM23F_() { tag = Value.Tag.VM23F; }
  }
  public class VM24F_ extends Value { 
    public V4<V2<Float>> _0;
    public VM24F_() { tag = Value.Tag.VM24F; }
  }
  public class VM32F_ extends Value { 
    public V2<V3<Float>> _0;
    public VM32F_() { tag = Value.Tag.VM32F; }
  }
  public class VM33F_ extends Value { 
    public V3<V3<Float>> _0;
    public VM33F_() { tag = Value.Tag.VM33F; }
  }
  public class VM34F_ extends Value { 
    public V4<V3<Float>> _0;
    public VM34F_() { tag = Value.Tag.VM34F; }
  }
  public class VM42F_ extends Value { 
    public V2<V4<Float>> _0;
    public VM42F_() { tag = Value.Tag.VM42F; }
  }
  public class VM43F_ extends Value { 
    public V3<V4<Float>> _0;
    public VM43F_() { tag = Value.Tag.VM43F; }
  }
  public class VM44F_ extends Value { 
    public V4<V4<Float>> _0;
    public VM44F_() { tag = Value.Tag.VM44F; }
  }
}

