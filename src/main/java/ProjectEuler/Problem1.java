package ProjectEuler;

public class Problem1 implements Problem {
  public String solve() {
    int sum = 0;

    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }

    return Integer.toString(sum);
  }
}