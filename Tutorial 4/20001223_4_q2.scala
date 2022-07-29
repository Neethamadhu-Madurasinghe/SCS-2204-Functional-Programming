object Tutorial4 {
  def main(args: Array[String]): Unit = {
    // Question 2
    var shoppingCart: Array[ShoppingCartItem] = Array(
      ShoppingCartItem("Vanilla Ice Cream", 3.99f, 13),
      ShoppingCartItem("Chocolate Biscuites", 4.00f, 6),
      ShoppingCartItem("Cupcakes", 7.77f, 7),
    );
    
    displayShoppingCart(shoppingCart);
    println();
    findVanillaIceCream(shoppingCart);

  }
} 

// Question 2
case class ShoppingCartItem(name: String, price: Float, quantity: Int)

def displayShoppingCart(shoppingCart: Array[ShoppingCartItem]): Any = if(!shoppingCart.isEmpty) {
    printf("%d %s at Rs %.2f each\n", shoppingCart.head.quantity, shoppingCart.head.name, shoppingCart.head.price)
    displayShoppingCart(shoppingCart.tail)
}



def findVanillaIceCream(shoppingCart: Array[ShoppingCartItem]): Any = {
  if(!shoppingCart.isEmpty && isVanillaInceCream(shoppingCart.head)) {
   printf("%d %s at Rs %.2f each\n", shoppingCart.head.quantity, shoppingCart.head.name, shoppingCart.head.price)
   findVanillaIceCream(shoppingCart.tail)
  }
  else if (!shoppingCart.isEmpty) {
  println("Found another item")
  findVanillaIceCream(shoppingCart.tail)
  }
}
//  checks wether given cart item is an ice cream object
def isVanillaInceCream(cartItem: ShoppingCartItem): Boolean = cartItem match {
  case ShoppingCartItem("Vanilla Ice Cream", _ , _) => true
  case _ => false
}
