package advanceJava;

public class bitArrays {
    public static void main(String[] args) {
        int [] arr = {2,3,3,4,6,2,4};
        System.out.println(ans(arr));
    }
//if we xor same element it will be 0;
    static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
