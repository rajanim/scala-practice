package programming.scala.chapter2

/**
  * Created by rajanishivarajmaski1 on 12/20/16.
  */
class chapter2 {

  //Inline function
  def greet = print("Hello")

  //Two param function
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }



 //while loop
 def print5timesWhileLoop(): Unit ={
   var i=0
   while (i < 5){
     println(i)
     i +=1
   }
 }

  //for loop
  def printWithForLoop() : Unit = {
    val greetStrings =  new Array[String] (3)
    greetStrings(0) = "hello"

    val numbers = List("1", "2", 3)

    for (elem <- numbers) {
      print(elem)
    }

    greetStrings.foreach(str => print(str))

    for(i <- 0 to 2)
      print(greetStrings(i))


  }


}

object chapter2 {

  //defining variable.
  val chapter = new chapter2

  def main(args: Array[String]): Unit = {
    chapter.greet
    print(chapter.max(2, 3))

  }

}