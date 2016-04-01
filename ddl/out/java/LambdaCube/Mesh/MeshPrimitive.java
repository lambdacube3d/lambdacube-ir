// generated file, do not modify!
// 2016-04-01T16:25:35.222504000000Z

package LambdaCube.Mesh;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class MeshPrimitive {
  public enum Tag { 
    P_Points,
    P_TriangleStrip,
    P_Triangles,
    P_TriangleStripI,
    P_TrianglesI
  }
  public Tag tag;

  public class P_TriangleStripI_ extends MeshPrimitive { 
    public ArrayList<Integer> _0;
    public P_TriangleStripI_() { tag = MeshPrimitive.Tag.P_TriangleStripI; }
  }
  public class P_TrianglesI_ extends MeshPrimitive { 
    public ArrayList<Integer> _0;
    public P_TrianglesI_() { tag = MeshPrimitive.Tag.P_TrianglesI; }
  }
}

