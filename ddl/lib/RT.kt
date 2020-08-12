package RT;

data class V2<A>(val x: A, val y: A)
data class V3<A>(val x: A, val y: A, val z: A)
data class V4<A>(val x: A, val y: A, val z: A, val w: A)

typealias M22F = V2<V2F>
typealias M23F = V3<V2F>
typealias M24F = V4<V2F>
typealias M32F = V2<V3F>
typealias M33F = V3<V3F>
typealias M34F = V4<V3F>
typealias M42F = V2<V4F>
typealias M43F = V3<V4F>
typealias M44F = V4<V4F>

typealias V2F = V2<Float>
typealias V3F = V3<Float>
typealias V4F = V4<Float>
typealias V2I = V2<Int>
typealias V3I = V3<Int>
typealias V4I = V4<Int>
typealias V2U = V2<Int>
typealias V3U = V3<Int>
typealias V4U = V4<Int>
typealias V2B = V2<Boolean>
typealias V3B = V3<Boolean>
typealias V4B = V4<Boolean>
