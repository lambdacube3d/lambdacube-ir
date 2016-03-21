using System.Collections.Generic;


namespace LambdaCube.IR {

  public struct Maybe<T>
  {
    public bool valid;
    public T data;
  }

  public struct V2<T>
  {
    public T x;
    public T y;
  }

  public struct V3<T>
  {
    public T x;
    public T y;
    public T z;
  }

  public struct V4<T>
  {
    public T x;
    public T y;
    public T z;
    public T w;
  }
}