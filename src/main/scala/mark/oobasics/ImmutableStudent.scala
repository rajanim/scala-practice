package mark.oobasics

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class ImmutableStudent (val firstName: String,
                        val lastName: String,
                        val quiz:List[Int]=Nil,
                        val assns:List[Int]=Nil,
                        val tests: List[Int]=Nil){

//quiz assns need not be private cos they are val and cannot be modified
def addQuiz(grade: Int) : ImmutableStudent =
new ImmutableStudent(firstName, lastName,
  grade::quiz, assns, tests)

  //


}
