package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
class User {
  val name: String = "Yubaba"

  def greet: String = s"Hello from $name"

  override def toString = s"User($name)"
}

object User extends  App{
  val u = new User
  println( u.greet )
}

