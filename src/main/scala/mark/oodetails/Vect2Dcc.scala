package mark.oodetails

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
case class Vect2Dcc(x: Double, y : Double) {

  def +(v: Vect2Dcc) = Vect2Dcc(x + v.x, y + v.y)

  def -(v: Vect2Dcc) = Vect2Dcc(x - v.x, y - v.y)
  def *(v: Vect2Dcc) = Vect2Dcc(x * v.x, y * v.y)
  def /(v: Vect2Dcc) = Vect2Dcc(x / v.x, y / v.y)
  def unary_-() = Vect2Dcc(-x, -y)
  def magnitude = math.sqrt(x*x + y*y)
  def apply(index: Int) : Double  = {
    index match {
      case 0 => x
      case 1 => y
      case _ => throw new IndexOutOfBoundsException
    }
  }

  //check only content of object for == unlike without case
  //case class includes apply method to create new

  //case class has copy method
  // It makes copy, copies arguments by name and if nothing present, picks default.
  //v3.copy(y=99)  assigns y=99 and x would remain same or take default.

  //case classes only for immutable types



}

object Vect2Dcc {
  def main(args: Array[String]): Unit = {
    val v1 = new Vect2Dcc(1,2)
    val v2 = new Vect2Dcc(2,2)

    val v3 = v1 + (v2)
    println(v3.magnitude)

  }
}
