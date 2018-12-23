package ProjectEuler;

public class StringHelpers {
  private StringHelpers() { }

  /**
   * Return true if a string is a palindrome.
   */
  public static boolean isPalindrome(String string) {
    return string.equals(new StringBuilder(string).reverse().toString());
  }
}