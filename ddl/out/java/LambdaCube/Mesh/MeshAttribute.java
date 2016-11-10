// generated file, do not modify!
// 2016-11-10T16:02:38.260630000000Z

package LambdaCube.Mesh;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class MeshAttribute {
  public enum Tag { 
    A_Float,
    A_V2F,
    A_V3F,
    A_V4F,
    A_M22F,
    A_M33F,
    A_M44F,
    A_Int,
    A_Word
  }
  public Tag tag;

  public class A_Float_ extends MeshAttribute { 
    public ArrayList<Float> _0;
    public A_Float_() { tag = MeshAttribute.Tag.A_Float; }
  }
  public class A_V2F_ extends MeshAttribute { 
    public ArrayList<V2<Float>> _0;
    public A_V2F_() { tag = MeshAttribute.Tag.A_V2F; }
  }
  public class A_V3F_ extends MeshAttribute { 
    public ArrayList<V3<Float>> _0;
    public A_V3F_() { tag = MeshAttribute.Tag.A_V3F; }
  }
  public class A_V4F_ extends MeshAttribute { 
    public ArrayList<V4<Float>> _0;
    public A_V4F_() { tag = MeshAttribute.Tag.A_V4F; }
  }
  public class A_M22F_ extends MeshAttribute { 
    public ArrayList<V2<V2<Float>>> _0;
    public A_M22F_() { tag = MeshAttribute.Tag.A_M22F; }
  }
  public class A_M33F_ extends MeshAttribute { 
    public ArrayList<V3<V3<Float>>> _0;
    public A_M33F_() { tag = MeshAttribute.Tag.A_M33F; }
  }
  public class A_M44F_ extends MeshAttribute { 
    public ArrayList<V4<V4<Float>>> _0;
    public A_M44F_() { tag = MeshAttribute.Tag.A_M44F; }
  }
  public class A_Int_ extends MeshAttribute { 
    public ArrayList<Integer> _0;
    public A_Int_() { tag = MeshAttribute.Tag.A_Int; }
  }
  public class A_Word_ extends MeshAttribute { 
    public ArrayList<Integer> _0;
    public A_Word_() { tag = MeshAttribute.Tag.A_Word; }
  }
}

