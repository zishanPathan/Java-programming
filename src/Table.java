import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;
        for(int i = 1 ; i <= 10 ; i++){
            sum = i*n;
          //  System.out.printf("%dx%d=%d",i,n,sum);
            System.out.println(sum);
        }


        }
    }
