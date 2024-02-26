```
//1
fun main() {
    val a = 10
    var b = "ABC"
    println(a) // 10
    println(b) // ABC
    // a = 12 is not possible, because a is read-only!
    b = "CDE"
    println(b) // CDE
}
```


```
//2
fun main() {
   val a: Int = 10
   var b: String = "ABC"
   println(a) // 10
   println(b) // ABC
   b = "CDE"
   println(b) // CDE
}
```


```
//3
fun main() {
    val a: Int
    a = 10
    println(a) // 10
}
```