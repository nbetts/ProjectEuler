package ProjectEuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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

  /**
   * Read the contents of a file into a 2D array of ints.
   */
  public static int[][] readFile(String filename) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(filename));
      int[][] array = new int[lines.size()][lines.get(0).split(" ").length];

      for (int i = 0; i < lines.size(); i++) {
        String[] numbers = lines.get(i).split(" ");

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