object Tutorial4 {
def main(args: Array[String]): Unit = {
    // Question 5
    println(formatNames("benny", toUpperAll))
    println(formatNames("niroshan", upperOnlyFirstTwoLetters))
    println(formatNames("saman", toLowerAll))
    println(formatNames("kumara", upperOnlyFirstAndLastLetters))
  }
} 

// Question 5
def toUpperAll(word: String): String = word.toUpperCase()
def toLowerAll(word: String): String = word.toLowerCase()
// get the lowercased substring that does not include first two characters and concat it with uppercased first two characters
def upperOnlyFirstTwoLetters(word: String): String = {
  word.charAt(0).toString().toUpperCase().concat(word.charAt(1).toString().toUpperCase().concat(word.substring(2).toLowerCase()))
}

// get the lowercased substring that does not contain first and last letters and contact uppercased first and last letters
def upperOnlyFirstAndLastLetters(word: String): String = {
  word.charAt(0).toString().toUpperCase().concat(word.slice(1, word.length()-1).toLowerCase().concat(word.charAt(word.length()-1).toString().toUpperCase()))
}

def formatNames(name: String, f: String => String): String = f(name)




