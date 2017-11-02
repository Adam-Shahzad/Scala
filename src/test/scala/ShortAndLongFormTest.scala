import friday.ShortandLongForm
import org.scalatest.junit.JUnitSuite
import org.junit.Test

class ShortAndLongFormTest extends UnitSpec {

  "reformat(input, true)" should ("return the format in long form") in {
    assert(ShortandLongForm.reformat(1234567891111L,true)=="1 billion, 234 milliard, 567 million, 891 thousand and 111")
  }

  "reformat(input, false)" should("return the format in short form") in {
    assert(ShortandLongForm.reformat(1234567891111L,false)=="1 trillion, 234 billion, 567 million, 891 thousand and 111")
  }


  "returnDivisorString(input,true)" should("return the long scale name of the input number") in {
    assert(ShortandLongForm.returnDivisorString(Math.pow(10,21).toLong,true)==" trilliard, ")
  }

  "returnDivisorString(input,false)" should("return the short scale name of the input number") in {
    assert(ShortandLongForm.returnDivisorString(Math.pow(10,21).toLong,false)==" sextillion, ")
  }

  "returnDivisor(input)" should("return the largest actual number grouping of the input") in {
    assert(ShortandLongForm.returnDivisor(Math.pow(10,21).toLong)==Math.pow(10,21))
  }
}
