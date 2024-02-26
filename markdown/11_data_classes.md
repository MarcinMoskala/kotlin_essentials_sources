```
// Any formal definition
open class Any {
   open operator fun equals(other: Any?): Boolean
   open fun hashCode(): Int
   open fun toString(): String
}

class A // Implicitly inherits from Any

fun main() {
   val a = A()
   a.equals(a)
   a == a
   a.hashCode()
   a.toString()
   println(a)
}
```


```
//1
class A

fun main() {
   val a1 = A()
   val a2 = A()

   println(a1.equals(a1)) // true
   println(a1.equals(a2)) // false
   // or
   println(a1 == a1) // true
   println(a1 == a2) // false

   println(a1.hashCode()) // Example: 149928006
   println(a2.hashCode()) // Example: 713338599

   println(a1.toString()) // Example: A@8efb846
   println(a2.toString()) // Example: A@2a84aee7
   // or
   println(a1) // Example: A@8efb846
   println(a2) // Example: A@2a84aee7
}
```


```
//2
class A {
   override fun equals(other: Any?): Boolean = other is A

   override fun hashCode(): Int = 123

   override fun toString(): String = "A()"
}

fun main() {
   val a1 = A()
   val a2 = A()

   println(a1.equals(a1)) // true
   println(a1.equals(a2)) // true
   // or
   println(a1 == a1) // true
   println(a1 == a2) // true

   println(a1.hashCode()) // 123
   println(a2.hashCode()) // 123

   println(a1.toString()) // A()
   println(a2.toString()) // A()
   // or
   println(a1) // A()
   println(a2) // A()
}
```


```
data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

val player = Player(0, "Gecko", 9999)
```


```
//3
class FakeUserRepository

fun main() {
   val repository1 = FakeUserRepository()
   val repository2 = FakeUserRepository()
   println(repository1) // e.g. FakeUserRepository@8efb846
   println(repository1) // e.g. FakeUserRepository@8efb846
   println(repository2) // e.g. FakeUserRepository@2a84aee7
}
```


```
//4
data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val player = Player(0, "Gecko", 9999)
   println(player) 
   // Player(id=0, name=Gecko, points=9999)
   println("Player: $player")
   // Player: Player(id=0, name=Gecko, points=9999)
}
```


```
//5
class FakeUserRepository

fun main() {
   val repository1 = FakeUserRepository()
   val repository2 = FakeUserRepository()
   println(repository1 == repository1) // true
   println(repository1 == repository2) // false
}
```


```
//6
data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val player = Player(0, "Gecko", 9999)
   println(player == Player(0, "Gecko", 9999)) // true
   println(player == Player(0, "Ross", 9999)) // false
}
```


```
override fun equals(other: Any?): Boolean = other is Player &&
   other.id == this.id &&
   other.name == this.name &&
   other.points == this.points
```


```
//7
data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   println(Player(0, "Gecko", 9999).hashCode()) // 2129010918
   println(Player(0, "Gecko", 9999).hashCode()) // 2129010918
   println(Player(0, "Ross", 9999).hashCode())  // 79159602
}
```


```
// This is how copy generated by data modifier
// for Person class looks like under the hood
fun copy(
   id: Int = this.id,
   name: String = this.name,
   points: Int = this.points
) = Player(id, name, points)
```


```
//8
data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val p = Player(0, "Gecko", 9999)

   println(p.copy()) // Player(id=0, name=Gecko, points=9999)

   println(p.copy(id = 1, name = "New name"))
   // Player(id=1, name=New name, points=9999)

   println(p.copy(points = p.points + 1))
   // Player(id=0, name=Gecko, points=10000)
}
```


```
//9
data class StudentGrades(
   val studentId: String,
   // Code smell: Avoid using mutable objects in data classes
   val grades: MutableList<Int>
)

fun main() {
   val grades1 = StudentGrades("1", mutableListOf())
   val grades2 = grades1.copy(studentId = "2")
   println(grades1) // Grades(studentId=1, grades=[])
   println(grades2) // Grades(studentId=2, grades=[])
   grades1.grades.add(5)
   println(grades1) // Grades(studentId=1, grades=[5])
   println(grades2) // Grades(studentId=2, grades=[5])
   grades2.grades.add(1)
   println(grades1) // Grades(studentId=1, grades=[5, 1])
   println(grades2) // Grades(studentId=2, grades=[5, 1])
}
```


```
//10
data class StudentGrades(
   val studentId: String,
   val grades: List<Int>
)

fun main() {
   var grades1 = StudentGrades("1", listOf())
   var grades2 = grades1.copy(studentId = "2")
   println(grades1) // Grades(studentId=1, grades=[])
   println(grades2) // Grades(studentId=2, grades=[])
   grades1 = grades1.copy(grades = grades1.grades + 5)
   println(grades1) // Grades(studentId=1, grades=[5])
   println(grades2) // Grades(studentId=2, grades=[])
   grades2 = grades2.copy(grades = grades2.grades + 1)
   println(grades1) // Grades(studentId=1, grades=[5])
   println(grades2) // Grades(studentId=2, grades=[1])
}
```


```
data class User(
   val name: String,
   val surname: String,
) {
   init {
       require(name.isNotBlank())
       // throws exception if name is blank
       require(surname.isNotBlank())
       // throws exception if surname is blank
   }
}
```


```
//11
data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val player = Player(0, "Gecko", 9999)
   val (id, name, pts) = player
   println(id) // 0
   println(name) // Gecko
   println(pts) // 9999
}
```


```
val (id, name, pts) = player
// is compiled to
val id: Int = player.component1()
val name: String = player.component2()
val pts: Int = player.component3()
```


```
//12
fun main() {
   val visited = listOf("Spain", "Morocco", "India")
   val (first, second, third) = visited
   println("$first $second $third")
   // Spain Morocco India

   val trip = mapOf(
       "Spain" to "Gran Canaria",
       "Morocco" to "Taghazout",
       "India" to "Rishikesh"
   )
   for ((country, city) in trip) {
       println("We loved $city in $country")
       // We loved Gran Canaria in Spain
       // We loved Taghazout in Morocco
       // We loved Rishikesh in India
   }
}
```


```
data class FullName(
   val firstName: String,
   val secondName: String,
   val lastName: String
)

val elon = FullName("Elon", "Reeve", "Musk")
val (name, surname) = elon
print("It is $name $surname!") // It is Elon Reeve!
```


```
//13
data class User(
   val name: String,
   val surname: String,
)

fun main() {
   val users = listOf(
       User("Nicola", "Corti")
   )
   users.forEach { u -> println(u) }
   // User(name=Nicola, surname=Corti)
   users.forEach { (u) -> println(u) }
   // Nicola
}
```


```
//14
data class Dog(
   val name: String,
) {
   // Bad practice, avoid mutable properties in data classes
   var trained = false
}

fun main() {
   val d1 = Dog("Cookie")
   d1.trained = true
   println(d1) // Dog(name=Cookie)
   // so nothing about trained property

   val d2 = d1.copy()
   println(d1.trained) // true
   println(d2.trained) // false
   // so trained value not copied
}
```


```
//15
data class FullName(
   val name: String,
   val surname: String,
) {
   val fullName = "$name $surname"
}

fun main() {
   val d1 = FullName("Cookie", "Moskała")
   println(d1.fullName) // Cookie Moskała
   println(d1) // FullName(name=Cookie, surname=Moskała)

   val d2 = d1.copy()
   println(d2.fullName) // Cookie Moskała
   println(d2) // FullName(name=Cookie, surname=Moskała)
}
```


```
data class Pair<out A, out B>(
   val first: A,
   val second: B
) : Serializable {

   override fun toString(): String =
       "($first, $second)"
}

data class Triple<out A, out B, out C>(
   val first: A,
   val second: B,
   val third: C
) : Serializable {

   override fun toString(): String =
       "($first, $second, $third)"
}
```


```
infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
```


```
//16
fun main() {
   val p1: Pair<String, Int> = "ABC" to 123
   println(p1) // (ABC, 123)
   val p2 = 'A' to 3.14 
   // the type of p2 is Pair<Char, Double>
   println(p2) // (A, 123)
   val p3 = true to false
   // the type of p3 is Pair<Boolean, Boolean>
   println(p3) // (true, false)
}
```


```
val (description, color) = when {
   degrees < 5 -> "cold" to Color.BLUE
   degrees < 23 -> "mild" to Color.YELLOW
   else -> "hot" to Color.RED
}
```


```
val (odd, even) = numbers.partition { it % 2 == 1 }
val map = mapOf(1 to "San Francisco", 2 to "Amsterdam")
```


```
//17
fun String.parseName(): Pair<String, String>? {
   val indexOfLastSpace = this.trim().lastIndexOf(' ')
   if (indexOfLastSpace < 0) return null
   val firstName = this.take(indexOfLastSpace)
   val lastName = this.drop(indexOfLastSpace)
   return Pair(firstName, lastName)
}

// Usage
fun main() {
  val fullName = "Marcin Moskała"
  val (firstName, lastName) = fullName.parseName() ?: return
}
```


```
val fullName = "Marcin Moskała"
val (lastName, firstName) = fullName.parseName() ?: return
print("His name is $firstName") // His name is Moskała
```


```
//18
data class FullName(
   val firstName: String,
   val lastName: String
)

fun String.parseName(): FullName? {
   val indexOfLastSpace = this.trim().lastIndexOf(' ')
   if (indexOfLastSpace < 0) return null
   val firstName = this.take(indexOfLastSpace)
   val lastName = this.drop(indexOfLastSpace)
   return FullName(firstName, lastName)
}

// Usage
fun main() {
  val fullName = "Marcin Moskała"
  val (firstName, lastName) = fullName.parseName() ?: return
  print("His name is $firstName $lastName") 
  // His name is Marcin Moskała
}
```