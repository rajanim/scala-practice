package mark.lewis.caseclasses.EvalPoly

/**
  * Created by rajanishivarajmaski1 on 4/7/17.
  */
class scala {

  //has a b and c and x
  def evalQuadratic(a: Double=0.0, b: Double=0.0, c:Double=0.0, x:Double) : Double = {
    a*x*x+b*x+c

  }

  //pass by name in any order
  evalQuadratic(x=2, a=2, b=1, c=1)

  evalQuadratic(1.0, x=2, b=1, c=1)

  //defaults
  val x:Double = 1
 // evalQuadratic(x)

}
