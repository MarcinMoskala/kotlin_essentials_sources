package f_14_enum.s_2

enum class PaymentOption {
    CASH,
    CARD,
    TRANSFER,
}

fun main() {
    val option: PaymentOption =
        PaymentOption.valueOf("TRANSFER")
    println(option)

    println("All options: ")
    val paymentOptions: List<PaymentOption> =
        PaymentOption.entries
    for (paymentOption in paymentOptions) {
        println(paymentOption)
    }
}
// TRANSFER
// All options:
// CASH
// CARD
// TRANSFER
