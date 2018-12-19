package ProjectEuler;

public class Problem21 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 1; i < 10000; i++) {
      long[] factors = MathHelpers.factors(i, true);
      long sum = MathHelpers.sum(factors);

      if (i != sum) {
        factors = MathHelpers.factors(sum, true);
        sum = MathHelpers.sum(factors);

        if (i == sum) {
          answer += i;
        }
      }
    }

    return Integer.toString(answer);
  }
}