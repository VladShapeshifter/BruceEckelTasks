package net.mindview.chapter14.coffee;

public class Cappuccino extends Coffee {
    public static class Generator implements net.mindview.chapter14.coffee.Generator<Cappuccino> {

        @Override
        public Cappuccino next() {
            return new Cappuccino();
        }
    }
}
