package ProjectEuler;

import java.util.ArrayList;

public class Problem51 implements Solvable {
  public String solve() {
    // ArrayList<Integer> primes = MathHelpers.primeList(10000000);
    int[] endDigits = { 1, 3, 7, 9 };
    int answer = 0, primeCount = 0;

    for (int i = 0; i <= 3; i++) {
      for (int j = 1; j <= (2 << i) - 1; j++) {
        String binary = String.format(String.format("%%%ds", i + 1), Integer.toBinaryString(j)).replace(' ', '0');

        for (int k = 0; k < i + 1; k++) {
          //
        }
      }
    }

    return Integer.toString(answer);
  }
}