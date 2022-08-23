object main extends App {
  println(sumEven(10))
}

// Q4
def isEven(n: Int): Boolean = n match {
  case 0 => true
  case _ => isOdd(n -1)
}

def isOdd(n: Int) = !isEven(n)

//  Q5
def sumEven(n: Int, acc: Int = 0): Any = n match {
  case 0 => acc 
  case x if isEven(x) => sumEven(x - 1, acc + x)
  case _ => sumEven(n - 1, acc)
}