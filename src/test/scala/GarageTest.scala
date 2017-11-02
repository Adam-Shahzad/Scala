import garage.Garage
import garage.models.Employee

import scala.collection.mutable.ListBuffer


class GarageTest extends UnitSpec {

   var g:Garage = new Garage

  "addEmployee" should("create and employee object and places it in the employeeList") in {
    g.addEmployee("a","a",1,0)
    assert(g.employeeList(0).fName=="a")
    assert(g.employeeList(0).sName=="a")
    assert(g.employeeList(0).id==1)
    assert(g.employeeList(0).available==0)
}
  "addBike" should("create and bike object and places it in the vehicleList") in {
    g.addBike(1,1,"s",ListBuffer())
    assert(g.garageList(0).id==1)
    assert(g.garageList(0).custID==1)
    assert(g.garageList(0).vehicleType=="s")
  }

  it should("add the time to the employee with the least amount of work to do") in {
    
  }

  "addCar" should("create and car object and places it in the vehicleList") in {
    g.addCar(2,2,"s",ListBuffer())
    assert(g.garageList(1).id==2)
    assert(g.garageList(1).custID==2)
    assert(g.garageList(1).vehicleType=="s")
  }

}
