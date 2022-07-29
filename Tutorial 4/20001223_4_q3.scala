import java.util.UUID
val randomNumberGenerator = scala.util.Random;

object Tutorial4 {
  def main(args: Array[String]): Unit = {
    // Question 3
    val cars: Array[CarUUID] = Array(
    CarUUID(Car("bmw 3 series", 20000.00)),
    CarUUID(Car("bmw 5 series", 50000.00)),
    CarUUID(Car("vw passat", 10000.00)),
    CarUUID(Car("vw golf series", 12000.00)),
    CarUUID(Car("mazda 3", 15000.00)),
    );

    displayCars(cars);
  }
} 

// Question 3
def getUUID(car: Car): Int = {
  car.hashCode + randomNumberGenerator.nextInt()
}

case class Car(name: String, price: Double)

// Companion object for CarUUID cases class defines auxiliary contructor which takes only Car object (UUID generated using the Car object)
object CarUUID {
  def apply(car: Car) = new CarUUID(car, getUUID(car))
}

case class CarUUID(car: Car, UUID: Int) 


def displayCars(cars: Array[CarUUID]): Any = if(!cars.isEmpty) {
  printf("car uuid = %s - %d\n", cars.head.car.name, cars.head.UUID)
  displayCars(cars.tail)
}