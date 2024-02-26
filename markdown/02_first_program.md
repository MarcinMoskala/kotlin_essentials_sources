```
//1
fun main() {
    println("Hello, World")
}
```


```
//2
fun main(args: Array<String>) {
    println("Hello, World")
}
```


```
//3
fun main(vararg args: String) {
    println("Hello, World")
}
```


```
//4
class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World")
        }
    }
}
```


```
//5
suspend fun main() {
    println("Hello, World")
}
```


```
//6
fun main() {
    println("Hello, World")
}
```


```
//7
fun main(args: Array<String>) {
    println("Hello, World")
}
```


```
package com.marcinmoskala.domain.model

class User(val name: String)
```


```
package com.marcinmoskala.domain

import com.marcinmoskala.domain.model.User
// or 
import com.marcinmoskala.domain.model.*

fun useUser() {
    val user = User("Marcin")
    // ...
}
```