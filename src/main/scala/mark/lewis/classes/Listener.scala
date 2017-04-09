package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
abstract class Listener {
  def trigger

}

object ListenerO extends App{

  val listener = new Listener {
    override def trigger: Unit = {
      print(s"Trigger at ${new java.util.Date }")
    }
  }

  listener.trigger
}

class Listening {

  var listener : Listener = null

  def register (l : Listener) {listener = l}

  //def notify() {listener.trigger}
}