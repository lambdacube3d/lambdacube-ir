// generated file, do not modify!
// 2023-10-27T02:34:24.280572454Z

package LambdaCube.Mesh;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class MeshPrimitive {
  public enum Tag { 
    P_Points,
    P_LineStrip,
    P_LineLoop,
    P_Lines,
    P_TriangleStrip,
    P_TriangleFan,
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

