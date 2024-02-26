package f_12_objects.s_7

object Point {
    var x = 0
    var y = 0
}

fun main() {
    println(Point.x) // 0
    Point.y = 10
    println(Point.y) // 10

    val p = Point
    p.x = 20
    println(Point.x) // 20
    println(Point.y) // 10
}
