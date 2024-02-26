package f_19_operators.s_1

import java.math.BigDecimal

fun main() {
    val list: List<String> = listOf("A", "B")
    val newList: List<String> = list + "C"
    println(newList) // [A, B, C]

    val str1: String = "AB"
    val str2: String = "CD"
    val str3: String = str1 + str2
    println(str3) // ABCD

    println("A" in list) // true
    println("C" in list) // false

    val money1: BigDecimal = BigDecimal("12.50")
    val money2: BigDecimal = BigDecimal("3.50")
    val money3: BigDecimal = money1 * money2
    println(money3) // 43.7500
}
