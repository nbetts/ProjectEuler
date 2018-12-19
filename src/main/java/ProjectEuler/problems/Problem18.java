package ProjectEuler;

public class Problem18 implements Solvable {
  private int[][] numbers;
  private int largestSum = 0;

  private void checkSum(int yOffset, int xOffset, int sum, boolean checkLeft, boolean checkRight) {
    if (yOffset == numbers[0].length - 1) {
      if (sum > largestSum) {
        largestSum = sum;
      }

      return;
    }

    int left = numbers[yOffset + 1][xOffset];
    int right = numbers[yOffset + 1][xOffset + 1];
    boolean checkOverlap = left > right;

    if (checkLeft) {
      checkSum(yOffset + 1, xOffset, sum + left, true, checkOverlap);
    }
    if (checkRight) {
      checkSum(yOffset + 1, xOffset + 1, sum + right, !checkOverlap, true);
    }
  }

  public String solve() {
    numbers = FileHelpers.readFileNumbers2D("resources/Problem18.txt");
    checkSum(0, 0, numbers[0][0], true, true);

    return Integer.toString(largestSum);
  }
}