package mark.oodetails

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class AXPY {

  def sparse(size: Int, elements: Seq[(Int, Double)]): SparseVector = {
    require(size > 0, "The size of the requested sparse vector must be greater than 0.")

    val (indices, values) = elements.sortBy(_._1).unzip
    var prev = -1
    indices.foreach { i =>
      require(prev < i, s"Found duplicate indices: $i.")
      prev = i
    }
    require(prev < size, s"You may not write an element to index $prev because the declared " +
      s"size of your vector is $size")

    new SparseVector(size, indices.toArray, values.toArray)
  }

  private def axpy(a: Double, x:SparseVector, y:SparseVector) : Unit = {
    val xValues = x.values
    val xIndices = x.indices
    val yValues = y.values
    val nnz = xIndices.length

    if (a == 1.0) {
      var k = 0
      while (k < nnz) {
        yValues(xIndices(k)) += xValues(k)
        k += 1
      }
    } else {
      var k = 0
      while (k < nnz) {
        yValues(xIndices(k)) += a * xValues(k)
        k += 1
      }
    }
  }
}

class SparseVector(
                    val size: Int,
                    val indices: Array[Int],
                    val values: Array[Double]){

  override def toString() : String = {
    val ret: StringBuilder = new StringBuilder
    for(i <- 0 until indices.length){
      ret.append(indices(i)).append(":")
        .append(values(i)).append(" ")
    }
    ret.toString()
  }
}


object AXPY{

  def main(args: Array[String]): Unit = {

    val axpy = new AXPY
    val vector1 = axpy.sparse(5, Seq((0, 1.0), (1, 1.0)))

    println(vector1.toString())
    val vector2 = axpy.sparse(5, Seq((0, 1.0), (1, 1.0), (2, 1.0)))
    println(vector2.toString())

    val output = axpy.axpy(5.0, vector1 , vector2)
    println(vector2.toString())


  }
}

