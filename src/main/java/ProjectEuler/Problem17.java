package ProjectEuler;

public class Problem17 implements Solvable {
  public String solve() {
    int answer = 0;

    // The lengths of each number
    int[] ones = { 0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8 };
    int[] tens = { 0, 3, 6, 6, 5, 5, 5, 7, 6, 6 };
    int hundred = 7, thousand = 8, and = 3;

    for (int i = 1; i <= 1000; i++) {
      int number = i;

      if (number >= 1000) {
        answer += ones[number / 1000] + thousand;
        number %= 1000;
      }

      if (number >= 100) {
        answer += ones[number / 100] + hundred;

        if (number % 100 != 0) {
          answer += and;
        }

        number %= 100;
      }

      if (number >= 20) {
        answer += tens[number / 10];
        number %= 10;
      }

      if (number > 0) {
        answer += ones[number];
      }
    }

    return Integer.toString(answer);
  }
}