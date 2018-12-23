package ProjectEuler;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHelpers {
  private FileHelpers() { }

  /**
   * Write the contents of a string into a file.
   */
  public static void createProblem(int number) {
    try {
      int group = number / 10;
      Path directory = Paths.get(String.format("src/main/java/ProjectEuler/problems/%d0-%d9/", group, group));

      if (!Files.isDirectory(directory)) {
        Files.createDirectory(directory);
      }

      Path filePath = Paths.get(directory.toString(), "Problem" + number + ".java");

      if (Files.exists(filePath)) {
        throw new FileAlreadyExistsException("Problem " + number + " already exists.");
      } else {
        String template = FileHelpers.readFile("resources/ProblemTemplate.txt");
        Files.write(filePath, template.replaceAll("Problem", "Problem" + number).getBytes());
      }
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

  /**
   * Write the contents of a string into a file.
   */
  public static void writeFile(String filename, String fileContents) {
    try {
      Files.write(Paths.get(filename), fileContents.getBytes());
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

  /**
   * Read the contents of a file into a string.
   */
  public static String readFile(String filename) {
    try {
      return new String(Files.readAllBytes(Paths.get(filename)));
    } catch (IOException exception) {
      exception.printStackTrace();
    }

    return null;
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
      int maxArrayLength = lines.get(0).trim().split("\\s+").length;

      for (String line : lines) {
        int arrayLength = line.trim().split("\\s+").length;

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