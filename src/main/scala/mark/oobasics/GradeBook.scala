package mark.oobasics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object GradeBook {

  def main(args: Array[String]): Unit = {

    val students = List(new Student("Jane", "Doe"),
      new Student("John", "Doe"))

  def printStudent(s:Student) : Unit = {
    println(s.firstName, s.lastName)
    println("grade = " + s.avg)

  }
  }
}
