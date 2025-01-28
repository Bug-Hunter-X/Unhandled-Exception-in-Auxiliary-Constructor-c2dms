```scala
class MyClass(val x: Int) {
  def this() = this(11) // Initialize x to a value that satisfies the condition

  def myMethod(): Int = {
    if (x > 10) {
      x * 2
    } else {
      // Handle the case where x is not greater than 10.  Throwing an exception might still be appropriate 
      // or you might return a default value instead.
      throw new IllegalArgumentException("x must be greater than 10")
    }
  }
}

object Main extends App {
  val myObj = new MyClass()
  println(myObj.myMethod())
  val myObj2 = new MyClass(5)
  println(myObj2.myMethod()) //this will throw exception
}
```