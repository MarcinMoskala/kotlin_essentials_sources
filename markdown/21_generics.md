```
fun <T> a() {} // T is type parameter
a<Int>() // Int is used here as a type argument
a<String>() // String is used here as a type argument
```


```
fun <T> a() {}
fun <T1, T2> b() {}
```


```
//1
fun <T> a() {}
fun <T1, T2> b() {}
fun <T> c(t: T) {}
fun <T1, T2> d(a: T1, b: T2) {}
fun <T> e(): T = TODO()

fun main() {
    // Type arguments specified explicitly
    a<Int>()
    a<String>()
    b<Double, Char>()
    b<Float, Long>()

    // Inferred type arguments
    c(10) // The inferred type of T is Int
    d("AAA", 10.0)
    // The inferred type of T1 is String, and of T2 is Double
    val e: Boolean = e() // The inferred type of T is Boolean
}
```


```
//2
import kotlin.random.Random

// The result type is the same as the argument type
fun <T> id(value: T): T = value

// The result type is the closest supertype of arguments
fun <T> randomOf(a: T, b: T): T =
    if (Random.nextBoolean()) a else b

fun main() {
    val a = id(10) // Inferred a type is Int
    val b = id("AAA") // Inferred b type is String
    val c = randomOf("A", "B") // Inferred c type is String
    val d = randomOf(1, 1.5) // Inferred d type is Number
}
```


```
//3
class ValueWithHistory<T>(
    private var value: T
) {
    private var history: List<T> = listOf(value)

    fun setValue(value: T) {
        this.value = value
        this.history += value
    }

    fun currentValue(): T = value

    fun history(): List<T> = history
}

fun main() {
    val letter = ValueWithHistory<String>("A")
    // The type of letter is ValueWithHistory<String>
    letter.setValue("B")
    // letter.setValue(123) <- this would not compile
    val l = letter.currentValue() // the type of l is String
    println(l) // B
    val h = letter.history() // the type of h is List<String>
    println(h) // [A, B]
}
```


```
val letter = ValueWithHistory("A")
// The type of letter is ValueWithHistory<String>
```


```
val letter: ValueWithHistory<Any> = ValueWithHistory("A")
// The type of letter is ValueWithHistory<Any>
```


```
//4
fun main() {
    val letters = ArrayList<String>()
    letters.add("A") // the argument must be of type String
    letters.add("B") // the argument must be of type String
    // The type of letters is List<String>
    val a = letters[0] // the type of a is String
    println(a) // A
    for (l in letters) { // the type of l is String
        println(l) // first A, then B
    }
}
```


```
fun main() {
    val letter = ValueWithHistory<String?>(null)
    letter.setValue("A")
    letter.setValue(null)
    val l = letter.currentValue() // the type of l is String?
    println(l) // null
    val h = letter.history() // the type of h is List<String?>
    println(h) // [null, A, null]

    val letters = ArrayList<String?>()
    letters.add("A")
    letters.add(null)
    println(letters) // [A, null]
    val l2 = letters[1] // the type of l2 is String?
    println(l2) // null
}
```


```
class Box<T> {
    var value: T? = null

    fun getOrThrow(): T = value!!
}
```


```
fun <T> T.orThrow(): T & Any = this ?: throw Error()

fun main() {
    val a: Int? = if (Random.nextBoolean()) 42 else null
    val b: Int = a.orThrow()
    val c: Int = b.orThrow()
    println(b)
}
```


```
interface List<out E> : Collection<E> {
    override val size: Int
    override fun isEmpty(): Boolean
    override fun contains(element: @UnsafeVariance E): Boolean
    override fun iterator(): Iterator<E>
    override fun containsAll(
        elements: Collection<@UnsafeVariance E>
    ): Boolean
    operator fun get(index: Int): E
    fun indexOf(element: @UnsafeVariance E): Int
    fun lastIndexOf(element: @UnsafeVariance E): Int
    fun listIterator(): ListIterator<E>
    fun listIterator(index: Int): ListIterator<E>
    fun subList(fromIndex: Int, toIndex: Int): List<E>
}
```


```
//5
interface Consumer<T> {
    fun consume(value: T)
}
class DogFood

class Dog : Consumer<DogFood> {
    override fun consume(value: DogFood) {
        println("Mlask mlask")
    }
}

fun main() {
    val dog: Dog = Dog()
    val consumer: Consumer<DogFood> = dog
}
```


```
//6
open class C<T>
interface I<T>
class A : C<Int>(), I<String>

fun main() {
    val a = A()
    val c: C<Int> = a
    val i: I<String> = a
}
```


```
class MessageListAdapter(
    context: Context,
    val values: List<ClaimMessage>
) : ArrayAdapter<String>(
    context,
    R.layout.row_messages,
    values.map { it.title }.toTypedArray()
) {
    fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        // ...
    }
}
```


```
//7
open class C<T>
interface I<T>
class A<T> : C<T>(), I<T>

fun main() {
    val a: A<Int> = A<Int>()
    val c1: C<Int> = a
    val i1: I<Int> = a

    val a1: A<String> = A<String>()
    val c2: C<String> = a1
    val i2: I<String> = a1
}
```


```
interface Iterable<out T> {
    // ...
}
interface MutableIterable<out T> : Iterable<T> {
    // ...
}
interface Collection<out E> : Iterable<E> {
    /// ...
}
interface MutableCollection<E> : Collection<E>,MutableIterable<E>{
    // ...
}
interface List<out E> : Collection<E> {
    // ...
}
interface MutableList<E> : List<E>, MutableCollection<E> {
    // ...
}
```


```
//8
open class C<T>
interface I<T>
class A<T> : C<Int>(), I<String>

fun main() {
    val a1: A<Double> = A<Double>()
    val c1: C<Int> = a1
    val i1: I<String> = a1
}
```


```
import kotlin.reflect.typeOf

fun <T> example(a: Any) {
    val check = a is T // ERROR
    val ref = T::class // ERROR
    val type = typeOf<T>() // ERROR
}
```


```
//9
import kotlin.reflect.typeOf

inline fun <reified T> example(a: Any) {
    val check = a is T
    val ref = T::class
    val type = typeOf<T>()
}
```


```
import java.math.BigDecimal

fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a >= b) a else b
}

fun main() {
    val m = maxOf(BigDecimal("10.00"), BigDecimal("11.00"))
    println(m) // 11.00

    class A
    maxOf(A(), A()) // Compilation error, 
    // A is not Comparable<A>
}
```


```
class ListAdapter<T : ItemAdaper>(/*...*/) { /*...*/ }
```


```
interface Animal {
    fun feed()
}
interface GoodTempered {
    fun pet()
}

fun <T> pet(animal: T) where T : Animal, T : GoodTempered {
    animal.pet()
    animal.feed()
}

class Cookie : Animal, GoodTempered {
    override fun pet() {
        // ...
    }
    override fun feed() {
        // ...
    }
}
class Cujo : Animal {
    override fun feed() {
        // ...
    }
}

fun main() {
    pet(Cookie()) // OK
    pet(Cujo()) //COMPILATION ERROR, Cujo is not GoodTempered
}
```


```
fun main() {
    val list = listOf("A", "B")
    println(list is List<*>) // true
    println(list is List<Int>) // Compilation error
}
```


```
fun printSize(list: List<*>) {
    println(list.size)
}

fun printList(list: List<*>) {
    for (e in list) { // the type of e is Any?
        println(e)
    }
}
```


```
fun main() {
    val l1: MutableList<Any?> = mutableListOf("A")
    val r1 = l1.first() // the type of r1 is Any?
    l1.add("B") // the expected argument type is Any?

    val l2: MutableList<*> = mutableListOf("A")
    val r2 = l2.first() // the type of r2 is Any?
    l2.add("B") // ERROR,
    // the expected argument type is Nothing,
    // so there is no value that might be used as an argument
}
```