object Main {
  def main(args: Array[String]): Unit = {
    val point1: Point = Point(10, 20)
    val point2: Point = Point(100, 200)

    println(point1 + point2)
    println(point1.move(5, 5))
    println(point1.distance(point2))
    println(point1.invert())
  }
}

case class Point(x: Double, y: Double) {

  def +(that: Point): Point = Point(this.x + that.x, this.y + that.y)
  def move(x: Double, y: Double): Point = Point(this.x + x, this.y + y)

  def distance(that: Point): Double = {
    val distanceBetweenX = this.x - that.x
    val distanceBetweenY = this.y - that.y
    // Distance between two points = sqrt((dx)^2 + (dy)^2)
    Math.sqrt((distanceBetweenX * distanceBetweenX) + (distanceBetweenY * distanceBetweenY))
  }


  def invert(): Point = Point(this.y, this.x)
}