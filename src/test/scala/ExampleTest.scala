
import Week1.HelloWorldNotWorksheet


class ExampleTest extends UnitSpec  {

  "returnHelloWorld" should("return \"Hello Worlds\" as a string") in {

  assert(HelloWorldNotWorksheet.returnHelloWorld == "Hello World")

  }

  "stringMult" should("return the input string multiplied by the input int") in {
    assert(HelloWorldNotWorksheet.stringMult("hello",3)=="\nhello\nhello\nhello")
  }

  "trimBy" should("return the input string minus the input int from the left") in {

    assert(HelloWorldNotWorksheet.trimFunc("hello",3)=="llo")

  }

  "reverseString" should("return the reverse of the input string") in {

    assert(HelloWorldNotWorksheet.reverseString("hello")=="olleh")

  }

  "sumOfInts" should("return the sum of two input ints") in {

    assert(HelloWorldNotWorksheet.sumOfInts(1,1)==2)

  }

  "ageInSeconds" should("return a formatted sting that contains coverts age in years to seconds ") in {

    assert(HelloWorldNotWorksheet.ageInSeconds(1)=="you're age in seconds is 31557600")
  }

  "task16" should("return the multiple of two ints if the input boolean is false ") in {

    assert(HelloWorldNotWorksheet.task16(1,1,false)==1)

  }

  it should("return the sum if two ints if the input boolean is true") in {
    assert(HelloWorldNotWorksheet.task16(1,1,true)==2)
  }

  "task16_patternMatching" should("if one of the inputs = 0, return the other input") in {
    assert(HelloWorldNotWorksheet.task16_patternMatching(0,10,false)==10)
    assert(HelloWorldNotWorksheet.task16_patternMatching(12,0,true)==12)
  }

  it should("return the multiple of two ints if the input boolean is false and the inputs are not 0") in {
    assert(HelloWorldNotWorksheet.task16_patternMatching(10,10,false)==100)
  }

  it should("return the sum of two ints if the input boolean is true and the inputs are not 0") in {
    assert(HelloWorldNotWorksheet.task16_patternMatching(10,10,true)==20)
  }

  "task27" should("return the input list, and multiply the ints in the list by 10, if the number is bigger than 20") in {
    assert(HelloWorldNotWorksheet.task27(List(1, 2, 3, 21, 22, 23))==List(1,2,3,210,220,230))
  }

  "isFib" should("return a boolean whether or not the list passed to it is in the fibonacci sequence") in {
    assert(HelloWorldNotWorksheet.isFib(List(1,2,3,5,8))==true)
    assert(HelloWorldNotWorksheet.isFib(List(1,9,4))==false)
  }

  "greatestCommonDivisor" should("return the greatest Common Divisor of two input ints") in {
    assert(HelloWorldNotWorksheet.greatestCommonDivisor(10,15)==5)
  }

  "task35" should("return the factorial of that number") in {
    assert(HelloWorldNotWorksheet.task35(4)==24)

  }
  "task36" should("return a boolean if the first input string can be found in the second input string") in {
    assert(HelloWorldNotWorksheet.task36("hell","hello")==true)
    assert(HelloWorldNotWorksheet.task36("hello","nope")==false)
  }

  "test" should("return a boolean if the first input string can be found in the second input string ") in {
    assert(HelloWorldNotWorksheet.test("hell", "hello")== true)
    assert(HelloWorldNotWorksheet.test("bye", "hello")== false)
  }

  "task39" should("return the int passed to it times by 1.2 and if the original int is bigger than 50, it times it by 0.9") in {
    assert(HelloWorldNotWorksheet.task39(15.5)<18.6&&HelloWorldNotWorksheet.task39(15.5)>18.59)
    assert(HelloWorldNotWorksheet.task39(50)==54)
  }

  "blackJack" should("return 0 if both the inputs are greater than 21") in {
    assert(HelloWorldNotWorksheet.blackJack(22,23)==0)
  }
  it should("return the other input if only one input is over 21")in{
    assert(HelloWorldNotWorksheet.blackJack(23,7)==7)
    assert(HelloWorldNotWorksheet.blackJack(4,29)==4)
  }
  it should("return the biggest input if both are under 21") in {
    assert(HelloWorldNotWorksheet.blackJack(20,19)==20)
    assert(HelloWorldNotWorksheet.blackJack(16,17)==17)
  }

  "uniqeSum" should("add all the distinct numbers in a list") in {
    assert(HelloWorldNotWorksheet.uniqeSum(List(1,2,3,4,5,5))==15)
  }

  "tooHot" should ("rerun true if the input it is greater than 100 and isSummer = true") in{
    assert(HelloWorldNotWorksheet.tooHot(101,true)== true)
    assert(HelloWorldNotWorksheet.tooHot(99,true)== false)
  }


   it should ("only return true if the input it is greater than 90 and isSummer = false") in{
    assert(HelloWorldNotWorksheet.tooHot(91,false)== true)
    assert(HelloWorldNotWorksheet.tooHot(89,false)== false)
  }
}
