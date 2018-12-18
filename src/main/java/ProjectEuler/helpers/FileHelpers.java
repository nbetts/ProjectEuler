package ProjectEuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHelpers {
  private FileHelpers() { }

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
      int maxArrayLength = lines.get(0).trim().split(" ").length;

      for (String line : lines) {
        int arrayLength = line.trim().split(" ").length;

        if (arrayLength > maxArrayLength) {
          maxArrayLength = arrayLength;
        }
      }

      int[][] array = new int[lines.size()][maxArrayLength];

      for (int i = 0; i < lines.size(); i++) {
        String[] numbers = lines.get(i).trim().split("\\s+");

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