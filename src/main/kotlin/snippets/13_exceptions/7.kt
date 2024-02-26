package f_13_exceptions.s_7

fun someFunction() {
    println("Function called")
}

fun main() {
    try {
        someFunction()
        println("After call")
    } finally {
        println("Finally block was called")
    }
    println("After try-finally")
}
// Function called
// After call
// Finally block was called
// After try-finally
