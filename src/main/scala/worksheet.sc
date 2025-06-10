// Expressions

1 + 2
1.+(2) // everything is an object!!

// Values

// use val keyword for immutable values!
val c1 = 1  // inferred type
val c2: Int = 1

// Types in scala
val b: Byte = 1
val i: Int = 1
val l: Long = 1
val s: Short = 1
val d: Double = 2.0
val f: Float = 3.0

// Functions
def square(x: Double) : Double = x * x
square(2)

val radius = 2

val area = math.Pi * radius * radius

def areaf = math.Pi * radius * radius

areaf

// Conditional expression
def abs(x: Int) = if (x >= 0) x else -x
abs(-1)

/*
  Exercise 1
  Write a function lessThan with two arguments that returns true with the first argument is less
  than the second one, otherwise it should return false. Is it necessary to use a conditional
  expression if-else?
*/


/*
  Exercise 2
  Without using || and &&, write the following functions
  - and
  - or
  such that for all argument x and y,
  - and(x, y) == x && y
  - or(x, y) == x || y.
*/

def and(x: Boolean, y: Boolean): Boolean = ???

def or(x: Boolean, y: Boolean): Boolean = ???

assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)
println("tests passed")

// Recursion
def factorial(n: Long): Long =
  if (n == 0) 1 else n * factorial(n - 1)

/*
   Exercise 3
   Write a recursive function sumDown that sum all values between the value received and zero
*/

def sumDown(x: Int): Int = ???

assert(sumDown(5) == 15)
println("tests passed")

/*
   Exercise 4
   Write a recursive function nSymbol with two arguments:
   the first one indicates the number of times that the symbol (the second argument) should be returned.
*/

def nSymbol(i: Int, c: Char) : String = ???

// Test
assert(nSymbol(5,'*') == "*****")

/*
   Exercise 5
   Write a recursive function mult with two arguments that returns the multiplication of the two values.
   The multiplication is to be computed using sums. For instance, 4 * 3 = 4+ 4 +4 = 3 + 3 + 3 + 3
*/
def mult(x: Int, y: Int): Int = ???

assert(mult(4,3) == 12)
assert(mult(0,0) == 0)
assert(mult(0,1) == 0)
assert(mult(1,0) == 0)
assert(mult(-3,-3) == 9)
assert(mult(-3,4) == -12)
assert(mult(3, -4) == -12)

// Tail Recursion

/*
  Provide solutions for the three previous exercises using tail recursion.
  First, think about a proper signature for the functions.
*/
