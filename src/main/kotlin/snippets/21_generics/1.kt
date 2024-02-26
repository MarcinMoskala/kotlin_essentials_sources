package f_21_generics.s_1

fun <T> a() {}
fun <T1, T2> b() {}
fun <T> c(t: T) {}
fun <T1, T2> d(a: T1, b: T2) {}
fun <T> e(): T = TODO()

fun main() {
    // Type arguments specified explicitly
    a<Int>()
    a<String>()
    b<Double, Char>()
    b<Float, Long>()

    // Inferred type arguments
    c(10) // The inferred type of T is Int
    d("AAA", 10.0)
    // The inferred type of T1 is String, and of T2 is Double
    val e: Boolean = e() // The inferred type of T is Boolean
}
