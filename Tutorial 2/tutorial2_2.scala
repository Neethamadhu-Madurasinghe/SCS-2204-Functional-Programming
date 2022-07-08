object Tutorial2_2 {
  def main(args:Array[String]): Unit = {
    
    printf("Take home salary is: %.2f\n", calcTakeHomeSalary(40, 30));

    printf("Profit at 10LKR per ticket : %d\n", calcProfit(10));
    printf("Profit at 15LKR per ticket : %d\n", calcProfit(15));
    printf("Profit at 20LKR per ticket : %d\n", calcProfit(20));
  
  }
}

// Question 4.a
def calcNormalHourSalary(hours: Int): Double = hours * 250;
def calcOTHourSalary(hours: Int): Double = hours * 85;
def calcTax(salary: Double): Double = salary * .12;

def calcTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
  (calcNormalHourSalary(normalHours) + calcOTHourSalary(otHours)) - calcTax(calcNormalHourSalary(normalHours) + calcOTHourSalary(otHours)) 
}


// Question 4.b
def calcAttendees(ticketPrice: Int): Int = 120 + ((15 - ticketPrice ) / 5) * 20;
def calcRevenue(ticketPrice: Int): Int = calcAttendees(ticketPrice) * ticketPrice;
def calcCost(ticketPrice: Int): Int = 500 + calcAttendees(ticketPrice) * 3;

def calcProfit(ticketPrice: Int): Int = {
  calcRevenue(ticketPrice) - calcCost(ticketPrice);
}