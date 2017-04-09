package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class SequenceMethods {

  //
  val a = Array(1,2,3,4)
  a.drop(2) // first two go away
  a.dropRight(2) // last two elements dropped
  a.head // first element
  a.tail // last lements except first 1
  a.last // last element
  a.splitAt(2)  // before that index goes one
  a.take(2) //first two elements take
  a.takeRight(2) // last two elements take
  a.slice(2,5) // first index inclusive and second element exclusive
  //all these apply to list and array and give new object evry time.

  a.patch(3, Array(1,2,3),3)

  a.diff(Array(1,8,9)) // take off all elements from original array comparing with elements privided in inner array
   // incase of duplicates it removes only one time.

  //zip with zipWithIndex

}
