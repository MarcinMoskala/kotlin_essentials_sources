```
fun processPerson(person: Person?) {
    val name = person?.name ?: "unknown"

    val surname = person?.surname ?: return

    val age = person?.age ?: throw Error("Person must have age")

    // ...
}
```


```
fun Iterable<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}

@OptIn(ExperimentalContracts::class)
inline fun CharSequence?.isNullOrBlank(): Boolean {
    // (skipped contract definition)
    return this == null || this.isBlank()
}
```


```
//1
open class Animal
class Dog : Animal()
```


```
fun petAnimal(animal: Animal) {}
fun petDog(dog: Dog) {}

fun main() {
    val dog: Dog = Dog()
    val dogAnimal: Animal = dog // works
    petAnimal(dog) // works
    val animal: Animal = Animal()
    val animalDog: Dog = animal // compilation error
    petDog(animal) // compilation error
}
```


```
fun petDogIfPresent(dog: Dog?) {}
fun petDog(dog: Dog) {}

fun main() {
    val dog: Dog = Dog()
    val dogNullable: Dog? = dog
    petDogIfPresent(dog) // works
    petDogIfPresent(dogNullable) // works
    petDog(dog) // works
    petDog(dogNullable) // compilation error
}
```


```
fun <T : Any> String.parseJson(): T = ...
```


```
//2
object Unit {
    override fun toString() = "kotlin.Unit"
}
```


```
fun runForever(): Nothing {
    while (true) {
        // no-op
    }
}

fun endProgram(): Nothing {
    exitProcess(0)
}

fun fail(): Nothing {
    throw Error("Some error")
}
```


```
//3
inline fun TODO(): Nothing = throw NotImplementedError()

inline fun error(message: Any): Nothing =
    throw IllegalStateException(message.toString())
```


```
//4
fun fib(n: Int): Int = TODO()
```


```
fun get(): T = when {
    left != null -> left
    right != null -> right
    else -> error("Must have either left or right")
}
```


```
// the inferred type of answer is Int
val answer = if (timeHasPassed) 42 else TODO()
```


```
fun processPerson(person: Person?) {
    // the inferred type of name is String
    val name = person?.name ?: fail()
    // the inferred type of fullName is String
    val fullName = when {
        !person.middleName.isNullOrBlank() ->
            "$name ${person.middleName} ${person.surname}"
        !person.surname.isNullOrBlank() ->
            "$name ${person.surname}"
        else ->
            error("Person must have a surname")
    }
    // ...
}
```


```
//5
fun main() {
    val a = return
    val b = throw Error()
}
```


```
//6
fun main() {
    val a: Nothing = return
    val b: Nothing = throw Error()
}
```


```
fun processPerson(person: Person?) {
    val name = person?.name ?: return
    val fullName = when {
        !person.middleName.isNullOrBlank() ->
            "$name ${person.middleName} ${person.surname}"
        !person.surname.isNullOrBlank() ->
            "$name ${person.surname}"
        else -> return
    }
    // ...
}
```


```
fun processPerson(person: Person?) {
    val name = person?.name ?: throw Error("Name is required")
    val fullName = when {
        !person.middleName.isNullOrBlank() ->
            "$name ${person.middleName} ${person.surname}"
        !person.surname.isNullOrBlank() ->
            "$name ${person.surname}"
        else -> throw Error("Surname is required")
    }
    // ...
}
```


```
//7
fun fizzBuzz(): String {
    TODO()
}
```


```
public interface SharedFlow<out T> : Flow<T> {
    public val replayCache: List<T>
    override suspend fun collect(
        collector: FlowCollector<T>
    ): Nothing
}
```


```
//8
fun main() {
    val n = null
    val i: Int? = n
    val d: Double? = n
    val str: String? = n
}
```


```
val a = if (predicate) "A" else null

val b = when {
    predicate2 -> "B"
    predicate3 -> "C"
    else -> null
}
```