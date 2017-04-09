package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class CurryingPassByName {

  //fill uses pass by name
  //tabulate uses currying

  def add(x:Int, y:Int): Int = x+y

  def addC(x:Int)(y:Int): Int = x+y

  //add one at a time is currying
  val curryAdd = addC(3)(_)


  def threeTuple(a: Double):(Double,Double,Double) ={
    (a,a,a)
  }
  //only number
  threeTuple(5)
  //what if random numbers method returns still same
  threeTuple(Math.random)

  //pass by name args // function is curried
  def threeTuplesByname(a: => Double) : (Double, Double, Double) = {
    (a,a,a)
  }
  threeTuplesByname(math.random)




}
