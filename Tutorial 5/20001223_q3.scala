object main extends App {
  println(sum(5))
}


def sum(n: Int, acc: Int = 0): Int = n match {
  case 0 => acc
  case x => sum(n - 1, acc + n)
}