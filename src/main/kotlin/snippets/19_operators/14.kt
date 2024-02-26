package f_19_operators.s_14

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

fun main() {
    val point = Point(10, 20)
    println(-point)  // prints "Point(x=-10, y=-20)"
}
