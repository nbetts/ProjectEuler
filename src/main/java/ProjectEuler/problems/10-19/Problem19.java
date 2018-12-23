package ProjectEuler;

public class Problem19 implements Solvable {
  public String solve() {
    int answer = 0, sundayOffset = 7;
    int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    for (int year = 1900; year <= 2000; year++) {
      int numberOfDays = 365;

      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        numberOfDays++;
        monthDays[1] = 29;
      } else {
        monthDays[1] = 28;
      }

      if (year >= 1901) {
        int dayCounter = sundayOffset, monthCounter = 0;

        while (monthCounter < monthDays.length) {
          dayCounter += 7;

          if (dayCounter > monthDays[monthCounter]) {
            dayCounter %= monthDays[monthCounter++];

            if (dayCounter == 1) {
              answer++;
            }
          }
        }
      }

      sundayOffset -= numberOfDays % 7;

      if (sundayOffset <= 0) {
        sundayOffset += 7;
      }
    }

    return Integer.toString(answer);
  }
}