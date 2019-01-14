package ProjectEuler;

import java.math.BigInteger;

public class Problem57 implements Solvable {
  public String solve() {
    BigInteger numerator = BigInteger.ONE, denominator = BigInteger.ONE;
    BigInteger previousNumerator = BigInteger.ONE, two = new BigInteger("2");
    int answer = 0;

    for (int i = 1; i <= 1000; i++) {
      BigInteger temp = numerator;
      numerator = numerator.multiply(two).add(previousNumerator);
      previousNumerator = temp;
      denominator = denominator.add(previousNumerator);

      if (numerator.toString().length() > denominator.toString().length()) {
        answer++;
      }
    }

    return String.valueOf(answer);
  }
}