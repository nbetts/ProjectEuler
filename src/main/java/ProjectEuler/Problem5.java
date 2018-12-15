package ProjectEuler;

public class Problem5 implements Solvable {
  public String solve() {
    int answer = 1, currentValue;

    for (int i = 1; i <= 20; i++) {
      currentValue = answer;

      while (answer % i != 0) {
        answer += currentValue;
      }
    }

    return Integer.toString(answer);
  }
}