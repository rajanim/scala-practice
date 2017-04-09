package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object StringInterpolation {

  val name = "Suzzy"
  var age = 10
  val message = "The age" + name + "is" + age

  var msgScala = s"The age of $name is $age"

  val t = (1,2,"hi there")

  msgScala = s"${t._3} he age of $name is $age"


}
