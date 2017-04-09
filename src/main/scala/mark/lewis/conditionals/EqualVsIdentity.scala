package mark.lewis.conditionals

/**
  * Created by rajanishivarajmaski1 on 3/11/17.
  */
class EqualVsIdentity {

  def equalVsIndentityCheck : Unit = {

    println("sssss" eq "s"*5) // creates two new string object and compares value as well as hashcode (which will not be same) so false
    println("sssss" == "s"*5)
  }

}
