package f_06_functions.s_18

fun a(a: Any) = "Any"
fun a(i: Int) = "Int"
fun a(l: Long) = "Long"

fun main() {
    println(a(1)) // Int
    println(a(18L)) // Long
    println(a("ABC")) // Any
}
