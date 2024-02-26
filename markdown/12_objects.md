```
//1
class A

// Using a constructor to create an object
val a = A()
```


```
//2
val instance = object {}
```


```
//3
class Box {
    var value: Any? = NOT_SET

    fun initialized() = value != NOT_SET

    companion object {
        private val NOT_SET = object {}
    }
}

private val LOCK = object {}
fun synchronizedOperation() = synchronized(LOCK) {
    // ...
}
```


```
//4
private val NOT_SET = Any()
```


```
//5
data class User(val name: String)

interface UserProducer {
    fun produce(): User
}

fun printUser(producer: UserProducer) {
    println(producer.produce())
}

fun main() {
    val user = User("Jake")
    val producer = object : UserProducer {
        override fun produce(): User = user
    }
    printUser(producer) // User(name=Jake)
}
```


```
//6
class Robot {
    // Possible, but rarely useful
    // prefer regular member properties instead
    private val point = object {
        var x = 0
        var y = 0
    }

    fun moveUp() {
        point.y += 10
    }

    fun show() {
        println("(${point.x}, ${point.y})")
    }
}

fun main() {
    val robot = Robot()
    robot.show() // (0, 0)
    robot.moveUp()
    robot.show() // (0, 10)

    val point = object {
        var x = 0
        var y = 0
    }
    println(point.x) // 0
    point.y = 10
    println(point.y) // 10
}
```


```
taskNameView.addTextChangedListener(object : TextWatcher {
    override fun afterTextChanged(
        editable: Editable?
    ) {
        //...
    }

    override fun beforeTextChanged(
        text: CharSequence?,
        start: Int,
        count: Int,
        after: Int
    ) {
        //...
    }

    override fun onTextChanged(
        text: CharSequence?,
        start: Int,
        before: Int,
        count: Int
    ) {
        //...
    }
})
```


```
//7
object Point {
    var x = 0
    var y = 0
}

fun main() {
    println(Point.x) // 0
    Point.y = 10
    println(Point.y) // 10

    val p = Point
    p.x = 20
    println(Point.x) // 20
    println(Point.y) // 10
}
```


```
//8
data class User(val name: String)

interface UserProducer {
    fun produce(): User
}

object FakeUserProducer : UserProducer {
    override fun produce(): User = User("fake")
}

fun setUserProducer(producer: UserProducer) {
    println(producer.produce())
}

fun main() {
    setUserProducer(FakeUserProducer) // User(name=fake)
}
```


```
//9
// Kotlin
class User {
    object Producer {
        fun empty() = User()
    }
}

// Usage
val user: User = User.Producer.empty()
```


```
class User {
    companion object Producer {
        fun empty() = User()
    }
}

// Usage
val user: User = User.empty()
// or
val user: User = User.Producer.empty()
```


```
class User {
    companion object {
        fun empty() = User()
    }
}

// Usage
val user: User = User.empty()
// or
val user: User = User.Companion.empty()
```


```
//10
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode.HALF_EVEN

abstract class Money(
    val amount: BigDecimal,
    val currency: String
)

class USD(amount: BigDecimal) : Money(amount, "USD") {
    companion object {
        private val MATH = MathContext(2, HALF_EVEN)
        fun from(amount: Int): USD =
            USD(amount.toBigDecimal(MATH))
        fun from(amount: Double): USD =
            USD(amount.toBigDecimal(MATH))

        @Throws(NumberFormatException::class)
        fun from(amount: String): USD =
            USD(amount.toBigDecimal(MATH))
    }
}

class EUR(amount: BigDecimal) : Money(amount, "EUR") {
    companion object {
        private val MATH = MathContext(2, HALF_EVEN)
        fun from(amount: Int): EUR =
            EUR(amount.toBigDecimal(MATH))
        fun from(amount: Double): EUR =
            EUR(amount.toBigDecimal(MATH))

        @Throws(NumberFormatException::class)
        fun from(amount: String): EUR =
            EUR(amount.toBigDecimal(MATH))
    }
}

class PLN(amount: BigDecimal) : Money(amount, "PLN") {
    companion object {
        private val MATH = MathContext(2, HALF_EVEN)
        fun from(amount: Int): PLN =
            PLN(amount.toBigDecimal(MATH))
        fun from(amount: Double): PLN =
            PLN(amount.toBigDecimal(MATH))

        @Throws(NumberFormatException::class)
        fun from(amount: String): PLN =
            PLN(amount.toBigDecimal(MATH))
    }
}

fun main() {
    val eur: EUR = EUR.from("12.00")
    val pln: PLN = PLN.from(20)
    val usd: USD = USD.from(32.5)
}
```


```
//11
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
```


```
// Using companion object inheritance for logging
// from the Kotlin Logging framework
class FooWithLogging {
    fun bar(item: Item) {
        logger.info { "Item $item" }
        // Logger comes from the companion object
    }

    companion object : KLogging()
    // companion inherits logger property
}
```


```
// Android-specific example of using an abstract factory 
// for companion object
class MainActivity : Activity() {
    //...

    // Using companion object as a factory
    companion object : ActivityFactory() {
        override fun getIntent(context: Context): Intent =
            Intent(context, MainActivity::class.java)
    }
}

abstract class ActivityFactory {
    abstract fun getIntent(context: Context): Intent

    fun start(context: Context) {
        val intent = getIntent(context)
        context.startActivity(intent)
    }

    fun startForResult(activity: Activity, requestCode: Int) {
        val intent = getIntent(activity)
        activity.startActivityForResult(intent, requestCode)
    }
}

// Usage of all the members of the companion ActivityFactory
val intent = MainActivity.getIntent(context)
MainActivity.start(context)
MainActivity.startForResult(activity, requestCode)

// In contexts on Kotlin Coroutines, companion objects are
// used as keys to identify contexts
data class CoroutineName(
    val name: String
) : AbstractCoroutineContextElement(CoroutineName) {

    // Companion object is a key
    companion object Key : CoroutineContext.Key<CoroutineName>

    override fun toString(): String = "CoroutineName($name)"
}

// Finding a context by key
val name1 = context[CoroutineName] // Yes, this is a companion

// You can also refer to companion objects by its name
val name2 = context[CoroutineName.Key]
```


```
//12
data object ABC

fun main() {
    println(ABC) // ABC
}
```


```
//13
class Product(
    val code: String,
    val price: Double,
) {
    init {
        require(price > MIN_AMOUNT)
    }

    companion object {
        val MIN_AMOUNT = 5.00
    }
}
```


```
//14
class Product(
    val code: String,
    val price: Double,
) {
    init {
        require(price > MIN_AMOUNT)
    }

    companion object {
        const val MIN_AMOUNT = 5.00
    }
}
```


```
private const val OUTDATED_API: String =
    "This is a part of an outdated API."

@Deprecated(OUTDATED_API)
fun foo() {
    ...
}

@Deprecated(OUTDATED_API)
fun boo() {
    ...
}
```