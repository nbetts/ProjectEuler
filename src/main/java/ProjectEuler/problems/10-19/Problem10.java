package ProjectEuler;

public class Problem10 implements Solvable {
  public String solve() {
    long answer = 2;

    for (int i = 3; i < 2000000; i += 2) {
      if (MathHelpers.isPrime(i)) {
        answer += i;
      }
    }

    return Long.toString(answer);
  }
}