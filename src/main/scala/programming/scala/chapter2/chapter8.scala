package programming.scala.chapter2

/**
  * Created by rajanishivarajmaski1 on 1/7/17.
  */
class chapter8 {


  //Partially applied functions
  def optimizedForLoop() : Unit = {
    val someNumbers = List(1,2,3)

    //instead of
    someNumbers.foreach(x => println(x))
    someNumbers.foreach(println _)




  }
}
