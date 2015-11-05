package net.mindview.chapter14.pets;

public class Manx extends Cat {
    public Manx() {
        super();
    }

    public Manx(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Manx> {

        @Override
        public Manx create() {
            return new Manx();
        }
    }
}
