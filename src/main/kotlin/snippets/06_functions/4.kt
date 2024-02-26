package f_06_functions.s_4

// Top-level function
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

// Top-level function
fun main(args: Array<String>) {
    double(1) // 2
    A().twelveTimes(2) // 24
}
