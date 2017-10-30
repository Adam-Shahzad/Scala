package garage.models
import scala.collection.mutable.ListBuffer

abstract class Vehicle {
  val id: Int
  val custID : Int
  val vehicleType:String
  var faults:ListBuffer[Part]

  def calculateCost():Int

  def fix()

  def calculateTime():Int
}
