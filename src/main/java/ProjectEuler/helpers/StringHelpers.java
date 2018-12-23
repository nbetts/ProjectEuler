package ProjectEuler;

public class StringHelpers {
  private StringHelpers() { }

  /**
   * Return true if a string is a palindrome.
   */
  public static boolean isPalindrome(String string) {
    return string.equals(new StringBuilder(string).reverse().toString());
  }

  /**
   * Return the numeric score of a string.
   */
  public static final int score(String string) {
    char[] letters = string.toCharArray();
    int score = 0;

    for (int j = 0; j < letters.length; j++) {
      score += letters[j] - 64;
    }

    return score;
  }
}