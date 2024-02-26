package f_08_nullability.s_4

fun printLengthIfNotNull(str: String?) {
    if (str != null) {
        println(str.length) // str smart-casted to String
    }
}
