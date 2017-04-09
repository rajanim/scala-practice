package mark.oodetails

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class MutableVect2D(private var _x: Double
                    , private var _y: Double) {
  def x = _x

  def y = _y

  def setX(newX: Double): Unit = _x = newX

  def setY(newY: Double): Unit = _y = newY

  // this is mutable vector


  def plus(mv: MutableVect2D): MutableVect2D = {

    _x += mv.x
    _y += mv.y
    this
  }

  def minus(mv: MutableVect2D): MutableVect2D = {
    _x -= mv.x
    _y -= mv.y
    this

  }

  def scale(c: Double): MutableVect2D = {
    _x *= c
    _y *= c
    this
  }

  def apply(index: Int) : Double = index match {
    case 0 => x
    case 1 => y
    case _ => throw new IndexOutOfBoundsException
  }

  def update(index : Int, newValue: Double ) : Unit = {
    index match {
      case 0 => _x = newValue
      case 1 => _y = newValue
      case _ => throw new IndexOutOfBoundsException(s"index NA $index")
    }
  }

}

object MutableVect2D {

  def main(args : Array[String]) : Unit = {

    val v1 = new MutableVect2D(1,2)
    val v2 = new MutableVect2D(2,1)
    v1.plus(v2)
    println(v1)
  }
}