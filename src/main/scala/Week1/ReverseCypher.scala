package Week1
object ReverseCypher extends App{

  def cypherReverse(input:String):String= {
    var output = ""
    input.foreach(ch => output+=(reverseChar(ch)))
    output
  }

  def reverseChar(input:Char): Char = { input match{
    case (' ') => ' '
    case _ => ('z'.toInt-input.toInt+'a'.toInt).toChar
  }}
}
