def prime_factors(nr:Long):List[Long] = {
  def from(nr: Long):Stream[Long] = nr #:: from(nr+1L)
  def first_factor(nr:Long) = from(2L).find(nr%_==0)

  first_factor(nr).get match {
    case `nr`        => List(nr)
    case factor:Long => factor :: prime_factors(nr/factor)
  }
}

println(prime_factors(600851475143L).last)
