package f_10_inheritance.s_2

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
