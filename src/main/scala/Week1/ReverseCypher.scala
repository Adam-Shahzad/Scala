package Week1
object ReverseCypher extends App{

  def cypherReverse(input:String):String= {
    (input.map(ch=>reverseChar(ch)))
  }

  def reverseChar(input:Char): Char = { input match{
    case (' ') => ' '
    case _ => ('z'.toInt-input.toInt+'a'.toInt).toChar
  }}
}
