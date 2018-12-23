package ProjectEuler;

public class Problem22 implements Solvable {
  public String solve() {
    int answer = 0;

    String[] names = FileHelpers.readFile("resources/Problem22.txt").replaceAll("\"", "").split(",");
    ArrayHelpers.sort(names);

    for (int i = 0; i < names.length; i++) {
      char[] letters = names[i].toCharArray();
      int score = 0;

      for (int j = 0; j < letters.length; j++) {
        score += letters[j] - 64;
      }

      answer += score * (i + 1);
    }

    return Integer.toString(answer);
  }
}