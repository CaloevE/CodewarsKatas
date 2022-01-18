package com.katas.level8

object SortStrings extends App {

    def sortByLength(arr: Array[String]): Array[String] = arr.sortWith(_.length < _.length)


println(sortByLength(Array("i", "to", "beg", "life")).mkString("Array(", ", ", ")"))
}
