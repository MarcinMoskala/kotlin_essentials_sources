package f_15_sealed.s_2

abstract class Result
class Success(val data: String) : Result()
class Failure(val exception: Throwable) : Result()
