package f_17_extensions.s_9

inline fun CharSequence?.isNullOrBlank(): Boolean {
    // (skipped contract definition)
    return this == null || this.isBlank()
}

fun Iterable<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}
