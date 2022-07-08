object Tutorial2_1 {
  def main(args:Array[String]): Unit = {
    var (k, i, j, m, n, f, g, c) = (2, 2, 2, 5, 5, 120.0, 4.0f, 'X');
    
    println(k + 12 * m);  // k + (12 * m) = 2 + (12 * 5) = 62
    println(m / j); // m / j  = 5 / 2 =  2  (Integer division)
    println(n % j); // 5 % 2 = 1 (Modulus operator)
    println(m / j * j); //  (m / j) * j = (5 / 2) * 2 = 2 * 2 = 4
    println(f + 10 * 5 + g); // f + (10 * 5) + g = 120.0 + 50 + 4.0 = 174.0
    // println(++i * n);   // does not work ++ is not a valid operator

    var (a: Int, b: Int, c1: Int, d: Int) = (2, 3, 4, 5);  // In java int a = 2, b = 3, c1 = 4, d = 5; is possible
    // c1 and k1 because c and k are already defined
    var k1:Float = 4.3f;

    // println(--b * a + c1 * d); 
    /**
     *  Does not work -> -- is not a valid operator 
     *  Works in java - evaluated to 24 -> 2 * 2 + 4 * 5 = 24
     *  b = 2
     **/

    // println(a++)
     /**
     *  Does not work -> ++ is not a valid operator
     *  Works in java - evaluated to 2 
     *  a = 3
     **/

    println(-2 * (g - k1) + c1); 
    /**
     *  Evaluated to 4.6000004 -> -2 * (4.0 - 4.3) + 4 = -2 * -0.3 + 4 = 4.6 + 4 = 4.6  
     *  4.0000006 because rounding error
     **/

    // println(c1 = c1++);
    /**
     *  Does not work -> ++ is not a valid operator
     *  Evaluated to 4 in java  ( starts with incrementing a, and then reverting a to the old value as a++ returns the not incremented value.)
     *  c1 = 4
     **/

    //  println(c1 = ++c1 * a++);
     /**
     *  Does not work -> ++ is not a valid operator
     *  Evaluated to 15 in java  => ++4 * 3++ = 5 * 3 = 15
     *  c1 = 15
     *  a = 4
     **/
  
  }
}