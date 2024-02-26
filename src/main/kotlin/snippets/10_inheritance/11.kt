package f_10_inheritance.s_11

interface Named {
    val name: String
}

class NameBox : Named {
    override var name = "(default)"
}
