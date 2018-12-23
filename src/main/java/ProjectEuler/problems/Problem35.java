package ProjectEuler;

import java.util.Collections;

public class Problem35 implements Solvable {
  public String solve() {
    int answer = 1;

    for (int i = 3; i < 1000000; i += 2) {
      if (MathHelpers.isPrime(i)) {
        String number = Integer.toString(i);
        boolean isCircularPrime = true;

        for (int j = 0; j < number.length() - 1; j++) {
          number = number.substring(1) + number.substring(0, 1);

          if (!MathHelpers.isPrime(Integer.parseInt(number))) {
            isCircularPrime = false;
            break;
          }
        }

        if (isCircularPrime) {
          answer++;
        }
      }
    }

    return Integer.toString(answer);
  }
}