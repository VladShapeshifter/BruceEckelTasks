package net.mindview.chapter14.pets;

public class Rat extends Rodent {
    public Rat() {
        super();
    }

    public Rat(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Rat> {

        @Override
        public Rat create() {
            return new Rat();
        }
    }
}
