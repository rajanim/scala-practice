package mark.oobasics.bank

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class Bank {

  private var _customers : List[Customer] = Nil
  private var _accounts : List[Account] = Nil

  private var nextCustomerNumber = 0
  private var nextAccNumber = 0

  def addCustomer(fname: String, lname: String,
                  address:Address) : Customer = {
    nextCustomerNumber += 7
    val c = new Customer(fname,lname, nextCustomerNumber.toString, ???)
    _customers ::= c
c
  }

  def openAccount(c:Customer) : Account = {

    nextAccNumber +=13
    val account = new Account(c,nextAccNumber.toString)
  _accounts ::= account
    account
  }

  def closeAccount(a:Account) : Boolean = {
    if(_accounts.contains(a)) {
      _accounts = _accounts.filter(_ != a)
    true
    }else
      false
  }

  //option because there can be possibility that no customer exist
  def findCustomer(fname:String, lname: String): Option[Customer] ={

    _customers.find(c => c.firstName==fname && c.lastName==lname)
  }


  def findCustomer(id:String): Option[Customer] ={

    _customers.find(_.id==id)
  }


}
