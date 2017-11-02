package friday

object ShortandLongForm extends App{

  val input:BigInt=1234567891111l

  println(input)
  println(reformat(input, true))
  println(reformat(input, false))

  def reformat(input:BigInt,isLongform:Boolean):String={

    if (input>0) ((input /% returnDivisor(input).toLong)._1.toString + returnDivisorString(input.toLong, isLongform)) + reformat((input /% returnDivisor(input).toLong)._2,isLongform)
    else ""

    }

  def returnDivisor(input:BigInt):Double={

    if      (input >= (Math.pow(10,21).toLong)) Math.pow(10,21)
    else if (input >= (Math.pow(10,18).toLong)) Math.pow(10,18)
    else if (input >= (Math.pow(10,15).toLong)) Math.pow(10,15)
    else if (input >= (Math.pow(10,12).toLong)) Math.pow(10,12)
    else if (input >= (Math.pow(10,9).toLong))  Math.pow(10,9)
    else if (input >= (Math.pow(10,6).toLong))  Math.pow(10,6)
    else if (input >= (Math.pow(10,3).toLong))  Math.pow(10,3)
    else 1

  }

  def returnDivisorString(input:BigInt,isLongform:Boolean):String={
    if (isLongform)
      {
        if      (input >= (Math.pow(10,21).toLong))   " trilliard, "
        else if (input >= (Math.pow(10,18).toLong))   " trillion, "
        else if (input >= (Math.pow(10,15).toLong))   " billiard, "
        else if (input >= (Math.pow(10,12).toLong))   " billion, "
        else if (input >= (Math.pow(10,9).toLong))    " milliard, "
        else if (input >= (Math.pow(10,6).toLong))    " million, "
        else if (input >= (Math.pow(10,3).toLong))    " thousand and "
        else                                          ""
      }
    else
    {
      if (     input >= (Math.pow(10,21).toLong))   " sextillion, "
      else if (input >= (Math.pow(10,18).toLong))   " quintillion, "
      else if (input >= (Math.pow(10,15).toLong))   " quadrillion, "
      else if (input >= (Math.pow(10,12).toLong))   " trillion, "
      else if (input >= (Math.pow(10,9).toLong))    " billion, "
      else if (input >= (Math.pow(10,6).toLong))    " million, "
      else if (input >= (Math.pow(10,3).toLong))    " thousand and "
      else                                          ""
    }
  }
}






