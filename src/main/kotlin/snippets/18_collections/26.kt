package f_18_collections.s_26

// by default, each object from a regular class is unique
class Cat(val name: String)

// if the data modifier is used,
// two instances with the same properties are equal
data class Dog(val name: String)

fun main() {
    val cat1 = Cat("Garfield")
    val cat2 = Cat("Garfield")
    println(cat1 == cat2) // false
    println(setOf(cat1, cat2)) // [Cat@4eec7777, Cat@3b07d329]

    val dog1 = Dog("Rex")
    val dog2 = Dog("Rex")
    println(dog1 == dog2) // true
    println(setOf(dog1, dog2)) // [Dog(name=Rex)]
}
