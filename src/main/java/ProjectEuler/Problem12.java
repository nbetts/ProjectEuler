package ProjectEuler;

public class Problem12 implements Solvable {
  public String solve() {
    long answer;

    for (int i = 1; ; i++) {
      answer = Helpers.triangleNumber(i);

      if (Helpers.factors(answer).length > 500) {
        break;
      }
    }

    return Long.toString(answer);
  }
}