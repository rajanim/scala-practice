package mark.lewis.loops

/**
  * Created by rajanishivarajmaski1 on 4/6/17.
  *
  * loop concise and not error prone
  *
  * for each loop
  * range (0 to 9) 0 to 9  ( to is a method takes an int and another int
  * gives back range) same applies to 'until'
  *
  */
class ForLoops {

  //3*x^2 + 2*x-5

  def evalPoly (coeffs : Array[Double], x:Double) : Double = {

    var sum = 0.0

    for(i <- coeffs.indices){
      sum += coeffs(i)*math.pow(x, coeffs.length-1-i)
    }
    sum

  }


  println(evalPoly(Array(3.0,2.0,5.0),1.0))

}
