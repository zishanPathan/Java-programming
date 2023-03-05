package advanceJava;

import java.util.ArrayList;
import java.util.Scanner;

//multi dimensional array list
public class arrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            l2.add(new ArrayList<>());
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                l2.get(i).add(sc.nextInt());
            }
        }
        System.out.println(l2);
    }
}
