package ProjectEuler;

public class Problem15 implements Solvable {
  long answer = 1;

  private void checkRoute(int x, int y) {
    if (x < 20) {
      checkRoute(x + 1, y);
    }
    if (y < 20 - 1) {
      checkRoute(x, y + 1);
    }

    answer++;
  }

  public String solve() {
    checkRoute(1, 1);
    answer *= 2;

    return Long.toString(answer);
  }
}