package com.cwh.practice;

public class errors {
    public static void main(String[] args) {
        // Syntax error
        // int a = 5
        // b =5;
        //logical error
        for (int i=0;i<10;i++){   //here i tried to print table of 2
            System.out.println(i*2);

            //runtime error
            int a = 5;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
    }
}
