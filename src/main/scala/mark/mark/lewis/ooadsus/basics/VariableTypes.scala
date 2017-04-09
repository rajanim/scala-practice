package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object VariableTypes {
// val final decorations
  val name = "Suzzy"
  var age : String = "old age"
  age = "new age"

  // other types : String, Int, Double, Char, Boolean, Unit

    //tuple: Its tuple for 2 number and 2 string
  val t = (1,2,"red", "blue")

  val (a,b,c,d) = t
  println(t._1, a)

}
