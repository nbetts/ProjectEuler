package ProjectEuler;

public class Problem18 implements Solvable {
  private int[][] numbers;
  private int largestSum = 0;

  private void checkSum(int yOffset, int xOffset, int sum) {
    if (yOffset == numbers[0].length - 1) {
      if (sum > largestSum) {
        largestSum = sum;
      }

      return;
    }

    checkSum(yOffset + 1, xOffset, sum + numbers[yOffset + 1][xOffset]);
    checkSum(yOffset + 1, xOffset + 1, sum + numbers[yOffset + 1][xOffset + 1]);
  }

  public String solve() {
    numbers = FileHelpers.readFileNumbers2D("resources/Problem18.txt");
    checkSum(0, 0, numbers[0][0]);

    return Integer.toString(largestSum);
  }
}