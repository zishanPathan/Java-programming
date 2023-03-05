package advanceJava;

public class minElement_array {
    public static void main(String[] args) {
        int[]arr = {90,4,5,7,8,89,1};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
