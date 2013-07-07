val max = 999
val multiplied = (1 to max).flatMap( x => (x to max).map(y=> x*y))
def is_palindrome(x:Int) = x.toString == x.toString.reverse

val last_palindrome = multiplied.filter(is_palindrome).max

println(last_palindrome)
