package net.mindview.chapter10;

import java.util.ArrayList;

public class Sequence {
    private ArrayList items;
    private int next = 0;
    public Sequence() {
        items = new ArrayList();
    }
    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size()) i++;
        }
        Sequence outerClass() {
            return Sequence.this;
        }
    }

    private class ReverseSelector implements Selector {
        private int i = items.size()-1;

        @Override
        public boolean end() {
            return i == -1;
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i >= 0) i--;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    public static void main(String[] args) {
        int numberOfObjects = 10;
        Sequence sequence = new Sequence();
        for (int i = 0; i < numberOfObjects; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.reverseSelector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
            System.out.println(new Items());
        }
    }
}
