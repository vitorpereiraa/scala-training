package hof

object HighOrderFunction:
  
  def isEven(x: Int) = x % 2 == 0

  def isOdd(x: Int) = x % 2 != 0

  def square(x: Int) = x * x

  def cube(x: Int) = x * x * x

  // The function isPrime is a predicate that checks weather a number is prime or not.
  def isPrime(x: Int) = ???

  // Function hof is supposed to receive a filter function f and mapping function m.
  def hof(f: Int => Boolean, m: Int => Int, xs: List[Int]): List[Int] = ???


