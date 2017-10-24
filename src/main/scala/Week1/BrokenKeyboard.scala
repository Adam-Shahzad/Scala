package Week1
import scala.io.Source
object BrokenKeyboard extends App
{

  val inputs:List[String] = List("edcf","qwer","hjklo")
  main(3,inputs )

  def main(repeated : Int, inputs :List[String]): Unit ={
    for( a <-inputs){checkLongest(a)}}

  def checkLongest(input:String) = {
    var temp = ""
    val listOfLines = Source.fromFile("C:\\Users\\Administrator\\IdeaProjects\\ScalaThings\\src\\main\\scala\\Week1\\data.txt").getLines.toList
    listOfLines.foreach(x => {if (input.sorted.contains(x.distinct.sorted) && x.length > temp.length) { temp = x}})
    println(s"${input} = $temp")
  }

}