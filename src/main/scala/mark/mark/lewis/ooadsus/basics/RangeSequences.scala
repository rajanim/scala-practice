package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object RangeSequences {

  // for loop uses range
  // to or until (exclusive on high end) can be used and these(to and until) are actually
  //methods
  for(i <- 1 to 10) {
    println(i)
  }

  //move forward by 2
  for(i <- 1 to 10 by 2) {
    println(i)
  }

  // when used double as moving window, its behavior is different.
  // if needed to move reverse, then by negative number
  for( i <- 10 to 1 by -1) {
  println(i)
  }



}
