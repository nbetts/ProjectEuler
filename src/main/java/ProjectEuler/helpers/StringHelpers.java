package ProjectEuler;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringHelpers {
  private static Pattern uniqueDigits = Pattern.compile("(?:([1-9])(?![1-9]*\\1))*");

  private StringHelpers() { }

  /**
   * Sort a string.
   */
  public static String sort(String string) {
    char[] characters = string.toCharArray();
    Arrays.sort(characters);

    return new String(characters);
  }

  /**
   * Reverse a string.
   */
  public static String reverse(String string) {
    return new StringBuilder(string).reverse().toString();
  }

  /**
   * Return true if a string is a palindrome.
   */
  public static boolean isPalindrome(String string) {
    return string.equals(reverse(string));
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

  /**
   * Return true if a string is comprised of unique digits.
   */
  public static boolean isUniqueDigits(String string) {
    return uniqueDigits.matcher(string).matches();
  }
}