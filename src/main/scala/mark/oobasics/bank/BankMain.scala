package mark.oobasics.bank

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
object BankMain {

  def main(args: Array[String]): Unit = {
    val bank = new Bank
    var option = 0
    var customer : Option[Customer] = None
    var account : Option[Account] = None
    while(option!=10){
      println(menu)
      option match {
        case 1 => customer = Some(createCustomer(bank))
        case 2 => customer = selectCustomer(bank)
        case _ => println("not an option")
      }
    }
  }

  private def selectCustomer(bank:Bank) : Option[Customer] = {
    println("search by id or name?")
    val option = io.StdIn.readLine()
    if(option=="name")
      {
        bank.findCustomer("", "")
      }else{
      bank.findCustomer("")
    }

  }
  private def createCustomer(bank: Bank) : Customer ={
    var firstName = io.StdIn.readLine()
    var lasName = io.StdIn.readLine()
    var address: Address = readAddress()

   bank.addCustomer(firstName, lasName, address)


  }

  private def readAddress() : Address = {
    ???
  }
  private val menu = "select one of the following" +
    "1.create customer , 2: select customer"

}
