package ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;

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
  public static long[] factors(long n, boolean excludeN) {
    ArrayList<Long> factors = new ArrayList<>();
    ArrayList<Long> upperFactors = new ArrayList<>();

    long sqrt = (long) Math.sqrt(n);

    for (int i = 1; i <= sqrt; i++) {
      long l = i;

      if (n % l == 0) {
        factors.add(l);

        if (l != sqrt) {
          upperFactors.add(n / l);
        }
      }
    }

    if (excludeN) {
      upperFactors.remove(n);
    }

    Collections.reverse(upperFactors);
    factors.addAll(upperFactors);

    return factors.stream().mapToLong(Long::longValue).toArray();
  }

  /**
   * Return the sum of a list of numbers.
   */
  public static long sum(long[] numbers) {
    long sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    return sum;
  }
}