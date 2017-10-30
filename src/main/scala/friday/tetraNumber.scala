package friday
import scala.util.control.Breaks._

object tetraNumber extends App {
val input = 169179692512835000L
  var a = 0
  while( a< input){
    a+=1
    if((a*(a+1)*(a+2))/6==input){
      println (a + " is the base number")
      break()
    }
  }
}
