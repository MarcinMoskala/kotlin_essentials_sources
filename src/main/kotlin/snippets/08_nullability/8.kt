package f_08_nullability.s_8

lateinit var text: String

fun main() {
    println(text) // RUNTIME ERROR!
    // lateinit property text has not been initialized
}
