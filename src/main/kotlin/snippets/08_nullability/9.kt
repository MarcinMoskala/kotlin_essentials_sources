package f_08_nullability.s_9

fun printLengthIfNotNullOrThrow(str: String?) {
    requireNotNull(str) // str smart-casted to String
    println(str.length)
}
