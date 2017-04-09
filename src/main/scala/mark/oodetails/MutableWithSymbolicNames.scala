package mark.oodetails

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */


package mark.oodetails

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class MutableWithSymbolicNames(private var _x: Double
                    , private var _y: Double) {
  def x = _x

  def y = _y

  def setX(newX: Double): Unit = _x = newX

  def setY(newY: Double): Unit = _y = newY

  // this is mutable vector


  def +(mv: MutableWithSymbolicNames): MutableWithSymbolicNames = {

    _x += mv.x
    _y += mv.y
    this
  }

  def -(mv: MutableWithSymbolicNames): MutableWithSymbolicNames = {
    _x -= mv.x
    _y -= mv.y
    this

  }

  def *(c: Double): MutableWithSymbolicNames = {
    _x *= c
    _y *= c
    this
  }

}

object MutableWithSymbolicNames {

  def main(args : Array[String]) : Unit = {

    val v1 = new MutableWithSymbolicNames(1,2)
    val v2 = new MutableWithSymbolicNames(2,1)
    v1+(v2)
    println(v1)
  }
}