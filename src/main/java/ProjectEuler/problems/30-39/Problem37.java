package ProjectEuler;

public class Problem37 implements Solvable {
  public String solve() {
    int answer = 0, truncatablePrimeCount = 0;

    for (int i = 11; truncatablePrimeCount < 11; i += 2) {
      if (MathHelpers.isPrime(i)) {
        String number = Integer.toString(i);
        boolean isTruncatablePrime = true;

        for (int j = 1; j < number.length(); j++) {
          int left = Integer.parseInt(number.substring(j));
          int right = Integer.parseInt(number.substring(0, number.length() - j));

          if (!MathHelpers.isPrime(left) || !MathHelpers.isPrime(right)) {
            isTruncatablePrime = false;
            break;
          }
        }

        if (isTruncatablePrime) {
          truncatablePrimeCount += 1;
          answer += i;
        }
      }
    }

    return Integer.toString(answer);
  }
}