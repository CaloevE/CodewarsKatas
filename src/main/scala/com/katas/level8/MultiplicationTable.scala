package com.katas.level8

object MultiplicationTable extends App {

    def multiplicationTable(size: Int): List[List[Int]] = {
      // Implement me!
      val x = 1 to size
      x.map{i => x.map {j => j*i}.toList}.toList
    }

  println(multiplicationTable(3))
}
