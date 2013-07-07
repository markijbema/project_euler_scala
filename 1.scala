def multiple_of_three_or_five(x:Int) =  x % 3 == 0 || x % 5 == 0
def sum_of_multiples(upperlimit: Int) = (1 until upperlimit).filter(multiple_of_three_or_five).sum

println(sum_of_multiples(1000))
