package DatabaseStuff


import slick.jdbc.MySQLProfile.api._

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

import  scala.concurrent.ExecutionContext.Implicits.global

object DatabaseExample extends App{

  val db = Database.forConfig("mysqlDB")
  val thingTable = TableQuery[People]

  val dropThingsCmd = DBIO.seq(thingTable.schema.drop)
  val createThingsCmd = DBIO.seq(thingTable.schema.create)

  def drop ={

    val dropFuture = Future{db.run(dropThingsCmd)}

    Await.result(dropFuture, Duration.Inf).andThen{
      case Success(_) => create
      case Failure(error) =>
        println(error.getMessage)
        create
    }
  }


  def create ={

    val setUpFuture = Future {db.run(createThingsCmd)}

    Await.result(setUpFuture,Duration.Inf).andThen{
      case Success(_) => runQuery
      case Failure(error) => println(error.getMessage)
    }
  }


  def runQuery ={

    val addThings = Future {

      val query = thingTable ++= Seq(
        (1, "iron", "wool", 7),
        (2, "brick", "copper", 10)
      )

      println(query.statements.head)
      db.run(query)
    }
      Await.result(addThings,Duration.Inf).andThen{
        case Success(_)=> deleteAThing
        case Failure(error) => println(error.getMessage)
      }
  }


  def listThings ={

    val queryFuture = Future {
      db.run(thingTable.result).map(_.foreach{
        case(id,item1,item2,price)=>println(s"$id, $item1, $item2, $price")
      })
    }

    Await.result(queryFuture,Duration.Inf).andThen{
      case Success(_)=> db.close()

      case Failure(error) => println(error.getMessage)
    }
  }

  def deleteAThing ={

    val del = thingTable.filter(_.id===2)

    val query = Future{
      db.run(del.delete)
    }

    Await.result(query,Duration.Inf).andThen{
      case Success(_)=> updateAThing
      case Failure(error) => println(error.getMessage)
    }
  }

  def updateAThing ={

    val up = thingTable.filter(_.id===1)

    val query = Future{
      db.run(up.update(3,"steel","wood",5))
    }

    Await.result(query,Duration.Inf).andThen{
      case Success(_)=> listThings
      case Failure(error) => println(error.getMessage)
    }
  }

  def searchAThing={
    val search = thingTable.filter(_.id===1)


  }

  drop

}


