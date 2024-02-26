package f_18_collections.s_4

fun main() {
    val mutable = mutableListOf("A", "B")
    mutable.add("C")
    mutable.remove("A")
    println(mutable) // [B, C]
}
