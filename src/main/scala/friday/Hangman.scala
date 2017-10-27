package friday
import scala.util.Random
import scala.io.StdIn.readChar
object Hangman extends App {

  val wordList: List[String] = List("hello", "world")
  val pickedWord = wordList(new Random().nextInt(wordList.length - 1))

  pickedWord.foreach(println(""))

  while (true) {
println("guess a letter")
  println(combineGuess(checkWord(pickedWord, readChar())))
}
  def checkWord(wordToGuess:String, inputChar:Char):String={
    var temp =""
    wordToGuess.foreach(letter=>{
      if (letter == inputChar) temp += inputChar
      else temp+= ("-")
    })
    temp
  }

  def combineGuess(newGuess:String, oldGuess:String="------------------------------"):String={
    var combine =""
    for (letter<-0 to newGuess.length-1){
      if (newGuess(letter)== oldGuess(letter)) combine+= '-'
      else if (newGuess(letter)== '-') combine+= oldGuess(letter)
      else if (oldGuess(letter)== '-') combine+= newGuess(letter)
    }
    combine
  }
}
