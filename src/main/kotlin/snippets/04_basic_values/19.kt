package f_04_basic_values.s_19

fun main() {
    println(true && true) // true
    println(true && false) // false
    println(false && true) // false
    println(false && false) // false

    println(true || true) // true
    println(true || false) // true
    println(false || true) // true
    println(false || false) // false

    println(!true) // false
    println(!false) // true
}
