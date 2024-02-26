package f_09_classes.s_17

class Puppy(val name: String) {

    class InnerPuppy {
        fun think() {
            // we have no access to name here
            println("Inner puppy is thinking")
        }
    }
}

fun main() {
    val innerPuppy = Puppy.InnerPuppy()
    // We create InnerPuppy on class, not object
    innerPuppy.think() // Inner puppy is thinking
}
