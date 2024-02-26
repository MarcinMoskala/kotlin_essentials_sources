```
//1
fun <Fun> `fun`(`fun`: Fun): Fun = `fun`
```


```
//2
fun square(x: Double): Double {
    return x * x
}

fun main() {
    println(square(10.0)) // 100.0
}
```


```
val a: Int = 123
// easy to transform from or to
val a = 123

fun add(a: Int, b: Int): Int = a + b

// easy to transform from or to
fun add(a: Int, b: Int) = a + b
```


```
class CartViewModelTests {
    @Test
    fun `should show error dialog when no items loaded`() {
        ...
    }
}
```


```
//3
fun square(x: Double): Double = x * x

fun main() {
    println(square(10.0)) // 100.0
}
```


```
fun findUsers(userFilter: UserFilter): List<User> =
    userRepository
        .getUsers()
        .map { it.toDomain() }
        .filter { userFilter.accepts(it) }
```


```
//4
fun square(x: Double) = x * x

fun main() {
    println(square(10.0)) // 100.0
}
```


```
//5
// Top-level function
fun double(i: Int) = i * 2

class A {
    // Member function (method)
    private fun triple(i: Int) = i * 3

    // Member function (method)
    fun twelveTimes(i: Int): Int {
        // Local function
        fun fourTimes() = double(double(i))
        return triple(fourTimes())
    }
}

// Top-level function
fun main(args: Array<String>) {
    double(1) // 2
    A().twelveTimes(2) // 24
}
```


```
fun validateForm() {
    var isValid = true
    val errors = mutableListOf<String>()
    fun addError(view: FormView, error: String) {
        view.error = error
        errors += error
        isValid = false
    }

    val email = emailView.text
    if (email.isBlank()) {
        addError(emailView, "Email cannot be empty or blank")
    }

    val pass = passView.text.trim()
    if (pass.length < 3) {
        addError(passView, "Password too short")
    }

    if (isValid) {
        tryLogin(email, pass)
    } else {
        showErrors(errors)
    }
}
```


```
//6
fun square(x: Double) = x * x // x is a parameter

fun main() {
    println(square(10.0)) // 10.0 is an argument
    println(square(0.0)) // 0.0 is an argument
}
```


```
fun a(i: Int) {
    i = i + 10 // ERROR
    // ...
}
```


```
//7
fun a(i: Int) {
    var i = i + 10
    // ...
}
```


```
//8
fun someFunction() {}

fun main() {
    val res: Unit = someFunction()
    println(res) // kotlin.Unit
}
```


```
fun a() {}

// the same as
fun a(): Unit {}

// the same as
fun a(): Unit {
    return
}

// the same as
fun a(): Unit {
    return Unit
}
```


```
//9
fun a(vararg params: Int) {}

fun main() {
    a()
    a(1)
    a(1, 2)
    a(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
}
```


```
//10
fun main() {
    println(listOf(1, 3, 5, 6)) // [1, 3, 5, 6]
    println(listOf("A", "B", "C")) // [A, B, C]
}
```


```
//11
fun concatenate(vararg strings: String): String {
    // The type of `strings` is Array<String>
    var accumulator = ""
    for (s in strings) accumulator += s
    return accumulator
}

fun sum(vararg ints: Int): Int {
    // The type of `ints` is IntArray
    var accumulator = 0
    for (i in ints) accumulator += i
    return accumulator
}

fun main() {
    println(concatenate()) //
    println(concatenate("A", "B")) // AB
    println(sum()) // 0
    println(sum(1, 2, 3)) // 6
}
```


```
//12
fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.joinToString()) // 1, 2, 3, 4
    println(list.joinToString(separator = "-")) //  1-2-3-4
    println(list.joinToString(limit = 2)) //  1, 2, ...
}
```


```
//13
fun cheer(how: String = "Hello,", who: String = "World") {
    println("$how $who")
}

fun main() {
    cheer() // Hello, World
    cheer("Hi") // Hi World
}
```


```
//14
fun addOneAndPrint(list: MutableList<Int> = mutableListOf()) {
    list.add(1)
    println(list)
}

fun main() {
    addOneAndPrint() // [1]
    addOneAndPrint() // [1]
    addOneAndPrint() // [1]
}
```


```
//15
fun cheer(how: String = "Hello,", who: String = "World") {
    print("$how $who")
}

fun main() {
    cheer(who = "Group") // Hello, Group
}
```


```
//16
fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.joinToString("-")) // 1-2-3-4
    // better
    println(list.joinToString(separator = "-")) //  1-2-3-4
}
```


```
//17
class User(
    val name: String,
    val surname: String,
)

val user = User(
    name = "Norbert",
    surname = "Moskała",
)
```


```
//18
fun a(a: Any) = "Any"
fun a(i: Int) = "Int"
fun a(l: Long) = "Long"

fun main() {
    println(a(1)) // Int
    println(a(18L)) // Long
    println(a("ABC")) // Any
}
```


```
//19
import java.math.BigDecimal

class Money(val amount: BigDecimal, val currency: String)

fun pln(amount: BigDecimal) = Money(amount, "PLN")
fun pln(amount: Int) = pln(amount.toBigDecimal())
fun pln(amount: Double) = pln(amount.toBigDecimal())
```


```
//20
class View
class ViewInteractor {
    infix fun clicks(view: View) { 
        // ...
    }
}

fun main() {
    val aView = View()
    val interactor = ViewInteractor()

    // regular notation
    interactor.clicks(aView)
    // infix notation
    interactor clicks aView
}
```


```
//21
fun main() {
    // infix notation
    println(0b011 and 0b001) // 1, that is 0b001
    println(0b011 or 0b001) // 3, that is 0b011
    println(0b011 xor 0b001) // 2, that is 0b010

    // regular notation
    println(0b011.and(0b001)) // 1, that is 0b001
    println(0b011.or(0b001)) // 3, that is 0b011
    println(0b011.xor(0b001)) // 2, that is 0b010
}
```


```
fun veryLongFunction(
    param1: Param1Type,
    param2: Param2Type,
    param3: Param3Type,
): ResultType {
    // body
}
```


```
class VeryLongClass(
    val property1: Type1,
    val property2: Type2,
    val property3: Type3,
) : ParentClass(), Interface1, Interface2 {
    // body
}
```


```
//22
fun makeUser(
    name: String,
    surname: String,
): User = User(
    name = name,
    surname = surname,
)

class User(
    val name: String,
    val surname: String,
)

fun main() {
    val user = makeUser(
        name = "Norbert",
        surname = "Moskała",
    )

    val characters = listOf(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "R", "S", "T", "U",
        "W", "X", "Y", "Z",
    )
}
```


```
//23
fun printName(
    name: String,
    surname: String, // <- trailing comma
) {
    println("$name $surname")
}

fun main() {
    printName(
        name = "Norbert",
        surname = "Moskała", // <- trailing comma
    )
}
```