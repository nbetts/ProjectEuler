package ProjectEuler;

public class Problem2 implements Solvable {
  public String solve() {
    int answer = 0,
        previousFibonacciValue = 0,
        currentFibonacciValue = 1;

    while (currentFibonacciValue < 4000000) {
      int temp = currentFibonacciValue;
      currentFibonacciValue = currentFibonacciValue + previousFibonacciValue;
      previousFibonacciValue = temp;

      if ((currentFibonacciValue & 1) == 0) {
        answer += currentFibonacciValue;
      }
    }

    return Integer.toString(answer);
  }
}