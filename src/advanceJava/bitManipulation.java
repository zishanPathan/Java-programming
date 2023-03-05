package advanceJava;

public class bitManipulation {
    public static void main(String[] args) {
        //get bit
        int n = 5;
        int position = 0;
        int bitMask = 1 << position;
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
        //set bit
        int n1 = 5;
        int position1 = 2;
        int bitMask1 =2<<position1;
        int newNumber = bitMask1 | n1;
        System.out.println(newNumber);
    }
}
