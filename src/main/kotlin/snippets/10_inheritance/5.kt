package f_10_inheritance.s_5

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
