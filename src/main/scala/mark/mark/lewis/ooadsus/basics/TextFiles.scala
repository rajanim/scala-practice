package mark.mark.lewis.ooadsus.basics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
import java.io.PrintWriter

import scala.io.StdIn
import scala.io.Source

class TextFiles {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("file.txt")
    //returns iterator : consumed as used // next and hasNext.
    //iterator also has map filter. //once map is called and iterator goes over
    //iterator is null end of execution. this saves memory
    //source is iterator of character, but we want whole lines, getLines
    //getLines : iterator of string of whole line iterator
    val lines = source.getLines()
    val matrix = lines.map(line => line.split(" ").map(_.toDouble))
    source.close()

    val pw= new PrintWriter("rowSum.txt")
    matrix.foreach(row => pw.println(row.sum))
    pw.close()
  }

}
