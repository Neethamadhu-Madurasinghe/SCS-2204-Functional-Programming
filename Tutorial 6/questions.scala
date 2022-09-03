object Main {
  def main(args: Array[String]) : Any = {
    val alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    val encryptFunction = (charactor: Char, key: Int, aph: String) => aph((aph.indexOf(charactor) + key) % aph.size);
    val decryptFunction = (charactor: Char, key: Int, aph: String) => aph((aph.indexOf(charactor) + (aph.size - key)) % aph.size);

    val cipher = (foo: (Char, Int, String) => Char, word: String, key: Int, a: String) => word.map(foo(_, key, a));

    val encyptedWord = cipher(encryptFunction, "ElephAntz76", 1, alphabet);
    println(encyptedWord) 

    val decryptedWord = cipher(decryptFunction, encyptedWord, 1, alphabet)
    println(decryptedWord) 
  }
}