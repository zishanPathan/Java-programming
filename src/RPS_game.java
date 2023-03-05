import java.util.Random;
import java.util.Scanner;

public class RPS_game {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 secsior
        Scanner in = new Scanner(System.in);
        System.out.println("enter 0 for rock/ 1 for paper / 2 for secsior");
        int Userinput = in.nextInt();

        Random ci = new Random();
      int Random = ci.nextInt(3);

      if (Userinput == Random) {
          System.out.println("draw");
      }
         else  if (Userinput == 0 && Random==2 || Userinput == 1 && Random == 0 || Userinput==2 && Random==1){
              System.out.println("you win");
          }
          else {
              System.out.println("computer win");
          System.out.println("computer choose :"+Random);
          }



    }
}
