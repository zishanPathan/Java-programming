package com.cwh.practice;

import java.util.Scanner;
class maxReached extends Exception{
    @Override
    public String toString() {
        return "max reached ";
    }
}

public class practiceException1 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        maxReached max = new maxReached();
        try {
            for (int i =0 ; i<= marks.length;i++){

                if(i==5){
                    System.out.println(max.toString());
                }
                int index = sc.nextInt();
                System.out.println(marks[index]);
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
