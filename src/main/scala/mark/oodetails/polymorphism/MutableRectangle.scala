package mark.oodetails.polymorphism

import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */
class MutableRectangle (private var _width: Double, private var _height: Double)extends Shape{

  def width = _width
  def height = _height

  def width_= (w:Double) = _width = w
  def height_= (h:Double) = _width = h

  override def area : Double = width*height
  override def perimeter : Double = 2*width+2*height

  override def draw(gc: GraphicsContext): Unit = ???
}
