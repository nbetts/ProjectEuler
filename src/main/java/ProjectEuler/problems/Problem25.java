package ProjectEuler;

import java.math.BigInteger;

public class Problem25 implements Solvable {
  public String solve() {
    int answer = 0;
    BigInteger previousFibonacciValue = BigInteger.ZERO,
               currentFibonacciValue = BigInteger.ONE;

    for (int i = 2; ; i++) {
      BigInteger temp = currentFibonacciValue;
      currentFibonacciValue = currentFibonacciValue.add(previousFibonacciValue);

      if (currentFibonacciValue.toString().length() >= 1000) {
        answer = i;
        break;
      }

      previousFibonacciValue = temp;
    }

    return Integer.toString(answer);
  }
}