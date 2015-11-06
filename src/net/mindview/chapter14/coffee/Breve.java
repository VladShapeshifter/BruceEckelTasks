package net.mindview.chapter14.coffee;

public class Breve extends Coffee {
    public static class Generator implements net.mindview.chapter14.coffee.Generator<Breve> {

        @Override
        public Breve next() {
            return new Breve();
        }
    }
}
