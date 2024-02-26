package f_17_extensions.s_2

class Telephone(
    val number: String
)

fun Telephone.call() {
    print("Calling $number")
}

fun main() {
    // Usage
    val telephone = Telephone("123456789")
    telephone.call() // Calling 123456789
}
