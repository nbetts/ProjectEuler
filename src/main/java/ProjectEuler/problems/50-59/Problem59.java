package ProjectEuler;

public class Problem59 implements Solvable {
  public String solve() {
    char alphabetStart = 97, alphabetEnd = 122;
    int answer = 0;

    String[] charValues = FileHelpers.readFile("resources/Problem59.txt").split(",");
    char[] encryptedCharacters = new char[charValues.length];
    char[] decryptedCharacters = new char[charValues.length];

    for (int i = 0; i < charValues.length; i++) {
      encryptedCharacters[i] = (char) Integer.parseInt(charValues[i]);
    }

    for (char a = alphabetStart; a <= alphabetEnd; a++) {
      for (char b = alphabetStart; b <= alphabetEnd; b++) {
        for (char c = alphabetStart; c <= alphabetEnd; c++) {
          char[] password = { a, b, c };
          String text = "";
          boolean isValidText = true;

          for (int i = 0; i < charValues.length; i++) {
            decryptedCharacters[i] = (char) (encryptedCharacters[i] ^ password[i % 3]);

            if (decryptedCharacters[i] < 32) {
              isValidText = false;
              break;
            }

            text += decryptedCharacters[i];
          }

          if (isValidText && text.contains("the ") && text.contains("and ")) {
            for (char character : decryptedCharacters) {
              answer += character;
            }
          }
        }
      }
    }

    return Integer.toString(answer);
  }
}