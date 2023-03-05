package advanceJava;

public class patterns {
    public static void main(String[] args) {
   // pattern1(4);
   // pattern2(4);
        pattern3(4);
    //pattern4(4);
    //pattern5(4);
  //pattern6(4);

    }
    static void pattern1 (int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    static void pattern2 (int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    static void pattern3 (int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    static void pattern4 (int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
    static void pattern5 (int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n -row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern6(int n){
        for (int row = 0 ; row < n; row++) {
            int noOfSpace = n - row;
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n ; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
