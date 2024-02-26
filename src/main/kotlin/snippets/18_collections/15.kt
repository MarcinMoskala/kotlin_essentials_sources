package f_18_collections.s_15

fun main() {
    val list = listOf("A", "B")
    println(list.indexOf("A")) // 0
    println(list.indexOf("B")) // 1
    println(list.indexOf("Z")) // -1
}
