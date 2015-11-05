package net.mindview.chapter14.pets;

public class Pug extends Dog {
    public Pug() {
        super();
    }

    public Pug(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Pug> {

        @Override
        public Pug create() {
            return new Pug();
        }
    }
}
