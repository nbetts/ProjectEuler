package ProjectEuler;

public class Problem34 implements Solvable {
  public String solve() {
    int answer = 0, digits = 10;
    int[] factorials = new int[digits];
    factorials[0] = 1;

    for (int i = 1; i < digits; i++) {
      factorials[i] = i * factorials[i - 1];
    }

    int limit = (digits - 1) * factorials[digits - 1];

    for (int i = 3; i < limit; i++) {
      int sumDigits = 0;

      for (char digit : Integer.toString(i).toCharArray()) {
        sumDigits += factorials[Character.getNumericValue(digit)];
      }

      if (sumDigits == i) {
        answer += i;
      }
    }

    return Integer.toString(answer);
  }
}