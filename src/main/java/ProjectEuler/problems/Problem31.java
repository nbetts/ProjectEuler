package ProjectEuler;

public class Problem31 implements Solvable {
  private int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
  private int answer = 0;

  private void checkCoins(int index, int remaining) {
    if (remaining == 0) {
      answer++;
      return;
    } else if (remaining < 0) {
      return;
    }

    for (int i = index; i < coins.length; i++) {
      checkCoins(i, remaining - coins[i]);
    }
  }

  public String solve() {
    checkCoins(0, 200);

    return Integer.toString(answer);
  }
}