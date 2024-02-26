package f_18_collections.s_26

fun main() {
    val set = setOf("A", "B", "C")
    println(set + "D") // [A, B, C, D]
    println(set + "B") // [A, B, C]

    val mutable = mutableSetOf("A", "B", "C")
    mutable.add("D")
    mutable.add("B")
    println(mutable) // [A, B, C, D]
}
