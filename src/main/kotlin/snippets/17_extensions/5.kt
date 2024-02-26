package f_17_extensions.s_5

open class View
class Button : View()

fun View.printMe() {
    println("I'm a View")
}

fun Button.printMe() {
    println("I'm a Button")
}

fun main() {
    val button: Button = Button()
    button.printMe() // I'm a Button
    val view: View = button
    view.printMe() // I'm a View
}
