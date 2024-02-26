package f_05_conditional_statements.s_17

fun lengthIfString(a: Any): Int {
    if (a is String) {
        return a.length // the type of a here is String
    }
    return 0
}
