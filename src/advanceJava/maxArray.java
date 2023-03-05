package advanceJava;

public class maxArray {
    public static void main(String[] args) {
        int [] arr = {12 ,34,5,22,3,2,1};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,6));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr ,int start , int end){
        int max = arr[start];
        for (int i = 0; i <arr[end] ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
