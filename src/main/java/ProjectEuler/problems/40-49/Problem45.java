package ProjectEuler;

public class Problem45 implements Solvable {
  public String solve() {
    long answer = 0;
    long tIndex = 286, pIndex = 165, hIndex = 143;
    long tValue = 0, pValue = 0, hValue = 0;

    while (true) {
      tValue = MathHelpers.triangleNumber(tIndex);
      pValue = MathHelpers.pentagonalNumber(pIndex);
      hValue = MathHelpers.hexagonalNumber(hIndex);

      if (tValue == pValue && tValue == hValue) {
        answer = tValue;
        break;
      }

      if (tValue < pValue) {
        tIndex++;
      } else if (pValue < hValue) {
        pIndex++;
      } else {
        hIndex++;
      }
    }

    return Long.toString(answer);
  }
}