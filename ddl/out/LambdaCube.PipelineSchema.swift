// generated file, do not modify!
// 2016-11-10T16:02:38.214442000000Z

enum StreamType {
  case Attribute_Word
  case Attribute_V2U
  case Attribute_V3U
  case Attribute_V4U
  case Attribute_Int
  case Attribute_V2I
  case Attribute_V3I
  case Attribute_V4I
  case Attribute_Float
  case Attribute_V2F
  case Attribute_V3F
  case Attribute_V4F
  case Attribute_M22F
  case Attribute_M23F
  case Attribute_M24F
  case Attribute_M32F
  case Attribute_M33F
  case Attribute_M34F
  case Attribute_M42F
  case Attribute_M43F
  case Attribute_M44F
}

enum ObjectArraySchema {
  case ObjectArraySchema(ObjectArraySchema_Data)
    struct ObjectArraySchema_Data {
      var primitive : FetchPrimitive
      var attributes : Dictionary<String, StreamType>
    }
}

enum PipelineSchema {
  case PipelineSchema(PipelineSchema_Data)
    struct PipelineSchema_Data {
      var objectArrays : Dictionary<String, ObjectArraySchema>
      var uniforms : Dictionary<String, InputType>
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



extension StreamType {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Attribute_Word:
        return [ "tag" : "Attribute_Word"]
      case .Attribute_V2U:
        return [ "tag" : "Attribute_V2U"]
      case .Attribute_V3U:
        return [ "tag" : "Attribute_V3U"]
      case .Attribute_V4U:
        return [ "tag" : "Attribute_V4U"]
      case .Attribute_Int:
        return [ "tag" : "Attribute_Int"]
      case .Attribute_V2I:
        return [ "tag" : "Attribute_V2I"]
      case .Attribute_V3I:
        return [ "tag" : "Attribute_V3I"]
      case .Attribute_V4I:
        return [ "tag" : "Attribute_V4I"]
      case .Attribute_Float:
        return [ "tag" : "Attribute_Float"]
      case .Attribute_V2F:
        return [ "tag" : "Attribute_V2F"]
      case .Attribute_V3F:
        return [ "tag" : "Attribute_V3F"]
      case .Attribute_V4F:
        return [ "tag" : "Attribute_V4F"]
      case .Attribute_M22F:
        return [ "tag" : "Attribute_M22F"]
      case .Attribute_M23F:
        return [ "tag" : "Attribute_M23F"]
      case .Attribute_M24F:
        return [ "tag" : "Attribute_M24F"]
      case .Attribute_M32F:
        return [ "tag" : "Attribute_M32F"]
      case .Attribute_M33F:
        return [ "tag" : "Attribute_M33F"]
      case .Attribute_M34F:
        return [ "tag" : "Attribute_M34F"]
      case .Attribute_M42F:
        return [ "tag" : "Attribute_M42F"]
      case .Attribute_M43F:
        return [ "tag" : "Attribute_M43F"]
      case .Attribute_M44F:
        return [ "tag" : "Attribute_M44F"]
    }
  }
}
extension ObjectArraySchema {
  var toJSON : [String: AnyObject] {
    switch self {
      case .ObjectArraySchema(let v):
        return [ "tag" : "ObjectArraySchema"
               , "primitive" : v.primitive.toJSON
               , "attributes" : v.attributes.toJSON
               ]
    }
  }
}
extension PipelineSchema {
  var toJSON : [String: AnyObject] {
    switch self {
      case .PipelineSchema(let v):
        return [ "tag" : "PipelineSchema"
               , "objectArrays" : v.objectArrays.toJSON
               , "uniforms" : v.uniforms.toJSON
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
  case StreamType
  case ObjectArraySchema
  case PipelineSchema
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