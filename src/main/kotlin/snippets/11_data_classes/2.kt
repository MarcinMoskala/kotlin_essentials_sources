package f_11_data_classes.s_2

class A {
   override fun equals(other: Any?): Boolean = other is A

   override fun hashCode(): Int = 123

   override fun toString(): String = "A()"
}

fun main() {
   val a1 = A()
   val a2 = A()

   println(a1.equals(a1)) // true
   println(a1.equals(a2)) // true
   // or
   println(a1 == a1) // true
   println(a1 == a2) // true

   println(a1.hashCode()) // 123
   println(a2.hashCode()) // 123

   println(a1.toString()) // A()
   println(a2.toString()) // A()
   // or
   println(a1) // A()
   println(a2) // A()
}
