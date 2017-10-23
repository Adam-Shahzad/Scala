import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Input
//task one - HELLO WORLD!
println("hello world")

//task two - ASSIGNMENT
var output:String = "Hello World"
println(output)

//task three - REASSIGNMENT
var outputA:String = "outputA value 1"
val outputB:String = "outputB value 1"

outputA = "outputA value 2"
//outputB = "outputB value 2"
// can't change because val is immutable
println(outputA)
println(outputB)


//task 4 - PARAMETERS
showInput("hello world")
def showInput(input:String) = {println(input)}

//task 5 - PARAMETERS 2
showInputWithDefault("");

def showInputWithDefault(input:String) = {
  if (input != null && input != "" ){
  println(input)
  }
  else{
    println("default")
  }
}

//task 6 - PARAMETERS 3
var timesToRepeat:Int = 3
var inputToRepeat:String = "hello"

stringMult(inputToRepeat, timesToRepeat)

def stringMult(input:String, mult :Int) ={
  for( a <- 0 to mult){
    println(input)
  }
}

//task 7 - Return Types
println(returnHelloWorld())
def returnHelloWorld():String = {"Hello World"}

//task 8 - TYPE INFERENCE
returnAll(1)
returnAll("one")
returnAll(true)
returnAll(1.1)
def returnAll(input:Any) = {println(input)}

//task 9 -STRINGS
var inputToTrim = "hello"
var trimBy = 3
trimFunc(inputToTrim, trimBy)
def trimFunc(input : String, trimBy : Int) : String = {(input.slice(input.length - trimBy, input.length)) }

//task 10 - STRINGS 2
task10("hello", " world", 'o','a')
def task10(string1 : String, string2: String, char1: Char, char2 : Char) ={
  val output = string1 + string2
  println(output.replace(char1, char2))
}

// task 11 - STRINGS 3

def dispNameAndAddress(name: String, address : String) ={
  println(s"“My name is ${name.toUpperCase()} and I live at ${address.toLowerCase()}")
}

//task 12 - STRINGS 4
task_12(1.11111)
def task_12(input: Double)={
  val s = math pow (10, 3)
  println(Math.round(input * s) / s)
}

//task13 - STRINGS 5
reverseString("Hello")
def reverseString (input:String) ={println(input.reverse)}

//task14 - OPERATORS
def sumOfInts(num1 : Int, num2 : Int) : Int = {
  val result = num1 + num2
  result}

//task15 - OPERATORS 2
def ageInSeconds(age:Int):String={
  val result:String = ("you're age in seconds is " + (age*365.25*24*60*60).toString())
  result}

//task16 - CONDITIONALS
def task16(num1 : Int, num2 : Int, addOrMult:Boolean) : Int = {
  var result = 0;
  if (addOrMult == true){result = num1 + num2 }
  else {result = num1 * num2}
  result}

//task 17 - CONDITIONALS 2
task17(1,1, true)
task17(1,0,true)
task17(0,2,true)
task17(0,0,true)

def task17(num1 : Int, num2 : Int, addOrMult:Boolean) : Int = {
  var result = 0;
  if(num1 == 0){result = num2}
  else if(num2 == 0){result = num1}

  else {
    if (addOrMult == true) {
      result = num1 + num2
    }
    else {
      result = num1 * num2
    }
  }
  result}


//task 18 ITERATION
task_18("hello",4)

def task_18 (input:String, timesToRepeat:Int) = {
  for( a <- 1 to timesToRepeat){
    println(input)
  }
}
//task 20