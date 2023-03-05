public class arrMethod {
    static void change (int arr[]){
        arr[0] = 100;
    }
    public static void main(String[] args) {
        int [] marks = {65,78,89,56,90};
        change(marks);

        System.out.println(marks[0]);
    }
}
