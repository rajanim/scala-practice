package mark.oobasics.bank

/**
  * Created by rajanishivarajmaski1 on 4/8/17.
  */
class Account(val customer: Customer,val id:String) {

  private var _balance =0

  customer.addAccount(this)

  def balance = _balance

  def deposit(amount: Int): Boolean ={
    if(amount<=0)
      false
    else
      _balance += amount
    true
  }

  def withDraw(amount: Int): Boolean = {
  if(amount<0 || amount> _balance) false
    else{
    _balance -= amount
    true
  }
  }
}
