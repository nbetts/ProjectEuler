package ProjectEuler;

public class Problem41 implements Solvable {
  public String solve() {
    int answer = 0;

    // Exploiting the fact that a 9 digit pandigital number has to be 4 or 7 digits long.
    for (int i = 7654321; i > 1234567; i -= 2) {
      if (MathHelpers.isPandigital(i, false) && MathHelpers.isPrime(i)) {
        return Integer.toString(i);
      }
    }

    return "0";
  }
}