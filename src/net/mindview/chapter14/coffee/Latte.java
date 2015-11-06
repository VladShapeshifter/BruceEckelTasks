package net.mindview.chapter14.coffee;

public class Latte extends Coffee {
    public static class Generator implements net.mindview.chapter14.coffee.Generator<Latte> {

        @Override
        public Latte next() {
            return new Latte();
        }
    }
}
