```
//1
fun main() {
    val list = listOf("A", "B", "C")
    for (letter in list) {
        print(letter)
    }

    // Variable type can be explicit
    for (str: String in setOf("D", "E", "F")) {
        print(str)
    }
}
// ABCDEF
```


```
//2
fun main() {
    val tree = Tree(
        value = "B",
        left = Tree("A"),
        right = Tree("D", left = Tree("C"))
    )

    for (value in tree) {
        print(value) // ABCD
    }
}

class Tree(
    val value: String,
    val left: Tree? = null,
    val right: Tree? = null,
) : Iterable<String> {

    override fun iterator(): Iterator<String> = iterator {
        if (left != null) yieldAll(left)
        yield(value)
        if (right != null) yieldAll(right)
    }
}
```


```
//3
fun main() {
    for (i in 1..5) {
        print(i)
    }
}
// 12345
```


```
//4
fun main() {
    for (i in 1..<5) {
        print(i)
    }
}
// 1234
```


```
//5
fun main() {
    for (i in 1 until 5) {
        print(i)
    }
}
// 1234
```


```
//6
fun main() {
    for (i in 5..1) {
        print(i)
    }
    for (i in 5..<1) {
        print(i)
    }
}
// (nothing is printed)
```


```
//7
fun main() {
    for (i in 5 downTo 1) {
        print(i)
    }
}
// 54321
```


```
//8
fun main() {
    for (i in 1..10 step 3) {
        print("$i ")
    }
    println()
    for (i in 1..<10 step 3) {
        print("$i ")
    }
    println()
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
}
// 1 4 7 10 
// 1 4 7 
// 10 7 4 1 
```


```
//9
fun main() {
    for (i in 1..5) {
        if (i == 3) break
        print(i)
    }
    // 12

    println()

    for (i in 1..5) {
        if (i == 3) continue
        print(i)
    }
    // 1245
}
```


```
//10
fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    for (i in 0..<names.size) {
        val name = names[i]
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
```


```
//11
fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    for (i in names.indices) {
        val name = names[i]
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
```


```
//12
fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    for ((i, name) in names.withIndex()) {
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
```


```
//13
fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    names.forEachIndexed { i, name ->
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
```


```
//14
fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev"
    )

    for (entry in capitals.entries) {
        println("The capital of ${entry.key} is ${entry.value}")
    }
}
// The capital of USA is Washington DC
// The capital of Poland is Warsaw
// The capital of Ukraine is Kiev
```


```
//15
fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev"
    )

    for ((country, capital) in capitals) {
        println("The capital of $country is $capital")
    }
}
// The capital of USA is Washington DC
// The capital of Poland is Warsaw
// The capital of Ukraine is Kiev
```


```
//16
fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev"
    )

    capitals.forEach { (country, capital) ->
        println("The capital of $country is $capital")
    }
}
// The capital of USA is Washington DC
// The capital of Poland is Warsaw
// The capital of Ukraine is Kiev
```