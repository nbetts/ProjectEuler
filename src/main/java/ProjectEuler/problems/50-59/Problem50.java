package ProjectEuler;

import java.util.ArrayList;

public class Problem50 implements Solvable {
  private int answer = 0, largestSequenceLength = 0;
  private ArrayList<Integer> primes = MathHelpers.primeList(10000);

  private void checkConsecutivePrimes(int sum, int lowIndex, int highIndex) {
    if (highIndex - lowIndex <= largestSequenceLength) {
      return;
    }

    if (MathHelpers.isPrime(sum)) {
      int sequenceLength = highIndex - lowIndex;

      if (sequenceLength > largestSequenceLength) {
        largestSequenceLength = sequenceLength;
        answer = sum;
      }

      return;
    }

    checkConsecutivePrimes(sum - primes.get(highIndex - 1), lowIndex, highIndex - 1);
    checkConsecutivePrimes(sum - primes.get(lowIndex), lowIndex + 1, highIndex);
  }

  public String solve() {
    int sum = 0, highIndex = 0;

    for (int i = 0; sum + primes.get(i) < 1000000; i++) {
      sum += primes.get(i);
      highIndex++;
    }

    checkConsecutivePrimes(sum, 0, highIndex);

    return Integer.toString(answer);
  }
}