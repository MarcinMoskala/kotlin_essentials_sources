package f_12_objects.s_9

// Kotlin
class User {
    object Producer {
        fun empty() = User()
    }
}

// Usage
val user: User = User.Producer.empty()
