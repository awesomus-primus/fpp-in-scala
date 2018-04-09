package app.models

import scala.io.StdIn

object Prompt {

  def ask(q: String): Unit = StdIn.readLine(q)

  def repeat(x:() ⇒ Unit): Unit = {
    while (StdIn.readLine("Do you to have another go? (Y/N) ") == "Y") x
  }

}
