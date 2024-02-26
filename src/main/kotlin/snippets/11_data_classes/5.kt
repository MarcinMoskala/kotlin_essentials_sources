package f_11_data_classes.s_5

class FakeUserRepository

fun main() {
   val repository1 = FakeUserRepository()
   val repository2 = FakeUserRepository()
   println(repository1 == repository1) // true
   println(repository1 == repository2) // false
}
