package f_18_collections.s_13

fun main() {
    val list = listOf("A", "B")
    println(list[1]) // B
    println(list.get(1)) // B
    println(list[3]) // Runtime error
}
