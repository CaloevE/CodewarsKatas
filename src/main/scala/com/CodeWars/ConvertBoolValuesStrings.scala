package com.CodeWars

/**
    Created by Evghenii.
    02-December-2021 
*/
    object ConvertBoolValuesStrings extends App {
        def boolToWord(boolean: Boolean): String = {
          var bool = boolean.toString
          if (bool == "true")  "Yes"
          else "No"
        }

}

class KataTest {


        println(ConvertBoolValuesStrings.boolToWord(true) )

//    "boolToWord(false)" should "return \"No\"" in {
//        Kata.boolToWord(false) should be ("No")
//    }
}