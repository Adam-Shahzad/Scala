package garage.models


class Customer(val fName:String, val sName:String, val id:Int) extends Person {

  override def toString = s"first name: $fName \n last name: $sName \n id: $id"

}
