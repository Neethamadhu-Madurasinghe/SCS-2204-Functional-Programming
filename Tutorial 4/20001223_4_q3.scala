object Tutorial4 {
def main(args: Array[String]): Unit = {
    // Question 3
    println(formatNames("Benny", _toUpper)())
    println(formatNames("Niroshan", _toUpper)(0::1::Nil))
    println(formatNames("Saman", _toLower)())
    println(formatNames("Kumara", _toUpper)(0::"Kumara".length-1::Nil))
  }
} 

// Question 3
def _toUpper(word: String): String = word.toUpperCase()
def _toLower(word: String): String = word.toLowerCase()


def formatNames(name: String, f: String => String)(format: List[Int] = List()): String = {
  if(format.isEmpty)  {
    f(name)
  
  }else {
    var temp = ""
    for(i <- 0 to name.length() - 1) {
      val current =  if(format.contains(i)) f(name.charAt(i).toString()) else name.charAt(i).toString()
      temp = temp + current;
    }
    temp
  }
}




