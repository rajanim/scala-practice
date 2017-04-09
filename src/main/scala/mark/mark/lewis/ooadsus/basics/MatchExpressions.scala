package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object MatchExpressions {

  //similar to switch in java but powerful in matching
  //does pattern matching

  val fizzBuzz = for(i<- 1 to 20) yield {
    (i%3, i%5) match {

      case (0,0)  => "fizzbuzz"
      case (0,_) => "fizz"
       case(_,0) => "buzz"
      case _ =>  i.toString

    }

  }

  val str = "123a"
  val num = try {
    str.toInt
  } catch {
    case ex : NumberFormatException => 0
  }
    print(num)
}
