package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
class UserParam(n: String) {
    val name: String = n

  def greet : String = s"hello from $name"

  override def toString = s"User($name)"


}

object UserParam extends App{
  val u = new UserParam("Zen")
  println(u.greet)

  val users = List(new UserParam("R"),new UserParam("L") )
  val sizes = users map (_.name.size)

  val sort = users sortBy (_.name)

  val search = users find (_.name contains "3")

  val greet = search map (_.greet) getOrElse "hi"

  println(sort)

  println(search)

  println(greet)


}
