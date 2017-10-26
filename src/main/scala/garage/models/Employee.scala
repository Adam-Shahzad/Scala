package garage.models

class Employee(val fName:String, val sName:String, val id:Int, var available :Boolean) extends Person {

  override def toString = s"first name: $fName \n last name: $sName \n id: $id \n available:$available"

}