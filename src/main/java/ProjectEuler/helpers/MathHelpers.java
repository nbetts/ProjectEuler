package ProjectEuler;

import java.util.ArrayList;

public class MathHelpers {
  private MathHelpers() { }

  /**
   * Determine if a number n is prime.
   * Original method: https://stackoverflow.com/a/1801446
   */
  public static boolean isPrime(long n) {
    if (n == 2 || n == 3) {
      return true;
    }

    if (n % 2 == 0 || n % 3 == 0) {
      return false;
    }

    long i = 5, w = 2;

    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }

      i += w;
      w = 6 - w;
    }

    return true;
  }

  /**
   * Calculate the nth triangle number.
   */
  public static long triangleNumber(long n) {
    return n * (n + 1) / 2;
  }

  /**
   * Return an int array of factors of n.
   */
  public static long[] factors(long n) {
    ArrayList<Long> factors = new ArrayList<>();

    for (int i = 1; i <= Math.sqrt((double)n); i++) {
      long l = (long) i;

      if (n % l == 0) {
        factors.add(l);
        factors.add(n / l);
      }
    }

    return factors.stream().mapToLong(Long::longValue).toArray();
  }
}