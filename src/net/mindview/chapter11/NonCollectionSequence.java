package net.mindview.chapter11;

import java.util.Iterator;

public class NonCollectionSequence extends IntegerSequence {
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
}
