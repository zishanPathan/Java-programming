package advanceJava;

public class bitOddEven {
    public static void main(String[] args) {
    int n = 81;
    //true for odd  //false for even
        System.out.println(isOdd(n));
    }
    static boolean isOdd (int n){
        return (n & 1) == 1;
    }
}
