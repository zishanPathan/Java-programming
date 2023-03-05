import java.util.Scanner;

public class matrixes {
    public static void main(String[] args) {
     /*   int [][] mat1 = {{1,2,3},
                         {5,6,7}};
        int [][] mat2 = {{1,2,3},
                         {4,5,6}};
        int [][] result = {{0,0,0}
                          ,{0,0,0}};
        for (int i = 0; i<mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+"  ");
            }
            System.out.println("");
        }

      */
        //REVERSE an array
     /*   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        System.out.println("Reverse of given array is ");
        for (int e: arr){
            System.out.print(+e + ",");
        }

      */
        int[] arr = {23, 56, 77, 8, 899, 7};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;

            }
        }
        System.out.println("Maximum element present in array is :\n" + max);
        for (int element : arr) {
            if (element < max) {
                min = element;

            }
        }System.out.println("Minimum element present in array is :\n" + min);


    }
}