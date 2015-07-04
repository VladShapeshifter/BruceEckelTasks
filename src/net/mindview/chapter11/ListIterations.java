package net.mindview.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> intlist2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        ListIterator<Integer> lit1 = intlist.listIterator();
        ListIterator<Integer> lit2 = intlist2.listIterator();
        while (lit2.hasNext()) {
            lit2.next();
        }
        while (lit1.hasNext()) {
            while (lit2.hasPrevious()) {
                lit2.previous();
                lit2.set(lit1.next());
            }
        }
        System.out.println(intlist);
        System.out.println(intlist2);
    }

}
