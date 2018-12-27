package ProjectEuler;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem26 implements Solvable {
  public String solve() {
    Pattern repeatingGroup = Pattern.compile("([0-9]+?)\\1");
    int answer = 0, largestCycle = 0;

    for (int i = 7; i < 1000; i++) {
      if (MathHelpers.isPrime(i)) {
        int offset = i / 10;
        BigDecimal decimal = BigDecimal.ONE.divide(new BigDecimal(i), i * 2 + offset, BigDecimal.ROUND_HALF_UP);
        String fraction = decimal.toString().substring(2 + offset, i * 2 + offset);

        Matcher matcher = repeatingGroup.matcher(fraction);
        int cycle = fraction.length();

        while (matcher.find()) {
          cycle = matcher.group(1).length();
        }

        if (cycle > largestCycle) {
          largestCycle = cycle;
          answer = i;
        }
      }
    }

    return Integer.toString(answer);
  }
}