package advanceJava;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(6);
        l1.add(59);
        l1.add(8);
        l1.add(7);
        l1.add(0, 90);
        l1.addFirst(808);
        l1.addLast(900);
        System.out.println(l1.indexOf(0));
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}