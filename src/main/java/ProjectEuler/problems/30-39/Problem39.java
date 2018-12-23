package ProjectEuler;

public class Problem39 implements Solvable {
  public String solve() {
    int answer = 0, limit = 1000, mostPythagoreanTriples = 0;

    for (int perimeter = 12; perimeter <= limit; perimeter++) {
      int pythagoreanTriples = 0;

      for (int a = 3; ; a++) {
        if (a * 3 + 3 >= limit) {
          break;
        } else {
          for (int b = a + 1; ; b++) {
            if (a + (b * 2) + 1 >= limit) {
              break;
            } else {
              for (int c = b + 1; ; c++) {
                int sum = a + b + c;

                if (sum >= limit) {
                  break;
                } else if (sum == perimeter && MathHelpers.isPythagoreanTriple(a, b, c)) {
                  pythagoreanTriples++;

                  if (pythagoreanTriples > mostPythagoreanTriples) {
                    mostPythagoreanTriples = pythagoreanTriples;
                    answer = perimeter;
                  }
                }
              }
            }
          }
        }
      }
    }

    return Integer.toString(answer);
  }
}