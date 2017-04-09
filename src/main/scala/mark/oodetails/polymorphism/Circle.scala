package mark.oodetails.polymorphism

import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */
class Circle(val radius : Double, val color: Color) extends Shape with HasColor{

  override def area : Double = math.Pi * radius*radius
  override def perimeter : Double = 2*math.Pi*radius

  override def draw(gc:GraphicsContext) : Unit = {
    super.draw(gc)
  gc.fillOval(0,0,radius,radius)
  }
  }
