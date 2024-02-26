package f_18_collections.s_9

fun main() {
    var list = listOf("A", "B")
    list += "C"
    println(list) // [A, B, C]

    val mutable = mutableListOf("A", "B")
    mutable += "C"
    println(mutable) // [A, B, C]
}
