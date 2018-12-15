package ProjectEuler;

public class Problem6 implements Solvable {
  public String solve() {
    int sumOfSquares = 0, squareOfSum = 0;

    for (int i = 1; i <= 100; i++) {
      sumOfSquares += i * i;
      squareOfSum += i;
    }

    int answer = (squareOfSum * squareOfSum) - sumOfSquares;

    return Long.toString(answer);
  }
}