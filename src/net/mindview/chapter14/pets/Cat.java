package net.mindview.chapter14.pets;

public class Cat extends Pet {
    public Cat() {
        super();
    }

    public Cat(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Cat> {

        @Override
        public Cat create() {
            return new Cat();
        }
    }
}
