package mark.oodetails

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  //magnitude and direction to it

  */

class Vect2D(val x : Double, val y :Double) {

  def plus(v: Vect2D) = new Vect2D(x + v.x, y + v.x)

  def minus(v: Vect2D) = new Vect2D(x + v.x, y - v.x)

  def scale(c: Double) = new Vect2D(x*c, y*c)

  def magnitude = math.sqrt(x*x+y*y)

  def apply(index: Int) : Double = index match {
    case 0 => x
    case 1 => y
    case _ => throw new IndexOutOfBoundsException

  }

}

//companion object
object Vect2D {

  def main(args: Array[String]): Unit = {
    val v1 = new Vect2D(1,2)
    val v2 = new Vect2D(2,2)

    val v3 = v1.plus(v2)
    println(v3.magnitude)



  }
}
