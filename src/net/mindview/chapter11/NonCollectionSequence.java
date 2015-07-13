package net.mindview.chapter11;

import java.util.*;

public class NonCollectionSequence extends IntegerSequence implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < ints.length;
            }

            @Override
            public Integer next() {
                return ints[index++];
            }
        };
    }
    public Iterable<Integer> reversed() {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int current = ints.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Integer next() {
                        return ints[current--];
                    }
                };
            }
        };
    }
    public Iterable<Integer> randomized() {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                List<Integer> shuffled = new ArrayList<>(Arrays.asList(ints));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence ncs = new NonCollectionSequence();
        System.out.print("reversed iterator(): ");
        for (int i : ncs.reversed()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("randomized iterator(): ");
        for (int i : ncs.randomized()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("standard iterator(): ");
        for (int i : ncs) {
            System.out.print(i + " ");
        }
    }
}
