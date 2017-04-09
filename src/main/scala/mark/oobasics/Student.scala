package mark.oobasics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class Student(val firstName: String,
              val lastName: String,
              private  var quiz:List[Int]=Nil,
              private var assns:List[Int]=Nil,
              private  var tests: List[Int]=Nil) {



  private def validGrade(grade : Int) : Boolean = grade>=20 && grade <=120

  def addQuiz(grade: Int) : Boolean = {
    if(validGrade(grade)) {
      quiz ::= grade
      true
    }
    else false

  }
  def avg : Double = {
    quizAvg*0.1 + assnAvg*0.5 + testAvg*.4

  }

  def quizAvg : Double = if(quiz.isEmpty) 0
  else  quiz.sum.toDouble/quiz.length


  def testAvg : Double = if(tests.isEmpty) 0
  else tests.sum.toDouble/tests.length


  def assnAvg : Double = if(assns.isEmpty) 0
  else assns.sum.toDouble/assns.length




}
