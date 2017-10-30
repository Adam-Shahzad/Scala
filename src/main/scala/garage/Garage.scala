package garage

import garage.models.{Bike, Car, Employee, Part, Vehicle}

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Garage extends App {

  var garageList = ListBuffer[Vehicle]()
  var employeeList = ListBuffer[Employee]()

  def addCar(id: Int, custID: Int, vehicleType: String, faults: ListBuffer[Part]) = {
    garageList += new Car(id, custID, vehicleType, faults)
    employeeList(employeeList.indexOf(employeeList.minBy(e=>e.available))).addTask(getVehicleByID(id).calculateTime())
  }


    def addBike(id: Int, custID: Int, vehicleType: String, faults: ListBuffer[Part]) = {
      garageList += new Bike(id, custID, vehicleType, faults)
      employeeList(employeeList.indexOf(employeeList.minBy(e=>e.available))).addTask(getVehicleByID(id).calculateTime())
    }


    def removeVehicleById(id: Int): Unit = garageList = garageList.filter(a => a.id != id)


    def removeVehicleByType(vehicleType: String): Unit = garageList = garageList.filter(a => a.vehicleType != vehicleType)


    def outputGarageContents(): Unit = garageList.foreach(vehicle => println(vehicle.toString))


    def addEmployee(fName: String, sName: String, id: Int, available: Int) = employeeList += new Employee(fName, sName, id, available)


    def getVehicleByID(id: Int): Vehicle = garageList.find((a: Vehicle) => a.id == id).getOrElse(null)



    val randomFaults = () => {
      var temp = new ListBuffer[Part]()
      for (a <- 1 to 10) {
        temp += new Part(a.toString, new Random().nextBoolean())
      }
      temp
    }


    //test
    addEmployee("a","a",1,0)
    addEmployee("b","b",2,1)
    employeeList.foreach(employee=>println(employee.toString))
    addBike(1, 1, "B", randomFaults())
    employeeList.foreach(employee=>println(employee.toString))
    outputGarageContents()

}






