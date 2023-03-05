public class varargs {
    static int sum(int...arr){
        int result = 0;
        for (int e:arr){
            result +=e;

        } return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of given number is :"+sum(2,4,6,67,8));
    }
}
