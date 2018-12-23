package ProjectEuler;

public class Problem24 implements Solvable {
  private int digits = 10, index = 0;
  private String[] solutions = new String[(int) MathHelpers.factorial(digits)];

  private void buildPermuation(String permutation) {
    int digit = permutation.length();

    if (digit < digits) {
      for (int i = 0; i <= digit; i++) {
        buildPermuation(permutation.substring(0, i) + Integer.toString(digit) + permutation.substring(i));
      }
    } else {
      solutions[index++] = permutation;
    }
  }

  public String solve() {
    buildPermuation("0");
    ArrayHelpers.sort(solutions);

    return solutions[999999];
  }
}