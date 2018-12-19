package ProjectEuler;

public class Problem22 implements Solvable {
  public String solve() {
    int answer = 0;

    String[] names = FileHelpers.readFile("resources/Problem22.txt").replaceAll("\"", "").split(",");

    for (int i = 0; i < names.length - 1; i++) {
      for (int j = i; j < names.length - 1; j++) {
        if (names[i].compareTo(names[j+1]) > 0) {
          String temp = names[i];
          names[i] = names[j+1];
          names[j+1] = temp;
        }
      }
    }

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