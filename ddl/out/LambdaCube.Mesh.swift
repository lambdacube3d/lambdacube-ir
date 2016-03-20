// generated file, do not modify!
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.781208000000Z
=======
// 2016-03-20T21:42:12.936741000000Z
>>>>>>> working c# backend

enum MeshAttribute {
  case A_Float(Array<Float>)
  case A_V2F(Array<Int>)
  case A_V3F(Array<Int>)
  case A_V4F(Array<Int>)
  case A_M22F(Array<Int>)
  case A_M33F(Array<Int>)
  case A_M44F(Array<Int>)
  case A_Int(Array<Int32>)
  case A_Word(Array<UInt32>)
}

enum MeshPrimitive {
  case P_Points
  case P_TriangleStrip
  case P_Triangles
  case P_TriangleStripI(Array<Int32>)
  case P_TrianglesI(Array<Int32>)
}

enum Mesh {
  case Mesh(Mesh_Data)
    struct Mesh_Data {
      var mAttributes : Dictionary<String, MeshAttribute>
      var mPrimitive : MeshPrimitive
    }
}


extension Int {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Int32 {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension UInt {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension UInt32 {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Float {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Bool {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension String {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Array {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Dictionary {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Maybe {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}



extension MeshAttribute {
  var toJSON : [String: AnyObject] {
    switch self {
      case .A_Float(let arg0):
        return [ "tag" : "A_Float", "arg0" : arg0.toJSON]
      case .A_V2F(let arg0):
        return [ "tag" : "A_V2F", "arg0" : arg0.toJSON]
      case .A_V3F(let arg0):
        return [ "tag" : "A_V3F", "arg0" : arg0.toJSON]
      case .A_V4F(let arg0):
        return [ "tag" : "A_V4F", "arg0" : arg0.toJSON]
      case .A_M22F(let arg0):
        return [ "tag" : "A_M22F", "arg0" : arg0.toJSON]
      case .A_M33F(let arg0):
        return [ "tag" : "A_M33F", "arg0" : arg0.toJSON]
      case .A_M44F(let arg0):
        return [ "tag" : "A_M44F", "arg0" : arg0.toJSON]
      case .A_Int(let arg0):
        return [ "tag" : "A_Int", "arg0" : arg0.toJSON]
      case .A_Word(let arg0):
        return [ "tag" : "A_Word", "arg0" : arg0.toJSON]
    }
  }
}
extension MeshPrimitive {
  var toJSON : [String: AnyObject] {
    switch self {
      case .P_Points:
        return [ "tag" : "P_Points"]
      case .P_TriangleStrip:
        return [ "tag" : "P_TriangleStrip"]
      case .P_Triangles:
        return [ "tag" : "P_Triangles"]
      case .P_TriangleStripI(let arg0):
        return [ "tag" : "P_TriangleStripI", "arg0" : arg0.toJSON]
      case .P_TrianglesI(let arg0):
        return [ "tag" : "P_TrianglesI", "arg0" : arg0.toJSON]
    }
  }
}
extension Mesh {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Mesh(let v):
        return [ "tag" : "Mesh"
               , "mAttributes" : v.mAttributes.toJSON
               , "mPrimitive" : v.mPrimitive.toJSON
               ]
    }
  }
}

enum Maybe<T> {
  case Nothing
  case Just(T)
}

enum Type {
  case Int
  case Int32
  case Word
  case Word32
  case Float
  case Bool
  case String
  case Array(Type)
  case List(Type)
  case Maybe(Type)
  case Map(Type,Type)
  case MeshAttribute
  case MeshPrimitive
  case Mesh
}

func fromJSON(type: Type, personName: String) -> Any {
  switch type {
    case .Int:    return 0
    case .Int32:  return 0
    case .Word:   return 0
    case .Word32: return 0
    case .Float:  return 0.0
    case .Bool:   return false
    case .String: return ""
    case .Array(let a): return fromJSON(a,personName)
    case .List(let a):  return fromJSON(a,personName)
    case .Maybe(let a): return fromJSON(a,personName)
  }
  return 0;
}