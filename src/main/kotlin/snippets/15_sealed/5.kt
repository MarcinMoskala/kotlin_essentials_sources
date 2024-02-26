package f_15_sealed.s_5

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
