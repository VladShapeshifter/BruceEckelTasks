package net.mindview.chapter14.coffee;

public class Americano extends Coffee {
    public static class Generator implements net.mindview.chapter14.coffee.Generator<Americano> {

        @Override
        public Americano next() {
            return new Americano();
        }
    }
}
