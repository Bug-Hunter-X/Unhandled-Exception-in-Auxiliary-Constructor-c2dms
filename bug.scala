```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor

  def myMethod(): Int = {
    if (x > 10) {
      x * 2
    } else {
      throw new IllegalArgumentException("x must be greater than 10")
    }
  }
}

 object Main extends App{
 val myObj = new MyClass()
 println(myObj.myMethod())
 }
```