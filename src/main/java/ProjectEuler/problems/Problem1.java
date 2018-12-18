package ProjectEuler;

public class Problem1 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        answer += i;
      }
    }

    return Integer.toString(answer);
  }
}