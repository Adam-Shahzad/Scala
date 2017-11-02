
import org.scalatest._
import org.scalatest.FlatSpec

abstract class UnitSpec extends FlatSpec with  Matchers with OptionValues with Inside with Inspectors
