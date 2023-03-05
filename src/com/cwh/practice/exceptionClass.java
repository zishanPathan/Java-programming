package com.cwh.practice;
import java.util.Scanner;

class myException extends Exception{
    public myException(String s) {
    }

    @Override
    public String toString() {
        return "an exception find";
    }

    @Override
    public String getMessage() {
        return "get massege";
    }
}

public class exceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a =sc.nextInt();
        if(a>10){
            try {
                throw new myException("okey");
               // throw new ArithmeticException();
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        }
        System.out.println("number is greater then 10");
    }
}
