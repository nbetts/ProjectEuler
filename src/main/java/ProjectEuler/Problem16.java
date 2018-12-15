package ProjectEuler;

import java.math.BigInteger;

public class Problem16 implements Solvable {
  public String solve() {
    BigInteger number = BigInteger.ONE;
    BigInteger two = new BigInteger("2");

    for (int i = 0; i < 1000; i++) {
      number = number.multiply(two);
    }

    String numberValue = number.toString();
    int answer = 0;

    for (int i = 0; i < numberValue.length(); i++) {
      answer += Character.getNumericValue(numberValue.charAt(i));
    }

    return Integer.toString(answer);
  }
}