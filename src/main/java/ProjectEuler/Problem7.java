package ProjectEuler;

public class Problem7 implements Solvable {
  public String solve() {
    long answer = 0;

    for (int i = 3, counter = 1; counter < 10001; i += 2) {
      if (MathHelpers.isPrime(i)) {
        answer = i;
        counter++;
      }
    }

    return Long.toString(answer);
  }
}