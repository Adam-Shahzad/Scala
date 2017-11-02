import garage.Garage


class GarageTest extends UnitSpec {

"addEmployee" should("create and employee object and places it in the employeeList")
  Garage.addEmployee("a","a",1,0)
  assert(Garage.employeeList==List(("a","a",1,0)))
}
