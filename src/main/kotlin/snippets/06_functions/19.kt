package f_06_functions.s_19

import java.math.BigDecimal

class Money(val amount: BigDecimal, val currency: String)

fun pln(amount: BigDecimal) = Money(amount, "PLN")
fun pln(amount: Int) = pln(amount.toBigDecimal())
fun pln(amount: Double) = pln(amount.toBigDecimal())
