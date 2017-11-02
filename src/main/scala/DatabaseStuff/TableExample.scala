package DatabaseStuff

import slick.driver.MySQLDriver.api._


class TableExample(tag: Tag) extends Table[(Int, String, String, Int)](tag, "PEOPLE"){

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc);
  def item1 = column[String]("item1")
  def item2 = column[String]("item2")
  def price = column[Int]("price")
  def * = (id, item1, item2, price)

}

