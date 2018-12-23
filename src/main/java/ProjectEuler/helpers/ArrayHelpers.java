package ProjectEuler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayHelpers {
  private ArrayHelpers() { }

  /**
   * Sort an array in ascending order.
   */
  public static <T extends Comparable<? super T>> void sort(T[] array) {
    List<T> list = Arrays.asList(array);
    Collections.sort(list);
    list.toArray(array);
  }

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
  public static <T extends Object> String concatenate(T[] values) {
    String string = "";

    for (T value : values) {
      string += value.toString();
    }

    return string;
  }
}