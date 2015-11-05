package net.mindview.chapter14.pets;

public class Mouse extends Rodent {
    public Mouse() {
        super();
    }

    public Mouse(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Mouse> {

        @Override
        public Mouse create() {
            return new Mouse();
        }
    }
}
