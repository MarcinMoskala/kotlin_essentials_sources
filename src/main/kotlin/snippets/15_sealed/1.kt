package f_15_sealed.s_1

interface Result
class Success(val data: String) : Result
class Failure(val exception: Throwable) : Result
