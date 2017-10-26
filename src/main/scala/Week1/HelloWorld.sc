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
val inputToTrim = "hello"
val trimBy = 3
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
  val decimalAfterPoint = math pow (10, 3)
  println(Math.round(input * decimalAfterPoint) / decimalAfterPoint)
}

//task13 - STRINGS 5
reverseString("Hello")
def reverseString (input:String) ={println(input.reverse)}

//task14 - OPERATORS
def sumOfInts(num1 : Int, num2 : Int) : Int = {num1 + num2}

//task15 - OPERATORS 2
def ageInSeconds(age:Int):String={"you're age in seconds is " + (age*365.25*24*60*60).toString()}

//task16 - CONDITIONALS
def task16(num1 : Int, num2 : Int, addOrMult:Boolean) : Int = {
  if (addOrMult == true){ num1 + num2 }
  else {num1 * num2}
  }

//task 17 - CONDITIONALS 2
task17(1,1, true)
task17(1,0,true)
task17(0,2,true)
task17(0,0,true)

def task17(num1 : Int, num2 : Int, addOrMult:Boolean) : Int = {
  if(num1 == 0){num2}
  else if(num2 == 0){num1}
  else {
    if (addOrMult == true) {num1 + num2}
  else {num1 * num2}
  }
  }


//task 18 ITERATION
task_18("hello",4)

def task_18 (input:String, timesToRepeat:Int) = {
  for( a <- 1 to timesToRepeat){
    println(input)
  }
}
//task 20
sqaure("h",4)
def sqaure(input : String, num : Int) = {
  for (i <- 1 to num;
       j <- 1 to num)
        if (j%num ==0)print(input+"\n")
        else(print(input))
}


//task21
fizzBuzz("err", "whee", 15)
def fizzBuzz(fizz :String, buzz:String, num :Int)={
  for(a<-1 to num){
    if (a%3==0&&a%5==0)  print(fizz + buzz +", ")
    else if (a%3 == 0)   print(fizz + ", ")
    else if (a%5==0) print(buzz + ", ")
    else print(a + ", ")
  }
}

//task22
def matrixLoop() = {

  while (true) {
    println(scala.util.Random.nextPrintableChar())
  }
}

  while (true) {print(scala.util.Random.nextPrintableChar())}}

//task23

sqaureRec("i",4)
def sqaureRec(input : String, num : Int, counter : Int = 1): Unit ={
  if (counter%num ==0) {print(input+"\n")}
  else{(print(input))}

  if (counter<=num*num){sqaureRec(input, num, counter + 1)}
}

def fizzBuzzRec(fizz :String, buzz:String, num :Int, a : Int=1):Unit={

    if (a%3==0&&a%5==0)  print(fizz + buzz +", ")
    else if (a%3 == 0)   print(fizz + ", ")
    else if (a%5==0) print(buzz + ", ")
    else print(a + ", ")

    if (a <= num) {fizzBuzzRec(fizz, buzz, num, a+1)}
}

def matrixRec() : Unit={
  println(scala.util.Random.nextPrintableChar())
  matrixRec()
}


//task 24 PATTERN MATCHING

task16_patternMatching(1,1, true)
task16_patternMatching(1,0,true)
task16_patternMatching(0,2,true)
task16_patternMatching(0,0,true)

def task16_patternMatching(num1 : Int, num2 : Int, addOrMult:Boolean) : Int =  {
  (num1, num2, addOrMult) match{
    case (0,_,_) => num2
    case (_,0,_) => num1
    case(_,_,true) => num1 + num2
    case(_,_,false) => num1*num2
}}


//task 26 PATTERN MATCHING 2 (incomplete)

def task26(numbers : Any): Any ={
  numbers match{
    case x: List[Int] if x.length <= 2 => x.reverse
    case x: Array[Int] if x.length <= 2 => x.reverse
    case x: Tuple2[Int, Int] => x.swap
  }
}

//task 27 MAP FUNCTION 1
def task27()= {
  val numb: List[Int] = List(1, 2, 3, 21, 22, 23)
  val answer: List[Int] = numb.map(x => if (x > 20) x * 10 else x)

}

//task 28 MAP FUNCTION 2
List("hello", "adam", "I").map(x => if (x.length >= 4) x)

//task 29 FLATMAP FUNCTION 1
val theList = List(List(List(1,2,3,4,5), List(6,7,8,9,10)), List(List(11,12,13,14,15), List(16,17,18,19,20)))
var theFlatList = theList.flatten.flatten
println(theFlatList)

//task 30 FOREACH 1
val listOfVowels = List("a","e","i","o","u")
listOfVowels.foreach(println)

//task 31 FOREACH 2
var temp = ""
val fruitList = List("Apple", "Raspberry", "Lemon", "Kiwi", "Strawberry")
fruitList.foreach(x => {
  if (x.length>temp.length) temp = x
}
)
println(temp)