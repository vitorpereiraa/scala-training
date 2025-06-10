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

// Exercise 1

/*
  Write a function lessThan with two arguments that returns true with the first argument is less
  than the second one, otherwise it should return false. Is it necessary to use a conditional
  expression if-else?
*/

// Exercise 2
/*
  Without using || and &&, write the following functions
  - and
  - or
  such that for all argument x and y,
  - and(x, y) == x && y
  - or(x, y) == x || y.
*/

def and(b1: Boolean, b2: Boolean): Boolean = ???

def or(b1: Boolean, b2: Boolean): Boolean = ???

assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)
println("tests passed")

// Factorial
def factorial(n: Long): Long =
  if (n == 0) 1 else n * factorial(n - 1)