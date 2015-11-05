package net.mindview.chapter14.pets;

public class Dog extends Pet {
    public Dog() {
        super();
    }

    public Dog(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<Dog> {

        @Override
        public Dog create() {
            return new Dog();
        }
    }
}
