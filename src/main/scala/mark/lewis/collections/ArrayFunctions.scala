package mark.lewis.collections

/**
  * Created by rajanishivarajmaski1 on 4/5/17.
  */
class ArrayFunctions {

  //mutating or making side effect
  def setArray(arr: Array[Int], v: Int, index: Int) : Unit  = {
    if(index < arr.length){
      arr(index) = v
      setArray(arr,v,index+1)
    }

  }
  def operateOnArray(arr: Array[Int], i: Int, f : (Int, Int) => Int ) : Int = {
    if(i < arr.length-1){
          f(arr(i), operateOnArray(arr, i+1, f))
    }else{
      arr(i)
    }

  }

}


object ArrayFunctions extends App{

  val arrayFunctions = new ArrayFunctions
  val nums = Array(1,2,3,4,5,6)
  arrayFunctions.setArray(nums, 10, 0)
  nums.foreach(println(_))
  println(arrayFunctions.operateOnArray(nums,0,_+_))


}