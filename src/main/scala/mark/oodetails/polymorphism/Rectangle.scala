package mark.oodetails.polymorphism

import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */
class Rectangle(val width: Double, val height: Double, val color: Color)
  extends Shape with HasColor {

  override def area: Double = width * height

  override def perimeter: Double = 2 * width + 2 * height

  override def draw(gc: GraphicsContext): Unit = {
    super.draw(gc)
    gc.fillRect(0, 0, width, height)
  }
}
