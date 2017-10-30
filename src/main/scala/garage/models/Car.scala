package garage.models
import scala.collection.mutable.ListBuffer

class Car(val id: Int, val custID : Int, val vehicleType:String, var faults:ListBuffer[Part]) extends Vehicle {

  override def toString = s"customer Id: $custID \nID: $id \ntype: $vehicleType \nfaults: ${faults.toString()}\nExpected Cost: ${calculateCost()}"

  def returnOnlyBroken():ListBuffer[Part] = faults.filter((a)=>a.isBroken==true)

  def calculateCost():Int =100*returnOnlyBroken().length

  def fix():Unit = faults.foreach(fixed=>fixed.isBroken=false)

  def calculateTime():Int = returnOnlyBroken().length*30
}