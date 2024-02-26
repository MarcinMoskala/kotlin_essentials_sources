package f_08_nullability.s_8

fun printLengthIfNotNull(str: String?) {
    if (str == null || str.length == 0) {
        // str in expression above smart-casted to String
        // ...
    }
}
