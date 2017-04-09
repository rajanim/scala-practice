package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class LambdaExpressions {

  //short literal defining a function. example squaring values
  val square = (x:Double) => x*x //argument and expression after rocket
  println(square(10))

  val squareWithRet : Double => Double = x => x*x

  val twice : Double => Double= x => 2*x

  val lt : (Double,Double) => Boolean = _<_

  val ltlong : (Double,Double) => Boolean = (x,y) => x<y


}
