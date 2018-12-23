package ProjectEuler;

public class Problem40 implements Solvable {
  public String solve() {
    int answer = 1, dn = 1, digitCount = 0;

    for (int i = 1; dn <= 1000000; i++) {
      String digits = Integer.toString(i);
      digitCount += digits.length();

      if (digitCount >= dn) {
        answer *= Character.getNumericValue(digits.charAt(digits.length() - 1 - (digitCount - dn)));
        dn *= 10;
      }
    }

    return Integer.toString(answer);
  }
}