package app.controllers

import scala.io.StdIn

object TalkingClock {

  //  Daily challenge 321: https://www.reddit.com/r/dailyprogrammer

  val time: String = StdIn.readLine("The time is currently: ")

  val tens = Map(0 → "oh", 2 → "twenty", 3 → "thirty", 4 → "forty", 5 → "fifty")
  val ones = Map(1 → "one", 2 → "two", 3 → "three", 4 → "four", 5 → "five", 6 → "six",
    7 → "seven", 8 → "eight", 9 → "nine", 11 → "eleven", 12 → "twelve", 13 → "thirteen",
    14 → "fourteen", 15 -> "fifteen", 16 → "sixteen", 17 → "seventeen", 18 → "eighteen",
    19 → "nineteen")

  def suffix(n: String): String = n match {
    case x if x.toInt >= 0 & x.toInt < 12 ⇒ "am"
    case x if x.toInt >= 12 & x.toInt <= 24 ⇒ "pm"
    case _ ⇒ "Invalid time"
  }

  def convertHoursToWords(s: String): String = {
    s.toInt match{
      case x if x > 0 & x <= 12 ⇒ ones(x)
      case x if x > 12 & x <= 24 ⇒ ones(x-12)
      case _ ⇒ "Invalid time"
    }
  }

  def convertMinutesToWords(s: String): String = {
    s.toInt match{
      case x if x == 0 ⇒ ""
      case x if x > 0 & x < 20 ⇒ ones(x)
      case x if x >= 20 & x < 60 ⇒ tens(x/10) + " " + ones(x%10)
      case _ ⇒ "Invalid time"
    }
  }

  def tellTime(): Unit = {
    time
    val hours: String = time.substring(0, 2)
    val minutes: String = time.substring(3,5)
    println("It's " + convertMinutesToWords(minutes) + " past "  + convertHoursToWords(hours) + " " + suffix(hours))
  }



}
