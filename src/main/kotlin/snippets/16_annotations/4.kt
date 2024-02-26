package f_16_annotations.s_4

// JvmOverloads annotates primary constructor
class User @JvmOverloads constructor(
    val name: String,
    val surname: String,
    val age: Int = -1,
)
