package app.models

import scala.io.StdIn

object Prompt {

  def ask(q: String): Unit = StdIn.readLine(q)

}
