package ProjectEuler;

public class Problem14 implements Solvable {
  public String solve() {
    long answer = 0, longestChain = 0;

    for (int i = 1; i < 1000000; i++) {
      long value = i, chain = 1;

      while (value != 1) {
        value = (value % 2 == 0) ? value / 2 : (value * 3) + 1;
        chain++;
      }

      if (chain > longestChain) {
        answer = i;
        longestChain = chain;
      }
    }

    return Long.toString(answer);
  }
}