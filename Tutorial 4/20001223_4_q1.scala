object Tutorial4 {
  def main(args: Array[String]): Unit = {
    // Question 1
    printf("Interest amount fot 240000 ruppes: %.2f\n", calulateInterest(240000));
  }
} 

// Question 1
def calulateInterest(depositAmount: Float): Float = depositAmount match {
  case x if x <= 20000 => depositAmount * 0.02f
  case x if x <= 200000 => depositAmount * 0.04f
  case x if x <= 2000000 => depositAmount * 0.035f
  case _ => depositAmount * 0.065f
}
