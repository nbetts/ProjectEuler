package ProjectEuler;

public class Problem10 implements Solvable {
  public String solve() {
    long answer = 2L;

    for (int i = 3; i < 2000000; i += 2) {
      if (Helpers.isPrime(i)) {
        answer += (long) i;
      }
    }

    return Long.toString(answer);
  }
}