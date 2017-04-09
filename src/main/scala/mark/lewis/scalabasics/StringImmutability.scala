package mark.lewis.scalabasics

/**
  * Created by rajanishivarajmaski1 on 3/11/17.
  */
class StringImmutability {

  /*
  * The lowerName variable refers to a string that is all lower case, but when we check on the value of the original name variable, it has not been changed.
  * None of the methods of String change the value.
  * Same applies to trim method or any string operation methods
  * */
  def demoStringImmuatable() : Unit ={

    val name = "Adam"
    val lowerName = name.toLowerCase
    println(name)
    print(lowerName)

  }

}
