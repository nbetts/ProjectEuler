package ProjectEuler;

public class Helpers {
  private Helpers() { }

  /**
   * Determine if a number n is prime.
   * Original method: https://stackoverflow.com/a/1801446
   */
  public static boolean isPrime(int n) {
    if (n == 2 || n == 3) {
      return true;
    }

    if (n % 2 == 0 || n % 3 == 0) {
      return false;
    }

    int i = 5, w = 2;

    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }

      i += w;
      w = 6 - w;
    }

    return true;
  }
}