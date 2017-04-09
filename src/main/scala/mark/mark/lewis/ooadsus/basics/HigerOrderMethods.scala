package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object HigerOrderMethods {
//takes a function within function
  val a = Array(1,2,3)
  a.foreach(println)

  //map filter
  //map runs through and applies function to each value
  //multiply array by 2
  val multiplied = a.map(_*2)

  //something that needs to be applied to all

  //filter takes a function and should return boolean.
  a.filter(_<2)
  a.filter(_%2==0)

  // predicate //function that returns boolean value is called predicate : filter is

  a.count(_ % 2==0)

  a.exists(_<5)
  // returns boolean

  //returns false
  a.forall(_<5)

  //returns true
  a.forall(_<10)

  // retunsOption[Int] = None
  a.find(_%4==0)


  //folds and reduce : run through collection and accumulates
  a.reduce(_+_)
  //fold same as reduce except for mentioning what value to start with

  val stringsList = Array("this", "to")

  stringsList minBy(_.length)



}
