package garage.models

class Part(val name : String, var isBroken:Boolean) {

  override def toString: String = s"part: $name, Broken? $isBroken \n"
}
