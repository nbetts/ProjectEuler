package ProjectEuler;

public class Problem58 implements Solvable {
  public String solve() {
    int sideLength = 0;
    double ratio = 1.0;

    for (int i = 1, sum = 1, primes = 0; ratio > 0.1; i++) {

      for (int j = 0; j < 4; j++) {
        sum += i * 2;

        if (MathHelpers.isPrime(sum)) {
          primes++;
        }
      }

      sideLength = i * 2 + 1;
      ratio = (double) primes / (double) (i * 4 + 1);
    }

    return Integer.toString(sideLength);
  }
}