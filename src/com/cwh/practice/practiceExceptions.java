package com.cwh.practice;

import java.util.Scanner;

public class practiceExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException a){
            System.out.println("HAHA");
        }
        catch (IllegalArgumentException i){
            System.out.println("HEHE");
        }


    }
}
