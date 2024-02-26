package f_04_basic_values.s_15

import java.math.BigDecimal
import java.math.BigInteger

fun main() {
    val i = 10
    val l = 10L
    val d = 10.0
    val f = 10.0F

    val bd1: BigDecimal = BigDecimal(123)
    val bd2: BigDecimal = BigDecimal("123.00")
    val bd3: BigDecimal = i.toBigDecimal()
    val bd4: BigDecimal = l.toBigDecimal()
    val bd5: BigDecimal = d.toBigDecimal()
    val bd6: BigDecimal = f.toBigDecimal()
    val bi1: BigInteger = BigInteger.valueOf(123)
    val bi2: BigInteger = BigInteger("123")
    val bi3: BigInteger = i.toBigInteger()
    val bi4: BigInteger = l.toBigInteger()
}
