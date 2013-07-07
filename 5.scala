def from(nr: Long):Stream[Long] = nr #:: from(nr+1L)

// this eliminates a lot of possibilities. One step further would
// be to just take a set of primefactors which is a superset of
// the sets of primefactors of the numbers below twenty.
// but then it would be calculating, not so much programming ;)
def times_primes_below_twenty(x:Long) = x*2*3*5*7*11*13*17*19

var divisible_numbers = from(1).map(times_primes_below_twenty)

for (x <- 1 to 20) {
  divisible_numbers = divisible_numbers.filter(_%x==0)
}
println(divisible_numbers.head)
