package Week1

object Facoriall extends App{

  println(CheckIfFactorial(6))

  def CheckIfFactorial(input : Int) : Any={
    var result = ""
    var toggle = true
    var counter = 2

    while(toggle){
      counter+=1
      if (factorial(counter) == input) {
        toggle = false
        result = counter.toString
      }
      else if (factorial(counter) > input) {
        toggle = false
        result = "none"
    }}
    result
  }

  def factorial(mult : Int):Int =  mult match{
    case 0 => 1
    case 1 => mult
    case _ => mult * factorial(mult-1)
    }
}
