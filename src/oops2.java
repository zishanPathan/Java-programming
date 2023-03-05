import java.util.Scanner;

class student{
    int roll;
    String name;
    Scanner in = new Scanner(System.in);
    public void setRoll(int roll) {
        this.roll = in.nextInt();
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = in.next();
    }
    public String getName(){
        return name;
    }
}

public class oops2 {
    public static void main(String[] args) {
        student zishan = new student();
        zishan.setRoll(125);
        System.out.println(zishan.getRoll());
        System.out.println(zishan.getName());
    }
}
