package f_08_nullability.s_6

fun printLengthIfNotNullOrThrow(str: String?) {
    if (str == null) throw Error()
    println(str.length) // str smart-casted to String
}
