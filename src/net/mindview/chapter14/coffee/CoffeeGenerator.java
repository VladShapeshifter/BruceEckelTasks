package net.mindview.chapter14.coffee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CoffeeGenerator implements Iterable<Coffee> {
//    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    static List<Generator<? extends Coffee>> coffeFactories = new ArrayList<>();
    static {
        coffeFactories.add(new Latte.Generator());
        coffeFactories.add(new Mocha.Generator());
        coffeFactories.add(new Cappuccino.Generator());
        coffeFactories.add(new Americano.Generator());
        coffeFactories.add(new Breve.Generator());
    }
    private static Random rand = new Random(47);
    public CoffeeGenerator() {}
    private int size = 0;
    public CoffeeGenerator(int cz) {
        size = cz;
    }
    public static Coffee nextRandom() {
        int n = rand.nextInt(coffeFactories.size());
        return coffeFactories.get(n).next();
    }
    /*@Override
    public Coffee next() {
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/

    /*@Override
    public Iterator<Coffee> iterator() {
        return null;
    }*/

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }
        @Override
        public Coffee next() {
            count--;
            return nextRandom();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.nextRandom());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
