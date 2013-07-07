def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a+b)
val fibonacci = fib(1,1)

def even(a: Int) = a % 2 == 0

val small_fibs = fibonacci.takeWhile(_<4000000)

val answer_sum = small_fibs.filter(even).sum

println(answer_sum);
