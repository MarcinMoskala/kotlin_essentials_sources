package f_09_classes.s_22

class Puppy(val name: String) {

    inner class InnerPuppy {
        fun think() {
            println("Inner $name is thinking")
        }
    }
}

fun main() {
    val puppy = Puppy("Cookie")
    val innerPuppy = puppy.InnerPuppy() // We need puppy
    innerPuppy.think() // Inner Cookie is thinking
}
