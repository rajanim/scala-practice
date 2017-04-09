
//lists
val lst = List(2,3,4)

1::lst
8::lst
7::lst
5::lst



def inputList() : List[Int] = {

  val in = scala.io.StdIn.readInt()
  if(in == "quit") Nil else in.toInt::inputList()
}


def operateOnList(lst : List[Int],  func:(Int, Int) => Int) : Int = {
  if(lst.tail == Nil) lst.head else func(lst.head, operateOnList(lst.tail, func))

}

operateOnList(lst, _+_)


def operateOnList2(lst:List[Int], func:(Int,Int)=>Int):Int = lst match {
  case h::Nil => h
  case h::t => func(h, operateOnList2(t, func))
  case _ => 0
}
