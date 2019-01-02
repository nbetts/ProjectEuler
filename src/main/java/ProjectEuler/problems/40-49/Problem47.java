package ProjectEuler;

import java.util.HashSet;

public class Problem47 implements Solvable {
  public String solve() {
    int answer = 0, numberCount = 4;

    for (int i = 1; answer == 0; i++) {
      boolean hasDistinctPrimeFactors = true;

      for (int j = 0; j < numberCount; j++) {
        if (MathHelpers.isPrime(i + j)) {
          hasDistinctPrimeFactors = false;
          break;
        }

        if (new HashSet<Long>(MathHelpers.primeFactors(i + j)).size() != numberCount) {
          hasDistinctPrimeFactors = false;
          break;
        }
      }

      if (hasDistinctPrimeFactors) {
        answer = i;
      }
    }

    return Integer.toString(answer);
  }
}