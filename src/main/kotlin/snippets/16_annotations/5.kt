package f_16_annotations.s_5

annotation class AnnotationWithList(
    val elements: Array<String>
)

@AnnotationWithList(["A", "B", "C"])
val str1 = "ABC"

@AnnotationWithList(elements = ["D", "E"])
val str2 = "ABC"

@AnnotationWithList(arrayOf("F", "G"))
val str3 = "ABC"
