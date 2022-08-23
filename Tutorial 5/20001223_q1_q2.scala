object main extends App {
  primeSequence(10)
}

//  Q1
def GCD(a: Int, b: Int): Int = b match {
  case 0 => a
  case x if a < x => GCD(x, a)
  case _ => GCD(b, a % b)
}


def isPrime(a: Int, b: Int = 2): Boolean = b match {
  case x if a == b => true
  case x if GCD(a, b) > 1 => false
  case _ => isPrime(a, b+1)
}

//  Q2

def primeSequence(n: Int): Any = n match {
  case x if x > 1 && isPrime(x) => {
    primeSequence(x - 1)
    println(x)
  }
  case x if x > 1 => primeSequence(x - 1)
  case _ => return

}