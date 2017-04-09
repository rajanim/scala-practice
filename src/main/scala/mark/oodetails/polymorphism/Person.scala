package mark.oodetails.polymorphism

/**
  * Created by rajanishivarajmaski1 on 4/9/17.
  */
trait Person {}

trait Parent extends Person{}

trait Female extends  Person{}
class Mother extends Parent with  Female{}
