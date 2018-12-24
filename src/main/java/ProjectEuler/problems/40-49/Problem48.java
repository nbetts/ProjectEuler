package ProjectEuler;

import java.math.BigInteger;

public class Problem48 implements Solvable {
  public String solve() {
    BigInteger sum = BigInteger.ZERO;

    for (int i = 1; i <= 1000; i++) {
      sum = sum.add(new BigInteger(Integer.toString(i)).pow(i));
    }

    String answer = sum.toString();

    return answer.substring(answer.length() - 10);
  }
}