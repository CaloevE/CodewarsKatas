package com.katas.level8

object GrasshopperSummation extends App {

  def summation(n: Int): Int = {
   val x = (1 to n).toList
    x.sum
  }
  println(summation(8))
}
