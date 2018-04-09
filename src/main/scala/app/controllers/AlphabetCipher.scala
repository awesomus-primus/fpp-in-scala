package app.controllers

import scala.io.StdIn

object AlphabetCipher {

  //  Daily challenge 355: https://www.reddit.com/r/dailyprogrammer

  val letters = Map("a" → 0, "b" → 1, "c" → 2, "d" → 3, "e" → 4, "f" → 5, "g" → 6,
    "h" → 7, "i" → 8, "j" → 9, "k" → 10, "l" → 11, "m" → 12, "n" → 13, "o" → 14,
    "p" → 15, "q" → 16, "r" → 17, "s" → 18, "t" → 19, "u" → 20, "v" → 21, "w" → 22,
    "x" → 23, "y" → 24, "z" → 25)

  val listOfLetters = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
    "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")

  def rotateList(n: Int): List[String] = listOfLetters.drop(n) ++ listOfLetters.take(n)

  def encryptWord(): Unit = {
    val enc = StdIn.readLine("What is your encryption word? ")
    val mes = StdIn.readLine("What is your message? ")
    val c: String = {
      val x = enc * ((mes.length / enc.length) + 1)
      if (x.length > mes.length) x.dropRight(x.length - mes.length)
      else x
    }
    println(c)
    println(mes)
    val list = mes.toList.zip(c.toList)
    for (i ← 0 until mes.length) {
      val rotatedList = rotateList(letters(list(i)._1.toString))
      print(rotatedList(letters(list(i)._2.toString)))
    }
  }

}
