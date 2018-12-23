package ProjectEuler;

import java.util.ArrayList;

public class Problem23 implements Solvable {
  public String solve() {
    int answer = 0, limit = 28123;
    boolean[] numbersOfInterest = new boolean[limit]; // 28123

    ArrayList<Integer> abundantNumbers = new ArrayList<>();

    for (int i = 1; i < numbersOfInterest.length; i++) {
      if (i < MathHelpers.sum(MathHelpers.factors(i, true))) {
        abundantNumbers.add(i);
      }
    }

    for (int i = 0; i < abundantNumbers.size(); i++) {
      for (int j = i; j < abundantNumbers.size(); j++) {
        int sum = abundantNumbers.get(i) + abundantNumbers.get(j);

        if (sum > limit) {
          break;
        }

        numbersOfInterest[sum-1] = true;
      }
    }

    for (int i = 0; i < numbersOfInterest.length; i++) {
      if (!numbersOfInterest[i]) {
        answer += (i + 1);
      }
    }

    return Integer.toString(answer);
  }
}