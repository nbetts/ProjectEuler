package ProjectEuler;

public class Problem4 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 999; i > 99; i--) {
      for (int j = i; j > 99; j--) {
        int result = i * j;
        String resultString = Integer.toString(result);
        boolean isPalindrome = true;

        for (int k = 0; k < resultString.length()/2; k++) {
          if (resultString.charAt(k) != resultString.charAt(resultString.length()-1-k)) {
            isPalindrome = false;
            break;
          }
        }

        if (isPalindrome && result > answer) {
          answer = result;
        }
      }
    }

    return Integer.toString(answer);
  }
}