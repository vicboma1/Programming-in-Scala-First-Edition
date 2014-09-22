package chapter14

import chapter10.ElementFactory
import org.scalatest.{FunSuite, Suite}

/**
 * Created by vicboma on 22/09/14.
 */
object Assertion {
  def main (args: Array[String]) {
    new ElementSuite().execute()
    new ElementFunSuite().execute()
  }
}

class ElementSuite extends Suite {

  def testUniformElement() {
    val ele = ElementFactory.elem('x', 2, 3)
    assert(ele.width == 2)
  }
}

class ElementFunSuite extends FunSuite {

  test("elem result should have passed width") {
    val ele = ElementFactory.elem('x', 2, 3)
    assert(ele.width == 2)
  }
}


