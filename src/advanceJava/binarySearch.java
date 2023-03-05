package advanceJava;

public class binarySearch {
    public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,7,8,12};
    int target = 7;
    int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAs = arr[start]<arr[end];
            if (arr[mid] == target){
                return mid;
            }
            else if(isAs) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
 /*   static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
        // boolean isAs = arr[start]<arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

  */
