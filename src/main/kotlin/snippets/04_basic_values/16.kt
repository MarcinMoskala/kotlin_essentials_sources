package f_04_basic_values.s_16

import java.math.BigDecimal
import java.math.BigInteger

fun main() {
    val bd1 = BigDecimal("1.2")
    val bd2 = BigDecimal("3.4")
    println(bd1 + bd2) // 4.6
    println(bd1 - bd2) // -2.2
    println(bd1 * bd2) // 4.08
    println(bd1 / bd2) // 0.4

    val bi1 = BigInteger("12")
    val bi2 = BigInteger("34")
    println(bi1 + bi2) // 46
    println(bi1 - bi2) // -22
    println(bi1 * bi2) // 408
    println(bi1 / bi2) // 0
}
