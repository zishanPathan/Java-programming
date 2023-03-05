import java.util.Scanner;

public class Operator_questions {
    public static void main(String[] args) {
        //Q1.encrypt the grade by adding 8 and then decrypting it.

       char grade = 'B';

        grade = (char) (grade + 8) ;
        System.out.println(grade);

        // Dycripting the grade

        grade = (char) (grade - 8);
        System.out.println(grade);

        //Q2.
    /*            Scanner in = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int a = in.nextInt();
        System.out.println("enter number 2 ");
        int b = in.nextInt();
        if (a > b){
            System.out.println(a+ " is greater then "+b);
        }
        else {
            System.out.println( b+ " is greater then "+a);
        }

      */

        //Q.3 write given expression (lecture no. 12 cwh java playlist

         Scanner in = new Scanner(System.in);

        int v = in.nextInt(), u = in.nextInt(), a = in.nextInt(); ;

        int sum = (v*2)-(u*2) / 2*a*5;
        System.out.println(sum);
        System.out.println(" equation = (v*2)-(u*2) / 2*a*5");



  }
}
