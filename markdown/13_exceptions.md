```
private fun calculate(): Int {
    return 1 / 0
}

private fun printCalculated() {
    println(calculate())
}

fun main() {
    println("Before")
    printCalculated()
    println("After")
}
// Before
// Exception java.lang.ArithmeticException: / by zero
//     at PlaygroundKt.calculate(Playground.kt:2)
//     at PlaygroundKt.printCalculated(Playground.kt:6)
//     at PlaygroundKt.main(Playground.kt:11)
//     at PlaygroundKt.main(Playground.kt)
```


```
//1
fun main() {
    val i1 = "10".toInt()
    println(i1)
    val i2 = "ABC".toInt()
    println(i2)
}
// 10
// Exception in thread "main" java.lang.NumberFormatException:
// For input string: "ABC"
//   at java.base/java.lang.NumberFormatException.
//   forInputString(NumberFormatException.java:67)
//   at java.base/java.lang.Integer.parseInt(Integer.java:660)
//   at java.base/java.lang.Integer.parseInt(Integer.java:778)
//   at PlaygroundKt.main(Playground.kt:4)
//   at PlaygroundKt.main(Playground.kt)
```


```
private fun functionThrowing() {
    throw ArithmeticException("Some message")
}

fun main() {
    println("Before")
    functionThrowing()
    println("After")
}
// Before
// Exception in thread "main" java.lang.ArithmeticException:
// Some message
//  at PlaygroundKt.functionThrowing(Playground.kt:2)
//  at PlaygroundKt.main(Playground.kt:7)
//  at PlaygroundKt.main(Playground.kt)
```


```
class MyException : Throwable("Some message")
object MyExceptionObject : Throwable("Some message")

private fun functionThrowing() {
    throw MyException()
    // or throw MyExceptionObject
}

fun main() {
    println("Before")
    functionThrowing()
    println("After")
}
// Before
// Exception in thread "main" MyException: Some message
//  at PlaygroundKt.functionThrowing(Playground.kt:4)
//  at PlaygroundKt.main(Playground.kt:9)
//  at PlaygroundKt.main(Playground.kt)
```


```
//2
class MyException : Throwable("Some message")

fun someFunction() {
    throw MyException()
    println("Will not be printed")
}

fun main() {
    try {
        someFunction()
        println("Will not be printed")
    } catch (e: MyException) {
        println("Caught $e")
        // Caught MyException: Some message
    }
}
```


```
//3
import java.lang.NumberFormatException

class MyException : Throwable("Some message")

fun testTryCatch(exception: Throwable) {
    try {
        throw exception
    } catch (e: ArithmeticException) {
        println("Got ArithmeticException")
    } catch (e: MyException) {
        println("Got MyException")
    } catch (e: Throwable) {
        println("Got some exception")
    }
}

fun main() {
    testTryCatch(ArithmeticException())
    // Got ArithmeticException
    testTryCatch(MyException())
    // Got MyException
    testTryCatch(NumberFormatException())
    // Got some exception
}
```


```
//4
fun main() {
    val a = try {
        1
    } catch (e: Error) {
        2
    }
    println(a) // 1

    val b = try {
        throw Error()
        1
    } catch (e: Error) {
        2
    }
    println(b) // 2
}
```


```
//5
import java.io.File
import java.io.FileNotFoundException

fun main() {
    val content = try {
        File("AAA").readText()
    } catch (e: FileNotFoundException) {
        ""
    }
    println(content) // (empty string)
}
```


```
fun <T : Any> fromJsonOrNull(
    json: String,
    clazz: KClass<T>
): T? = try {
    gson.fromJson(json, clazz.java)
} catch (e: JsonSyntaxException) {
    null
}
```


```
//6
fun someFunction() {
    throw Throwable("Some error")
}

fun main() {
    try {
        someFunction()
    } finally {
        println("Finally block was called")
    }
    println("Will not be printed")
}
// Finally block was called
```


```
//7
fun someFunction() {
    println("Function called")
}

fun main() {
    try {
        someFunction()
        println("After call")
    } finally {
        println("Finally block was called")
    }
    println("After try-finally")
}
// Function called
// After call
// Finally block was called
// After try-finally
```


```
//8
fun findClusters(number: Int) {
    if (number < 1) {
        throw IllegalArgumentException("...")
    }
    // ...
}

var userName = ""

fun printUserName() {
    if (userName == "") {
        throw IllegalStateException("Name must not be empty")
    }
    // ...
}
```


```
fun pop(num: Int): List<T> {
    require(num <= size)
    // throws IllegalArgumentException if num > size
    check(isOpen)
    // throws IllegalStateException if is not open
    val ret = collection.take(num)
    collection = collection.drop(num)
    return ret
}
```


```
//9
fun makeOperation(
    operation: String,
    left: Int,
    right: Int? = null
): Int = when (operation) {
    "add" ->
        left + (right ?: error("Two numbers required"))
    "subtract" ->
        left - (right ?: error("Two numbers required"))
    "opposite" -> -left
    else -> error("Unknown operation")
}

fun main() {
    println(makeOperation("add", 1, 2)) // 3
    println(makeOperation("subtract", 1, 2)) // -1
    println(makeOperation("opposite", 10)) // -10

    makeOperation("add", 1) // ERROR!
    // IllegalStateException: Two numbers required
    makeOperation("subtract", 1) // ERROR!
    // IllegalStateException: Two numbers required
    makeOperation("other", 1, 2) // ERROR!
    // IllegalStateException: Unknown operation
}
```