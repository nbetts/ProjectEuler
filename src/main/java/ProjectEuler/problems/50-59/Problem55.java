package ProjectEuler;

import java.math.BigInteger;

public class Problem55 implements Solvable {
  public String solve() {
    int answer = 0;

    for (int i = 10; i < 10000; i++) {
      String nString = String.valueOf(i);
      BigInteger n = new BigInteger(nString);

      for (int j = 0; j < 50; j++) {
        n = n.add(new BigInteger(StringHelpers.reverse(nString)));
        nString = n.toString();

        if (StringHelpers.isPalindrome(nString)) {
          break;
        }
      }

      if (!StringHelpers.isPalindrome(nString)) {
        answer++;
      }
    }

    return Integer.toString(answer);
  }
}