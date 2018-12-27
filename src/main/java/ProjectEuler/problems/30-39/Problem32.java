package ProjectEuler;

import java.util.HashSet;
import java.util.regex.Pattern;

public class Problem32 implements Solvable {
  public String solve() {
    Pattern uniqueDigits = Pattern.compile("(?:([1-9])(?![1-9]*\\1))*");
    HashSet<Integer> uniqueProducts = new HashSet<>();
    int answer = 0;

    for (int i = 1; i < 100; i++) {
      String multiplicand = Integer.toString(i);

      if (uniqueDigits.matcher(multiplicand).matches()) {
        for (int j = i + 1; ; j++) {
          String digits = multiplicand + Integer.toString(j);

          if (uniqueDigits.matcher(digits).matches()) {
            int product = i * j;
            digits += Integer.toString(product);

            if (digits.length() > 9) {
              break;
            }

            if (digits.length() == 9 && !uniqueProducts.contains(product)
                && uniqueDigits.matcher(digits).matches()) {
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