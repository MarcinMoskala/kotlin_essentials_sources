package f_19_operators.s_12

fun main() {
    var str = "ABC"
    str += "D" // translates to str = str + "D"
    println(str) // ABCD

    var l = listOf("A", "B", "C")
    l += "D" // translates to l = l + "D"
    println(l) // [A, B, C, D]
}
