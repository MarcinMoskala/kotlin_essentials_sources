package f_21_generics.s_4

class ValueWithHistory<T>(
    private var value: T
) {
    private var history: List<T> = listOf(value)

    fun setValue(value: T) {
        this.value = value
        this.history += value
    }

    fun currentValue(): T = value

    fun history(): List<T> = history
}

fun main() {
    val letter = ValueWithHistory<String>("A")
    // The type of letter is ValueWithHistory<String>
    letter.setValue("B")
    // letter.setValue(123) <- this would not compile
    val l = letter.currentValue() // the type of l is String
    println(l) // B
    val h = letter.history() // the type of h is List<String>
    println(h) // [A, B]
}
