```
//1
// Simplest class definition
class A

fun main() {
    // Object creation from a class
    val a: A = A()
}
```


```
class A {
    // class body
}
```


```
//2
class A {
    fun printMe() {
        println(this)
    }
}

fun main() {
    val a = A()
    println(a) // A@ADDRESS
    a.printMe() // A@ADDRESS (the same address)
}
```


```
//3
// Kotlin code
class User {
    var name: String = ""
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "Alex" // setter call
    println(user.name) // getter call
}
```


```
// equivalent Java code
public final class User {
    @NotNull
    private String name = "";

    // getter
    @NotNull
    public final String getName() {
        return this.name;
    }

    // setter
    public final void setName(@NotNull String name) {
        this.name = name;
    }
}

public final class PlaygroundKt {
    public static void main(String[] var0) {
        User user = new User();
        user.setName("Alex"); // setter call
        System.out.println(user.getName()); // getter call
    }
}
```


```
class User {
    private var name: String = ""

    // DO NOT DO THAT! DEFINE PROPERTY GETTER INSTEAD
    fun getName() = name

    // DO NOT DO THAT! DEFINE PROPERTY SETTER INSTEAD
    fun setName(name: String) {
        this.name = name
    }
}
```


```
//4
class User {
    var name: String = ""
        get() = field.uppercase()
    // or
    // var name: String = ""
    //     get() {
    //         return field.uppercase()
    //     }
}

fun main() {
    val user = User()
    user.name = "norbert"
    println(user.name) // NORBERT
}
```


```
//5
class User {
    // DON'T DO THAT
    var name: String = ""
        // Using property name inside getter
        // leads to infinitive recursion
        get() = name.uppercase()
}

fun main() {
    val user = User()
    user.name = "norbert"
    println(user.name) // Error: java.lang.StackOverflowError
}
```


```
//6
class User {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val user = User()
    user.name = "norbert"
    user.name = ""
    user.name = "  "
    println(user.name) // NORBERT
}
```


```
//7
class User {
    var name: String = ""
    var surname: String = ""
    val fullName: String
        get() = "$name $surname"
}

fun main() {
    val user = User()
    user.name = "Maja"
    user.surname = "Moskała"
    println(user.fullName) // Maja Moskała
}
```


```
//8
class User(
    var name: String,
    var surname: String,
) {
    val fullName1: String
        get() = "$name $surname"
    val fullName2: String = "$name $surname"
}

fun main() {
    val user = User("Maja", "Markiewicz")
    println(user.fullName1) // Maja Markiewicz
    println(user.fullName2) // Maja Markiewicz
    user.surname = "Moskała"
    println(user.fullName1) // Maja Moskała
    println(user.fullName2) // Maja Markiewicz
}

```


```
//9
class Holder {
    val v1: Int get() = calculate("v1")
    val v2: Int = calculate("v2")

    private fun calculate(propertyName: String): Int {
        println("Calculating $propertyName")
        return 42
    }
}

fun main() {
    val h1 = Holder() // Calculating v2
    // h1 never used v1, so it was never calculated
    // it calculated v2 even though it was not used either
    val h2 = Holder() // Calculating v2
    println(h2.v1) // Calculating v1 and 42
    println(h2.v1) // Calculating v1 and 42
    println(h2.v2) // 42
    println(h2.v2) // 42
    // h2 used v1 two times, and it was calculated two times, it 
    // calculated v2 only once, even though it was used two times.
}
```


```
//10
import java.util.Date

class User {
    // ...
    var birthdate: Date? = null
}
```


```
class User {
    // ...
    var birthdateMillis: Long? = null

    var birthdate: Date?
        get() {
            val millis = birthdateMillis
            return if (millis == null) null else Date(millis)
        }
        set(value) {
            birthdateMillis = value?.time
        }
}
```


```
class A

val a = A()
```


```
//11
class User {
    var name: String = ""
    var surname: String = ""

    constructor(name: String, surname: String) {
        this.name = name
        this.surname = surname
    }
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
```


```
//12
class User constructor(name: String, surname: String) {
    var name: String = name
    var surname: String = surname
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
```


```
//13
class User(name: String, surname: String) {
    var name: String = name
    var surname: String = surname
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
```


```
//14
class User(name: String, surname: String) {
    var name: String = name
    var surname: String = surname

    // Secondary constructor
    constructor(user: User) : this(user.name, user.surname) {
        // optional body
    }
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp

    val user2 = User(user)
    println(user2.name) // Johnny
    println(user2.surname) // Depp
}
```


```
//15
class User(
    var name: String,
    var surname: String,
) {
    // optional body
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
```


```
//16
class User(
    var name: String = "",
    var surname: String = "Anonim",
)

fun main() {
    val user = User("Johnny")
    println(user.name) // Johnny
    println(user.surname) // Anonim
}
```


```
public final class User {
    @NotNull
    private final String name;
    @NotNull
    private final String surname;
    private final int age;

    public User(
        @NotNull String name,
        @NotNull String surname,
        int age
    ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
```


```
class User(
    val name: String,
    val surname: String,
    val age: Int?,
)
```


```
//17
class Puppy(val name: String) {

    class InnerPuppy {
        fun think() {
            // we have no access to name here
            println("Inner puppy is thinking")
        }
    }
}

fun main() {
    val innerPuppy = Puppy.InnerPuppy()
    // We create InnerPuppy on class, not object
    innerPuppy.think() // Inner puppy is thinking
}
```


```
//18
class Puppy(val name: String) {

    inner class InnerPuppy {
        fun think() {
            println("Inner $name is thinking")
        }
    }
}

fun main() {
    val puppy = Puppy("Cookie")
    val innerPuppy = puppy.InnerPuppy() // We need puppy
    innerPuppy.think() // Inner Cookie is thinking
}
```


```
// A class from Kotlin stdlib
class FileTreeWalk(
    ...
) : Sequence<File> {

    /** Returns an iterator walking through files. */
    override fun iterator(): Iterator<File> =
        FileTreeWalkIterator()

    private inner class FileTreeWalkIterator
        : AbstractIterator<File>() {
        ...
    }

    ...
}
```