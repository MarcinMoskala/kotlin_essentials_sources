package f_18_collections.s_23

fun main() {
    val mutable = mutableSetOf("A", "B")
    mutable.add("C")
    println(mutable) // [A, B, C]
    mutable.addAll(listOf("D", "E"))
    println(mutable) // [A, B, C, D, E]
    mutable.remove("B")
    println(mutable) // [A, C, D, E]
}
