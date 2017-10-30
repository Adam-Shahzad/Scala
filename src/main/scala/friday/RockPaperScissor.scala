package friday
import scala.io.StdIn.readLine
import scala.collection.mutable.HashMap

object RockPaperScissor extends App {

  var previousGuesses: HashMap[String, Int] = HashMap(("rock",0),("paper",0),("scissor",0))

while(true){
println("Rock,paper or scissor?")
  val input = readLine()
  println(makeGuess())
  checkResults(input,makeGuess())
  countInput(input)

}

  def countInput(guess:String): Unit ={
  guess match{
    case "rock" => previousGuesses("rock")+=1
    case "paper" => previousGuesses("paper")+=1
    case "scissor" => previousGuesses("scissor")+=1
    case _ =>println("error")
  }
  }

  def makeGuess(): String ={
    if (previousGuesses.min == "rock") "paper"
    else if (previousGuesses.min == "paper") "scissor"
    else if (previousGuesses.min == "scissor") "rock"
    else "rock"
  }

  def checkResults(userGuess:String, compGuess:String = "rock"): String ={
    if (userGuess==compGuess) {"tie"}
    else if (userGuess == "rock" && compGuess == "paper" || userGuess == "paper" && compGuess == "scissor" || userGuess == "scissor" && compGuess == "rock"){"comp wins"}
    else if (compGuess == "rock" && userGuess == "paper" || compGuess == "paper" && userGuess == "scissor" || compGuess == "scissor" && userGuess == "rock"){"user wins"}
    else "error"
  }
}
