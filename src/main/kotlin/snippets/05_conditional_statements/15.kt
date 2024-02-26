package f_05_conditional_statements.s_15

var n: Number = 123

fun main() {
    val i: Int? = n as? Int
    println(i) // 123
    val d: Double? = n as? Double
    println(d) // null
}
