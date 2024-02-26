package f_21_generics.s_14

fun printSize(list: List<*>) {
    println(list.size)
}

fun printList(list: List<*>) {
    for (e in list) { // the type of e is Any?
        println(e)
    }
}
