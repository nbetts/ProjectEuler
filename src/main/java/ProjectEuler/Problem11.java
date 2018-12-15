package ProjectEuler;

public class Problem11 implements Solvable {
  public String solve() {
    int[][] numbers = Helpers.readFile("resources/Problem11.txt");
    int answer = 0, product, line = 4,
        columnLength = numbers.length, rowLength = numbers[0].length;

    for (int i = 0; i < columnLength; i++) {
      for (int j = 0; j < rowLength; j++) {
        // calculate product to the right
        if (j + line < rowLength) {
          product = 1;

          for (int k = 0; k < line; k++) {
            product *= numbers[i][j+k];
          }

          if (product > answer) {
            answer = product;
          }
        }

        // calculate product to the right and down
        if (j + line < rowLength && i + line < columnLength) {
          product = 1;

          for (int k = 0; k < line; k++) {
            product *= numbers[i+k][j+k];
          }

          if (product > answer) {
            answer = product;
          }
        }

        // calculate product down
        if (i + line < columnLength) {
          product = 1;

          for (int k = 0; k < line; k++) {
            product *= numbers[i+k][j];
          }

          if (product > answer) {
            answer = product;
          }
        }

        // calculate product to the left and down
        if (j - line > 0 && i + line < columnLength) {
          product = 1;

          for (int k = 0; k < line; k++) {
            product *= numbers[i+k][j-k];
          }

          if (product > answer) {
            answer = product;
          }
        }
      }
    }

    return Integer.toString(answer);
  }
}