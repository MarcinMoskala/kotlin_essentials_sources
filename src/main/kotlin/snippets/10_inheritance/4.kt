package f_10_inheritance.s_4

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
