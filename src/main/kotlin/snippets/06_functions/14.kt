package f_06_functions.s_14

fun addOneAndPrint(list: MutableList<Int> = mutableListOf()) {
    list.add(1)
    println(list)
}

fun main() {
    addOneAndPrint() // [1]
    addOneAndPrint() // [1]
    addOneAndPrint() // [1]
}
