package f_15_sealed.s_4

enum class PaymentType {
    CASH,
    CARD,
    CHECK
}

fun commentDecision(type: PaymentType) = when (type) {
    PaymentType.CASH -> "I will pay with cash"
    PaymentType.CARD -> "I will pay with card"
    PaymentType.CHECK -> "I will pay with check"
}
