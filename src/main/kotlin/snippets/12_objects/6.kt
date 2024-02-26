package f_12_objects.s_6

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode.HALF_EVEN

abstract class Money(
    val amount: BigDecimal,
    val currency: String
)

abstract class MoneyMaker<Currency : Money> {
    private val MATH = MathContext(2, HALF_EVEN)
    abstract fun from(amount: BigDecimal): Currency
    fun from(amount: Int): Currency =
        from(amount.toBigDecimal(MATH))
    fun from(amount: Double): Currency =
        from(amount.toBigDecimal(MATH))

    @Throws(NumberFormatException::class)
    fun from(amount: String): Currency =
        from(amount.toBigDecimal(MATH))
}

class USD(amount: BigDecimal) : Money(amount, "USD") {
    companion object : MoneyMaker<USD>() {
        override fun from(amount: BigDecimal): USD = USD(amount)
    }
}

class EUR(amount: BigDecimal) : Money(amount, "EUR") {
    companion object : MoneyMaker<EUR>() {
        override fun from(amount: BigDecimal): EUR = EUR(amount)
    }
}

class PLN(amount: BigDecimal) : Money(amount, "PLN") {
    companion object : MoneyMaker<PLN>() {
        override fun from(amount: BigDecimal): PLN = PLN(amount)
    }
}

fun main() {
    val eur: EUR = EUR.from("12.00")
    val pln: PLN = PLN.from(20)
    val usd: USD = USD.from(32.5)
}
