package app

import app.controllers._

import scala.io.StdIn

object Main extends App {

  def fx(): Unit = {
    //  IntegerComplexity.findSmallestValueOfFactors()
    //  TalkingClock.tellTime()
    AlphabetCipher.encryptWord()
  }

  fx()
  println()
  while (StdIn.readLine("Do you to have another go? (Y/N) ") == "Y") {
    fx()
    println()
  }
}
