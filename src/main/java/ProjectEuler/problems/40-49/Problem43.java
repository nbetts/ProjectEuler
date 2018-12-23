package ProjectEuler;

import java.util.stream.IntStream;

public class Problem43 implements Solvable {
  private long answer = 0;
  private int[] primes = { 2, 3, 5, 7, 11, 13, 17 };

  private void buildPandigital(String number) {
    int digit = number.length();

    if (digit < 10) {
      for (int i = 0; i <= digit; i++) {
        buildPandigital(number.substring(0, i) + Integer.toString(digit) + number.substring(i));
      }
    } else {
      for (int i = 0; i < primes.length; i++) {
        String trebleDigits = "";

        for (int j = 0; j < 3; j++) {
          trebleDigits += Character.getNumericValue(number.charAt(i + j + 1));
        }

        if (Integer.parseInt(trebleDigits) % primes[i] != 0) {
          return;
        }
      }

      answer += Long.parseLong(number);
    }
  }

  public String solve() {
    buildPandigital("0");

    return Long.toString(answer);
  }
}