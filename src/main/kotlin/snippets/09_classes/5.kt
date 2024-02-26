package f_09_classes.s_5

class User {
    private var name: String = ""

    // DO NOT DO THAT! DEFINE PROPERTY GETTER INSTEAD
    fun getName() = name

    // DO NOT DO THAT! DEFINE PROPERTY SETTER INSTEAD
    fun setName(name: String) {
        this.name = name
    }
}
