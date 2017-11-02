import Week1.ReverseCypher

class ReverseCypherTest extends UnitSpec{

  "reverseChar" should("return the reverse cypher of the char") in {
    assert(ReverseCypher.reverseChar('a')=='z')
  }

  it should("return ' ' if the input char is ' ' ") in {
    assert(ReverseCypher.reverseChar(' ')==' ')
  }

  "cypherReverse" should("return the reverse Cypher of the input string") in {
    assert(ReverseCypher.cypherReverse("wizard")=="draziw")
  }
}
