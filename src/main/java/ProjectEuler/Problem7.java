package ProjectEuler;

public class Problem7 implements Solvable {
  public String solve() {
    int answer = 0, counter = 1;

    for (int i = 3; counter < 10001; i += 2) {
      if (Helpers.isPrime(i)) {
        answer = i;
        counter++;
      }
    }

    return Long.toString(answer);
  }
}