```
//1
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
```


```
//2
data class Complex(val real: Double, val imaginary: Double)
```


```
//3
data class Complex(val real: Double, val imaginary: Double) {

    operator fun plus(another: Complex) = Complex(
        real + another.real,
        imaginary + another.imaginary
    )

    operator fun minus(another: Complex) = Complex(
        real = real - another.real,
        imaginary = imaginary - another.imaginary
    )
}

// example usage
fun main() {
    val c1 = Complex(1.0, 2.0)
    val c2 = Complex(2.0, 3.0)
    println(c1 + c2) // Complex(real=3.0, imaginary=5.0)
    println(c2 - c1) // Complex(real=1.0, imaginary=1.0)
}
```


```
c1 + c2 // under the hood is c1.plus(c2)
c1 - c2 // under the hood is c1.minus(c2)
```


```
//4
fun main() {
    println(13 % 4) // 1
    println(7 % 4)  // 3
    println(1 % 4)  // 1
    println(0 % 4)  // 0
    println(-1 % 4) // -1
    println(-5 % 4) // -1
    println(-7 % 4) // -3
}
```


```
//5
fun main() {
    val intRange: IntRange = 1..10
    val comparableRange: ClosedRange<String> = "A".."Z"
    val openEndRange: OpenEndRange<Double> = 1.0..<2.0
}
```


```
//6
fun main() {
    val letters = setOf("A", "B", "C")
    println("A" in letters) // true
    println("D" in letters) // false
    println(letters.contains("A")) // true
    println(letters.contains("D")) // false
}
```


```
//7
fun main() {
    println(5 in 1..10) // true
    println(11 in 1..10) // false
}
```


```
//8
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
```


```
//9
public interface Iterable<out T> {
    /**
     * Returns an iterator over the elements of this object.
     */
    public operator fun iterator(): Iterator<T>
}
```


```
//10
// Part of Kotlin standard library
inline operator fun <K, V>
Map<out K, V>.iterator(): Iterator<Map.Entry<K, V>> =
    entries.iterator()

fun main() {
    val map = mapOf('a' to "Alex", 'b' to "Bob")
    for ((letter, name) in map) {
        println("$letter like in $name")
    }
}
// a like in Alex
// b like in Bob
```


```
fun main() {
    for (e in Tree()) {
        // body
    }
}

class Tree {
    operator fun iterator(): Iterator<String> = ...
}
```


```
fun main() {
    val iterator = Tree().iterator()
    while (iterator.hasNext()) {
        val e = iterator.next()
        // body
    }
}
```


```
//11
public interface Comparable<in T> {
    /**
     * Compares this object with the specified object for
     * order. Returns zero if this object is equal to the
     * specified [other] object, a negative number if it's
     * less than [other], or a positive number if it's
     * greater than [other].
     */
    public operator fun compareTo(other: T): Int
}
```


```
//12
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
```


```
//13
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
```


```
//14
fun main() {
    val mutableList = mutableListOf("A", "B", "C")
    println(mutableList[1]) // B
    mutableList[2] = "D"
    println(mutableList) // [A, B, D]

    val animalFood = mutableMapOf(
        "Dog" to "Meat",
        "Goat" to "Grass"
    )
    println(animalFood["Dog"]) // Meat
    animalFood["Cat"] = "Meat"
    println(animalFood["Cat"]) // Meat
}
```


```
//15
fun main() {
    var str = "ABC"
    str += "D" // translates to str = str + "D"
    println(str) // ABCD

    var l = listOf("A", "B", "C")
    l += "D" // translates to l = l + "D"
    println(l) // [A, B, C, D]
}
```


```
//16
fun main() {
    val names = mutableListOf("Jake", "Ben")
    names += "Jon"
    names -= "Ben"
    println(names) // [Jake, Jon]

    val tools = mutableMapOf(
        "Grass" to "Lawnmower",
        "Nail" to "Hammer"
    )
    tools += "Screw" to "Screwdriver"
    tools -= "Grass"
    println(tools) // {Nail=Hammer, Screw=Screwdriver}
}
```


```
//17
data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

fun main() {
    val point = Point(10, 20)
    println(-point)  // prints "Point(x=-10, y=-20)"
}
```


```
//18
fun main() {
    var i = 10
    println(i++) // 10
    println(i) // 11
    println(++i) // 12
    println(i) // 12

    i = 10
    println(i--) // 10
    println(i) // 9
    println(--i) // 8
    println(i) // 8
}
```


```
//19
class CheerUseCase {
    operator fun invoke(who: String) {
        println("Hello, $who")
    }
}

fun main() {
    val hello = {
        println("Hello")
    }
    hello() // Hello

    val cheerUseCase = CheerUseCase()
    cheerUseCase("Reader") // Hello, Reader
}
```


```
//20
fun main() {
    println(-1.plus(1))
}
```


```
//21
fun main() {
    println((-1).plus(1)) // 0
}
```