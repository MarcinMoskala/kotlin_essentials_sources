package f_11_data_classes.s_1

class A

fun main() {
   val a1 = A()
   val a2 = A()

   println(a1.equals(a1)) // true
   println(a1.equals(a2)) // false
   // or
   println(a1 == a1) // true
   println(a1 == a2) // false

   println(a1.hashCode()) // Example: 149928006
   println(a2.hashCode()) // Example: 713338599

   println(a1.toString()) // Example: A@8efb846
   println(a2.toString()) // Example: A@2a84aee7
   // or
   println(a1) // Example: A@8efb846
   println(a2) // Example: A@2a84aee7
}
