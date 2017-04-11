package mark.lewis.collections

/**
  * Created by rajanishivarajmaski1 on 4/10/17.
  */
class Lists {

//its possible to get elements by index but not recommended way to read list
  //lists are immutable
  //we cannot do list(2) = newValue
  //cons : construction is used to add new element to list
  //99.0 :: list
  //1::2::3:: Nil
 // List[List[Int]] = List(List(1, 2, 3))
  //read from lists : head and tail.
//Fill only when there's data

  /**
    *  Read list of a given length.
    *
    */

  def readList(len:Int) : List[Int] =  {
    if(len<1) Nil
    else
      io.StdIn.readInt() :: readList(len-1)
  }

  /**
    *
    * @return
    */
  def readListsUntilQuit() : List[Int] = {
    val word = io.StdIn.readLine()
    if(word=="quit") Nil
    else
      word.toInt :: readListsUntilQuit()

  }

  def sumList(list:List[Int]) : Int = {
    if(list.isEmpty) 0 else
      list.head + sumList(list.tail)
  }


def readNameAndAges () : List[(String, Int)] = {
  val name = io.StdIn.readLine()
  if(name=="quit") Nil
  else
    {
      val age = io.StdIn.readInt()
      (name, age) :: readNameAndAges()
    }
}


  def findYoungest(list: List[(String, Int)]): (String, Int) ={
    if(list.length==1)
      list.head
    else{
      val youngest = findYoungest(list.tail)
      if(list.head._2<=youngest._2) list.head else youngest
    }
  }
  val lst = readListsUntilQuit()
  println(lst)
  println(sumList(lst))

}
/*

object Lists {
  def main(args: Array[String]): Unit = {

    val lst = readList(5)

    println(lst)
  }
}*/
