package advanceJava;

import java.util.Scanner;

public class bitManupilation3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //operation = 1 : set operation
        //operation = 0 : clear operation
        int operation = sc.nextInt();
        int n = 5;
        int position = 0;
        int bitMask = 1 << position;
       ;
        if (operation == 0){
            int notBitmask = ~(bitMask);
            int newBitmask = notBitmask & n;
            System.out.println(newBitmask);
        }
        else {
            int newnum =  bitMask | n;
            System.out.println(newnum);
        }
    }
}
