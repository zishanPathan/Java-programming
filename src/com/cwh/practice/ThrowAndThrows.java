package com.cwh.practice;
class RadiusNegetiveException extends Exception{
    @Override
    public String toString() {
        return"radius cannot be negetive";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negetive";
    }
}

public class ThrowAndThrows {
    public static double area(int r) throws RadiusNegetiveException{
        double result;
        if (r<0){
            throw new RadiusNegetiveException();
        }
        result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        try {
          double ar =  area(8);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("exception");
        }

    }
}
