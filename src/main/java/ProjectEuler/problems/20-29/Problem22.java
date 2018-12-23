package ProjectEuler;

public class Problem22 implements Solvable {
  public String solve() {
    int answer = 0;

    String[] names = FileHelpers.readFile("resources/Problem22.txt").replaceAll("\"", "").split(",");
    ArrayHelpers.sort(names);

    for (int i = 0; i < names.length; i++) {
      answer += StringHelpers.score(names[i]) * (i + 1);
    }

    return Integer.toString(answer);
  }
}