package ProjectEuler;

public class Problem21 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 1; i < 10000; i++) {
      long[] factors = MathHelpers.factors(i);
      long sum = MathHelpers.sum(factors) - factors[1];

      if (i != sum) {
        factors = MathHelpers.factors(sum);
        sum = MathHelpers.sum(factors) - factors[1];

        if (i == sum) {
          answer += i;
        }
      }
    }

    return Integer.toString(answer);
  }
}