```
interface Result
class Success(val data: String) : Result
class Failure(val exception: Throwable) : Result
```


```
abstract class Result
class Success(val data: String) : Result()
class Failure(val exception: Throwable) : Result()
```


```
val result: Result = getSomeData()
when (result) {
    is Success -> handleSuccess(result.data)
    is Failure -> handleFailure(result.exception)
}
```


```
class FakeSuccess : Result

val res: Result = object : Result {}
```


```
sealed interface Result
class Success(val data: String) : Result
class Failure(val exception: Throwable) : Result

// or

sealed class Result
class Success(val data: String) : Result()
class Failure(val exception: Throwable) : Result()
```


```
//1
fun commentValue(value: String) = when {
    value.isEmpty() -> "Should not be empty"
    value.length < 5 -> "Too short"
    else -> "Correct"
}

fun main() {
    println(commentValue("")) // Should not be empty
    println(commentValue("ABC")) // Too short
    println(commentValue("ABCDEF")) // Correct
}
```


```
enum class PaymentType {
    CASH,
    CARD,
    CHECK
}

fun commentDecision(type: PaymentType) = when (type) {
    PaymentType.CASH -> "I will pay with cash"
    PaymentType.CARD -> "I will pay with card"
    PaymentType.CHECK -> "I will pay with check"
}
```


```
sealed class Response<out V>
class Success<V>(val value: V) : Response<V>()
class Failure(val error: Throwable) : Response<Nothing>()

fun handle(response: Response<String>) {
    val text = when (response) {
        is Success -> "Success with ${response.value}"
        is Failure -> "Error"
        // else is not needed here
    }
    print(text)
}
```


```
sealed class MathOperation
class Plus(val left: Int, val right: Int) : MathOperation()
class Minus(val left: Int, val right: Int) : MathOperation()
class Times(val left: Int, val right: Int) : MathOperation()
class Divide(val left: Int, val right: Int) : MathOperation()

sealed interface Tree
class Leaf(val value: Any?) : Tree
class Node(val left: Tree, val right: Tree) : Tree

sealed interface Either<out L, out R>
class Left<out L>(val value: L) : Either<L, Nothing>
class Right<out R>(val value: R) : Either<Nothing, R>

sealed interface AdView
object FacebookAd : AdView
object GoogleAd : AdView
class OwnAd(val text: String, val imgUrl: String) : AdView
```


```
fun BinaryTree.height(): Int = when (this) {
    is Leaf -> 1
    is Node -> maxOf(this.left.height(), this.right.height())
}
```


```
//2
sealed interface Parent
class A : Parent
class B : Parent
class C : Parent

fun main() {
    println(Parent::class.sealedSubclasses)
    // [class A, class B, class C]
}
```