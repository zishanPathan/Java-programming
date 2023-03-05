package advanceJava;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
       //int[] arr = {5,4,3,2,1};
        int[] arr ={-97,45,2,-1,0,49};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swap;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            //for each step , max item will come to the last index
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            //if for first run no swap wil happend
            if (!swap){
                break;
            }
        }
    }
}
