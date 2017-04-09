package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object loops {

  //if condition with variable should return same type to get proper returne type otherwise its "Any"

  //scala "for" are just for each loop, there are no old style c for loops that are internally while loop

  for (i<- 1 to 10){
    println(i)
  }

  for(i <- 1 until 10 ; if i % 3==0 || i%6==0){
    println(i)
  }


  for(i <- 1 until 10 ; if i % 3==0 || i%6==0){
    println(i)

    //work as expression give back values
  val s =   for{

      i<- 0 until(10)
      if i % 3==0 || i%6==0
      sqr = i*i
      j <- 'a' to 'c'
    } yield  {
      i -> j
    }
    println(s)
  }


}
