package mark.lewis.loops

/**
  * Created by rajanishivarajmaski1 on 4/6/17.
  */
class WhileLoop {


  //while(cond){body}
  var i = 0
  while(i<10) {
    println(i)
     i +=1
  }

  def readInts : List[Int] = {
    var input = readLine
    var lst = List[Int]()
    while (input != "quit"){
      lst ::= input.toInt
      input = readLine
    }

  lst
  }



}
