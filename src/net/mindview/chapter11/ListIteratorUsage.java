package net.mindview.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorUsage {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        ListIterator<Integer> lit = num.listIterator();
        lit.add(0);
        lit.add(1);
        for (int i = 2; i < 10; i++) {
            lit = num.listIterator(num.size() / 2);
            lit.add(i);
        }
        System.out.println(num);

    }
}
