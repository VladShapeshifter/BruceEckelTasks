package net.mindview.chapter14.pets;

public class Cymric extends Manx {
    public Cymric() {
        super();
    }

    public Cymric(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Cymric> {

        @Override
        public Cymric create() {
            return new Cymric();
        }
    }
}
