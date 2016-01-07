package net.mindview.chapter15;

import net.mindview.chapter14.pets.Mutt;
import net.mindview.chapter14.pets.Pet;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }
    void set(T a) {
        this.a = a;
    }
    T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<>(new Mutt());
        Mutt mutt = (Mutt)h3.get();
        System.out.println(mutt);
    }
}
