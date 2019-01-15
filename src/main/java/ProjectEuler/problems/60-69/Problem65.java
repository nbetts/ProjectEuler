package ProjectEuler;

import java.math.BigInteger;

public class Problem65 implements Solvable {
  public String solve() {
    BigInteger multiplier = BigInteger.ZERO, two = new BigInteger("2");
    BigInteger numerator = two, previousNumerator = BigInteger.ONE;
    BigInteger denominator = BigInteger.ONE, previousDenominator = BigInteger.ZERO;

    for (int i = 2; i <= 100; i++) {
      BigInteger tempNumerator = numerator, tempDenominator = denominator;

      if (i % 3 == 0) {
        multiplier = multiplier.add(two);
        numerator = numerator.multiply(multiplier);
        denominator = denominator.multiply(multiplier);
      }

      numerator = numerator.add(previousNumerator);
      denominator = denominator.add(previousDenominator);
      previousNumerator = tempNumerator;
      previousDenominator = tempDenominator;
    }

    return String.valueOf(StringHelpers.sumDigits(numerator.toString()));
  }
}