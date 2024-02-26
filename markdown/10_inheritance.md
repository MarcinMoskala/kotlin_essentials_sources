```
//1
open class Mammal {
    val haveHairOrFur = true
    val warmBlooded = true
    var canFeed = false

    fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        }
    }
}

class Dog : Mammal() {
    fun makeVoice() {
        println("Bark bark")
    }
}

fun main() {
    val dog = Dog()
    dog.makeVoice() // Bark bark
    println(dog.haveHairOrFur) // true
    println(dog.warmBlooded) // true
    // Dog is Mammal, so we can up-cast it
    val mammal: Mammal = dog
    mammal.canFeed = true
    mammal.feedYoung() // Feeding young with milk
}
```


```
//2
open class Mammal {
    val haveHairOrFur = true
    val warmBlooded = true
    var canFeed = false

    open fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        }
    }
}

class Cat : Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        } else {
            println("Feeding young with milk from bottle")
        }
    }
}

fun main() {
    val dog = Mammal()
    dog.feedYoung() // Nothing printed
    val cat = Cat()
    cat.feedYoung() // Feeding young with milk from bottle
    cat.canFeed = true
    cat.feedYoung() // Feeding young with milk
}
```


```
open class Animal(val name: String)

class Dodo : Animal("Dodo")
```


```
//3
open class Animal(val name: String)

class Dog(name: String) : Animal(name)

class Cat(name: String) : Animal("Mr $name")

class Human(
   firstName: String,
   lastName: String,
) : Animal("$firstName $lastName")

fun main() {
   val dog = Dog("Cookie")
   println(dog.name) // Cookie
   val cat = Cat("MiauMiau")
   println(cat.name) // Mr MiauMiau
}
```


```
//4
open class Dog {
    open fun seeFriend() {
        println("Wave its tail")
    }
}

class BorderCollie : Dog() {
    override fun seeFriend() {
        println("Lie down")
        super.seeFriend()
    }
}

fun main() {
    val dog = Dog()
    dog.seeFriend() // Wave its tail
    val borderCollie = BorderCollie()
    borderCollie.seeFriend()
    // Lie down
    // Wave its tail
}
```


```
abstract class Mammal {
   val haveHairOrFur = true
   val warmBlooded = true
   var canFeed = false

   fun feedYoung() {
       if (canFeed) {
           println("Feeding young with milk")
       }
   }
}
```


```
//5
abstract class Mammal {
    val haveHairOrFur = true
    val warmBlooded = true
    var canFeed = false

    abstract fun feedYoung()
}

class Dog : Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        }
    }
}

class Human : Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        } else {
            println("Feeding young with milk from bottle")
        }
    }
}

fun feedYoung(mammal: Mammal) {
    // We can do that, because feedYoung is an abstract
    // function in Mammal
    mammal.feedYoung()
}

fun main() {
    val dog = Dog()
    dog.canFeed = true
    feedYoung(dog) // Feeding young with milk
    feedYoung(Human()) // Feeding young with milk from bottle
}
```


```
abstract class CoffeeMachine {
    abstract fun prepareEspresso()
    abstract fun addMilk()

    fun prepareLatte() {
        prepareEspresso()
        addMilk()
    }
    fun prepareDoppio() {
        prepareEspresso()
        prepareEspresso()
    }
}
```


```
interface CoffeeMaker {
    val type: String
    fun makeCoffee(size: Size): Coffee
}
```


```
//6
class User(val id: Int, val name: String)

interface UserRepository {
    fun findUser(id: Int): User?
    fun addUser(user: User)
}

class FakeUserRepository : UserRepository {
    private var users = mapOf<Int, User>()

    override fun findUser(id: Int): User? = users[id]

    override fun addUser(user: User) {
        users += user.id to user
    }
}

fun main() {
    val repo: UserRepository = FakeUserRepository()
    repo.addUser(User(123, "Zed"))
    val user = repo.findUser(123)
    println(user?.name) // Zed
}
```


```
interface Named {
    val name: String
    val fullName: String
}

class User(
    override val name: String,
    val surname: String,
) : Named {
    override val fullName: String
        get() = "$name $surname"
}
```


```
interface Named {
    val name: String
}

class NameBox : Named {
    override var name = "(default)"
}
```


```
interface Drinkable {
    fun drink()
}

interface Spillable {
    fun spill()
}

class Mug : Drinkable, Spillable {
    override fun drink() {
        println("Ummm")
    }
    override fun spill() {
        println("Ow, ow, OWWW")
    }
}
```


```
//7
class User(val id: Int, val name: String)

interface UserRepository {
    fun findUser(id: Int): User? =
        getUsers().find { it.id == id }

    fun getUsers(): List<User>
}

class FakeUserRepository : UserRepository {
    private var users = listOf<User>()

    override fun getUsers(): List<User> = users

    fun addUser(user: User) {
        users += user
    }
}

fun main() {
    val repo = FakeUserRepository()
    repo.addUser(User(123, "Zed"))
    val user = repo.findUser(123)
    println(user?.name) // Zed
}
```


```
//8
interface NicePerson {
   fun cheer() {
       println("Hello")
   }
}

class Alex : NicePerson

class Ben : NicePerson {
   override fun cheer() {
       super.cheer()
       println("My name is Ben")
   }
}

fun main() {
   val alex = Alex()
   alex.cheer() // Hello
  
   val ben = Ben()
   ben.cheer()
   // Hello
   // My name is Ben
}
```


```
//9
interface Boat {
   fun start() {
       println("Ready to swim")
   }
}

interface Car {
   fun start() {
       println("Ready to drive")
   }
}

class Amphibian: Car, Boat {
   override fun start() {
       super<Car>.start()
       super<Boat>.start()
   }
}

fun main() {
   val vehicle = Amphibian()
   vehicle.start()
   // Ready to drive
   // Ready to swim
}
```


```
// File1.kt
open class A {
   public val a = 10
   public fun b() {
       println(a) // Can use it
   }
}

public val c = 20
public fun d() {}

class B: A() {
   fun e() {
       println(a) // Can use it
       println(b()) // Can use it
   }
}

fun main() {
   println(A().a) // Can use it
   println(A().b()) // Can use it
   println(c) // Can use it
   println(d()) // Can use it
}

// File2.kt in the same or different module as File1.kt
fun main() {
   println(A().a) // Can use it
   println(A().b()) // Can use it
   println(c) // Can use it
   println(d()) // Can use it
}
```


```
// File1.kt
open class A {
    private val a = 10
    private fun b() {
        println(a) // Can use it
    }
}

private val c = 20
private fun d() {}

class B : A() {
    fun e() {
        println(a) // Error, cannot use a!
        println(b()) // Error, cannot use b!
    }
}

fun main() {
    println(A().a) // Error, cannot use a!
    println(A().b()) // Error, cannot use b!
    println(c) // Can use it
    println(d()) // Can use it
}

// File2.kt in the same or different module as File1.kt
fun main() {
    println(A().a) // Error, cannot use a!
    println(A().b()) // Error, cannot use b!
    println(c) // Error, cannot use c!
    println(d()) // Error, cannot use d!
}
```


```
// File1.kt
open class A {
   protected val a = 10
   protected fun b() {
       println(a) // Can use it
   }
}

open class B: A() {
   fun e() {
       println(a) // Can use it!
       println(b()) // Can use it!
   }
}

class C: A() {
   fun f() {
       println(a) // Can use it!
       println(b()) // Can use it!
   }
}

fun main() {
   println(A().a) // Error, cannot use a!
   println(A().b()) // Error, cannot use b!
}

// File2.kt in the same or different module as File1.kt
fun main() {
   println(A().a) // Error, cannot use a!
   println(A().b()) // Error, cannot use b!
}
```


```
// File1.kt
open class A {
   internal val a = 10
   internal fun b() {
       println(a) // Can use it
   }
}

internal val c = 20
internal fun d() {}

class B: A() {
   fun e() {
       println(a) // Can use it
       println(b()) // Can use it
   }
}

fun main() {
   println(A().a) // Can use it
   println(A().b()) // Can use it
   println(c) // Can use it
   println(d()) // Can use it
}

// File2.kt in the same module as File1.kt
fun main() {
   println(A().a) // Can use it
   println(A().b()) // Can use it
   println(c) // Can use it
   println(d()) // Can use it
}

// File3.kt in a different module than File1.kt
fun main() {
   println(A().a) // Error, cannot use a!
   println(A().b()) // Error, cannot use b!
   println(c) // Error, cannot use c!
   println(d()) // Error, cannot use d!
}
```


```
class View {
   var isVisible: Boolean = true
       private set

   fun hide() {
       isVisible = false
   }
}

fun main() {
   val view = View()
   println(view.isVisible) // true
   view.hide()
   println(view.isVisible) // false
   view.isVisible = true // ERROR
   // Cannot assign to 'isVisible',
   // the setter is private in 'View'
}
```


```
//10
fun consumeAnything(a: Any?) {
    println("Om nom $a")
}

fun main() {
    consumeAnything(null) // Om nom null
    consumeAnything(123) // Om nom 123
    consumeAnything("ABC") // Om nom ABC
}
```