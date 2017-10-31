import Week1.Facoriall

class FacoriallTest extends UnitSpec {

"factorial" should("return the factorial of a number") in {
  assert(Facoriall.factorial(0)==1)
  assert(Facoriall.factorial(1)==1)
  assert(Facoriall.factorial(2)==2)
  assert(Facoriall.factorial(3)==6)
  assert(Facoriall.factorial(4)==24)
  assert(Facoriall.factorial(5)==120)
}
  "CheckIfFactorial" should("return the reverse factorial of a number") in {
    assert(Facoriall.CheckIfFactorial(6)=="3")
    assert(Facoriall.CheckIfFactorial(1)=="1") //test fail, need to implement this feature
  }
  it should("return the string 'none' if the number is not a factorial") in {
    assert(Facoriall.CheckIfFactorial(7)=="none")
  }
}
