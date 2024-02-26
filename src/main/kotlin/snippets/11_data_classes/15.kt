package f_11_data_classes.s_15

data class FullName(
   val name: String,
   val surname: String,
) {
   val fullName = "$name $surname"
}

fun main() {
   val d1 = FullName("Cookie", "Moskała")
   println(d1.fullName) // Cookie Moskała
   println(d1) // FullName(name=Cookie, surname=Moskała)

   val d2 = d1.copy()
   println(d2.fullName) // Cookie Moskała
   println(d2) // FullName(name=Cookie, surname=Moskała)
}
