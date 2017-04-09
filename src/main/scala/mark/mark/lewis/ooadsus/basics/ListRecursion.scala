package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class ListRecursion {

  def buildList() : List[String] = {
    //read from user
  val input = io.StdIn.readLine()
  if(input=="quit")
    {
      Nil
    }else{
    input :: buildList()
  }
  }

  //concat list of strings

  def concatStrings(words : List[String]) : String = {
    if(words.isEmpty){
      ""
    }else{
      words.head + concatStrings(words.tail)
    }

  }

  //pattern decoration //crashes
  val Array(a,b,c) = "one two".split(" ")
  //lets do pattern matching

  def concatStringPat(words: List[String]) : String = words match {
    case Nil => ""
    case h :: t => h + concatStringPat(t)
  }



}
