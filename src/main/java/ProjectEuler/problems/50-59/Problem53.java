package ProjectEuler;

import java.math.BigInteger;

public class Problem53 implements Solvable {
  public String solve() {
    BigInteger c = BigInteger.ONE, million = new BigInteger("1000000");
    BigInteger[] factorials = new BigInteger[101];
    factorials[0] = BigInteger.ONE;
    int answer = 0;

    for (int n = 1; n < factorials.length; n++, c = c.add(BigInteger.ONE)) {
      factorials[n] = factorials[n - 1].multiply(c);

      for (int r = 1; r <= n; r++) {
        BigInteger nCr = factorials[n].divide(factorials[r].multiply(factorials[n-r]));

        if (nCr.compareTo(million) > 0) {
          answer++;
        }
      }
    }

    return String.valueOf(answer);
  }
}