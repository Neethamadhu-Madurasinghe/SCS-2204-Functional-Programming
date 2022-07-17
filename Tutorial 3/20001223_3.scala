object Tutorial3 {
  def main(args: Array[String]): Unit = {
    // Question 1
    printf("Area of disk : %.2f\n", areaOfDisk(5f));

    // Question 2
    printf("35 Celsius in Fahrenheit: %.2f\n", celsiusToFahrenheit(35f));

    // Question 3
    printf("Volume of sphere: %.2f\n", volumeOfSphere(5f));

    // Question 4
    printf("Total cost for 60 books: %.2f\n", totalWholeSaleCost(60));

    // Question 5
    printf("Total running time: %.0f Minutes", timeEasyPace(2) + timeTempo(3) + timeEasyPace(2))
  }
}


// Question 1
def areaOfDisk(r: Float): Float = Math.PI.toFloat * r * r

 // Question 2
 def celsiusToFahrenheit(t: Float): Float = t * 1.8f + 32.0f;

 // Question 3
 def volumeOfSphere(r: Float): Float = (4.0f/3.0f) * Math.PI.toFloat * r * r * r;

 // Question 4
 def totalWholeSaleCost(books: Int): Float = bookCost(books) + shippingCost(books);

 def bookCost(books: Int): Float = books * 24.95f * (1 - 0.4f);
 def shippingCost(books: Int): Float = books match {
    case x if x <= 50 =>  books * 3.0f
    case x => (50 * 3.0f) + ((books - 50) * .75f)    
 }

 // Question 5
 def timeEasyPace(d: Float): Float = d * 8.0f;
 def timeTempo(d: Float): Float = d * 7.0f;