package f_13_exceptions.s_2

class MyException : Throwable("Some message")

fun someFunction() {
    throw MyException()
    println("Will not be printed")
}

fun main() {
    try {
        someFunction()
        println("Will not be printed")
    } catch (e: MyException) {
        println("Caught $e")
        // Caught MyException: Some message
    }
}
