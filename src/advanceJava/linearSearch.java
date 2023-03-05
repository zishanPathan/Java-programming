package advanceJava;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,7,8,9,2,4};
        int target = sc.nextInt();
        int ans = search(arr,target);
        System.out.println(ans);
        System.out.println(serachInRange(arr,target,1,5));

    }
    static int search(int[] arr,int target){
        if (arr.length == 0){
        return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
    static int serachInRange(int[] arr,int target,int start,int end ){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
