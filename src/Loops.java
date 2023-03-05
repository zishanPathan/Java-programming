import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = 0;
     for (int i=0;i<=n;i++){      //sum of given n even numbers
          sum = i*2;
     }
        System.out.println(sum);

    }
}
