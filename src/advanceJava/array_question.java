package advanceJava;

public class array_question {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,5},
                {5,1,2},
                {3,1,9}
        };
        System.out.println(maxWealth(arr));

    }
    static int maxWealth(int[][]arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            int max = 0;
            for (int j = 0; j <arr[i].length ; j++) {

                max = max + arr[i][j];
                if (max > ans) {
                    ans = max;
                }
            }
        } return ans;

    }
}
