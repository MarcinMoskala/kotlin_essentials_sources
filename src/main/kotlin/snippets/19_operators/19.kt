package f_19_operators.s_19

class CheerUseCase {
    operator fun invoke(who: String) {
        println("Hello, $who")
    }
}

fun main() {
    val hello = {
        println("Hello")
    }
    hello() // Hello

    val cheerUseCase = CheerUseCase()
    cheerUseCase("Reader") // Hello, Reader
}
