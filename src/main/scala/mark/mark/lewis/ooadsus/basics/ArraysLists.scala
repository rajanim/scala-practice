package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object ArraysLists {

  // data in the form of collections.
  //array
  //array are mutable, can be obtained via index
  //size of array cannot be changed
  //call toList on Array
  val array = Array(1,2,3)

  val arrayZero = Array.fill(10)(0)
  //list
  //list  immutable
  //efficiently add new element to front
  // call toArray on list

  val list = List(1,2,3)

  val listzero = List.fill(10)(10)

  // fill is curried method,
  val listFromConsole = List.fill(10)(io.StdIn.readLine)
  //we can create var and make list mutated.
  //tabulate takes function and i is bound to index
  val tabArray = Array.tabulate(10)(i=> i*i)

  //use fill or tabulate instead of new Array.
  //this creates 10 null values, leading to null check, null pointer exceptions.
  //so recommended is use fill or tabulate for larger array creation
  val newArray = new Array[String](10)



}
