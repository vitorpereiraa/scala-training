package hof

object HighOrderFunction:
  
  def isEven(x: Int): Boolean = x % 2 == 0

  def isOdd(x: Int): Boolean = x % 2 != 0

  def square(x: Int): Int = x * x

  def cube(x: Int): Int = x * x * x

  // The function isPrime is a predicate that checks weather a number is prime or not.
  // Read: https://en.wikipedia.org/wiki/Prime_number
  def isPrime(x: Int): Boolean = ???

  // Function hof is supposed to receive a filter function f and mapping function m.
  def hof(f: Int => Boolean, m: Int => Int, xs: List[Int]): List[Int] = ???


