package ProjectEuler;

public class Problem3 implements Solvable {
  public String solve() {
    long divisor = 2, number = 600851475143L;

    while (number >= divisor) {
      if (number % divisor == 0) {
        number /= divisor;
      } else {
        divisor++;
      }
    }

    return Long.toString(divisor);
  }
}