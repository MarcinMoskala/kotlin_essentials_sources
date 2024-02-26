package f_21_generics.s_4

fun main() {
    val letters = ArrayList<String>()
    letters.add("A") // the argument must be of type String
    letters.add("B") // the argument must be of type String
    // The type of letters is List<String>
    val a = letters[0] // the type of a is String
    println(a) // A
    for (l in letters) { // the type of l is String
        println(l) // first A, then B
    }
}
