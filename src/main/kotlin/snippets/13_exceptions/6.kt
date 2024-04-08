package f_13_exceptions.s_6

fun someFunction() {
    throw Throwable("Some error")
}

fun main() {
    try {
        someFunction()
    } finally {
        println("Finally block was called")
    }
    println("Will not be printed")
}
