package f_18_collections.s_9

fun main() {
    var list = listOf("A", "B")
    list = list + "C"
    println(list) // [A, B, C]
    list = list + listOf("D", "E")
    println(list) // [A, B, C, D, E]
    list = listOf("Z") + list
    println(list) // [Z, A, B, C, D, E]
    list = list - "A"
    println(list) // [Z, B, C, D, E]

    val mutable = mutableListOf("A", "B")
    mutable.add("C")
    println(mutable) // [A, B, C]
    mutable.addAll(listOf("D", "E"))
    println(mutable) // [A, B, C, D, E]
    mutable.add(0, "Z") // The first number is index
    println(mutable) // [Z, A, B, C, D, E]
    mutable.remove("A")
    println(mutable) // [Z, B, C, D, E]
}
