package f_10_inheritance.s_16

fun consumeAnything(a: Any?) {
    println("Om nom $a")
}

fun main() {
    consumeAnything(null) // Om nom null
    consumeAnything(123) // Om nom 123
    consumeAnything("ABC") // Om nom ABC
}
