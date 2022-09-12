object Main {
  def main(args: Array[String]) = {
    val x = new Rational(3, 4);
    val y = new Rational(5, 8);
    val z = new Rational(2, 7);

    println(x);
    println(y);
    println(z);

    println(x.sub(y.sub(z)));

  } 
}

class Rational(x: Int, y: Int) {
  require(y > 0, "Denominator Must be greater then 0")

  private def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case _ => GCD(b, a % b)
  }

  val numerator = x / GCD(Math.abs(x), y)
  val denominator = y / GCD(Math.abs(x), y)

  def neg(): Rational = {
    new Rational(-1 * this.numerator, this.denominator)
  }

  def add(that: Rational): Rational = {
    val n = (this.numerator * that.denominator) + (that.numerator * this.denominator)
    val d = this.denominator * that.denominator 
    new Rational(n, d)
  }

  def sub(that: Rational): Rational = {
    this add(that.neg())
  }

  override def toString(): String = {
    "(" + this.numerator + "/" + this.denominator + ")"
  }
}