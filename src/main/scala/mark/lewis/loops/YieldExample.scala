package mark.lewis.loops

/**
  * Created by rajanishivarajmaski1 on 4/6/17.
  */
class YieldExample {


  def evalPoly(coeffs : Array[Double], x : Double) : Double = {

    (for(i <- coeffs.indices) yield {
      coeffs(i)*math.pow(x, coeffs.length-1-i)
    }).sum
  }
}
