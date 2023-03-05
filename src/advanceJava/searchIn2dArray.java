package advanceJava;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {{3,4,2},{4,56,7},{7,9,8}};
      int  target = 9;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j]==target) {
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
