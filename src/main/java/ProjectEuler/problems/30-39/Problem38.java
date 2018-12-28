package ProjectEuler;

import java.util.regex.Pattern;

public class Problem38 implements Solvable {
  public String solve() {
    Pattern uniqueDigits = Pattern.compile("(?:([1-9])(?![1-9]*\\1))*");

    for (int i = 99999; i > 1; i--) {
      String concatenatedProduct = Integer.toString(i);

      if (uniqueDigits.matcher(concatenatedProduct).matches()) {
        int multiplier = 2;
        boolean hasUniqueDigits = true;

        while (concatenatedProduct.length() <= 5) {
          concatenatedProduct += i * multiplier++;

          if (!uniqueDigits.matcher(concatenatedProduct).matches()) {
            hasUniqueDigits = false;
            break;
          }
        }

        if (hasUniqueDigits) {
          return concatenatedProduct;
        }
      }
    }

    return "0";
  }
}