package com.cwh.practice;
import java.util.Scanner;

public class tryCatchInException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of array");
        int ind = sc.nextInt();
        System.out.println("enter the number for division");
        int number = sc.nextInt();
        try{
            System.out.println("index of array is :"+marks[ind]);
           try {
               System.out.println("division :"+marks[ind]/number);
           }
           catch (ArithmeticException e){
               System.out.println("you enter invalid number");
           }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
