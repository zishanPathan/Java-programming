package advanceJava;

public class binarySearchPractice {
    public static void main(String[] args) {
    int[] arr = {2,3,56,77,88,90,98};
    int target = 57;
    int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        //for ceiling of given number
     //return start;

        //for floor of a given number is
      // return end;

        return -1;
    }
}
