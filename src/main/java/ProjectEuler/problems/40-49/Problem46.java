package ProjectEuler;

import java.util.ArrayList;

public class Problem46 implements Solvable {
  public String solve() {
    ArrayList<Integer> primes = new ArrayList<>(1024);
    boolean hasFoundNumber = false;
    int answer = 0;

    for (int i = 3; !hasFoundNumber; i += 2) {
      if (MathHelpers.isPrime(i)) {
        primes.add(i);
      } else {
        boolean checkSquares = true;

        for (int j = 0; checkSquares; j++) {
          if (j == primes.size()) {
            answer = i;
            hasFoundNumber = true;
            break;
          }

          int prime = primes.get(j);
          checkSquares = true;

          for (int k = 1, sum = 0; sum < i; k++) {
            sum = prime + 2 * k * k;

            if (sum == i) {
              checkSquares = false;
            }
          }
        }
      }
    }

    return Integer.toString(answer);
  }
}