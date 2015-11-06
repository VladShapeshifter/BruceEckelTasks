package net.mindview.chapter14.coffee;

public class Mocha extends Coffee {
    public static class Generator implements net.mindview.chapter14.coffee.Generator<Mocha> {

        @Override
        public Mocha next() {
            return new Mocha();
        }
    }
}
