package mark.lewis.collections

/**
  * Created by rajanishivarajmaski1 on 4/5/17.
  */
class ListScala {


  val lists = List(1,2,3)




  def inputList(n: Int) : List[Int] = {
    if(n<1)
      Nil
    else
      readInt :: inputList(n-1)
  }


  def operateOnList(lst: List[Int], base : Int, f : (Int, Int) => Int) : Int = {

  if(lst == Nil) base
  else f(lst.head, operateOnList(lst.tail, base, f))

  }

  def fillList(n:Int, v:Double) : List[Double] = {

    if(n<1) Nil
    else
      v :: fillList(n-1, v)
  }


}


object ListScala extends  App {

  val listScala  = new ListScala

  val list = listScala.inputList(5)
  println(list)


}
