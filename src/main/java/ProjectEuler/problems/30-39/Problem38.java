package ProjectEuler;

public class Problem38 implements Solvable {
  public String solve() {
    for (int i = 99999; i > 1; i--) {
      String concatenatedProduct = Integer.toString(i);

      if (StringHelpers.isUniqueDigits(concatenatedProduct)) {
        int multiplier = 2;
        boolean hasUniqueDigits = true;

        while (concatenatedProduct.length() <= 5) {
          concatenatedProduct += i * multiplier++;

          if (!StringHelpers.isUniqueDigits(concatenatedProduct)) {
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