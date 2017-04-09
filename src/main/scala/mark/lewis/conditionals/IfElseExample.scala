package mark.lewis.conditionals

/**
  * Created by rajanishivarajmaski1 on 3/11/17.
  */
class IfElseExample {

  def ifElseExample(): Unit = {
    //The syntax of an if is: if (condition) trueExpression else falseExpression.
    // The else clause is optional.
    val  age = scala.io.StdIn.readInt()
    val cost = if (age<13) 20 else 35
    println(cost)

  }

  def nestedIfElse(): Unit ={
    val  age = scala.io.StdIn.readInt()
    //nested functional style
    val cost = if (age < 13) 20 else if (age > 65) 20 else 35

  }


  def ifExampleFunctionalStyle : Unit = {
    val  age = scala.io.StdIn.readInt()
   // val cost = (if (age<13) 20 else 35)+(if (cooler) 5 else 0)+(if (waterPark) 10 else
   //   0)
   // println(cost)

  }
}
