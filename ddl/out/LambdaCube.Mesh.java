// generated file, do not modify!
// 2016-03-14T10:58:29.976813000000Z


public class LambdaCube.Mesh {
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

    public class A_Float extends MeshAttribute { 
      public ArrayList<Float> _0;
    }
    public class A_V2F extends MeshAttribute { 
      public ArrayList<int> _0;
    }
    public class A_V3F extends MeshAttribute { 
      public ArrayList<int> _0;
    }
    public class A_V4F extends MeshAttribute { 
      public ArrayList<int> _0;
    }
    public class A_M22F extends MeshAttribute { 
      public ArrayList<int> _0;
    }
    public class A_M33F extends MeshAttribute { 
      public ArrayList<int> _0;
    }
    public class A_M44F extends MeshAttribute { 
      public ArrayList<int> _0;
    }
    public class A_Int extends MeshAttribute { 
      public ArrayList<Integer> _0;
    }
    public class A_Word extends MeshAttribute { 
      public ArrayList<Integer> _0;
    }
  }

  public class MeshPrimitive {
    public enum Tag { 
      P_Points,
      P_TriangleStrip,
      P_Triangles,
      P_TriangleStripI,
      P_TrianglesI
    }
    public Tag tag;

    public class P_TriangleStripI extends MeshPrimitive { 
      public ArrayList<Integer> _0;
    }
    public class P_TrianglesI extends MeshPrimitive { 
      public ArrayList<Integer> _0;
    }
  }

  public class Mesh {
    public enum Tag { 
      Mesh
    }
    public Tag tag;

    public class Mesh extends Mesh { 
      public HashMap<String, MeshAttribute> mAttributes;
      public MeshPrimitive mPrimitive;
    }
  }

}