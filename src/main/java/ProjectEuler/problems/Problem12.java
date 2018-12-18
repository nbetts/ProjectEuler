package ProjectEuler;

public class Problem12 implements Solvable {
  public String solve() {
    long answer;

    for (int i = 1; ; i++) {
      answer = MathHelpers.triangleNumber(i);

      if (MathHelpers.factors(answer).length > 500) {
        break;
      }
    }

    return Long.toString(answer);
  }
}