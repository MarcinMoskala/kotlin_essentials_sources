package f_18_collections.s_12

fun main() {
    val list = listOf("A", "B", "C")
    println(list.size == 0) // false
    println(list.isEmpty()) // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
}
