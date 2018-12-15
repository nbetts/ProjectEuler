package ProjectEuler;

import java.math.BigInteger;

public class Problem13 implements Solvable {
  public String solve() {
    String[] numbers = Helpers.readFileLines("resources/Problem13.txt");
    BigInteger sum = BigInteger.ZERO;

    for (int i = 0; i < numbers.length; i++) {
      sum = sum.add(new BigInteger(numbers[i]));
    }

    return sum.toString().substring(0, 10);
  }
}