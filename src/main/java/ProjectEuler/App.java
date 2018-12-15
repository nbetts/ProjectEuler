package ProjectEuler;

public class App {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Please provide a problem number, e.g. 1");
      return;
    }

    try {
      Solvable problem = (Solvable) Class.forName("ProjectEuler.Problem" + args[0]).newInstance();
      System.out.println(problem.solve());
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
