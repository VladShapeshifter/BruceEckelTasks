package net.mindview.chapter14.pets;

public class Mutt extends Dog {
    public Mutt() {
        super();
    }

    public Mutt(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Mutt> {

        @Override
        public Mutt create() {
            return new Mutt();
        }
    }
}
