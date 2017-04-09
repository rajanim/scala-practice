package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
abstract class AbstractCar {
val year : Int
  val automatic : Boolean = false
  def color: String


}


object  AbstractCar extends App{
  new AbstractCar {override def color: String = "Red"

    override val year: Int = 2006
  }

  class RedMini(val year : Int) extends AbstractCar{
    override def color: String = "red"

  }


}