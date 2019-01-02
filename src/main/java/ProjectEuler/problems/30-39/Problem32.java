package ProjectEuler;

import java.util.HashSet;

public class Problem32 implements Solvable {
  public String solve() {
    HashSet<Integer> uniqueProducts = new HashSet<>();
    int answer = 0;

    for (int i = 1; i < 100; i++) {
      String multiplicand = Integer.toString(i);

      if (StringHelpers.isUniqueDigits(multiplicand)) {
        for (int j = i + 1; ; j++) {
          String digits = multiplicand + Integer.toString(j);

          if (StringHelpers.isUniqueDigits(digits)) {
            int product = i * j;
            digits += Integer.toString(product);

            if (digits.length() > 9) {
              break;
            }

            if (digits.length() == 9 && !uniqueProducts.contains(product)
                && StringHelpers.isUniqueDigits(digits)) {
              uniqueProducts.add(product);
              answer += product;
            }
          }
        }
      }
    }

    return Integer.toString(answer);
  }
}