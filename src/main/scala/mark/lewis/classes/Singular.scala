/*
package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
class Singular[A] (element : A) extends Traversable[A] {
  override def foreach[U](f: (A) => U): Unit = f(element)

}

object Singular extends  App {
  val p =  new Singular("p", "q")
   p foreach println

  val head: String = p.head
}*/
