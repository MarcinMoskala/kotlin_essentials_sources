package f_17_extensions.s_8

open class View
class Button : View()

fun printMe(view: View) {
    println("I'm a View")
}

fun printMe(button: Button) {
    println("I'm a Button")
}

fun main() {
    val button: Button = Button()
    printMe(button) // I'm a Button
    val view: View = button
    printMe(view) // I'm a View
}
