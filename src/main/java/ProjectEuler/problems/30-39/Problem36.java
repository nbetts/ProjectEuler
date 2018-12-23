package ProjectEuler;

public class Problem36 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 1; i < 1000000; i++) {
      if (ArrayHelpers.isPalindrome(Integer.toString(i)) &&
          ArrayHelpers.isPalindrome(Integer.toString(i, 2))) {
        answer += i;
      }
    }

    return Integer.toString(answer);
  }
}