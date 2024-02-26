package f_19_operators.s_13

import java.time.LocalDateTime

fun main() {
    val now = LocalDateTime.now()
    val actionStarts = LocalDateTime.of(2010, 10, 20, 0, 0)
    val actionEnds = actionStarts.plusDays(1)
    println(now > actionStarts) // true
    println(now <= actionStarts) // false
    println(now < actionEnds) // false
    println(now >= actionEnds) // true
}
