package ProjectEuler;

public class Problem33 implements Solvable {
  public String solve() {
    int numerator = 1, denominator = 1;

    for (int i = 11; i < 100; i++) {
      if (i % 10 != 0) {
        double numeratorLeft = i / 10;
        double numeratorRight = i % 10;

        for (int j = i + 1; j < 100; j++) {
          if (j % 10 != 0) {
            double denominatorLeft = j / 10;
            double denominatorRight = j % 10;
            double fraction = 0;

            if (numeratorRight == denominatorLeft) {
              fraction = numeratorLeft / denominatorRight;
            } else if (numeratorLeft == denominatorRight) {
              fraction = numeratorRight / denominatorLeft;
            }

            if (fraction != 0 && (double) i / (double) j == fraction) {
              numerator *= i; denominator *= j;
            }
          }
        }
      }
    }

    int answer = denominator / (int) MathHelpers.gcd(numerator, denominator);

    return Integer.toString(answer);
  }
}