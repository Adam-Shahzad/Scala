package friday
import scala.util.Random
import scala.io.StdIn.readChar
object Hangman extends App {

  var lives =7
  val wordList: List[String] = List("hello", "world","buzz","death")
  val pickedWord = wordList(new Random().nextInt(wordList.length))

  pickedWord.foreach(a=>print("-"))
  println("\nguess a letter")
  var oldGuess = combineGuess(checkWord(pickedWord, readChar()), "------------" )
  println(oldGuess)


  while (lives>0) {
    println("guess a letter")
    oldGuess=combineGuess(checkWord(pickedWord, readChar()),oldGuess)
    println(oldGuess)
}
  def checkWord(wordToGuess:String, inputChar:Char):String={
    if (wordToGuess.contains(inputChar)==false) {
      lives-=1
      println("you now have "+lives+ " hits left")
    }

    var temp =""
    wordToGuess.foreach(letter=>{
      if (letter == inputChar) temp += inputChar
      else temp+= ("-")
    })
    temp
  }

  def combineGuess(newGuess:String, oldGuess:String):String={
    var combine =""
    for (letter<-0 to newGuess.length-1){
      if (newGuess(letter)== oldGuess(letter)) combine+= '-'
      else if (newGuess(letter)== '-') combine+= oldGuess(letter)
      else if (oldGuess(letter)== '-') combine+= newGuess(letter)
    }
    combine
  }

}
