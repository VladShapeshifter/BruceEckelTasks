package net.mindview.chapter14.coffee;

import net.mindview.chapter14.pets.TypeCounter;

public class CoffeeCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.print(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        System.out.println();
        System.out.println(counter);
    }
}
