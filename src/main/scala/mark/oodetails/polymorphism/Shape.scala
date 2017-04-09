package mark.oodetails.polymorphism

import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */
abstract class Shape {

  def area : Double
  def perimeter : Double
  def draw(gc:GraphicsContext) : Unit
}

object Shape{
  def main(args: Array[String]): Unit = {

    val rectangle = new Rectangle(1,2, Color.ALICEBLUE)
    printShapeData(rectangle)
    val circle = new Circle(2,Color.ALICEBLUE)
    printShapeData(circle)

    val square = new Square(2)
    printShapeData(square)

    //Not safe thing to do.
    val square2 = new MutableSquare(5)
    square2.width = 100
    printShapeData(square)

  }
  def printShapeData(s:Shape) : Unit ={
    println(s" area: ${s.area}")
    println(s" perimeter: ${s.perimeter}")
  }


}