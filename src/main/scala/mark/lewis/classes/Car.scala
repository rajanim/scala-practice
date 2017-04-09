package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
class Car(val make : String,  var reserved : Boolean) {

  def reserve(r:Boolean) : Unit = {
    reserved = r
  }

}

object Car extends  App {

  val car  = new Car("Tote", false)

  car.reserve(true)
  println(car.reserved)

  val tesla = new Car(make="Tesla" , reserved = true)
  println(tesla.reserved)

}
