package f_04_basic_values.s_12

fun main() {
    println(0b0101 and 0b0001) // 1, that is 0b0001
    println(0b0101 or 0b0001)  // 5, that is 0b0101
    println(0b0101 xor 0b0001) // 4, that is 0b0100
    println(0b0101 shl 1) // 10, that is 0b1010
    println(0b0101 shr 1) // 2,  that is 0b0010
    println(0b0101 ushr 1) // 2,  that is 0b0010
}
