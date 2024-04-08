package f_06_functions.s_5

fun double(i: Int) = i * 2

class A {
    // Member function (method)
    private fun triple(i: Int) = i * 3

    // Member function (method)
    fun twelveTimes(i: Int): Int {
        // Local function
        fun fourTimes() = double(double(i))
        return triple(fourTimes())
    }
}

fun main(args: Array<String>) {
    double(1) // 2
    A().twelveTimes(2) // 24
}
