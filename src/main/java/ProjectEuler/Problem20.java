package ProjectEuler;

import java.math.BigInteger;

public class Problem20 implements Solvable {
  public String solve() {
    int answer = 0;
    BigInteger factorial = BigInteger.ONE;

    for (int i = 2; i <= 100; i++) {
      factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
    }

    String value = factorial.toString();

    for (int i = 0; i < value.length(); i++) {
      answer += Character.getNumericValue(value.charAt(i));
    }

    return Integer.toString(answer);
  }
}