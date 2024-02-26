package f_09_classes.s_3

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
