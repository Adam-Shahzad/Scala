package Week1

object ChatBot extends App {
  val name = "eric"
  val cannedResponse =  new Array[String](2)
  cannedResponse(1) = "I don’t know and I’m too lazy to look it up..."
  cannedResponse(2) = "I don’t know, let me google it up for you"
  var questionCounter = 1

  while (true) {
    var input = scala.io.StdIn.readLine()

    if (checkIfQuestion(input) != "") println(checkIfQuestion(input))
    else if (checkIfYell(input) != "" ) println(checkIfYell(input))
    else if (checkIfName(input)!= "" ) println(checkIfName(input))
    else (println("Sorry, What was that?"))
  }

  def checkIfQuestion(input: String) = if ("?" == input.takeRight(1)) {
    questionCounter += 1
    cannedResponse(questionCounter % 2)
  }
  else ""

  def checkIfYell(input: String):String = if (input == input.toUpperCase()) "STOP YELLING" else ""

  def checkIfName(input: String): String = if (input == name) "yes?" else ""


}
