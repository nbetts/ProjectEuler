package ProjectEuler;

public class Problem8 implements Solvable {
  public String solve() {
    long answer = 0;
    int digits = 13;
    String number = FileHelpers.readFile("resources/Problem8.txt");

    for (int i = 0; i < number.length() - 1 - digits; i++) {
      long product = 1;

      for (int j = 0; j < digits; j++) {
        product *= Character.getNumericValue(number.charAt(i + j));
      }

      if (product > answer) {
        answer = product;
      }
    }

    return Long.toString(answer);
  }
}