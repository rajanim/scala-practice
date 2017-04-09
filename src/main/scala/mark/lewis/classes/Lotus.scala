package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
class Lotus (val color: String, reserved: Boolean) extends  Car("Lotus" , reserved){
}



object Lotus extends  App {

  val l = new Lotus("silver" , true)
  println(l.make, l.color, l.reserved)
}
