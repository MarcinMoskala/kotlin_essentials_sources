package f_12_objects.s_14

class Product(
    val code: String,
    val price: Double,
) {
    init {
        require(price > MIN_AMOUNT)
    }

    companion object {
        const val MIN_AMOUNT = 5.00
    }
}
