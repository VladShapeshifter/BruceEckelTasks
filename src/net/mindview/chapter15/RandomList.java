package net.mindview.chapter15;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : "The quick brown fox jumped over the lasy brown dog".split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
        System.out.println();

        RandomList<Integer> ri = new RandomList<>();
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
            ri.add(i);
        for (int i = 0; i < 10; i++)
            System.out.print(ri.select() + " ");
        System.out.println();

        RandomList<Character> rc = new RandomList<>();
        for (char c : new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'i'})
            rc.add(c);
        for (int i = 0; i < 12; i++)
            System.out.print(rc.select() + " ");
    }
}
