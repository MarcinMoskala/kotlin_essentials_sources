package f_18_collections.s_14

fun main() {
    val list = listOf("A", "B")
    println(list.getOrNull(1)) // B
    println(list.getOrElse(1) { "X" }) // B

    println(list.getOrNull(3)) // null
    println(list.getOrElse(3) { "X" }) // X
}
