package f_13_exceptions.s_8

fun findClusters(number: Int) {
    if (number < 1) {
        throw IllegalArgumentException("...")
    }
    // ...
}

var userName = ""

fun printUserName() {
    if (userName == "") {
        throw IllegalStateException("Name must not be empty")
    }
    // ...
}
