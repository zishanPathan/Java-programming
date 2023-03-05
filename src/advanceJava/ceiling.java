package advanceJava;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,12};
        int target = 7;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //ceiling of a no means >= target
static int ceiling(int[]arr, int target){
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
    return start;
}

}