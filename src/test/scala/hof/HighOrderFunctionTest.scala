package hof

import hof.HighOrderFunction.*
import org.scalatest.funsuite.AnyFunSuiteLike

class HighOrderFunctionTest extends AnyFunSuiteLike:

  test("testIsPrime") {
    val l = (1 to 30).filter(isPrime)
    assert(l === List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
  }

  test("testHof") {
    val l = (1 to 5).toList
    assert(hof(isEven, square, l) === List(4, 16))
    assert(hof(isOdd, cube, l) === List(1, 27, 125))
    assert(hof(isPrime, square, l) === List(4, 9, 25))
  }

  test("isEven") {
    assert((1 to 15).filter(isEven) === List(2, 4, 6, 8, 10, 12, 14))
  }

  test("isOdd") {
    assert((1 to 15).filter(isOdd) === List(1, 3, 5, 7, 9, 11, 13, 15))
  }

  test("square") {
    assert((1 to 6).map(square) === List(1, 4, 9, 16, 25, 36))
  }

  /*
     Use anonymous functions instead!
     Replace each ??? in order to have anonymous functions in the calls.
  */

  test("anonymIsOdd") {
    assert(( 1 to 15 ).filter( ??? ) === List(1, 3, 5, 7, 9, 11, 13, 15))
  }

  test("anonymSquare") {
    assert(( 1 to 6 ).map( ??? ) === List( 1, 4, 9, 16, 25, 36))
  }
