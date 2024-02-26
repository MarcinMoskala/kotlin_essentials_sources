package f_19_operators.s_9

import java.math.BigDecimal

fun main() {
    val amount1 = BigDecimal("42.80")
    val amount2 = BigDecimal("5.00")
    println(amount1 > amount2) // true
    println(amount1 >= amount2) // true
    println(amount1 < amount2) // false
    println(amount1 <= amount2) // false
    println(amount1 > amount1) // false
    println(amount1 >= amount1) // true
    println(amount1 < amount2) // false
    println(amount1 <= amount2) // false
}
