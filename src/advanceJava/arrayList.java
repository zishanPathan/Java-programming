package advanceJava;

import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(10);
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
           l1.add(sc.nextInt());
    }
        System.out.println(l1);

    }
}

