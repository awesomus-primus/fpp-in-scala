package app.controllers

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object IntegerComplexity {

  //  Daily challenge 354: https://www.reddit.com/r/dailyprogrammer

  def findSmallestValueOfFactors(): Unit = {
    val n = StdIn.readLine("What number will you choose? ").toInt
    val sums = ArrayBuffer[Int]()
    val x = for (i ← 1 until n if n % i == 0) yield i
    for (i ← x) {
      val sum = (n / i) + i
      sums += sum
    }
    println(sums.min)
  }

}
