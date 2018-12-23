package ProjectEuler;

public class Problem9 implements Solvable {
  public String solve() {
    for (int a = 1; a < 1000; a++) {
      for (int b = a + 1; b < 1000; b++) {
        double squareSum = a * a + b * b;
        int c = (int) Math.sqrt(squareSum);

        if (c * c == squareSum && a + b + c == 1000) {
          return Integer.toString(a * b * c);
        }
      }
    }

    return "0";
  }
}