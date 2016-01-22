package net.mindview.chapter15;

import net.mindview.chapter14.coffee.Coffee;
import net.mindview.chapter14.coffee.CoffeeGenerator;
import net.mindview.chapter14.coffee.Generator;

import java.util.*;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }
    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            queue.add(gen.next());
        }
        return queue;
    }
    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            set.add(gen.next());
        }
        return set;
    }

    public static void main(String[] args) {
        List<Coffee> coff = new LinkedList<>();
        Queue<Coffee> qu = new LinkedList<>();
        List<Coffee> coffee = fill(coff, new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }

        Queue<Coffee> coffee1 = fill(qu, new CoffeeGenerator(), 4);
        for (Coffee c : coffee1) {
            System.out.println(c);
        }

        Set<Coffee> coffee2 = fill(new HashSet<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee2) {
            System.out.println(c);
        }

        Collection<Coffee> coffee3 = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee3) {
            System.out.println(c);
        }

        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (Integer i : fnumbers) {
            System.out.print(i + ", ");
        }
    }
}
