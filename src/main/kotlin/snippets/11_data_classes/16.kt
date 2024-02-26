package f_11_data_classes.s_16

data class Dog(
   val name: String,
) {
   // Bad practice, avoid mutable properties in data classes
   var trained = false
}

fun main() {
   val d1 = Dog("Cookie")
   d1.trained = true
   println(d1) // Dog(name=Cookie)
   // so nothing about trained property

   val d2 = d1.copy()
   println(d1.trained) // true
   println(d2.trained) // false
   // so trained value not copied
}
