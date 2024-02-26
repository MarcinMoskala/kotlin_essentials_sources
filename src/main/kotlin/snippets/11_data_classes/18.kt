package f_11_data_classes.s_18

infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
