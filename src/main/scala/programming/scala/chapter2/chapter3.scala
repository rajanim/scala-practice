package programming.scala.chapter2

/**
  * Created by rajanishivarajmaski1 on 1/3/17.
  */
class chapter3 {


  // Scala Lists are always immutable
  def ListsInScala() : Unit = {
    val oneTofive = List((1).to(5))
    val sixToTen = List(6.to(10))
    val oneToTen = oneTofive :: sixToTen
    for (elem <- oneToTen) {print(elem)}
  }


  // Step 9 Use tuples
  //Although conceptually you could create tuples of any length, currently the Scala library only defines them up to Tuple22.
  def TupleInScala() : Unit = {

    val tuple = new Tuple3[String, Int, Int ]("Scala", 1, 2)
    print(tuple)
    print(tuple._1)

  }


  //Step 10. Use sets and maps
  // arrays are always mutable; lists are always immutable
// Scala also provides mutable and immutable alternatives for sets and maps
  def SetInScala() : Unit = {

    var sets = Set("test1", "test1")
    sets  += "test2"

    import scala.collection.mutable.Set
    val mutableSet = Set("test1", "test2")
    mutableSet += "test3"


    //map
    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")

    println(treasureMap(1))

  }


// Step 11. Function Style practice
  // var vs val  - Imperative lean towards mutable objects, var and functional lean towards immutable (val)
  //scala offers both as a toolbox although leaning towards immutable should be preferred.
  //Scala is a hybrid imperative/functional language.
  //imperative
  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1 }
  }

  //functional
  def printArgsFunctional(args: Array[String]): Unit = {
    args.foreach(println)
  }

  def formatArgs(args: Array[String]) = args.mkString("\n")


  //Step 12. Read lines from a file
  //In this section, you’ll build a script that reads lines from a file and prints them

  import scala.io.Source
  for(line <- Source.fromFile("").getLines())
    println(line.length)
}


object chapter3{
  def main(args: Array[String]): Unit = {
    val big = new java.math.BigInteger("12345")
    print(big)
    val greetStrings =  new Array[String] (3)
    greetStrings(0) = "hello"

    greetStrings.foreach(str => print(str))

  }
}