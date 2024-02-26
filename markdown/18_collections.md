```
//1
interface Iterable<out T> {
    operator fun iterator(): Iterator<T>
}
```


```
interface Collection<out E> : Iterable<E> {
    val size: Int
    fun isEmpty(): Boolean
    operator fun contains(element: E): Boolean
    override fun iterator(): Iterator<E>
    fun containsAll(elements: Collection<E>): Boolean
}
```


```
//2
fun main() {
    var a = 100
    a = a + 10
    a += 1
    println(a) // 111

    var str = "A"
    str = str + "B"
    str += "C"
    println(str) // ABC
}
```


```
//3
fun main() {
    var list = listOf("A", "B")
    list = list + "C"
    println(list) // [A, B, C]
    list = list + listOf("D", "E")
    println(list) // [A, B, C, D, E]
    list = listOf("Z") + list
    println(list)  // [Z, A, B, C, D, E]
}
```


```
//4
fun main() {
    val mutable = mutableListOf("A", "B")
    mutable.add("C")
    mutable.remove("A")
    println(mutable) // [B, C]
}
```


```
//5
fun main() {
    // We create `List` using `listOf` function.
    val list: List<String> = listOf("A", "B", "C")
    // We create `MutableList` using `mutableListOf` function.
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)

    // We create `Set` using `setOf` function.
    val set: Set<Double> = setOf(3.14, 7.11)
    // We create `MutableSet` using `mutableSetOf` function.
    val mutableSet: MutableSet<Char> = mutableSetOf('A', 'B')

    // We create `Map` using `mapOf` function.
    val map: Map<Char, String> =
        mapOf('A' to "Alex", 'B' to "Ben")
    // We create `MutableMap` using `mutableMapOf` function.
    val mutableMap: MutableMap<Int, Char> =
        mutableMapOf(1 to 'A', 2 to 'B')

    // We create `Array` using `arrayOf` function.
    val array: Array<String> = arrayOf("Dukaj", "Sapkowski")
    // We create `IntArray` using `intArrayOf` function.
    val intArray: IntArray = intArrayOf(9, 8, 7)

    // We create `ArrayList` using `arrayListOf` function.
    val arrayList: ArrayList<String> = arrayListOf("M", "N")
}
```


```
//6
fun main() {
    val list: List<Char> = listOf('A', 'B', 'C')
    val mutableList: MutableList<Char> = list.toMutableList()
    val set: Set<Char> = mutableList.toSet()
    val mutableSet: MutableList<Char> = set.toMutableList()
    val array: Array<Char> = mutableSet.toTypedArray()
    val charArray: CharArray = array.toCharArray()
    val list2: List<Char> = charArray.toList()
}
```


```
//7
fun main() {
    val list = listOf("A", "B", "C")
    println(list) // [A, B, C]
}
```


```
//8
fun main() {
    val list: List<String> = listOf("A", "B", "C")
    println(list) // [A, B, C]
    val ints: List<Int> = listOf(1, 2, 3)
    println(ints) // [1, 2, 3]
}
```


```
//9
fun main() {
    var list = listOf("A", "B")
    list = list + "C"
    println(list) // [A, B, C]
    list = list + listOf("D", "E")
    println(list) // [A, B, C, D, E]
    list = listOf("Z") + list
    println(list) // [Z, A, B, C, D, E]
    list = list - "A"
    println(list) // [Z, B, C, D, E]

    val mutable = mutableListOf("A", "B")
    mutable.add("C")
    println(mutable) // [A, B, C]
    mutable.addAll(listOf("D", "E"))
    println(mutable) // [A, B, C, D, E]
    mutable.add(0, "Z") // The first number is index
    println(mutable) // [Z, A, B, C, D, E]
    mutable.remove("A")
    println(mutable) // [Z, B, C, D, E]
}
```


```
//10
fun main() {
    var list = listOf("A", "B")
    list += "C"
    println(list) // [A, B, C]

    val mutable = mutableListOf("A", "B")
    mutable += "C"
    println(mutable) // [A, B, C]
}
```


```
//11
fun main() {
    val list = listOf("A", "B", "C")
    println(list.size) // 3
}
```


```
//12
fun main() {
    val list = listOf("A", "B", "C")
    println(list.size == 0) // false
    println(list.isEmpty()) // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
}
```


```
//13
fun main() {
    val list = listOf("A", "B")
    println(list[1]) // B
    println(list.get(1)) // B
    println(list[3]) // Runtime error
}
```


```
//14
fun main() {
    val list = listOf("A", "B")
    println(list.getOrNull(1)) // B
    println(list.getOrElse(1) { "X" }) // B

    println(list.getOrNull(3)) // null
    println(list.getOrElse(3) { "X" }) // X
}
```


```
//15
fun main() {
    val map = mutableMapOf("A" to 1, "B" to 2)
    println(map.getOrPut("A") { 3 }) // 1
    println(map.getOrPut("C") { 3 }) // 3
    println(map) // {A=1, B=2, C=3}
}
```


```
//16
fun main() {
    val list = listOf("A", "B")
    println(list.indexOf("A")) // 0
    println(list.indexOf("B")) // 1
    println(list.indexOf("Z")) // -1
}
```


```
//17
fun main() {
    val mutable = mutableListOf("A", "B", "C")
    mutable[1] = "X"
    println(mutable) // [A, X, C]
    mutable.set(1, "Y")
    println(mutable) // [A, Y, C]
}
```


```
//18
fun main() {
    val letters = listOf("A", "B", "C")
    println(letters.contains("A")) // true
    println(letters.contains("Z")) // false
    println("A" in letters) // true
    println("Z" in letters) // false
}
```


```
//19
fun main() {
    val letters = listOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}
```


```
//20
fun main() {
    val letters = listOf("A", "B", "C")
    for (letter in letters) {
        print(letter)
    }
}
```


```
//21
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
}
```


```
//22
fun main() {
    val set: Set<Char> = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
    val ints: Set<Long> = setOf(1L, 2L, 3L)
    println(ints) // [1, 2, 3]
}
```


```
//23
fun main() {
    var set = setOf("A", "B")
    set = set + "C"
    println(set) // [A, B, C]
    set = set + setOf("D", "E")
    println(set) // [A, B, C, D, E]
    set = setOf("Z") + set
    println(set) // [Z, A, B, C, D, E]
    set = set - "A"
    println(set) // [Z, B, C, D, E]
}
```


```
//24
fun main() {
    val mutable = mutableSetOf("A", "B")
    mutable.add("C")
    println(mutable) // [A, B, C]
    mutable.addAll(listOf("D", "E"))
    println(mutable) // [A, B, C, D, E]
    mutable.remove("B")
    println(mutable) // [A, C, D, E]
}
```


```
//25
fun main() {
    val set = setOf("A", "B", "C", "B")
    println(set) // [A, B, C]
}
```


```
//26
fun main() {
    val set = setOf("A", "B", "C")
    println(set + "D") // [A, B, C, D]
    println(set + "B") // [A, B, C]

    val mutable = mutableSetOf("A", "B", "C")
    mutable.add("D")
    mutable.add("B")
    println(mutable) // [A, B, C, D]
}
```


```
//27
// by default, each object from a regular class is unique
class Cat(val name: String)

// if the data modifier is used,
// two instances with the same properties are equal
data class Dog(val name: String)

fun main() {
    val cat1 = Cat("Garfield")
    val cat2 = Cat("Garfield")
    println(cat1 == cat2) // false
    println(setOf(cat1, cat2)) // [Cat@4eec7777, Cat@3b07d329]

    val dog1 = Dog("Rex")
    val dog2 = Dog("Rex")
    println(dog1 == dog2) // true
    println(setOf(dog1, dog2)) // [Dog(name=Rex)]
}
```


```
//28
fun main() {
    val names = listOf("Jake", "John", "Jake", "James", "Jan")
    println(names) // [Jake, John, Jake, James, Jan]
    val unique = names.toSet()
    println(unique) // [Jake, John, James, Jan]
}
```


```
//29
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set.size) // 3
}
```


```
//30
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set.size == 0) // false
    println(set.isEmpty()) // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
}
```


```
//31
fun main() {
    val letters = setOf('A', 'B', 'C')
    println(letters.contains('A')) // true
    println(letters.contains('Z')) // false
    println('A' in letters) // true
    println('Z' in letters) // false
}
```


```
//32
fun main() {
    val letters = setOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}
```


```
//33
fun main() {
    val letters = setOf('A', 'B', 'C')
    for (letter in letters) {
        print(letter)
    }
}
```


```
class CachedApiArticleRepository(
    val articleApi: ArticleApi
) {
    val articleCache: MutableMap<String, String> =
        mutableMapOf()

    fun getContent(key: String) =
        articleCache.getOrPut(key) {
            articleApi.fetchContent(key)
        }
}

class DeliveryMethodsConfiguration(
    val deliveryMethods: Map<String, DeliveryMethod>
)

class TokenRepository {
    private var tokenToUser: Map<String, User> = mapOf()

    fun getUser(token: String) = tokenToUser[token]

    fun addToken(token: String, user: User) {
        tokenToUser[token] = user
    }
}
```


```
//34
fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
    )
//    val capitals = mapOf(
//        Pair("USA", "Washington DC"),
//        Pair("Poland", "Warsaw"),
//    )
    println(capitals) // {USA=Washington DC, Poland=Warsaw}
}
```


```
//35
fun main() {
    val capitals: Map<String, String> = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
    )
    println(capitals) // {USA=Washington DC, Poland=Warsaw}

    val alphabet: Map<Char, Int> =
        mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet) // {A=1, B=2, C=3}
}
```


```
//36
fun main() {
    val alphabet: Map<Char, Int> =
        mapOf('A' to 1, 'B' to 2, 'C' to 3)
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
}
```


```
//37
fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4)
    // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}
}
```


```
//38
fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('B' to "Barbara")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Barbara}
}
```


```
//39
fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 - 'B'
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex}
}
```


```
//40
fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    println('A' in map) // true
    println(map.containsKey('A')) // true
    println('Z' in map) // false
    println(map.containsKey('Z')) // false
}
```


```
//41
fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    println(map.size) // 2
}
```


```
//42
fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for (entry in map) {
        println("${entry.key} is for ${entry.value}")
    }
}
// A is for Alex
// B is for Bob
```


```
//43
fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for ((letter, name) in map) {
        println("$letter is for $name")
    }
}
// A is for Alex
// B is for Bob
```


```
//44
fun main() {
    val map: MutableMap<Char, String> =
        mutableMapOf('A' to "Alex", 'B' to "Bob")
    map.put('C', "Celina")
    map['D'] = "Daria"
    println(map) // {A=Alex, B=Bob, D=Daria, C=Celina}
    map.remove('B')
    println(map) // {A=Alex, D=Daria, C=Celina}
}
```


```
//45
fun main() {
    val arr: Array<String> = arrayOf("A", "B", "C")
    println(arr[0]) // A
    println(arr.get(0)) // A
    println(arr[1]) // B
    arr[1] = "D"
    println(arr[1]) // D
    arr.set(2, "E")
    println(arr[2]) // E
    println(arr.size) // 3
    for (e in arr) {
        print(e)
    }
    // ADE
}
```


```
//46
fun main() {
    val arr1 = arrayOf("A", "B", "C")
    val arr2 = arrayOf("A", "B", "C")
    println(arr1 == arr2) // false
    println(arr1) // [Ljava.lang.String;@4f023edb
    println(arr2) // [Ljava.lang.String;@3a71f4dd
}
```


```
//47
// JVM implementation
operator fun <T> Array<T>.plus(element: T): Array<T> {
    val index = size
    val result = java.util.Arrays.copyOf(this, index + 1)
    result[index] = element
    return result
}

fun main() {
    val arr = arrayOf("A", "B", "C")
    println(arr.size) // 3
    val arr2 = arr + "D"
    println(arr.size) // 3
    println(arr2.size) // 4
}
```


```
//48
fun main() {
    val arr1: Array<String> = arrayOf("A", "B", "C")
    val list: List<String> = arr1.toList()
    val arr2: Array<String> = list.toTypedArray()
    val set: Set<String> = arr2.toSet()
    val arr3: Array<String> = set.toTypedArray()
}
```


```
//49
fun main() {
    val doubles: DoubleArray = doubleArrayOf(2.71, 3.14, 9.8)
    val chars: CharArray = charArrayOf('X', 'Y', 'Z')

    val accepts: List<Boolean> = listOf(true, false, true)
    val acceptsArr: BooleanArray = accepts.toBooleanArray()

    val ints: Set<Int> = setOf(2, 4, 8, 10)
    val intsArr: IntArray = ints.toIntArray()
}
```


```
//50
fun markdownList(vararg lines: String): String {
    // the type of lines is Array<String>
    var str = ""
    for ((i, line) in lines.withIndex()) {
        str += " * $line"
        if (i != lines.size) {
            str += "\n"
        }
    }
    return str
}

fun main() {
    print(markdownList("A", "B", "C"))
    // * A
    // * B
    // * C
}
```


```
//51
fun <T> listOf(vararg elements: T): List<T> =
    if (elements.size > 0) elements.asList() else emptyList()

fun <T> setOf(vararg elements: T): Set<T> =
    if (elements.size > 0) elements.toSet() else emptySet()
```


```
fun main() {
    val arr = arrayOf("B", "C")
    print(markdownList("A", *arr, "D"))
    // * A
    // * B
    // * C
    // * D
}
```