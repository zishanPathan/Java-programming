package advanceJava;

public class evenNumber_array {
    public static void main(String[] args) {
    int[] num = {12,345,2,6,7896};
        System.out.println(findNumber(num));
    }
    static int findNumber(int[] num){
        int count = 0;
        for(int n:num){
            if (even(n)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigit = countDigit(num);
        if (numberOfDigit%2==0){
            return true;
        }
    return false;
    }
    static int countDigit(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
