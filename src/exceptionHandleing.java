import java.util.Scanner;

public class exceptionHandleing {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 5;
        marks[1] = 10;
        marks[2] = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of array:");
        int ind = sc.nextInt();
        System.out.println("enter the number for division");
        int number = sc.nextInt();
     /*   try{
            System.out.println("value of index you enterd is:"+marks[ind]);
            System.out.println("the division is :"+marks[ind]/number);
        }
        catch (Exception e){
            System.out.println("exception");
        }

      */
        //handling specific exception
        try{
            System.out.println("value of index you enterd is:"+marks[ind]);
            System.out.println("the division is :"+marks[ind]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you enter wrong index of array");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("you enter invalid number for division");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("exception error");
            System.out.println(e);
        }

    }
}
