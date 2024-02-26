package f_08_nullability.s_12

fun check(str: String?) {
    println("The value: \"$str\"")
    println("The value or empty: \"${str.orEmpty()}\"")
    println("Is it null or empty? " + str.isNullOrEmpty())
    println("Is it null or blank? " + str.isNullOrBlank())
}

fun main() {
    check("ABC")
    // The value: "ABC"
    // The value or empty: "ABC"
    // Is it null or empty? false
    // Is it null or blank? false
    check(null)
    // The value: "null"
    // The value or empty: ""
    // Is it null or empty? true
    // Is it null or blank? true
    check("")
    // The value: ""
    // The value or empty: ""
    // Is it null or empty? true
    // Is it null or blank? true
    check("       ")
    // The value: "       "
    // The value or empty: "       "
    // Is it null or empty? false
    // Is it null or blank? true
}
