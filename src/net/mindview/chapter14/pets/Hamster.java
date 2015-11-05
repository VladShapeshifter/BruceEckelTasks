package net.mindview.chapter14.pets;

public class Hamster extends Rodent {
    public Hamster() {
        super();
    }

    public Hamster(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Hamster> {

        @Override
        public Hamster create() {
            return new Hamster();
        }
    }
}
