object Tutorial4 {
def main(args: Array[String]): Unit = {
    // Question 4
    println("Enter a number :")
    val userInput = scala.io.StdIn.readInt()
    isNegativeOrPositive(userInput)
    isOddOrEven(userInput)
  }
} 

def isNegativeOrPositive(number: Int): Any = number match {
  case x if number > 0 => println("Positive")
  case x if number < 0 => println("Negative")
  case _  => println("Zero")
}

def isOddOrEven(number: Int): Any = number match {
  case x if number % 2 == 0 => println("Even")
  case _  => println("Odd")
}


