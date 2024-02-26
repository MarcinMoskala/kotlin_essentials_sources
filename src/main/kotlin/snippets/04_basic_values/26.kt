package f_04_basic_values.s_26

fun main() {
    val text = """
   Let's say:
   "Hooray"
   """.trimIndent()
    println(text)
    // Let's say:
    // "Hooray"

    val description = """
      A
      B
          C
  """.trimIndent()
    println(description)
    // A
    // B
    //     C
}
