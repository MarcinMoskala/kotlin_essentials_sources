package f_08_nullability.s_7

fun printLengthIfNotNull(str: String?) {
    if (str != null && str.length > 0) {
        // str in expression above smart-casted to String
        // ...
    }
}
