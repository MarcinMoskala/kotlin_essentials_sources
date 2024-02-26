package f_08_nullability.s_5

fun printLengthIfNotNull(str: String?) {
    if (str == null) return
    println(str.length) // str smart-casted to String
}
