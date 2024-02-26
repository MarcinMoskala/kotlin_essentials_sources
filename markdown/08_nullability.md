```
var person: Person // COMPILATION ERROR, 
// the property needs to be initialized
```


```
var person: Person = null // COMPILATION ERROR,
// Person is not a nullable type, and cannot be `null`
```


```
var person: Person? = null // OK
```


```
person.name // COMPILATION ERROR,
// person type is nullable, so we cannot use it directly
```


```
//1
class User(val name: String) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

var user: User? = null

fun main() {
    user?.cheer() // (does nothing)
    println(user?.name) // null
    user = User("Cookie")
    user?.cheer() // Hello, my name is Cookie
    println(user?.name) // Cookie
}
```


```
//2
class User(val name: String) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

var user: User? = null

fun main() {
    // println(user?.name.length) // ILLEGAL
    println(user?.name?.length) // null
    user = User("Cookie")
    // println(user?.name.length) // ILLEGAL
    println(user?.name?.length) // 6
}
```


```
//3
class User(val name: String) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

var user: User? = User("Cookie")

fun main() {
    println(user!!.name.length) // 6
    user = null
    println(user!!.name.length) // throws NullPointerException
}
```


```
fun sendData(dataWrapped: Wrapper<Data>) {
    val data = requireNotNull(dataWrapped.data)
    val connection = checkNotNull(connections["db"])
    connection.send(data)
}
```


```
//4
fun printLengthIfNotNull(str: String?) {
    if (str != null) {
        println(str.length) // str smart-casted to String
    }
}
```


```
//5
fun printLengthIfNotNull(str: String?) {
    if (str == null) return
    println(str.length) // str smart-casted to String
}
```


```
//6
fun printLengthIfNotNullOrThrow(str: String?) {
    if (str == null) throw Error()
    println(str.length) // str smart-casted to String
}
```


```
//7
fun printLengthIfNotNull(str: String?) {
    if (str != null && str.length > 0) {
        // str in expression above smart-casted to String
        // ...
    }
}
```


```
//8
fun printLengthIfNotNull(str: String?) {
    if (str == null || str.length == 0) {
        // str in expression above smart-casted to String
        // ...
    }
}
```


```
//9
fun printLengthIfNotNullOrThrow(str: String?) {
    requireNotNull(str) // str smart-casted to String
    println(str.length)
}
```


```
//10
fun main() {
    println("A" ?: "B") // A
    println(null ?: "B") // B
    println("A" ?: null) // A
    println(null ?: null) // null
}
```


```
//11
class User(val name: String)

fun printName(user: User?) {
    val name: String = user?.name ?: "default"
    println(name)
}

fun main() {
    printName(User("Cookie")) // Cookie
    printName(null) // default
}
```


```
//12
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
```


```
//13
fun check(list: List<Int>?) {
    println("The list: \"$list\"")
    println("The list or empty: \"${list.orEmpty()}\"")
    println("Is it null or empty? " + list.isNullOrEmpty())
}

fun main() {
    check(listOf(1, 2, 3))
    // The list: "[1, 2, 3]"
    // The list or empty: "[1, 2, 3]"
    // Is it null or empty? false
    check(null)
    // The list: "null"
    // The list or empty: "[]"
    // Is it null or empty? true
    check(listOf())
    // The list: "[]"
    // The list or empty: "[]"
    // Is it null or empty? true
}
```


```
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onCreate()
    }
}

class UserServiceTest {
    lateinit var userRepository: InMemoryUserRepository
    lateinit var userService: UserService

    @Before
    fun setup() {
        userRepository = InMemoryUserRepository()
        userService = UserService(userRepository)
    }

    @Test
    fun `should register new user`() {
        // when
        userService.registerUser(aRegisterUserRequest)

        // then
        userRepository.hasUserId(aRegisterUserRequest.id)
        // ...
    }
}
```


```
//14
lateinit var text: String

fun main() {
    println(text) // RUNTIME ERROR!
    // lateinit property text has not been initialized
}
```


```
lateinit var text: String

private fun printIfInitialized() {
    if (::text.isInitialized) {
        println(text)
    } else {
        println("Not initialized")
    }
}

fun main() {
    printIfInitialized() // Not initialized
    text = "ABC"
    printIfInitialized() // ABC
}
```