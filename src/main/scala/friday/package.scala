package friday
import scala.io.StdIn.readLine

package object Morsecode extends App{
//this is a bad implementation why didn't i use a map, maybee cause i hate myself
  print("enter a string")
  readLine().foreach(letter=>print(getMorsecodeOfChar(letter)))

  def getMorsecodeOfChar(letter:Char): String ={
    letter match{
      case ('a') =>".-"
      case ('b') =>"-..."
      case ('c') =>"-.-."
      case ('d') =>"-.."
      case ('e') =>"."
      case ('f') =>"..-."
      case ('g') =>"--."
      case ('h') =>"...."
      case ('i') =>".."
      case ('j') =>".---"
      case ('k') =>"-.-"
      case ('l') =>".-.."
      case ('m') =>"--"
      case ('n') =>"-."
      case ('o') =>"---"
      case ('p') =>".--."
      case ('q') =>"--.-"
      case ('r') =>".-."
      case ('s') =>"-"
      case ('t') =>"...-"
      case ('u') =>"-..-"
      case ('v') =>"-.--"
      case ('w') =>"--.."
      case ('x') =>".----"
      case ('y') =>"..---"
      case ('z') =>"...--"
      case (' ') =>"/"
    }

  }

}
