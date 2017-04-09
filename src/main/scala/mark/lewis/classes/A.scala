package mark.lewis.classes

/**
  * Created by rajanishivarajmaski1 on 4/1/17.
  */
class A {

  def hi  = "Hello from A"

  override def toString  = getClass.getName
}


class B extends A {

}

class C extends B {

  override  def hi = "hi C " + super.hi
}

object abc extends App{
  val hia = new A().hi
  println(hia)

  val hib =   new B().hi
  println(hib)

  val hic = new C().hi
  println(hic)

}