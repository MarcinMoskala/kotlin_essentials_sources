package f_10_inheritance.s_7

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
