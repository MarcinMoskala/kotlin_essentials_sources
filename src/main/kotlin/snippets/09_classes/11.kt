package f_09_classes.s_11

class Holder {
    val v1: Int get() = calculate("v1")
    val v2: Int = calculate("v2")

    private fun calculate(propertyName: String): Int {
        println("Calculating $propertyName")
        return 42
    }
}

fun main() {
    val h1 = Holder() // Calculating v2
    // h1 never used v1, so it was never calculated
    // it calculated v2 even though it was not used either
    val h2 = Holder() // Calculating v2
    println(h2.v1) // Calculating v1 and 42
    println(h2.v1) // Calculating v1 and 42
    println(h2.v2) // 42
    println(h2.v2) // 42
    // h2 used v1 two times, and it was calculated two times, it 
    // calculated v2 only once, even though it was used two times.
}
