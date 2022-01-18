package com.CodeWars

/**
 * Created by Evghenii.
 * 03-December-2021
 */
object ExesAndOhs extends App {

    def xo(str: String): Boolean = {
        val world = str.toLowerCase()
        world.replace("o","").length() == world.replace("x","").length()
    }

}


class ExesAndOhsTest {

    val tests = List(
        ("xo", true),
        ("xo0", true),
        ("xxxoo", false)
        )

//
//    tests.foreach {
//        case (input, expected) =>
//            s"xo($input)"  s"return $expected"  {
//                ExesAndOhs.xo(input)
//            }
//    }
}
