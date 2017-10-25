package Week1

object Facoriall extends App{

  println(CheckIfFactorial(6))

  def CheckIfFactorial(input : Int) : Any={
    var ll = ""
    var toggle = true
    var a = 2

    while(toggle){
      a+=1
      if (factorial(a) == input) {
        toggle = false
        ll = a.toString
      }
      else if (factorial(a) > input) {
        toggle = false
        ll = "none"
    }}
    ll
  }

  def factorial(mult : Int):Int =  mult match{
    case 0 => 1
    case 1 => mult
    case _ => mult * factorial(mult-1)
    }
}
