package net.mindview.chapter14.factory;

import net.mindview.chapter14.pets.TypeCounter;

public class PartsCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for (int i = 0; i < 10; i++) {
            Part part = Part.createRandom();
            System.out.print(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        System.out.println();
        System.out.println(counter);
    }
}
