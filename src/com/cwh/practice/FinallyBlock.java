package com.cwh.practice;

public class FinallyBlock {
    public static int greet(){

        try{
            int a = 7;
            int b = 50;
            return a/b;
        }
        catch (Exception e){
            System.out.println("exception");
        }
        finally {
            System.out.println("i am done");
        }
        return 0;
    }

    public static void main(String[] args) {
       int result = greet();
        System.out.println(result);
    }
}
