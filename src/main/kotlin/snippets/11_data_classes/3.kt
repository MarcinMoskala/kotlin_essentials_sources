package f_11_data_classes.s_3

class FakeUserRepository

fun main() {
   val repository1 = FakeUserRepository()
   val repository2 = FakeUserRepository()
   println(repository1) // e.g. FakeUserRepository@8efb846
   println(repository1) // e.g. FakeUserRepository@8efb846
   println(repository2) // e.g. FakeUserRepository@2a84aee7
}
