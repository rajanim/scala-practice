package mark.oodetails.polymorphism

import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */
//inherently an abstract class
trait HasColor {

  val color : Color
  def draw(gc:GraphicsContext) : Unit ={
    gc.setFill(color)
  }
}
