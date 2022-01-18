package com.katas.level8

object StringRepeat extends App {
  def repeatStr(times: Int, str: String): String = {
    val result = str * times
    result
  }

  println(repeatStr(6,"I"))
}