import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int userIn = 0;

      Tests testsObj = new Tests();

      while (true) {
          System.out.println("Please enter a Test Score, or -1 to Quit. ");
          userIn = input.nextInt();
          if (userIn == -1) {
              break;
          }
          testsObj.addScore(userIn);
      }
      testsObj.getAverage();
      System.out.println(testsObj.toString());

  }
}