package mark.lewis.scalabasics

/**
  * Created by rajanishivarajmaski1 on 3/11/17.
  */
class SwapFirstLastName {


  def swapNameUsingSubString(name: String) : Unit = {
    val name = "Adam John"
    val spaceIndex = name.indexOf(' ')
    val firstName= name.substring(0, spaceIndex)
    val lastName = name.substring(spaceIndex+1)
    val printName = s"$lastName, $firstName"
    println(printName)

  }

  def swapNameUsingSplitMethod(name: String) : Unit = {

    val (firstName, lastName ) = name.splitAt(name.indexOf(" "))
    val printName = s"${lastName.trim}, $firstName"
    println(printName)

  }

}

//notes
//The splitAt method returns a tuple