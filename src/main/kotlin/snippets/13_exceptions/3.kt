package f_13_exceptions.s_3

import java.lang.NumberFormatException

class MyException : Throwable("Some message")

fun testTryCatch(exception: Throwable) {
    try {
        throw exception
    } catch (e: ArithmeticException) {
        println("Got ArithmeticException")
    } catch (e: MyException) {
        println("Got MyException")
    } catch (e: Throwable) {
        println("Got some exception")
    }
}

fun main() {
    testTryCatch(ArithmeticException())
    // Got ArithmeticException
    testTryCatch(MyException())
    // Got MyException
    testTryCatch(NumberFormatException())
    // Got some exception
}
