import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
     /*   float[] marks = {45.5f, 67.5f, 86f ,89f,55f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The sum of the array is " + sum); //sum
        System.out.println("The Averege of the array is " + sum/marks.length); //avg


        Scanner in =  new Scanner(System.in);
        int [] arr = {2,3,4,5,6,7,20};
        int num = in.nextInt();
        boolean isInArray = false ;
        for (int e:arr){
            if (num == e){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is present in array");
        }else {
            System.out.println("value is not present in array");
        }

      */
        int [] table = {1,2,3,4,5,6,8,9};
        boolean sorted = true ;
        for (int i = 0; i < table.length-1;i++){
            if (table[i]>table[i+1]){
                sorted= false;
                break;
            }
        }
        if (sorted){
            System.out.println("the array is sorted");
        }else {
            System.out.println("the array is not sorted");
        }

    }
}
