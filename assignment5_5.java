class Main {

  /*
   * Returns whether a given number is prime or not.
   */
  static boolean isPrime(int candidate) {
    // Make sure we start at the right number.
    if (candidate < 2) {
      return false;
    }

    boolean prime = true;

    for (int i = 2; i < candidate; i++) {
      // Clearly number is not prime.
      if (candidate % i == 0) {
        prime = false;
        break;
      }
    }

    return prime;
  }

  /*
   */
  public static void main(String[] args) {
    // code here
  }
}


