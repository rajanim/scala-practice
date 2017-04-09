Array(1,2,3,4)

Array(1.0, 2.0, 3.0, 4)

Array('a', 'b')

Array[Double](1,2)

Array(1,2, "a")


val array = Array(2,4,6,8)

array(0)

array(2) = 5 // is this possible for val type arrays?
// yes because the value is changed not array itself.
//if we try to reassign 'array' variable, it will report error
//example : array = Array(2,4,6) reassigning array val

array(2)



def fillArray (arr : Array[Int], index : Int) : Unit = {
if(index<arr.length){
  arr(index) = scala.io.StdIn.readInt()
  fillArray(arr, index+1)

}
}

val numbers = Array(0,0,0,0)
fillArray(numbers,0)


def operateOnArray(arr: Array[Int], index: Int, func:(Int, Int) => Int) : Int = {
  if(index<arr.length-1)
    {
      func(arr(index), operateOnArray(arr, index+1, func))
    }
  else {
    arr(arr.length-1)
  }
}



