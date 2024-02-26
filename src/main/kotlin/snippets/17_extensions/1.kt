package f_17_extensions.s_1

class Telephone(
    // member property
    val number: String
) {
    // member function
    fun call() {
        print("Calling $number")
    }
}

fun main() {
    // Usage
    val telephone = Telephone("123456789")
    println(telephone.number) // 123456789
    telephone.call() // Calling 123456789
}
