package app.controllers

object Numbers {

  private val thds = 1234L
  private val mlns = 1234567L
  private val blns = 1234567890L
  private val tlns = 1234567890123L
  private val formatter = java.text.NumberFormat.getIntegerInstance

  def checkLength(n: Long): Int = n.toString.length

  def addSeparators(n: Long, n2: Int): Unit = {
    var s = n.toString
    for (i <- 1 to n2 / 3) {
      val y = s.length - i * 3 - (i - 1)
      val (a, b) = s.splitAt(y)
      s = a + "," + b
    }
    println(s)
  }

  def addFormat(n: Long): Unit = println(formatter.format(n))

  def addSeparators(n: Long): Unit = addSeparators(n, checkLength(n))

  println("Le troll")

}
