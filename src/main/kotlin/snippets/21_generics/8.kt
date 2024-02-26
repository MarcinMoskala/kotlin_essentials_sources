package f_21_generics.s_8

interface Consumer<T> {
    fun consume(value: T)
}
class DogFood

class Dog : Consumer<DogFood> {
    override fun consume(value: DogFood) {
        println("Mlask mlask")
    }
}

fun main() {
    val dog: Dog = Dog()
    val consumer: Consumer<DogFood> = dog
}
