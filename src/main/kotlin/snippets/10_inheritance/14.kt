package f_10_inheritance.s_14

interface NicePerson {
   fun cheer() {
       println("Hello")
   }
}

class Alex : NicePerson

class Ben : NicePerson {
   override fun cheer() {
       super.cheer()
       println("My name is Ben")
   }
}

fun main() {
   val alex = Alex()
   alex.cheer() // Hello
  
   val ben = Ben()
   ben.cheer()
   // Hello
   // My name is Ben
}
