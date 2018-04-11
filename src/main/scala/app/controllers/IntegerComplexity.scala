package app.controllers

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object IntegerComplexity {

  //  Daily challenge 354: https://www.reddit.com/r/dailyprogrammer

  def findSmallestValueOfFactors(): Unit = {
    val n = StdIn.readLine("What number will you choose? ").toInt
    val sums = ArrayBuffer[Int]()
    val x = for (i ← 1 until n if n % i == 0) yield i
  //  val y = (1 until n).filter(y ⇒ n % y == 0) - Another way of writing out the above
    for (i ← x) {
      val sum = (n / i) + i
      sums += sum
    }
    println(sums.min)
  }
  
  // The following are one-liners for the entire function, making val sums redundant
  //    val z = (1 until n).filter(z ⇒ n % z == 0).map(z ⇒ n / z + z).min
  //    val b = (1 until n).collect { case b if n % b == 0 ⇒ n / b + b }.min
  //    val m = (1 until n).foldLeft {Int.MaxValue} { (p, x) ⇒
  //      if (n % x == 0 && x < p) n / x + x
  //      else p
  //    }

}
