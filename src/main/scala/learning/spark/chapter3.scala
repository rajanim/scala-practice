/*
package learning.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by rajanishivarajmaski1 on 1/8/17.
  */
class chapter3 {
  val conf = new SparkConf().setMaster("local[2]").setAppName("chapter_3")
  val sc = new SparkContext(conf)

  def squaringValuesinRDD() : Unit = {


    val array =  sc.parallelize(List(1,2,3,4))
    val result = array.map(elem => elem*elem)
    println(result.collect().mkString(","))

    val lines = sc.parallelize(List("hello", "hi"))
    val words = lines.flatMap(line => line.split(" "))
    print(words.first())

  }

  def accumulatorsExample () : Unit = {

    val file = sc.textFile("")
    val blankLines = sc.accumulator(0)

    def extractLines() : Unit = {
      blankLines.add(1)
    }

  }
}
*/
