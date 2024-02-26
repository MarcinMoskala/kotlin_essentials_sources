```
//1
fun main() {
    val b: Byte = 123
    val s: Short = 345
    val l: Long = 345
}
```


```
//2
fun main() {
    val b: Byte = 123
    val l: Long = 123L
    val i: Int = 123

    val i1: Int = b.toInt()
    val i2: Int = l.toInt()
    val l1: Long = b.toLong()
    val l2: Long = i.toLong()
}
```


```
//3
fun main() {
    val million = 1_000_000
    println(million) // 1000000
}
```


```
//4
fun main() {
    val hexBytes = 0xA4_D6_FE_FE
    println(hexBytes) // 2765553406
    val bytes = 0b01010010_01101101_11101000_10010010
    println(bytes) // 1382934674
}
```


```
//5
fun main() {
    val i: Int = 123
    val b: Byte = 123
    val l: Long = 123L

    val n1: Number = i
    val n2: Number = b
    val n3: Number = l
}
```


```
//6
abstract class Number {
    abstract fun toDouble(): Double
    abstract fun toFloat(): Float
    abstract fun toLong(): Long
    abstract fun toInt(): Int
    abstract fun toChar(): Char
    abstract fun toShort(): Short
    abstract fun toByte(): Byte
}
```


```
//7
fun main() {
    val b: Byte = 123
    val l: Long = b.toLong()
    val f: Float = l.toFloat()
    val i: Int = f.toInt()
    val d: Double = i.toDouble()
    println(d) // 123.0
}
```


```
//8
fun main() {
    val i1 = 12
    val i2 = 34
    println(i1 + i2) // 46
    println(i1 - i2) // -22
    println(i1 * i2) // 408
    println(i1 / i2) // 0

    val d1 = 1.4
    val d2 = 2.5
    println(d1 + d2) // 3.9
    println(d1 - d2) // -1.1
    println(d1 * d2) // 3.5
    println(d1 / d2) // 0.5599999999999999
}
```


```
//9
fun main() {
    println(5 / 2) // 2, not 2.5
}
```


```
//10
fun main() {
    println(5.toDouble() / 2) // 2.5
}
```


```
//11
fun main() {
    println(1 % 3) // 1
    println(2 % 3) // 2
    println(3 % 3) // 0
    println(4 % 3) // 1
    println(5 % 3) // 2
    println(6 % 3) // 0
    println(7 % 3) // 1
    println(0 % 3) // 0
    println(-1 % 3) // -1
    println(-2 % 3) // -2
    println(-3 % 3) // 0
}
```


```
//12
fun main() {
    var i = 1
    println(i) // 1
    i += 10
    println(i) // 11
    i -= 5
    println(i) // 6
    i *= 3
    println(i) // 18
    i /= 2
    println(i) // 9
    i %= 4
    println(i) // 1

    // Post-incrementation
    // increments value and returns the previous value
    println(i++) // 1
    println(i) // 2

    // Pre-incrementation
    // increments value and returns the new value
    println(++i) // 3
    println(i) // 3

    // Post-decrementation
    // decrements value and returns the previous value
    println(i--) // 3
    println(i) // 2

    // Pre-decrementation
    // decrements value and returns the new value
    println(--i) // 1
    println(i) // 1
}
```


```
//13
fun main() {
    println(0b0101 and 0b0001) // 1, that is 0b0001
    println(0b0101 or 0b0001)  // 5, that is 0b0101
    println(0b0101 xor 0b0001) // 4, that is 0b0100
    println(0b0101 shl 1) // 10, that is 0b1010
    println(0b0101 shr 1) // 2,  that is 0b0010
    println(0b0101 ushr 1) // 2,  that is 0b0010
}
```


```
//14
fun main() {
    println(0.1 + 0.2) // 0.30000000000000004
    println(2147483647 + 1) // -2147483648
}
```


```
//15
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
```


```
//16
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
```


```
//17
fun main() {
    val b1: Boolean = true
    println(b1) // true
    val b2: Boolean = false
    println(b2) // false
}
```


```
//18
fun main() {
    println(10 == 10) // true
    println(10 == 11) // false
    println(10 != 10) // false
    println(10 != 11) // true
}
```


```
//19
fun main() {
    println(10 > 10) // false
    println(10 > 11) // false
    println(11 > 10) // true

    println(10 < 10) // false
    println(10 < 11) // true
    println(11 < 10) // false

    println(10 >= 10) // true
    println(10 >= 11) // false
    println(11 >= 10) // true

    println(10 <= 10) // true
    println(10 <= 11) // true
    println(11 <= 10) // false
}
```


```
//20
fun main() {
    println(true && true) // true
    println(true && false) // false
    println(false && true) // false
    println(false && false) // false

    println(true || true) // true
    println(true || false) // true
    println(false || true) // true
    println(false || false) // false

    println(!true) // false
    println(!false) // true
}
```


```
//21
fun main() {
    println('A') // A
    println('Z') // Z
}
```


```
//22
fun main() {
    println('A'.code) // 65
}
```


```
//23
fun main() {
    println('\u00A3') // £
}
```


```
//24
fun main() {
    val text1 = "ABC"
    println(text1) // ABC
    val text2 = """DEF"""
    println(text2) // DEF
}
```


```
//25
fun main() {
    val text1 = "Let\'s say:\n\"Hooray\""
    println(text1)
    // Let's say:
    // "Hooray"
    val text2 = """Let\'s say:\n\"Hooray\""""
    println(text2)
    // Let\'s say:\n\"Hooray\"
    val text3 = """Let's say:
"Hooray""""
    println(text3)
    // Let's say:
    // "Hooray"
}
```


```
//26
fun main() {
    val text = """
   Let's say:
   "Hooray"
   """.trimIndent()
    println(text)
    // Let's say:
    // "Hooray"

    val description = """
      A
      B
          C
  """.trimIndent()
    println(description)
    // A
    // B
    //     C
}
```


```
//27
fun main() {
    val name = "Cookie"
    val surname = "DePies"
    val age = 6

    val fullName = "$name $surname ($age)"
    println(fullName) // Cookie DePies (6)

    val fullNameUpper =
        "${name.uppercase()} ${surname.uppercase()} ($age)"
    println(fullNameUpper) // COOKIE DEPIES (6)

    val description = """
       Name: $name
       Surname: $surname
       Age: $age
   """.trimIndent()
    println(description)
    // Name: Cookie
    // Surname: DePies
    // Age: 6
}
```


```
//28
fun main() {
    val text1 = """ABC\nDEF"""
    println(text1) // ABC\nDEF
    val text2 = """ABC${"\n"}DEF"""
    println(text2)
    // ABC
    // DEF
}
```


```
//29
fun main() {
    val text1 = "ABC"
    val text2 = "DEF"
    println(text1 + text2) // ABCDEF
    println(text1 + 123) // ABC123
    println(text1 + true) // ABCtrue
}
```