package advanceJava;

public class bitManipulation2nd {
    public static void main(String[] args) {
        int n = 5;//0101
        int position = 2;
        int bitMask = 1<<position;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);//0001
    }
}
