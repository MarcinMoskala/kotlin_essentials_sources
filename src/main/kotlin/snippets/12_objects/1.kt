package f_12_objects.s_1

data class User(val name: String)

interface UserProducer {
    fun produce(): User
}

fun printUser(producer: UserProducer) {
    println(producer.produce())
}

fun main() {
    val user = User("Jake")
    val producer = object : UserProducer {
        override fun produce(): User = user
    }
    printUser(producer) // User(name=Jake)
}
