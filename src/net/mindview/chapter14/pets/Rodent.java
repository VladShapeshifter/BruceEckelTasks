package net.mindview.chapter14.pets;

public class Rodent extends Pet {
    public Rodent() {
        super();
    }

    public Rodent(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Rodent> {

        @Override
        public Rodent create() {
            return new Rodent();
        }
    }
}
