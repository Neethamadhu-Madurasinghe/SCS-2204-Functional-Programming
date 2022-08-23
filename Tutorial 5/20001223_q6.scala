object main extends App {
  fibSeq(35)
}


def finoncci(i: Int): Int = i match {
  case 0 => 0
  case 1 | 2 => 1
  case x => finoncci(i - 2) + finoncci(i - 1)
}

def fibSeq(n: Int): Any = {
  if(n > 0) fibSeq(n - 1)
  println(finoncci(n))
}