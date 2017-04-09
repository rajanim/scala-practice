package mark.oobasics.bank

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class Customer (val firstName: String,
                val lastName : String,
                val id : String,
                private var _address : Address
               ){


  private var _accounts : List[Account] = Nil


  def addAccount(account: Account) : Unit = {
    _accounts ::=account
  }

  def removeAccount(id:String) : Boolean = {
    val index = _accounts.indexWhere(_.id==id)
    if(index<0)false
    else {
     _accounts = _accounts.patch(index,Nil, 1)
      true
    }
  }

  //list immutable so it can be just returned
    //if array then it has to be deep copy and return
  def accounts = _accounts

  def changeAddress(a:Address) : Unit ={
   this._address = a
  }

  def address = _address


}
