package ProjectEuler;

public class Problem44 implements Solvable {
  public String solve() {
    int baseIndex = 0, limit = 100000;
    long[] pentagonals = new long[limit];
    pentagonals[0] = 1;

    for (int i = 1; i < limit; i++) {
      long increment = 3 * (long) i + 1;
      pentagonals[i] = pentagonals[i - 1] + increment;

      if (increment > pentagonals[baseIndex]) {
        baseIndex++;
      }

      for (int j = baseIndex; j < i - 1; j++) {
        long sum = pentagonals[i] + pentagonals[j];
        double pentagonal = (1 + Math.sqrt(24 * sum + 1)) / 6;

        if (pentagonal == (long) pentagonal) {
          long difference = pentagonals[i] - pentagonals[j];
          pentagonal = (1 + Math.sqrt(24 * difference + 1)) / 6;

          if (pentagonal == (long) pentagonal) {
            return Long.toString(difference);
          }
        }
      }
    }

    return "0";
  }
}