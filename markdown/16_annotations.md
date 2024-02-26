```
//1
import java.math.BigDecimal
import java.math.MathContext

class Money(
    val amount: BigDecimal,
    val currency: String,
) {
    @Throws(IllegalArgumentException::class)
    operator fun plus(other: Money): Money {
        require(currency == other.currency)
        return Money(amount + other.amount, currency)
    }

    companion object {
        @JvmField
        val MATH = MathContext(2)

        @JvmStatic
        fun eur(amount: Double) =
            Money(amount.toBigDecimal(MATH), "EUR")

        @JvmStatic
        fun usd(amount: Double) =
            Money(amount.toBigDecimal(MATH), "USD")

        @JvmStatic
        fun pln(amount: Double) =
            Money(amount.toBigDecimal(MATH), "PLN")
    }
}
```


```
annotation class Factory
annotation class FactoryFunction(val name: String)

@Factory
class CarFactory {

    @FactoryFunction(name = "toyota")
    fun makeToyota(): Car = Toyota()

    @FactoryFunction(name = "skoda")
    fun makeSkoda(): Car = Skoda()
}

abstract class Car
class Toyota : Car()
class Skoda : Car()
```


```
class DoctorServiceTest {

    @Mock
    lateinit var doctorRepository: DoctorRepository

    lateinit var doctorService: DoctorService

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
        doctorService = DoctorService(doctorRepository)
    }

    // ...
}
```


```
@MustBeDocumented
@Target(AnnotationTarget.CLASS)
annotation class Factory

@Repeatable
@Target(AnnotationTarget.FUNCTION)
annotation class FactoryFunction(val name: String)
```


```
// JvmOverloads annotates primary constructor
class User @JvmOverloads constructor(
    val name: String,
    val surname: String,
    val age: Int = -1,
)
```


```
annotation class AnnotationWithList(
    val elements: Array<String>
)

@AnnotationWithList(["A", "B", "C"])
val str1 = "ABC"

@AnnotationWithList(elements = ["D", "E"])
val str2 = "ABC"

@AnnotationWithList(arrayOf("F", "G"))
val str3 = "ABC"
```