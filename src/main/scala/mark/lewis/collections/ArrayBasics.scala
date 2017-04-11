package mark.lewis.collections

/**
  * Created by rajanishivarajmaski1 on 4/10/17.
  */
//give ability to store multiple values in single variable.

class ArrayBasics {

 // val array = Array(1,2,3)

  val doubleArray: Array[Double] = Array(1,2,3)

  //create large arrays
  //zeros: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  val zeros = new Array[Int](20)


  //type of collection called sequence.
  //they have order to them, so we can give
  //location to get value at certain position.

  //val array_1 = array(1)

  def printArrayValues (array : Array[Int]) : Unit = {

    for (i <- 1 until array.length) {
      println(array(i))
    }
  }

    def updateArrayValues(num : Int, array: Array[Int]) : Array[Int] = {

      for (i <-1 until array.length){
        array(i) = num
      }
      array
    }

  //fill elements of an array, nothing to return but just alter array
  def fillArray(arr: Array[Int], num:Int, index:Int): Unit = {

    //base case
    if(index<arr.length){
      arr(index) = num
      fillArray(arr, num, index+1)
    }

  }

  def printArrays(arr:Array[Int], index : Int) : Unit= {
    if(index<arr.length) {
      print(arr(index) + " ")
    printArrays(arr, index+1)
    }else{
      println()
    }

  }

  def readArray(arr: Array[Int], index : Int) : Unit = {

    if(index<arr.length){
      arr(index) = io.StdIn.readInt()
      readArray(arr, index+1)
    }
  }

  def sumArray(arr:Array[Int], index: Int) : Int = {
    if(index>=arr.length) 0
    else arr(index) + sumArray(arr,index+1)
  }



 }

object ArrayBasics {

  def main(args: Array[String]): Unit = {
    val arrayBasics = new ArrayBasics
    val nums = Array(1,2,3)
    arrayBasics.fillArray( nums, 2, 0)
    arrayBasics.updateArrayValues(2, nums)
    arrayBasics.printArrays( nums, 0)

    val smallArray = new Array[Int](5)

    arrayBasics.printArrays( smallArray, 0)

    arrayBasics.readArray(smallArray, 0)
    arrayBasics.printArrays( smallArray, 0)
  }
}
