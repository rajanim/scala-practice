package other.sources

/**
  * Created by rajanishivarajmaski1 on 1/15/17.
  */
class Jkv {

  //field
  var field: Int = 0;


  //constructor
  def this(value: Int) = {
    this()
    this.field = value
  }

  //methods
  def getField() : Int = {
    return this.field
  }

  def addToField(num: Int): Unit = {
    this.field +=num
  }

  def main(args: Array[String]): Unit = {
    Jkv.sayHi()
  }
}


object Jkv {

  def sayHi(): Unit = {
    print("hi")
  }


}