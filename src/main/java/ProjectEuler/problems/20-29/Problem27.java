package ProjectEuler;

public class Problem27 implements Solvable {
  public String solve() {
    int answer = 0, sum, largestN = 0;

    for (int a = -999; a < 1000; a++) {
      for (int b = -1000; b <= 1000; b++) {
        int n = 0;

        do {
          sum = n * n + a * n + b;
          n++;
        } while (sum > 0 && MathHelpers.isPrime(sum));

        if (n > largestN) {
          largestN = n;
          answer = a * b;
        }
      }
    }

    return Integer.toString(answer);
  }
}