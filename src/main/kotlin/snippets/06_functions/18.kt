package f_06_functions.s_18

fun main() {
    // infix notation
    println(0b011 and 0b001) // 1, that is 0b001
    println(0b011 or 0b001) // 3, that is 0b011
    println(0b011 xor 0b001) // 2, that is 0b010

    // regular notation
    println(0b011.and(0b001)) // 1, that is 0b001
    println(0b011.or(0b001)) // 3, that is 0b011
    println(0b011.xor(0b001)) // 2, that is 0b010
}
