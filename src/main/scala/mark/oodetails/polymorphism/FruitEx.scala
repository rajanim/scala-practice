package mark.oodetails.polymorphism

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */

class Skin

class Fruit{

  def canEatSkin : Boolean = true
  def fractionLiquidContent : Double = 0.5
  def peel(): Skin = ???
  def slice () : Unit = ???

}
object FruitEx {
  makeBreakFastShake(new Banana())

  def makeBreakFastShake(fruit:Fruit) : Unit = {
    if(!fruit.canEatSkin) fruit.peel()
    blender +=fruit
    blender +=juice
    if(fruit.fractionLiquidContent<0.3) blender += juice
    blender +=ice
    blender.blend

  }


}
