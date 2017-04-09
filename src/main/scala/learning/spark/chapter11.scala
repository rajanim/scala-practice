/*
package learning.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by rajanishivarajmaski1 on 1/14/17.
  */
class chapter11 {

  //spam classifier

  val conf = new SparkConf().setMaster("local[2]").setAppName("chapter_11")
  val sc = new SparkContext(conf)

  def spamClassifier () : Unit = {

    val spam = sc.textFile("spam.txt")
    val normal = sc.textFile("normal.txt")
//    val tf = new HashingTF(numFeatures = 10000)

    //  val spamFeatures =spam.map(mail => tf.transform(mail.split(" ")))
    //val normalFeatures = normal.map(mail => tf.transform(mail.split(" ")))

  }
}
*/
