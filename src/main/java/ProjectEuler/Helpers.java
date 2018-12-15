package ProjectEuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helpers {
  private Helpers() { }

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

  /**
   * Read the contents of a file into an array of strings.
   */
  public static String[] readFileLines(String filename) {
    try {
      return Files.readAllLines(Paths.get(filename)).toArray(new String[0]);
    } catch (IOException exception) {
      exception.printStackTrace();
    }

    return null;
  }

  /**
   * Read the contents of a file into a 2D array of ints.
   */
  public static int[][] readFileNumbers2D(String filename) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(filename));
      int maxArrayLength = lines.get(0).split(" ").length;

      for (String line : lines) {
        int arrayLength = line.split(" ").length;

        if (arrayLength > maxArrayLength) {
          maxArrayLength = arrayLength;
        }
      }

      int[][] array = new int[lines.size()][maxArrayLength];

      for (int i = 0; i < lines.size(); i++) {
        String[] numbers = lines.get(i).split(" ");
        System.out.println(numbers.length);

        for (int j = 0; j < numbers.length; j++) {
          array[i][j] = Integer.parseInt(numbers[j]);
        }
      }

      return array;
    } catch (IOException exception) {
      exception.printStackTrace();
    }

    return null;
  }
}