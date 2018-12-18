package ProjectEuler;

public class Problem4 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 999; i > 99; i--) {
      for (int j = i; j > 99; j--) {
        int product = i * j;
        String string = Integer.toString(product);
        boolean isPalindrome = true;

        for (int k = 0; k < string.length()/2; k++) {
          if (string.charAt(k) != string.charAt(string.length()-1-k)) {
            isPalindrome = false;
            break;
          }
        }

        if (isPalindrome && product > answer) {
          answer = product;
        }
      }
    }

    return Integer.toString(answer);
  }
}