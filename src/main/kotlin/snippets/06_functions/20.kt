package f_06_functions.s_20

class View
class ViewInteractor {
    infix fun clicks(view: View) { 
        // ...
    }
}

fun main() {
    val aView = View()
    val interactor = ViewInteractor()

    // regular notation
    interactor.clicks(aView)
    // infix notation
    interactor clicks aView
}
