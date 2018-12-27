package ProjectEuler;

public class Problem30 implements Solvable {
  public String solve() {
    int answer = 0;
    int[] powers = new int[10];

    for (int i = 0; i < powers.length; i++) {
      powers[i] = (int) Math.pow(i, 5);
    }

    int limit = powers[9] * (int) (Math.log10(powers[9]) + 2);

    for (int i = 2; i < limit; i++) {
      int sumDigits = 0;

      for (char digit : Integer.toString(i).toCharArray()) {
        sumDigits += powers[Character.getNumericValue(digit)];
      }

      if (sumDigits == i) {
        answer += i;
      }
    }

    return Integer.toString(answer);
  }
}