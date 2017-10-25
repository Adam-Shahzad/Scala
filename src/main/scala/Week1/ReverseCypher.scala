package Week1
object ReverseCypher extends App{

    "wizard ".foreach( ch => print(reverseChar(ch)))

  def reverseChar(input:Char): Char = { input match{
    case (' ') => ' '
    case _ => ('z'.toInt-input.toInt+'a'.toInt).toChar
  }}
}
