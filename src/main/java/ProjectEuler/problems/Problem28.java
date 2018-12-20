package ProjectEuler;

public class Problem28 implements Solvable {
  public String solve() {
    int answer = 1;

    for (int i = 2; i <= 1001; i += 2) {
      for (int j = 0; j < 4; j++) {
        answer += (i * (j + i - 1)) + 1;
      }
    }

    return Integer.toString(answer);
  }
}