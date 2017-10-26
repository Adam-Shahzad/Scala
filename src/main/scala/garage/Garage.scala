package garage

import garage.models.{Bike, Car, Employee, Part, Vehicle}

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Garage extends App {

  var garageList = ListBuffer[Vehicle]()
  var employeeList = ListBuffer[Employee]()

  def addCar(id: Int, custID: Int, vehicleType: String, faults: ListBuffer[Part] ) = garageList += new Car(id, custID, vehicleType, faults)


  def addBike(id: Int, custID:Int, vehicleType :String, faults: ListBuffer[Part] ) = garageList+=new Bike(id, custID, vehicleType, faults)



  def removeVehicleById(id:Int): Unit = garageList = garageList.filter(a=>a.id!=id)


  def removeVehicleByType(vehicleType:String): Unit = garageList = garageList.filter(a=>a.vehicleType!=vehicleType)


  def outputGarageContents():Unit = garageList.foreach(vehicle => println(vehicle.toString))


  def addEmployee(fName:String,  sName:String,  id:Int ) = employeeList+=new Employee(fName,  sName,  id)


  def getVehicleByID(id:Int): Option[Vehicle] = garageList.find((a:Vehicle)=> a.id==id)



  val randomFaults = () =>
  {
    var temp = new ListBuffer[Part]()
    for(a<- 1 to 10){
      temp += new Part(a.toString, new Random().nextBoolean())
    }
    temp
  }


  //test
  addBike(1, 1, "B", randomFaults())
  outputGarageContents()
}






