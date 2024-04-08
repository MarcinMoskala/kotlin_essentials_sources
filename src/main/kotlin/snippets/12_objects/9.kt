package f_12_objects.s_9

class User {
    object Producer {
        fun empty() = User()
    }
}

val user: User = User.Producer.empty()
