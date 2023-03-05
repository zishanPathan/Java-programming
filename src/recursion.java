import java.util.Scanner;

public class recursion {
  /*  static int factorial(int n){
        if (n==0 || n==1){
            return 1;          //factorial of given number
        }
        else {
            return n * factorial(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int  x= in.nextInt();
        System.out.println("factorial of given number is :"+factorial(x));
    }

   */
    static  int sumRec(int n){
        if (n == 1){
            return 1;
        }
      return n + sumRec(n-1);        //sum of first n natural number
    }

    public static void main(String[] args) {;
        System.out.println(sumRec(5));

    }


}
