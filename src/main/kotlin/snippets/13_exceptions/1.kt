package f_13_exceptions.s_1

fun main() {
    val i1 = "10".toInt()
    println(i1)
    val i2 = "ABC".toInt()
    println(i2)
}
// 10
// Exception in thread "main" java.lang.NumberFormatException:
// For input string: "ABC"
//   at java.base/java.lang.NumberFormatException.
//   forInputString(NumberFormatException.java:67)
//   at java.base/java.lang.Integer.parseInt(Integer.java:660)
//   at java.base/java.lang.Integer.parseInt(Integer.java:778)
//   at PlaygroundKt.main(Playground.kt:4)
//   at PlaygroundKt.main(Playground.kt)
