```
//1
class Telephone(
    // member property
    val number: String
) {
    // member function
    fun call() {
        print("Calling $number")
    }
}

fun main() {
    // Usage
    val telephone = Telephone("123456789")
    println(telephone.number) // 123456789
    telephone.call() // Calling 123456789
}
```


```
//2
class Telephone(
    val number: String
)

fun Telephone.call() {
    print("Calling $number")
}

fun main() {
    // Usage
    val telephone = Telephone("123456789")
    telephone.call() // Calling 123456789
}
```


```
//3
fun String.remove(value: String) = this.replace(value, "")

fun main() {
    println("Who Framed Roger Rabbit?".remove(" "))
    // WhoFramedRogerRabbit?
}
```


```
// explicit this
fun String.remove(value: String) = this.replace(value, "")

// implicit this
fun String.remove(value: String) = replace(value, "")
```


```
//4
fun String.remove(value: String) = this.replace(value, "")

fun main() {
    println("A B C".remove(" ")) // ABC
}
```


```
public final class PlaygroundKt {
    @NotNull
    public static final String remove(
            @NotNull String $this$remove,
            @NotNull String value
    ) {
        // parameters not-null checks
        return StringsKt.replace$default(
                $this$remove,
                value,
                ""
                // plus default values
        );
    }

    public static final void main(@NotNull String[] args) {
        // parameter not-null check
        String var1 = remove("A B C", " ");
        System.out.println(var1);
    }
}
```


```
fun remove(text: String, value: String) = text.replace(value, "")

fun String.remove(value: String) = this.replace(value, "")
```


```
//5
val <T> List<T>.lastIndex: Int
    get() = size - 1
```


```
val Context.inflater: LayoutInflater
    get() = getSystemService(Context.LAYOUT_INFLATER_SERVICE)
        as LayoutInflater

val Context.notificationManager: NotificationManager
    get() = getSystemService(Context.NOTIFICATION_SERVICE)
        as NotificationManager

val Context.alarmManager: AlarmManager
    get() = getSystemService(Context.ALARM_SERVICE)
        as AlarmManager
```


```
class User {
    // ...
    var birthdateMillis: Long? = null
}

var User.birthdate: Date?
    get() {
        val millis = birthdateMillis
        return if (millis == null) null else Date(millis)
    }
    set(value) {
        birthdateMillis = value?.time
    }
```


```
//6
open class View
class Button : View()

fun View.printMe() {
    println("I'm a View")
}

fun Button.printMe() {
    println("I'm a Button")
}

fun main() {
    val button: Button = Button()
    button.printMe() // I'm a Button
    val view: View = button
    view.printMe() // I'm a View
}
```


```
//7
open class View {
   open fun printMe() {
       println("I'm a View")
   }
}
class Button: View() {
   override fun printMe() {
       println("I'm a Button")
   }
}

fun main() {
   val button: Button = Button()
   button.printMe() // I'm a Button
   val view: View = button
   view.printMe() // I'm a Button
}
```


```
//8
open class View
class Button : View()

fun printMe(view: View) {
    println("I'm a View")
}

fun printMe(button: Button) {
    println("I'm a Button")
}

fun main() {
    val button: Button = Button()
    printMe(button) // I'm a Button
    val view: View = button
    printMe(view) // I'm a View
}
```


```
//9
inline fun CharSequence?.isNullOrBlank(): Boolean {
    // (skipped contract definition)
    return this == null || this.isBlank()
}

fun Iterable<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}
```


```
//10
object A

fun A.foo() {}

fun main() {
    A.foo()

    val a: A = A
    a.foo()
}
```


```
//11
class A {
    companion object
}

fun A.Companion.foo() {}

fun main() {
    A.foo()

    val a: A.Companion = A
    a.foo()
}
```


```
//12
class Telephone {
    fun String.call() { 
        // ...
    }
}
```


```
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun View.hide() {
    this.visibility = View.GONE
}
```


```
//13
interface Iterable<out T> {
    operator fun iterator(): Iterator<T>
}
```


```
//14
fun <T : Comparable<T>> Iterable<T>.sorted(): List<T> {
    if (this is Collection) {
        if (size <= 1) return this.toList()
        @Suppress("UNCHECKED_CAST")
        return (toTypedArray<Comparable<T>>() as Array<T>)
            .apply { sort() }
            .asList()
    }
    return toMutableList().apply { sort() }
}

fun Iterable<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}
```


```
import java.math.BigDecimal

class Product(
    val id: String,
    val title: String,
    val imgSrc: String,
    val description: String,
    val price: BigDecimal,
    val type: ProductType,
    // ...
)
```


```
//15
class ProductJson(
    val id: String,
    val title: String,
    val img: String,
    val desc: String,
    val price: String,
    val type: String,
    // ...
)
```


```
class ProductJson(
    val id: String,
    val title: String,
    val img: String,
    val desc: String,
    val price: String,
    val type: String,
    // ...
) {
    fun toProduct() = Product(
        id = this.id,
        title = this.title,
        imgSrc = this.img,
        description = this.desc,
        price = BigDecimal(price),
        type = enumValueOf<ProductType>(this.type)
    )
}
```


```
class ProductJson(
    val id: String,
    val title: String,
    val img: String,
    val desc: String,
    val price: String,
    val type: String,
    // ...
)

fun ProductJson.toProduct() = Product(
    id = this.id,
    title = this.title,
    imgSrc = this.img,
    description = this.desc,
    price = BigDecimal(this.price),
    type = enumValueOf<ProductType>(this.type)
)

fun Product.toProductJson() = ProductJson(
    id = this.id,
    title = this.title,
    img = this.imgSrc,
    desc = this.description,
    price = this.price.toString(),
    type = this.type.name
)
```