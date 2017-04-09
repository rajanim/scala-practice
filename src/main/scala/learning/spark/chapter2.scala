/*
package learning.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by rajanishivarajmaski1 on 1/8/17.
  */
class chapter2 {




}


object  chapter2 {


  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[2]").setAppName("chapter_2")
    val sc = new SparkContext(conf)

    val input = sc.textFile("src/main/resources/word_count.txt")
    val words =  input.flatMap(line => line.split(" "))
    val counts  = words.map(word => (word, 1)).reduceByKey{case (x,y) => x+y}
   // counts.saveAsTextFile("src/main/resources/output_word_count.txt")
    counts.foreach(each => println(each))

  }
}*/
