package f_16_annotations.s_3

@MustBeDocumented
@Target(AnnotationTarget.CLASS)
annotation class Factory

@Repeatable
@Target(AnnotationTarget.FUNCTION)
annotation class FactoryFunction(val name: String)
