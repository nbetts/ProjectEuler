package ProjectEuler;

public class Problem4 implements Solvable {
  public static boolean isPalindrome(String string) {
    for (int i = 0; i < string.length() / 2; i++) {
      if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
        return false;
      }
    }

    return true;
  }

  public String solve() {
    int answer = 0;

    for (int i = 999; i > 99; i--) {
      for (int j = i; j > 99; j--) {
        int product = i * j;

        if (product > answer && ArrayHelpers.isPalindrome(Integer.toString(product))) {
          answer = product;
        }
      }
    }

    return Integer.toString(answer);
  }
}