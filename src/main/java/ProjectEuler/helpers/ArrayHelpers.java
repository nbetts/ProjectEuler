package ProjectEuler;

public class ArrayHelpers {
  private ArrayHelpers() { }

  /**
   * Swap two values in an array.
   */
  public static <T extends Object> void swap(T[] array, int first, int second) {
    T temp = array[first];
    array[first] = array[second];
    array[second] = temp;
  }

  /**
   * Concatenate array elements into a string.
   */
  public static <T extends Object> String concatenate(T[] numbers) {
    StringBuilder number = new StringBuilder();

    for (int i = 0; i < numbers.length; i++) {
      number.append(numbers[i].toString());
    }

    return number.toString();
  }

  /**
   * Return true if a string is a palindrome.
   */
  public static boolean isPalindrome(String string) {
    return string.equals(new StringBuilder(string).reverse().toString());
  }
}