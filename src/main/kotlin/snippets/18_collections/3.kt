package f_18_collections.s_3

fun main() {
    var list = listOf("A", "B")
    list = list + "C"
    println(list) // [A, B, C]
    list = list + listOf("D", "E")
    println(list) // [A, B, C, D, E]
    list = listOf("Z") + list
    println(list)  // [Z, A, B, C, D, E]
}
