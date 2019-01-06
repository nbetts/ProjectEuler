package ProjectEuler;

import java.util.Arrays;

public class Problem52 implements Solvable {
  public String solve() {
    int answer = 0, maxMultiplier = 6;
    int magnitude = 10, magnitudeLimit = magnitude / maxMultiplier;
    boolean containsSameDigits = false;

    for (int i = 1; !containsSameDigits; i++) {
      if (i > magnitudeLimit) {
        i = magnitude;
        magnitude *= 10;
        magnitudeLimit = magnitude / maxMultiplier;
      }

      String originalDigits = StringHelpers.sort(String.valueOf(i));
      containsSameDigits = true;

      for (int j = 2; j < maxMultiplier; j++) {
        String digits = StringHelpers.sort(String.valueOf(i * j));

        if (!originalDigits.equals(digits)) {
          containsSameDigits = false;
          break;
        }
      }

      if (containsSameDigits) {
        answer = i;
        break;
      }
    }

    return Integer.toString(answer);
  }
}