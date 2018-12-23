package ProjectEuler;

public class Problem42 implements Solvable {
  public String solve() {
    int answer = 0;

    String[] words = FileHelpers.readFile("resources/Problem42.txt").replaceAll("\"", "").split(",");

    for (int i = 0; i < words.length; i++) {
      int wordValue = StringHelpers.score(words[i]);
      int triangleNumber = (int) MathHelpers.triangleNumber(1);

      for (int j = 2; wordValue > triangleNumber; j++) {
        triangleNumber = (int) MathHelpers.triangleNumber(j);
      }

      if (wordValue == triangleNumber) {
        answer++;
      }
    }

    return Integer.toString(answer);
  }
}