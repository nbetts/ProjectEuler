package ProjectEuler;

import java.math.BigInteger;
import java.util.HashSet;

public class Problem29 implements Solvable {
  public String solve() {
    HashSet<String> numbers = new HashSet<>();
    int min = 2, max = 100;

    for (int i = min; i <= max; i++) {
      for (int j = min; j <= max; j++) {
        numbers.add(new BigInteger(Integer.toString(i)).pow(j).toString());
      }
    }

    return Integer.toString(numbers.size());
  }
}