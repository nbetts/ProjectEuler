package ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;

public class MathHelpers {
  private MathHelpers() { }

  /**
   * Return true if a number n is prime.
   * Original method: https://stackoverflow.com/a/1801446
   */
  public static boolean isPrime(long n) {
    if (n == 1) {
      return false;
    }

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
   * Return the nth triangle number.
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

    for (int i = 1; i <= Math.sqrt(n); i++) {
      long l = i;

      if (n % l == 0) {
        factors.add(l);

        if (l != n / l) {
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
   * Return the greatest common divisor (gcd) of two numbers.
   */
  public static long gcd(long a, long b) {
    if (b != 0) {
      return gcd(b, a % b);
    }

    return a;
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

  /**
   * Return the factorial of n.
   */
  public static long factorial(int n) {
    long factorial = 1;

    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    return factorial;
  }

  /**
   * Return true if the integers a, b and c form a Pythagorean triple.
   */
  public static boolean isPythagoreanTriple(int a, int b, int c) {
    return a * a + b * b == c * c;
  }

  /**
   * Return true if an number is pandigital.
   */
  public static boolean isPandigital(long n, boolean includeZero) {
    int length = (int) (Math.log10(n) + 1);
    int[] digits = new int[length];
    long digitSum = 0;
    boolean containsZero = false;

    for (int i = 0; i < length; i++) {
      int digit = (int) n % 10;

      if (digit == 0) {
        if (includeZero) {
          containsZero = true;
        } else {
          return false;
        }
      }

      digits[i] = digit;
      digitSum += digit;
      n /= 10;
    }

    if (digitSum == triangleNumber(containsZero ? length - 1 : length)) {
      boolean[] includedDigits = new boolean[length + 1];

      for (int j = 1; j <= length; j++) {
        int digit = digits[length - j];

        if (digit > length || includedDigits[digit]) {
          return false;
        }

        includedDigits[digit] = true;
      }

      return true;
    }

    return false;
  }
}