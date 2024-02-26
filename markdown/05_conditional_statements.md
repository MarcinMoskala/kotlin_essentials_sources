```
if (predicate) {
    // body
}
```


```
//1
fun main() {
    val i = 1 // or 5
    if (i < 3) { // i < 3 is used as a condition
        // will be executed when condition returns true
        println("Smaller")
    } else {
        // will be executed when condition returns false
        println("Bigger")
    }
    // Prints Smaller if i == 1, or Bigger if i == 5
}
```


```
val value = if (condition) {
    // body 1
} else {
    // body 2
}
```


```
//2
fun main() {
    var isOne = true
    val number1: Int = if (isOne) 1 else 0
    println(number1) // 1
    isOne = false
    val number2: Int = if (isOne) 1 else 0
    println(number2) // 0

    val superuser = true
    val hasAccess: Boolean = if (superuser) {
        println("Good morning, sir Admin")
        true
    } else {
        false
    }
    println(hasAccess) // true
}
```


```
val r: Int = if (one) 1 else 0
// a more readable alternative to
val r: Int = if (one) {
    1
} else {
    0
}
```


```
// Kotlin
val name = if (user == null) "" else user.name
```


```
//3
fun main() {
    println("Is it going to rain?")
    val probability = 70
    if (probability < 40) {
        println("Na-ha")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("Holly Crab")
    }
}
```


```
//4
// Function we can execute on any object, to print it
// 10.print() prints 10
// "ABC".print() prints ABC
fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    if (num < 0) {
        "negative"
    } else if (num > 0) {
        "positive"
    } else {
        "zero"
    }.print()
}

fun main(args: Array<String>) {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)
}
```


```
fun printNumberSign(num: Int) {
    if (num < 0) {
        "negative"
    } else {
        if (num > 0) {
            "positive"
        } else {
            "zero"
        }.print()
    }
}
```


```
//5
// Function we can execute on any object, to print it
// 10.print() prints 10
// "ABC".print() prints ABC
fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    when {
        num < 0 -> "negative"
        num > 0 -> "positive"
        else -> "zero"
    }.print()
}

fun main(args: Array<String>) {
    printNumberSign(-2) // negative
    print(",") // ,
    printNumberSign(0) // zero
    print(",") // ,
    printNumberSign(2) // positive
}
```


```
//6
fun main() {
    println("Is it going to rain?")
    val probability = 70
    when {
        probability < 40 -> {
            println("Na-ha")
        }
        probability <= 80 -> {
            println("Likely")
        }
        probability < 100 -> {
            println("Yes")
        }
        else -> {
            println("Holly Crab")
        }
    }
}
```


```
//7
fun main() {
    println("Is it going to rain?")
    val probability = 70
    when {
        probability < 40 -> println("Na-ha")
        probability <= 80 -> println("Likely")
        probability < 100 -> println("Yes")
        else -> println("Holly Crab")
    }
}
```


```
//8
fun main() {
    println("Is it going to rain?")
    val probability = 70
    val text = when {
        probability < 40 -> "Na-ha"
        probability <= 80 -> "Likely"
        probability < 100 -> "Yes"
        else -> "Holly Crab"
    }
    println(text)
}
```


```
private fun getEmailErrorId(email: String) = when {
    email.isEmpty() -> R.string.error_field_required
    emailInvalid(email) -> R.string.error_invalid_email
    else -> null
}
```


```
//9
private val magicNumbers = listOf(7, 13)

fun describe(a: Any?) {
    when (a) {
        null -> println("Nothing")
        1, 2, 3 -> println("Small number")
        in magicNumbers -> println("Magic number")
        in 4..100 -> println("Big number")
        is String -> println("This is just $a")
        is Long, is Int -> println("This is Int or Long")
        else -> println("No idea, really")
    }
}

fun main() {
    describe(null) // Nothing
    describe(1) // Small number
    describe(3) // Small number
    describe(7) // Magic number
    describe(9) // Big number,
    // because 9 is in range from 4 to 100
    describe("AAA") // This is just AAA
    describe(1L) // This is Int or Long
    describe(-1) // This is Int or Long
    describe(1.0) // No idea, really,
    // because 1.0 is Double
}
```


```
//10
private val magicNumbers = listOf(7, 13)

fun describe(a: Any?): String = when (a) {
    null -> "Nothing"
    1, 2, 3 -> "Small number"
    in magicNumbers -> "Magic number"
    in 4..100 -> "Big number"
    is String -> "This is just $a"
    is Long, is Int -> "This is Int or Long"
    else -> "No idea, really"
}

fun main() {
    println(describe(null)) // Nothing
    println(describe(1)) // Small number
    println(describe(3)) // Small number
    println(describe(7)) // Magic number
    println(describe(9)) // Big number,
    // because 9 is in range from 4 to 100
    println(describe("AAA")) // This is just AAA
    println(describe(1L)) // This is Int or Long
    println(describe(-1)) // This is Int or Long
    println(describe(1.0)) // No idea, really,
    // because 1.0 is Double
}
```


```
fun showUsers() =
    when (val response = requestUsers()) {
        is Success -> showUsers(response.body)
        is HttpError -> showException(response.exception)
    }
```


```
fun main() {
    println(123 is Int) // true
    println("ABC" is String) // true
    println(123 is String) // false
    println("ABC" is Int) // false
}
```


```
fun main() {
    println(123 is Int) // true
    println(123 is Number) // true
    println(3.14 is Double) // true
    println(3.14 is Number) // true

    println(123 is Double) // false
    println(3.14 is Int) // false
}
```


```
fun main() {
    println(123 !is Int) // false
    println("ABC" !is String) // false
    println(123 !is String) // true
    println("ABC" !is Int) // true
}
```


```
//11
fun main() {
    val i: Int = 123
    val l: Long = 123L
    val d: Double = 3.14

    var number: Number = i // up-casting from Int to Number
    number = l // up-casting from Long to Number
    number = d // up-casting from Double to Number
}
```


```
//12
var i: Number = 123

fun main() {
    val j = (i as Int) + 10
    println(j) // 133
}
```


```
//13
var i: Number = 3.14

fun main() {
    val j = (i as Int) + 10 // RUNTIME ERROR!
    println(j)
}
```


```
//14
var i: Number = 3.14

fun main() {
    val j = i.toInt() + 10
    println(j) // 13
}
```


```
//15
var n: Number = 123

fun main() {
    val i: Int? = n as? Int
    println(i) // 123
    val d: Double? = n as? Double
    println(d) // null
}
```


```
fun convertToInt(num: Number): Int =
    if (num is Int) num  // the type of num here is Int
    else num.toInt()
```


```
fun lengthIfString(a: Any): Int {
    if (a is String) {
        return a.length // the type of a here is String
    }
    return 0
}
```


```
//16
var obj: Any = "AAA"

fun main() {
    if (obj is String) {
        // println(obj.length) will not compile,
        // because `obj` can be modified by some
        // other thread, so Kotlin cannot be sure,
        // that at this point, is it still of type String
    }
}
```


```
fun handleResponse(response: Result<T>) {
    when (response) {
        is Success<*> -> showMessages(response.data) 
        // response smart-casted to Success
        is Failure -> showError(response.throwable)
        // response smart-casted to Failure
    }
}
```


```
//17
fun main() {
    var i = 1
    // while-statement
    while (i < 10) {
        print(i)
        i *= 2
    }
    // 1248

    var j = 1
    // do-while statement
    do {
        print(j)
        j *= 2
    } while (j < 10)
    // 1248
}
```


```
//18
fun main() {
    generateSequence(1) { it * 2 }
        .takeWhile { it < 10 }
        .forEach(::print)
    // 1248
}
```