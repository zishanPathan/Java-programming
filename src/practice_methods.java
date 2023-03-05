import java.util.Scanner;

public class practice_methods {
  /*  static int table(int a){
        int sum =1;
        for (int i = 1;i<=10;i++){
            sum = a * i;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(table(n));
    }

   */
    static void table(int n){
        for (int i = 1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
        //int num = in.nextInt();
        table(2);
    }

}
