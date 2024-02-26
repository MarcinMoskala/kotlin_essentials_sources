package f_10_inheritance.s_1

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
