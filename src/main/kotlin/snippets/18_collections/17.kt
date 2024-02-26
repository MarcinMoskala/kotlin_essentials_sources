package f_18_collections.s_17

fun main() {
    val mutable = mutableListOf("A", "B", "C")
    mutable[1] = "X"
    println(mutable) // [A, X, C]
    mutable.set(1, "Y")
    println(mutable) // [A, Y, C]
}
