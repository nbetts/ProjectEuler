package ProjectEuler;

import java.util.regex.Pattern;

public class Problem49 implements Solvable {
  public String solve() {
    for (int first = 1001; first < 9999; first += 2) {
      if (MathHelpers.isPrime(first)) {
        Pattern primeDigits = Pattern.compile(String.format("[%d]{4}", first));
        int second = first + 3330;

        if (MathHelpers.isPrime(second) && primeDigits.matcher(Integer.toString(second)).matches()) {
          int third = second + 3330;

          if (MathHelpers.isPrime(third) && primeDigits.matcher(Integer.toString(third)).matches()) {
            if (first != 1487) {
              return Integer.toString(first) + Integer.toString(second) + Integer.toString(third);
            }
          }
        }
      }
    }

    return "0";
  }
}