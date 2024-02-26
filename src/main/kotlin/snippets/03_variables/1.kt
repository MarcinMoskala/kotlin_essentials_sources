package f_03_variables.s_1

fun main() {
    val a = 10
    var b = "ABC"
    println(a) // 10
    println(b) // ABC
    // a = 12 is not possible, because a is read-only!
    b = "CDE"
    println(b) // CDE
}
