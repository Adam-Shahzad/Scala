package friday

import scala.collection.mutable.ListBuffer

object Lumberjack extends App {
  val storagesize = 3
  var storage = ListBuffer[Int]()
  storage += (1,1,1,2,1,3,1,4,1)

  println(addLumber(7).toString())

  def addLumber(numOfLumber:Int):ListBuffer[Int]={
    for(lumber <- 0 to numOfLumber){
      storage(storage.indexOf(storage.min)) += 1
    }
    storage
  }
}
