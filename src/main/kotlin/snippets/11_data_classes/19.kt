package f_11_data_classes.s_19

fun main() {
   val p1: Pair<String, Int> = "ABC" to 123
   println(p1) // (ABC, 123)
   val p2 = 'A' to 3.14 
   // the type of p2 is Pair<Char, Double>
   println(p2) // (A, 123)
   val p3 = true to false
   // the type of p3 is Pair<Boolean, Boolean>
   println(p3) // (true, false)
}
