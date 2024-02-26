package f_17_extensions.s_6

open class View {
   open fun printMe() {
       println("I'm a View")
   }
}
class Button: View() {
   override fun printMe() {
       println("I'm a Button")
   }
}

fun main() {
   val button: Button = Button()
   button.printMe() // I'm a Button
   val view: View = button
   view.printMe() // I'm a Button
}
