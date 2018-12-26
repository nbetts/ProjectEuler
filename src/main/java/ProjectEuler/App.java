package ProjectEuler;

public class App {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println("Please provide a problem number, e.g. 1");
      return;
    }

    try {
      int problemNumber = Integer.parseInt(args[0]);

      if (problemNumber < 1) {
        throw new IllegalArgumentException();
      }

      if (args.length > 1 && args[1].equals("c")) {
        FileHelpers.createProblem(problemNumber);
      } else {
        Solvable problem = (Solvable) Class.forName("ProjectEuler.Problem" + problemNumber).newInstance();

        try {
          System.out.println(problem.solve());
        } catch (Exception exception) {
          System.out.println("Error in solution:");
          exception.printStackTrace();
        }
      }
    } catch (NullPointerException | IllegalArgumentException exception) {
      System.err.println("Please provide a valid problem number, e.g. 1");
    } catch (Exception exception) {
      System.err.println("System exception:");
      exception.printStackTrace();
    }
  }
}
