package f_19_operators.s_7

import java.math.BigDecimal
import java.time.LocalDateTime

fun main() {
    val amount = BigDecimal("42.80")
    val minPrice = BigDecimal("5.00")
    val maxPrice = BigDecimal("100.00")
    val correctPrice = amount in minPrice..maxPrice
    println(correctPrice) // true

    val now = LocalDateTime.now()
    val actionStarts = LocalDateTime.of(1410, 7, 15, 0, 0)
    val actionEnds = actionStarts.plusDays(1)
    println(now in actionStarts..actionEnds) // false
}
