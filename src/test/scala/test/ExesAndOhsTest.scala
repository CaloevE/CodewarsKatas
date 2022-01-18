package test

import org.scalatest._
/**
    Created by Evghenii.
    03-December-2021
 */

object ExesAndOhs{

    def xo(str: String): Boolean = {
        var x = 0
        var o = 0
        val world = str.toLowerCase()
        val worldArr = world.split("")

        val resultX =  for(result <- worldArr) {
            if (result.equals("x"))
             x + 1
        }
       val resultO = for(result <- worldArr) { if (result.equals("o"))
               o + 1
      }
        if (resultO == resultX) true
        else false


}
}

//class ExesAndOhsTest extends FlatSpec with Matchers {
//
//    val tests = List(
//        ("xo", true),
//        ("xo0", true),
//        ("xxxoo", false)
//        )
//
//    tests.foreach {
//        case (input, expected) =>
//            s"xo($input)" should s"return $expected" in {
//                ExesAndOhs.xo(input) should be (expected)
//            }
//    }
//}